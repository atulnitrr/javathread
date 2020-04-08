package com.atul.jthread.jthread.pc;

import java.util.ArrayList;
import java.util.List;

public class WNProducer  {

    private List<Integer> integers = new ArrayList<>();
    private Integer LIMIT = 10;

    private Object lock = new Object();

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (lock) {
                while (integers.size() == LIMIT) {
                    lock.wait();
                }
                integers.add(value++);
                lock.notify();
            }
        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(2000);
        while (true) {
            synchronized (lock) {

                while (integers.size() == 0) {
                    lock.wait();
                }
                int vallue = integers.remove(0);
                System.out.println("value " + vallue + " queue " + integers.size());
                lock.notify();
            }
        }
    }

}
