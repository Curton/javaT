package com.company;

public class MyThread0 implements Runnable{

    private int count = 0;
    private static final int RUN_TIMES = 100000;

    @Override
    public synchronized void run() {
        ch();
    }

    private void ch() {
        for (int i = 0; i < RUN_TIMES; i++) {
            inc();
        }
    }

    private void inc() {
        count ++;
    }

    public int getCount() {
        return count;
    }
}
