package com.mlxc.utils;

public class ResultModel {

    public static final int ERRCODE_SUCCESS = 1;
    public static final int ERRCODE_FAILED = 0;


    private int errcode;
    private String errmsg;

    public ResultModel() {

    }

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }
}
