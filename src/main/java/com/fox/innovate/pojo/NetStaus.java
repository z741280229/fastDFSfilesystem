package com.fox.innovate.pojo;

import java.util.Objects;

public class NetStaus {

    public final static Long GET_FAILURE = 00L; // 获取数据失败
    public final static Long INSERT_FAILURE = 10L; // 插入数据失败
    public final static Long UPDATA_FAILURE = 20L; // 数据更新失败
    public final static Long DELETE_FAILURE = 30L; // 输出数据失败

    public final static Long INSERT_SUCCESS = 11L; // 输出数据成功
    public final static Long GET_SUCCESS = 11L; // 获取数据成功
    public final static Long UPDATE_SUCCESS = 21L; // 更新数据成功
    public final static Long DELETE_SUCCESS = 31L; // 输出数据成功

    public final static Long DATA_NULL = 40L; // 输出数据成功

    public final static Long RESPONSE_FAILURE = 2000L; // 服务器响应失败
    public final static Long RESPONSE_SUCCESS = 4000L; // 服务器响应失败

    private Long code;  //返回转台码
    private String describe;  //问题描述
    private Object responseData;  //返回数据


    public NetStaus(){

    }

    public NetStaus(Long code, String describe, Objects response_data) {
        this.code = code;
        this.describe = describe;
        this.responseData = response_data;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Object getResponsData() {
        return responseData;
    }

    public void setResponseData(Object responseData) {
        this.responseData = responseData;
    }
}

