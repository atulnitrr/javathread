package com.atul.jthread.jthread.sync;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    Worker worker;

    @BeforeEach
    void setUp() {
        worker = new Worker();
    }

    @Test
    void test_worker() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread thread1 = new Thread(worker);
        Thread thread2 = new Thread(worker);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        long end = System.currentTimeMillis();
        System.out.println("l1 size : " + worker.getListOneSize());
        System.out.println("l2 size : " + worker.getListTwoSize());
        System.out.println("end - start  : " +  (end - start));
    }
}