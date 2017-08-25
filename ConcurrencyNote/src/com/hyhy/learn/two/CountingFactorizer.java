package com.hyhy.learn.two;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by jon on 17-8-25.
 */
public class CountingFactorizer {
    private static ExecutorService exec;
    final AtomicLong count = new AtomicLong(0);

    public long getCount() {
        return count.get();
    }

    private void increment() {

        exec.execute(new Runnable() {
            @Override
            public void run() {

                while (true) {
                    count.incrementAndGet();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getCount());
                }
            }
        });
    }


    public static void main(String[] args) {
        CountingFactorizer cf = new CountingFactorizer();
        exec = Executors.newCachedThreadPool();
        cf.increment();
        cf.increment();
    }

}
