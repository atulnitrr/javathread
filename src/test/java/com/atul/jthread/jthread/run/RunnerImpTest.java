package com.atul.jthread.jthread.run;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
}