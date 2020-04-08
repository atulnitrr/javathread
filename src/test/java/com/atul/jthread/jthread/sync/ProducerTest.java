package com.atul.jthread.jthread.sync;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import static org.junit.jupiter.api.Assertions.*;

class ProducerTest {

    @Test
    void test() throws InterruptedException {
        BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(10);
        Thread thread1 = new Thread(new Producer(blockingQueue));
        Thread thread2 = new Thread(new Consumer(blockingQueue));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}