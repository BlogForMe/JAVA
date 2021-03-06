package com.designpattern.adapter;

import com.designpattern.adapter.object.Adapter;

/**
 * Created by jon on 17-8-10.
 */
public class CAdapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.specificRequest();
    }

    public static void main(String[] args) {

        Target adapter = new CAdapter();
        adapter.request();
    }
}
