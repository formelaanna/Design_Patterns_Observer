package com.company;

public class BlogSubsriber implements SubscriberObserver {

    private final Subscriber subscriber;
    private final static String RESULT_INFORMATION = "[%s] %s, you have %d unread articles";
    private int numberOfArticlesToRead = 0;

    public BlogSubsriber(Subscriber subscriber) {
        this.subscriber = subscriber;
    }

    @Override
    public void sendEmailNotification() {
        if(subscriber.isEmailNotificationEnabled()){
            System.out.println(String.format(RESULT_INFORMATION, NotificationTags.EMAIL, subscriber.getName(),
                    numberOfArticlesToRead));
        }

    }

    @Override
    public void sendPushNotification() {
        if (subscriber.isPushNotificationEnabled()) {
            System.out.println(String.format(RESULT_INFORMATION, NotificationTags.PUSH, subscriber.getName(),
                    numberOfArticlesToRead));

        }
    }

    @Override
    public void sendSmsNotification() {
        if(subscriber.isSmsNotificationEnabled()){
            System.out.println(String.format(RESULT_INFORMATION, NotificationTags.SMS, subscriber.getName(),
                    numberOfArticlesToRead));
        }

    }

    @Override
    public void update() {

        numberOfArticlesToRead++;
        sendEmailNotification();
        sendPushNotification();
        sendSmsNotification();

    }
}
