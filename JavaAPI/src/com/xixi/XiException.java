package com.xixi;

public class XiException extends Exception {

    public XiException(ErrorCode errorCode) {
        super(errorCode.getMsg());
    }

}
