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
        System.out.println("SLeeping for 12 secc enter to shutdown");
        Thread.sleep(1000);
        proccessor.shutDown();
        System.out.println("Done running ");
        Thread.sleep(2000);
        System.out.println("Press enter to shutdown");

    }
}