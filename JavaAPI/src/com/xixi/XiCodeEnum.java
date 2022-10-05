package com.xixi;

public enum XiCodeEnum implements ErrorCode {
    NOT_FOUND_PAGE("404", "找不到网站资源"),
    NOT_FOUND_FILE("444", "找不到文件"),
    NOT_OVER_TEN("233", "只能求0-10的加法！"),
    ;

    private final String code;
    private final String msg;

    XiCodeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
