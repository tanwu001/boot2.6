package com.example.observer;
/**
 * 观察者，JDK自带有观察者，定义接口不指定实现
 */
interface Observer {

    void notify(String bizType, String content);
}
