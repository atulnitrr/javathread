package com.atul.jthread.jthread.sync;


import java.util.stream.IntStream;

public class CommonThread implements Runnable {

    private int count;

    @Override
    public void run() {
        IntStream.rangeClosed(1, 100).forEach(i -> count++);
        System.out.println("ccount --> " + count);
    }


}
