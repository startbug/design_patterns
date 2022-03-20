package com.ggs.custom_framework.utils;

import java.util.Locale;

/**
 * @Author lianghaohui
 * @Date 2022/3/19 22:12
 * @Description
 */
public class CustomStringUtils {

    private CustomStringUtils() {
    }

    //userDao ==> setUserDao
    public static String getSetterMethodByFieldName(String fieldName) {
        return "set" + fieldName.substring(0, 1).toUpperCase(Locale.ROOT) + fieldName.substring(1);
    }

}
