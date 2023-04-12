package com.example.observer;

import org.springframework.stereotype.Service;

@Service("email")
class EmailSendService implements SendMsgService {
    @Override
    public void sendMsg(String content) {
        System.out.println("邮件发送:" + content);
    }
}