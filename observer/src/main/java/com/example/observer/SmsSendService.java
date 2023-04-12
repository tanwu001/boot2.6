package com.example.observer;

import org.springframework.stereotype.Service;

@Service("sms")
class SmsSendService implements SendMsgService {
    @Override
    public void sendMsg(String content) {
        System.out.println("短信发送:" + content);
    }
}