package com.atul.jthread.jthread.run;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class RunnerImpTest {

    RunnerImp runnerImp;

    @BeforeEach
    void setUp() {
        runnerImp = new RunnerImp();
    }

    @Test
    void test_runnable() throws InterruptedException {
        final Thread thread1 = new Thread(runnerImp);
        final Thread thread2 = new Thread(runnerImp);
        thread1.start();
        thread2.start();
        Thread.sleep(1200);
    }

    @Test
    void test_thread() throws InterruptedException {
        Thread thread = new Thread(() -> IntStream.iterate(0, b -> b + 1)
                                          .limit(10)
                                          .forEach(i -> {
                     System.out.println(Thread.currentThread().getName() + " -> " + i);
                     try {
                         Thread.sleep(10);
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                 }));
        thread.start();
        Thread.sleep(1100);
    }
}