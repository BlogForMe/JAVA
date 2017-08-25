package com.designpattern.adapter.object;

import com.designpattern.adapter.Adaptee;
import com.designpattern.adapter.Target;

/**
 * Created by jon on 17-8-10.
 * 对象适配器
 */
public class Adapter implements Target {
    //直接关联被适配类
    private Adaptee adaptee;

    //可以通过构造函数传入具体需要适配的被适配类对象
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        this.adaptee.specificRequest();
    }

    public static void main(String[] args) {
        Target adapter = new Adapter(new Adaptee());
        adapter.request();
    }
}

