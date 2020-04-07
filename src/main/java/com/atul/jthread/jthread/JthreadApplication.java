package com.atul.jthread.jthread;

import com.atul.jthread.jthread.run.RunnerImp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JthreadApplication {

	public static void main(String[] args) {
		SpringApplication.run(JthreadApplication.class, args);
		System.out.println(Thread.currentThread().getName());
	}

}
