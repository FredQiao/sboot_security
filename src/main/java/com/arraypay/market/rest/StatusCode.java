package com.arraypay.market.rest;

/**
 * Created by fred on 2017/12/5.
 */
public enum StatusCode {

    INVALID_PARAM("000002", "参数错误"),
    USER_NOTEXIST("100000", "用户不存在"),
    USER_EXIST("100001", "用户已存在"),
    USER_COMPANYNAME_ISNULL("100010", "公司名称为空"),
    USER_CAREER_ISNULL("100011", "职位为空"),
    USER_REALNAME_ISNULL("100012", "真实姓名为空"),
    USER_BCARD_ISNULL("100013", "名片为空"),
    USER_IS_INAPPLY("100014", "用户正在申请中"),

    COMMENT_NOTEXIST("300001", "评论不存在");

    private String code;
    private String message;

    StatusCode(String code, String message) {
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
