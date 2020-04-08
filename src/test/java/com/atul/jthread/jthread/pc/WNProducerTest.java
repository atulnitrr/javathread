package com.atul.jthread.jthread.pc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WNProducerTest {

    WNProducer wnProducer = new WNProducer();


    @Test
    void name() throws InterruptedException {
        Thread producer = new Thread(() -> {
            try {
                wnProducer.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread consume = new Thread(() -> {
            try {
                wnProducer.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consume.start();

        producer.join();
        producer.join();

    }
}