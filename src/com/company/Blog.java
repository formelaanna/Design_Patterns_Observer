package com.company;

import java.util.LinkedList;
import java.util.List;

public class Blog implements Observable {

    private final String blogName;

    public Blog(String blogName) {
        this.blogName = blogName;
    }

    List<Observer> blogSubscribers = new LinkedList<>();

    @Override
    public void addObserver(Observer observer) {
        blogSubscribers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        blogSubscribers.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for (Observer observer : blogSubscribers) {
            observer.update();
        }
    }

    public void publishNewArticle(String articleName){
        System.out.println(String.format("Publish new article on blog %s and the title is:  %s ", blogName, articleName));

        notifyObservers();
        }


}
