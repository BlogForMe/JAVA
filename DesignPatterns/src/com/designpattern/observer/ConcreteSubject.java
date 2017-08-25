package com.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jon on 17-8-10.
 */
public class ConcreteSubject implements Subject {
    //存放观察者
    private List<Observer> list = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyOBservers(String str) {
        for (Observer observer : list) {
            observer.update(str);
        }
    }
}
