package com.atul.jthread.jthread.pc;

import java.util.List;

public class WNConsumer implements Runnable {

    private List<Integer> integers;

    public WNConsumer(List<Integer> integers) {
        this.integers = integers;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (true) {
            synchronized (this) {
                Integer value = integers.get(0);
                System.out.println("Got data " + value  +  " size " + integers.size());
                notify();
            }
        }

    }
}
