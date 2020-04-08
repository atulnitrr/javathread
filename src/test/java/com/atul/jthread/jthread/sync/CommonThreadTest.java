package com.atul.jthread.jthread.sync;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommonThreadTest {

    CommonThread commonThread;
    @BeforeEach
    void setUp() {
        commonThread = new CommonThread();
    }

    @Test
    void name() throws InterruptedException {
        Thread thread1 = new Thread(commonThread);
        Thread thread2 = new Thread(commonThread);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}