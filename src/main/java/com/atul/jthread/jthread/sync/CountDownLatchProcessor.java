package com.atul.jthread.jthread.sync;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchProcessor implements Runnable {

    private CountDownLatch countDownLatch;

    public CountDownLatchProcessor(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {

        System.out.println("Started --> ");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        countDownLatch.countDown();
        System.out.println("Ended --> ");
    }
}
