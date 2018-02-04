package com.example.ConfigServerForJobFinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication
@EnableConfigServer
public class ConfigServerForJobFinderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerForJobFinderApplication.class, args);
	}
}
