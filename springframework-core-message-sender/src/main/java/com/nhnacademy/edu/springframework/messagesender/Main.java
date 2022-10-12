package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.service.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.SmsMessageSender;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {

            MessageSendService messageSendService = context.getBean("messageSendService", MessageSendService.class);
            messageSendService.doSendMessage();

            /*MessageSender emailMessageSender = context.getBean("emailMessageSender", EmailMessageSender.class);
            MessageSender smsMessageSender = context.getBean("smsMessageSender", SmsMessageSender.class);
            emailMessageSender.sendMessage(new User("dk@email.com", "xxx"), "email");
            smsMessageSender.sendMessage(new User("dk@email.com", "xxx"), "sms");*/

            /*System.out.println("-------");
            new MessageSendService(context.getBean("emailMessageSender", EmailMessageSender.class)).doSendMessage();
            System.out.println("-------");
            new MessageSendService(context.getBean("emailMessageSender", EmailMessageSender.class)).doSendMessage();
            System.out.println("-------");
            new MessageSendService(context.getBean("smsMessageSender", SmsMessageSender.class)).doSendMessage();
            System.out.println("-------");
            new MessageSendService(context.getBean("smsMessageSender", SmsMessageSender.class)).doSendMessage();*/
        }
        // new MessageSendService(new SmsMessageSender()).doSendMessage();
        // new MessageSendService(new EmailMessageSender()).doSendMessage();
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
