package com.atul.jthread.jthread.run;

import sun.jvm.hotspot.runtime.Threads;

import java.util.stream.IntStream;

public class RunnerImp implements Runnable {
    @Override
    public void run() {

        IntStream.iterate(0, b -> b + 1)
                 .limit(10)
                 .forEach(i -> {
                     System.out.println(Thread.currentThread().getName() + " -> " + i);
                     try {
                         Thread.sleep(10);
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                 });
    }
}
