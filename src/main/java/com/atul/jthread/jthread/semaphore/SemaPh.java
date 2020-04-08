package com.atul.jthread.jthread.semaphore;

import java.util.concurrent.Semaphore;

public class SemaPh {

    public void first() throws InterruptedException {

        Semaphore semaphore = new Semaphore(1);
        semaphore.release();
        semaphore.acquire();
        System.out.println("cc -->" + semaphore.availablePermits());
    }
}
