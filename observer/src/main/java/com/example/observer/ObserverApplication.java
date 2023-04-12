package com.example.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ObserverApplication implements CommandLineRunner {

    /** 这里可以注册多个观察者，这个demo只注册了一个消息通知 */
    @Autowired
    List<Observer> observerList;

    public static void main(String[] args) {
        new SpringApplication(ObserverApplication.class).run(args);
    }

    /** 容器启动即执行 */
    @Override
    public void run(String... args) {
        sendMsg("bizType1", "业务1的内容");
        sendMsg("bizType2", "业务2的内容");
    }
    /** client调用，指明业务和需要发送的内容 */
    private void sendMsg(String bizType, String content) {
        observerList.forEach(observer -> observer.notify(bizType, content));
    }

}
