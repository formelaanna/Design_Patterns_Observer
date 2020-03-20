package com.company;

public interface SubscriberObserver extends Observer {

    void sendEmailNotification();
    void sendPushNotification();
    void sendSmsNotification();

}
