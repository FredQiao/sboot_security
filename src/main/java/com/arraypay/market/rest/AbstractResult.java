package com.arraypay.market.rest;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by fred on 2017/12/5.
 */
public class AbstractResult {
    String code;

    String message;

    public AbstractResult(String code) {
        this.code = code;
    }

    public AbstractResult(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
