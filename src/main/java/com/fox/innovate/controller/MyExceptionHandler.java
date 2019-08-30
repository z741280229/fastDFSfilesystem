package com.fox.innovate.controller;

import com.fox.innovate.pojo.NetStaus;
import org.apache.tomcat.util.http.fileupload.FileUploadBase;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class MyExceptionHandler {

    @Value("${spring.servlet.multipart.max-file-size}")
    private String maxFileSize;

    @Value("${spring.servlet.multipart.max-request-size}")
    private String maxRequestSize;


    @ExceptionHandler(Exception.class)
    public NetStaus handleMaxUploadSizeExceededException(MaxUploadSizeExceededException e) {
        NetStaus netStaus = new NetStaus();
        netStaus.setCode(NetStaus.FILE_OUT_MAX);
        netStaus.setDescribe("上传文件过大");
        Map map = new HashMap();
        map.put("maxFileSize",maxFileSize);
        map.put("maxRequestSize",maxRequestSize);
        netStaus.setResponseData(map);
        return netStaus;
    }
}
