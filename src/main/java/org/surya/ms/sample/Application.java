package org.surya.ms.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Spring Cloud entry point for creating the Tenant Service.
 * 
 * @author surya jena
 */
@EnableAutoConfiguration
@EnableDiscoveryClient
@SpringBootApplication
public class Application {
	
	/**
	 * Protected constructor to prevent direct instantiation.
	 */
	protected Application() { }
	
	/**
	 * Spring Boot entry point for launching the application.
	 * 
	 * @param args 
	 */
	public static void main(final String... args) {
		SpringApplication.run(Application.class, args);
	}
	
}
