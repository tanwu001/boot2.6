package com.example.observer;

/**
 * 发送消息的能力抽象，可以理解为策略接口
 */
interface SendMsgService {
    /** 发送内容*/
    void sendMsg(String content);
}