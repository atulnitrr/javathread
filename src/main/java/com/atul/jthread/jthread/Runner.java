package com.atul.jthread.jthread;

import java.util.stream.IntStream;

public class Runner extends Thread {

    @Override
    public void run() {

        IntStream.iterate(0, b -> b + 1)
                 .limit(10)
                 .forEach(i -> {
                     System.out.println("Running " + i);
                     try {
                         Thread.sleep(100);
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                 });
    }
}
