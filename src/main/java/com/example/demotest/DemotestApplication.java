package com.example.demotest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemotestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemotestApplication.class, args);
		System.out.println("testing");
		Table t1 = new Table();
		t1.print();
		//t1.data1=5;
		//System.out.println("data related = " + t1.data1);

	}

}


