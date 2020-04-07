package com.atul.jthread.jthread;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunnerTest {

    Runner runner;

    @BeforeEach
    void setUp() {

    }

    @Test
    void test_34() throws InterruptedException {
        runner = new Runner();
        runner.start();
        Thread.sleep(1200);
    }
}