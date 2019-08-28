package com.fox.innovate.service;

import com.fox.innovate.pojo.File;

import java.util.List;

/**
 * 文件服务接口
 */
public interface FileService {


    /**
     * 获取所有文件的ID
     * @return
     */
    List<String> allFileId();

    /**
     * 插入文件数据
     * @param file
     * @return
     */
    int insertFile(File file);

    /**
     * 通过ID获取文件数据
     * @param fileId
     * @return
     */
    File getFileById(String fileId);

    /**
     * 通过企业Id和设备ID获取数据
     * @param parentId
     * @param deviceId
     * @return
     */
    List<File> getFileByParentIdAndDeviceId(String parentId,String deviceId,String userId);

    /**
     * 根据文件Id删除图片
     * @param fileId
     * @return
     */
    int deletePicUrl(String fileId);
}
