package com.atul.jthread.jthread.sync;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    private BlockingQueue<Integer> blockingQueue;
    private Random random = new Random();

    public Producer(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                blockingQueue.put(random.nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
