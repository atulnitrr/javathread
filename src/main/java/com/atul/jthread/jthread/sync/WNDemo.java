package com.atul.jthread.jthread.sync;

import java.util.Scanner;

public class WNDemo {

    private Scanner scanner = new Scanner(System.in);

    public void process() throws InterruptedException {
        produce();
        consumer();
    }

    private void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Producer started ");
            wait();
            System.out.println("Producer resumed");
        }
    }

    private void consumer() throws InterruptedException {
        synchronized (this) {
            Thread.sleep(2000);
            System.out.println("Waiting for return key");
            scanner.next();
            System.out.println("Return key pressed ");
            notify();
            Thread.sleep(2000);
        }
    }
}
