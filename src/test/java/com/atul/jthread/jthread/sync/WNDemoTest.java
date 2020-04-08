package com.atul.jthread.jthread.sync;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WNDemoTest {

    WNDemo wnDemo = new WNDemo();


    @Test
    void test() throws InterruptedException {
        wnDemo.process();
    }
}