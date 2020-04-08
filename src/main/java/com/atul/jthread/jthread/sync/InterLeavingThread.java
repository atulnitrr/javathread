package com.atul.jthread.jthread.sync;

import java.util.stream.IntStream;

public class InterLeavingThread {

    private int count = 0;

    private synchronized void increment() {
        count++;
    }

    public void doWork() throws InterruptedException {

        Thread thread1 = new Thread(() -> {
            IntStream.rangeClosed(1, 100)
                     .forEach(i -> increment());
        });

        Thread thread2 = new Thread(() -> {
            IntStream.rangeClosed(1, 100)
                     .forEach(j -> increment());
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("count " + count);
    }
}
