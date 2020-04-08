package com.atul.jthread.jthread.sync;

import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class CountDownLatchProcessorTest {

    @Test
    void test() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(100);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        IntStream.rangeClosed(1, 6).forEach(i -> {
            executorService.submit(new CountDownLatchProcessor(countDownLatch));
        });


        countDownLatch.await();

//        executorService.shutdownNow();
//        executorService.awaitTermination(1, TimeUnit.DAYS);
    }
}