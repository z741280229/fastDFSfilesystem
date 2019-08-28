package com.fox.innovate.controller;


import com.fox.innovate.pojo.File;
import com.fox.innovate.pojo.NetStaus;
import com.fox.innovate.pojo.ResponseFile;
import com.fox.innovate.service.FileService;
import com.fox.innovate.utils.BaseUtils;
import com.fox.innovate.utils.FastdfsClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.*;


@RestController
@RequestMapping("file")
public class UploadController {

    @Autowired
    private FileService fileService;

    @Autowired
    private FastdfsClientUtil fastdfsClientUtil;

    /**
     * 单文件上传
     * @param file
     * @param parentId
     * @param deviceId
     * @param userId
     * @return
     */
    @PostMapping("/upload") //new annotation since 4.3
    public NetStaus singleFileUpload(@RequestParam("file") MultipartFile file, String parentId,String deviceId,String userId) {
        NetStaus netStaus = new NetStaus();
        if (file.isEmpty()) {
            netStaus.setCode(NetStaus.DATA_NULL);
            netStaus.setDescribe("上传文件为空");
            return netStaus;
        }else{
            try {
                if (parentId == "" || parentId ==null){
                    netStaus.setCode(NetStaus.DATA_NULL);
                    netStaus.setDescribe("企业ID为空");
                    return netStaus;
                }else if (deviceId =="" || deviceId ==null){
                    netStaus.setCode(NetStaus.DATA_NULL);
                    netStaus.setDescribe("设备ID为空");
                    return netStaus;
                }else if (userId == "" || userId == null){
                    netStaus.setCode(NetStaus.DATA_NULL);
                    netStaus.setDescribe("用户ID为空");
                    return netStaus;
                }else{
                    String fileId = BaseUtils.createNum("File"); //生成文件ID
                    if (fileId == null || fileId ==""){
                        fileId = BaseUtils.createNum("File"); //生成文件ID
                        File fileInfo1 = saveFileToDatabase(file, fileId, deviceId, userId, parentId); //保存数据到数据库中
                        netStaus.setCode(NetStaus.INSERT_SUCCESS);
                        netStaus.setDescribe("数据录入成功");
                        netStaus.setResponseData(fileInfo1);
                        return netStaus;
                    }else{
                        File fileInfo2 = saveFileToDatabase(file, fileId, deviceId, userId, parentId);
                        netStaus.setCode(NetStaus.INSERT_SUCCESS);  //保存数据到数据库中
                        netStaus.setDescribe("数据录入成功");
                        netStaus.setResponseData(fileInfo2);
                        return netStaus;
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
                netStaus.setCode(new Long(2000));
                netStaus.setDescribe("服务器异常");
                return netStaus;
            }

        }
    }


    /**
     * 实现文件批量上传
     * @param request
     * @return
     */
    @PostMapping("/batchUpload")
    public NetStaus batchFileUpload(HttpServletRequest request){

        String parentId = request.getParameter("parentId");
        String deviceId = request.getParameter("deviceId");
        String userId = request.getParameter("userId");
        //获取前端上传的文件列表

        List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
        NetStaus netStaus = new NetStaus();
        if (files==null){
            netStaus.setCode(NetStaus.DATA_NULL);
            netStaus.setDescribe("上传文件为空");
            return netStaus;
        }else{
            try {
                if (parentId == "" || parentId ==null){
                    netStaus.setCode(NetStaus.DATA_NULL);
                    netStaus.setDescribe("企业ID为空");
                    return netStaus;
                }else if (deviceId =="" || deviceId ==null){
                    netStaus.setCode(NetStaus.DATA_NULL);
                    netStaus.setDescribe("设备ID为空");
                    return netStaus;
                }else if (userId == "" || userId == null){
                    netStaus.setCode(NetStaus.DATA_NULL);
                    netStaus.setDescribe("用户ID为空");
                    return netStaus;
                }else{
                    List<File> fileInfos = new ArrayList<>();
                    int remark = 0;
                    for (MultipartFile single:files) {
                        String fileId = BaseUtils.createNum("File")+ remark++; //生成文件ID
                        if (fileId == null || fileId ==""){
                            fileId = BaseUtils.createNum("File"); //生成文件ID
                            File fileInfo1 = saveFileToDatabase(single, fileId, deviceId, userId, parentId); //保存数据到数据库中
                            fileInfos.add(fileInfo1);
                        }else{
                            File fileInfo2 = saveFileToDatabase(single, fileId, deviceId, userId, parentId);
                            netStaus.setResponseData(fileInfo2);
                            fileInfos.add(fileInfo2);
                        }
                    }
                    netStaus.setCode(NetStaus.INSERT_SUCCESS);  //保存数据到数据库中
                    netStaus.setDescribe("数据录入成功");
                    netStaus.setResponseData(fileInfos);
                    return netStaus;
                }
            }catch (Exception e){
                e.printStackTrace();
                netStaus.setCode(new Long(2000));
                netStaus.setDescribe("服务器异常");
                return netStaus;
            }
        }

    }

    /**
     * 获取图片
     * @param parentId
     * @param deviceId
     * @param userId
     * @return
     */
    @GetMapping("getPic")
    public NetStaus getPics(String parentId,String deviceId,String userId){
        NetStaus netStaus = new NetStaus();
        try{
            if (parentId == "" || parentId ==null){
                netStaus.setCode(NetStaus.DATA_NULL);
                netStaus.setDescribe("企业ID为空");
                return netStaus;
            }else if (deviceId =="" || deviceId ==null){
                netStaus.setCode(NetStaus.DATA_NULL);
                netStaus.setDescribe("设备ID为空");
                return netStaus;
            }else if (userId == "" || userId == null){
                netStaus.setCode(NetStaus.DATA_NULL);
                netStaus.setDescribe("用户ID为空");
                return netStaus;
            }else {
                List<File> files = fileService.getFileByParentIdAndDeviceId(parentId, deviceId, userId);
                if (files != null){
                    //Map pics = new HashMap(); //用户存取按时间分类的图片
                    List<File> newFiles = new ArrayList<>();
                    for (File f:files) {
                        newFiles.add(f);
                    }

                    List<ResponseFile> getFiles = new ArrayList<>();

                    for (int j = 0;j < files.size();j++){
                        File oldFile = files.get(j);
                        //List<File> sortDate = new ArrayList<>();
                        ResponseFile sortDate = new ResponseFile();
                        List<File> sortFile = new ArrayList<>();


                        for (int i = 0;i < newFiles.size();i++){
                            File temFile = newFiles.get(i);
                            if (oldFile.getFileUploadDate().equals(temFile.getFileUploadDate())){ //比较时间是否相等
                                sortFile.add(temFile);
                                newFiles.remove(temFile);
                                i--;
                            }
                        }
                        if (sortFile.size()>0){
                            sortDate.setTime(oldFile.getFileUploadDate()); //设置归类时间
                            sortDate.setFiles(sortFile);  //将文件进行归类
                            getFiles.add(sortDate);
                        }
                    }

                    netStaus.setCode(NetStaus.RESPONSE_SUCCESS);
                    netStaus.setDescribe("获取成功");
                    netStaus.setResponseData(getFiles);
                    return netStaus;
                }else {
                    netStaus.setCode(NetStaus.RESPONSE_SUCCESS);
                    netStaus.setDescribe("数据为空");
                    return netStaus;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            netStaus.setCode(NetStaus.RESPONSE_FAILURE);
            netStaus.setDescribe("服务器响应异常");
            return netStaus;
        }
    }


    /**
     * 删除图片
     * @param picIds
     * @return
     */
    @PostMapping("deletePic")
    public NetStaus batchDelete(@RequestParam("picIds") String[] picIds){
        NetStaus netStaus = new NetStaus();
        try{
            if (picIds == null){
                netStaus.setCode(NetStaus.RESPONSE_FAILURE);
                netStaus.setDescribe("出入数据为空");
                return netStaus;
            }else{
                for (String url:picIds){
                    fileService.deletePicUrl(url);
                }
                netStaus.setCode(NetStaus.DELETE_SUCCESS);
                netStaus.setDescribe("删除成功");
                return netStaus;
            }
        }catch (Exception e){
            e.printStackTrace();
            netStaus.setCode(NetStaus.RESPONSE_FAILURE);
            netStaus.setDescribe("服务器响应异常");
            return netStaus;
        }
    }



    /**
     * 保存文件到数据库中
     * @param file
     * @param fileId
     * @param deviceId
     * @param userId
     * @param parentId
     * @return
     * @throws Exception
     */
    public File saveFileToDatabase(MultipartFile file,String fileId,String deviceId,String userId,String parentId) throws Exception{

        //String path=saveFile(file); //保存文件到服务器并获取文件服务器路径
        String path = fastdfsClientUtil.upload(file);

        String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));//获取文件后缀
        String fileName = file.getOriginalFilename();  //文件名
        BigDecimal fileSize = BigDecimal.valueOf(file.getSize());  //文件大小

        File fileInfo = new File();
        fileInfo.setFileId(fileId);  //设置文件ID
        fileInfo.setDeviceId(deviceId); //设置设备ID
        fileInfo.setUserId(userId); //设置用户ID
        fileInfo.setParentId(parentId);//设置企业ID
        fileInfo.setFileUrl(path);//设置文件所在服务器路径
        fileInfo.setFileUploadTime(BaseUtils.getDateTime());//设置文件上传时间
        fileInfo.setFileUploadDate(BaseUtils.getDate()); //设置文件上传日期
        fileInfo.setFileSize(fileSize); //设置文件大小
        fileInfo.setFileType(suffix); //设置文件类型
        fileInfo.setFileName(fileName); //设置文件类型
        fileInfo.setDataStatus(1);

        fileService.insertFile(fileInfo);//保存数据到数据库中
        return fileInfo;
    }

}