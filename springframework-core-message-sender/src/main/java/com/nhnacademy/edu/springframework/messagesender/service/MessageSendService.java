package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageSendService {

    @Autowired
    private MessageSender messageSender;

    public MessageSendService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public MessageSendService() {

    }

    public void setEmailMessageSender(MessageSender messageSender) {
        System.out.println("set by setMessageSender");
        this.messageSender = messageSender;
    }

    public void doSendMessage() {
        messageSender.sendMessage(
                new User("email@email.com","010xxxx"),"something");
    }
}
