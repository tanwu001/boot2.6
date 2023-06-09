package com.example.controllerdemo;

import lombok.Getter;

@Getter
public enum  AppCode {

    APP_ERROR(2000, "业务异常"),
    PRICE_ERROR(2001, "价格异常");

    private int code;
    private String msg;

    AppCode(int code, String msg) {
   
     
        this.code = code;
        this.msg = msg;
    }
}