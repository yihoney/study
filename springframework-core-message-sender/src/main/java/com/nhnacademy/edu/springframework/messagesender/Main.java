package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.service.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.SmsMessageSender;

public class Main {

    public static void main(String[] args) {
        new MessageSendService(new SmsMessageSender()).doSendMessage();
        new MessageSendService(new EmailMessageSender()).doSendMessage();
    }

/*    private void sendSmsMessage(User user, String message) {
        System.out.println("SMS Message Sent to "+user.getPhoneNumber()
                            + message);

    }

    private void sendEmailMessage(User user, String message) {
        System.out.println("Email Message Sent to " + user.getEmail()
                            + message);
    }*/
}
