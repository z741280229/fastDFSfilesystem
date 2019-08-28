package com.fox.innovate.utils;

import com.fox.innovate.fastdfs.FastConfig;
import com.github.tobato.fastdfs.domain.fdfs.StorePath;
import com.github.tobato.fastdfs.domain.fdfs.ThumbImageConfig;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;


/**
 * Fastdfs工具类
 */
@Component
public class FastdfsClientUtil {

    private final Logger logger = LoggerFactory.getLogger(FastdfsClientUtil.class);

    @Autowired
    private FastFileStorageClient storageClient;

    @Autowired
    private FastConfig fastConfig;


    //上传文件
    public String upload(MultipartFile myfile) throws Exception{
        //文件名
        String originalFilename = myfile.getOriginalFilename().substring(myfile.getOriginalFilename().lastIndexOf(".") + 1);

        //StorePath storePath = this.storageClient.uploadImageAndCrtThumbImage(myfile.getInputStream(), myfile.getSize(),originalFilename , null);
        StorePath storePath = this.storageClient.uploadFile(myfile.getInputStream(), myfile.getSize(),originalFilename , null);

        String path = fastConfig.getFastUrl()+"/"+storePath.getFullPath();

        return path;
    }

}

