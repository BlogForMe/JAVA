package com.designpattern.observer;

/**
 * Created by jon on 17-8-10.
 * 具体观察者
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update(String str) {
        System.out.println(str);
    }
}
