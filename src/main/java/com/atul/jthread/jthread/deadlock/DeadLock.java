package com.atul.jthread.jthread.deadlock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

public class DeadLock {

    private Account account1 = new Account();
    private Account account2 = new Account();
    private Random random = new Random();
    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    private void increment() {
//        IntStream.rangeClosed(1, 1000).forEach(i -> count ++);
    }

    public void producer() {
        lock1.lock();
        lock2.lock();
        IntStream.rangeClosed(1, 100)
                 .forEach(i -> Account.transfer(account1, account2, random.nextInt(100)));

        lock1.unlock();
        lock2.unlock();
    }

    public void consume() {
        lock2.lock();
        lock1.lock();
        IntStream.rangeClosed(1, 100)
                 .forEach(i -> Account.transfer(account2, account1, random.nextInt(100)));
        lock2.unlock();
        lock1.unlock();

    }

    public void done() {
        System.out.println("account1 balance --> " + account1.getBalance());
        System.out.println("account2 balance --> " + account2.getBalance());
        System.out.println("Total balance --> " + (account1.getBalance() + account2.getBalance()));
    }
}
