package com.nhnacademy.edu.springframework.messagesender;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        User user = new User("email@naver.com", "01012345678");
        main.sendSmsMessage(user, "sms message");
        main.sendEmailMessage(user, "email message");
    }

    private void sendSmsMessage(User user, String message) {
        System.out.println("SMS Message Sent to "+user.getPhoneNumber()
                            + message);

    }

    private void sendEmailMessage(User user, String message) {
        System.out.println("Email Message Sent to " + user.getEmail()
                            + message);
    }
}
