package com.arraypay.market.util;

import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created by fred on 2017/12/6.
 */
public class AuthUtil {

    public static String getCurrentUserName(){
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }
}
