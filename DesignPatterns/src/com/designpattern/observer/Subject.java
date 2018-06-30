package com.designpattern.observer;

/**
 * Created by jon on 17-8-10.
 * 抽象主题
 */
public interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(String str);
}
