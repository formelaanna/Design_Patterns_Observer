package com.company;

public class SubscriberInformations implements Subscriber {
    private final String name;
    private final String phoneNumber;
    private final String email;
    private boolean isPushNotificationEnable = true;
    private boolean isEmailNotificationEnable = true;
    private boolean isSmsNotificationEnable = true;

    public SubscriberInformations(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public boolean isPushNotificationEnabled() {
        return isPushNotificationEnable;
    }

    @Override
    public boolean isEmailNotificationEnabled() {
        return isEmailNotificationEnable;
    }

    @Override
    public boolean isSmsNotificationEnabled() {
        return isSmsNotificationEnable;
    }

    @Override
    public void setPushNotificationEnable(boolean pushNotificationEnable) {
        this.isPushNotificationEnable = pushNotificationEnable;

    }

    @Override
    public void setSmsNotificationEnable(boolean smsNotificationEnable) {
        this.isSmsNotificationEnable = smsNotificationEnable;
    }

    @Override
    public void setEmailNotificationEnable(boolean emailNotificationEnable) {
        this.isEmailNotificationEnable = emailNotificationEnable;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
