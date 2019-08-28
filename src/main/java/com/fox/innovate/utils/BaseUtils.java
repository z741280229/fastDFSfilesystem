package com.fox.innovate.utils;

import com.fox.innovate.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 基本工具类
 */
@Component
public class BaseUtils {

    @Autowired
    private FileService fileService;
    private static BaseUtils baseUtils;

    /**
     * 以时间生成Id
     * @return
     */
    public static String createNum(String prefix) throws Exception{
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddhhmmss");
        if (prefix == null || prefix==""){
            return "NO" + format.format(new Date());
        }else {
            return  prefix+ format.format(new Date());
        }
    }

    /**
     * 获取当前系统当前日期
     * @return
     */
    public static String getDate() throws Exception {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        return df.format(new Date());
    }

    /**
     * 获取当前系统日期和时间
     * @return
     * @throws Exception
     */
    public static String getDateTime() throws Exception {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        return df.format(new Date());
    }

    /**
     * 判断ID是否存在
     * @param iDs
     * @param compareId
     * @return
     */
    public static int isExist(List<String> iDs,String compareId) throws Exception{
        if (iDs==null && (compareId == null||compareId=="")){
            return 2; //传入数据为空
        }else {
            for (String id:iDs) {
                if (id.equals(compareId)){
                    return 1; //ID存在
                }
            }
            return 0; //Id不存在
        }
    }


}
