package com.atul.jthread.jthread.sync;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterLeavingThreadTest {

    InterLeavingThread interLeavingThread;

    @BeforeEach
    void setUp() {
        interLeavingThread = new InterLeavingThread();
    }

    @Test
    void test() throws InterruptedException {
        interLeavingThread.doWork();
//        Thread.sleep(12000);
    }
}