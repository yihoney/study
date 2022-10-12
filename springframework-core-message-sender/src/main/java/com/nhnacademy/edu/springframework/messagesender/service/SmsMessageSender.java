package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;

public class SmsMessageSender implements MessageSender{

    public SmsMessageSender() {
        System.out.println("SMS MessageSender initiated!");
    }

    public void init() {
        System.out.println("SMS MessageSender init called!");

    }

    public void destroy() {
        System.out.println("destroy method called in SmsMessageSender");
    }

    @Override
    public void sendMessage(User user, String message) {
        System.out.println("Sms message");
    }
}
