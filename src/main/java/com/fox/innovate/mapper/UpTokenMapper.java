package com.fox.innovate.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UpTokenMapper {
   String getToken();
}