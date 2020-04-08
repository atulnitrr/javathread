package com.atul.jthread.jthread.callableAndFuture;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Random;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class DummyTest {

    Random random = new Random();


    @Test
    void test() throws InterruptedException {
        System.out.println("Starting ");
        Thread thread1 = new Thread(() -> {
            IntStream.rangeClosed(1, 100000000).forEach(i -> {

                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("Interrupted ");
                }
                Math.sin(random.nextDouble());
            });

        });

        thread1.start();
        Thread.sleep(500);
        thread1.interrupt();
        thread1.join();
        System.out.println("Done");
    }
}