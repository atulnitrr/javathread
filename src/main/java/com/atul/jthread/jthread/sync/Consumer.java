package com.atul.jthread.jthread.sync;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    private BlockingQueue<Integer> blockingQueue;

    private Random random = new Random();
    public Consumer(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {

       while (true) {
           try {
               Thread.sleep(10);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }

           if (random.nextInt(10) == 0) {
               try {
                   final Integer value = blockingQueue.take();
                   System.out.println("taken --> " + value + " Queue size ->  " + blockingQueue.size());
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
       }

    }
}
