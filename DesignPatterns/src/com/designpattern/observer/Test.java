package com.designpattern.observer;

/**
 * Created by jon on 17-8-10.
 */
public class Test {
    public static void main(String[] args) {
        //一个主题
        ConcreteSubject eatSubject = new ConcreteSubject();
        //两个观察者
        ConcreteObserver p1 = new ConcreteObserver();
        ConcreteObserver p2 = new ConcreteObserver();

        //观察者订阅主题
        eatSubject.addObserver(p1);
        eatSubject.addObserver(p2);
        eatSubject.notifyOBservers("起来敲代码啦！！！");

    }
}
