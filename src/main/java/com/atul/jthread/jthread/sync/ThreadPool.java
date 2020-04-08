package com.atul.jthread.jthread.sync;

public class ThreadPool implements Runnable {

    private int id;

    public ThreadPool(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Started running --> " + id);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ended running --> " + id);

    }
}
