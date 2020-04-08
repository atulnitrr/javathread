package com.atul.jthread.jthread.sync;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Worker implements Runnable {

    private Object lock1 = new Object();
    private Object lock2 = new Object();

    Random random = new Random();
    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    @Override
    public void run() {
        process();
    }

    public void process() {
        IntStream.rangeClosed(1, 1000).forEach(i -> {
            stageOne();
            stage2();
        });
    }

    public int getListOneSize() {
        return list1.size();
    }

    public int getListTwoSize() {
        return list2.size();
    }


    private synchronized void stageOne() {

        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (lock1) {
            list1.add(random.nextInt(100));
        }
    }


    private  void stage2() {

        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (lock2) {
            list2.add(random.nextInt(100));
        }

    }


}
