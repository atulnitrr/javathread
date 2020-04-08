package com.atul.jthread.jthread.rnlocck;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RNLockTest {

    private RNLock rnLock = new RNLock();


    @Test
    void test() throws InterruptedException {
        final Thread thread1 = new Thread(() -> {
            try {
                rnLock.first();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        final Thread thread2 = new Thread(() -> {
            try {
                rnLock.second();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();;
        thread2.start();

        thread1.join();
        thread2.join();

        rnLock.done();
    }
}