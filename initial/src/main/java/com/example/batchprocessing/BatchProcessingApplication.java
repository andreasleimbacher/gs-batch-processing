package com.example.batchprocessing;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// @EnableBatchProcessing
//
//Note how the application does not use the @EnableBatchProcessing annotation. Previously, @EnableBatchProcessing could be used to enable Spring Boot’s auto-configuration of Spring Batch. Starting from Spring Boot v3.0, this annotation is no longer required and should be removed from applications that want to use Spring Boot’s auto-configuration. A bean that is annotated with @EnableBatchProcessing or that extends Spring Batch’s DefaultBatchConfiguration can now be defined to tell the auto-configuration to back off, allowing the application to take complete control of how Spring Batch is config
public class BatchProcessingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BatchProcessingApplication.class, args);
	}

}
