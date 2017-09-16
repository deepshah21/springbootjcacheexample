package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * Sample Project with Ehcache
 *
 */
@SpringBootApplication
@EnableCaching
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
