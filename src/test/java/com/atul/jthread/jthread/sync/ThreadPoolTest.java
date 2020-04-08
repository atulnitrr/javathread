package com.atul.jthread.jthread.sync;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class ThreadPoolTest {

    @Test
    void name() throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        IntStream.rangeClosed(1, 5).forEach(i -> executorService.submit(new ThreadPool(i)));

        executorService.shutdown(); // stop accepting
        System.out.println("All submitted");
        executorService.awaitTermination(1, TimeUnit.DAYS);
        System.out.println("All task submitted");
    }
}