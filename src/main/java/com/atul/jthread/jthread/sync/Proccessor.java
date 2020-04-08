package com.atul.jthread.jthread.sync;

public class Proccessor implements Runnable {

    private volatile boolean running = true;

    public void shutDown() {
        running = false;
    }

    @Override
    public void run() {
        while (running) {

            System.out.println("Running ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
