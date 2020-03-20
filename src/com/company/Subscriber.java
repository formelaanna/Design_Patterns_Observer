package com.company;

public interface Subscriber {
    boolean isPushNotificationEnabled();
    boolean isEmailNotificationEnabled();
    boolean isSmsNotificationEnabled();
    void setPushNotificationEnable(boolean state);
    void setSmsNotificationEnable(boolean state);
    void setEmailNotificationEnable(boolean state);
    String getEmail();
    String getName();
    String getPhoneNumber();
}
