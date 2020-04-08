package com.atul.jthread.jthread.rnlocck;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

public class RNLock {

    private int count = 0;
    private Lock lock = new ReentrantLock();

    private void increment() {
        IntStream.rangeClosed(1, 1000).forEach(i -> count++);
    }

    public void first() throws  InterruptedException {
        System.out.println("First ");
        lock.lock();
        try {
            increment();
        } finally {
            lock.unlock();
        }



    }

    public void second() throws InterruptedException {
        System.out.println("Second ");
        lock.lock();
        try {
            increment();
        } finally {
            lock.unlock();
        }
    }

    public void done() {
        System.out.println("increment " + count);
    }
}
