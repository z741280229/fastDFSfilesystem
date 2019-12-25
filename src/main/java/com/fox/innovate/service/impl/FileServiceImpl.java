package com.fox.innovate.service.impl;

import com.fox.innovate.mapper.FileMapper;
import com.fox.innovate.mapper.UpTokenMapper;
import com.fox.innovate.pojo.File;
import com.fox.innovate.service.FileService;
import com.fox.innovate.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * 文件服务接口实现
 */
@Service
@Transactional
public class FileServiceImpl implements FileService {

    @Autowired
    private FileMapper fileMapper;

    @Autowired
    UpTokenMapper upTokenMapper;


    @Override
    public List<String> allFileId() {
        return null;
    }

    @Override
    public int insertFile(File file) {
        return fileMapper.insertSelective(file);
    }

    @Override
    public File getFileById(String fileId) {
        return null;
    }

    @Override
    public List<File> getFileByParentIdAndDeviceId(String parentId, String deviceId, String userId) {
       /* FileExample example = new FileExample();
        FileExample.Criteria criteria = example.createCriteria();
        criteria.andFileIdIsNotNull();
        criteria.andDataStatusEqualTo(1);
        criteria.andParentIdEqualTo(parentId);
        criteria.andDeviceIdEqualTo(deviceId);
        criteria.andUserIdEqualTo(userId);
        return fileMapper.selectByExample(example);*/
       return fileMapper.getFileByParentIdAndDeviceId(parentId,deviceId,userId,1);
    }

    @Override
    public int deletePicUrl(String fileId,String userId) {
        File file = new File();
        file.setFileId(fileId);
        file.setFileDeleteId(userId);
        file.setFileDeleteTime(DateUtils.formatDate(new Date()));
        file.setDataStatus(0);
        return fileMapper.updateByPrimaryKeySelective(file);
    }

    @Override
    public String getToken() {
        return upTokenMapper.getToken();
    }
}
