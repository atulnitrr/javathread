package com.atul.jthread.jthread.semaphore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SemaPhTest {

    private SemaPh semaPh;

    @BeforeEach
    void setUp() {
        semaPh = new SemaPh();
    }

    @Test
    void testSema() throws InterruptedException {
        semaPh.first();
    }
}