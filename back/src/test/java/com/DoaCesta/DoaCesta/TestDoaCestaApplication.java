package com.DoaCesta.DoaCesta;

import org.springframework.boot.SpringApplication;

public class TestDoaCestaApplication {

	public static void main(String[] args) {
		SpringApplication.from(DoaCestaApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
