package com.company;

public class Main {

    public static void main(String[] args) {

        Blog java_informations = new Blog("javainformations.pl");
        Blog tech_informations = new Blog("techinformations.pl");

        Subscriber subscriber1 = new SubscriberInformations("Kate", "000-000-000", "kate@gmail.com");
        Subscriber subscriber2 = new SubscriberInformations("Tom", "111-111-111", "tom@gmail.com");

        BlogSubsriber kate = new BlogSubsriber(subscriber1);
        BlogSubsriber tom = new BlogSubsriber(subscriber2);

        subscriber1.setEmailNotificationEnable(true);
        subscriber1.setSmsNotificationEnable(true);
        subscriber1.setPushNotificationEnable(true);

        subscriber2.setSmsNotificationEnable(true);
        subscriber2.setPushNotificationEnable(false);
        subscriber2.setEmailNotificationEnable(true);

        java_informations.addObserver(kate);
        java_informations.addObserver(tom);
        tech_informations.addObserver(kate);

        java_informations.publishNewArticle("Everything you need to know about Observer Design Pattern");
        java_informations.publishNewArticle("Lambda Expressions");
        tech_informations.publishNewArticle("How to become a better Java Developer");
        tech_informations.publishNewArticle("AI news");

    }
}
