package com.arraypay.market.rest;

import com.arraypay.market.util.Constant;

/**
 * Created by fred on 2017/12/5.
 */
public class ResultData<T> extends AbstractResult {
    private T data;

    @SuppressWarnings(value = "unchecked")
    public static <T> ResultData<T> ok() {
        return new ResultData(Constant.SUCCESS, null);
    }

    @SuppressWarnings(value = "unchecked")
    public static <T> ResultData<T> ok(String code, String message) {
        return new ResultData(code, message);
    }

    @SuppressWarnings(value = "unchecked")
    public static <T> ResultData<T> error() {
        return new ResultData(Constant.FAIL, Constant.SYS_ERROR);
    }

    public static <T> ResultData<T> error(String message) {
        return new ResultData(Constant.FAIL, message);
    }

    @SuppressWarnings(value = "unchecked")
    public static <T> ResultData<T> error(String code, String message) {
        return new ResultData(code, message);
    }

    public ResultData(String code, String message) {
        super(code, message);
    }

    public static <T> ResultData<T> one(T obj) {
        ResultData<T> res = new ResultData(Constant.SUCCESS, null);
        res.data = obj;
        return res;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
