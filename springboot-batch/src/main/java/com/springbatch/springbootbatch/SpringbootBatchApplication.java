package com.springbatch.springbootbatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableBatchProcessing
@ComponentScan("com.springbatch.config")
public class SpringbootBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBatchApplication.class, args);
	}

}
