package com.fox.innovate.mapper;

import java.util.List;

import com.fox.innovate.pojo.File;
import com.fox.innovate.pojo.FileExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FileMapper {
    int countByExample(FileExample example);

    int deleteByExample(FileExample example);

    int deleteByPrimaryKey(String fileId);

    int insert(File record);

    int insertSelective(File record);

    List<File> selectByExample(FileExample example);

    File selectByPrimaryKey(String fileId);

    int updateByExampleSelective(@Param("record") File record, @Param("example") FileExample example);

    int updateByExample(@Param("record") File record, @Param("example") FileExample example);

    int updateByPrimaryKeySelective(File record);

    int updateByPrimaryKey(File record);

    List<File> getFileByParentIdAndDeviceId(@Param("parentId") String parentId, @Param("deviceId") String deviceId,@Param("userId") String userId,@Param("dataStatus")Integer dataStatus);
}