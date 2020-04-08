package com.atul.jthread.jthread.deadlock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeadLockTest {

    private DeadLock deadLock = new DeadLock();


    @Test
    void test_deadlock() throws InterruptedException {

        final Thread producer = new Thread(() -> deadLock.producer());
        final Thread consumer = new Thread(() -> deadLock.consume());

        producer.start();
        consumer.start();;

        producer.join();
        consumer.join();

        deadLock.done();
    }
}