package com.atul.jthread.jthread.sync;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ProccessorTest {

    Proccessor proccessor;

    @BeforeEach
    void setUp() {
        proccessor = new Proccessor();
    }

    @Test
    void ttest() throws InterruptedException {
        final Thread thread = new Thread(proccessor);
        thread.start();
        System.out.println("Press enter to shutdown");
//        Scanner scanner = new Scanner(System.in);
//        scanner.next();
//        proccessor.shutDown();
//        Thread.sleep(1200);
    }
}