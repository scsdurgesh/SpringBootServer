package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.core.env.Environment;

@EnableConfigServer
@SpringBootApplication
public class CloudConfigurationServerDemoApplication {

	
	private Environment environment;
	
	public Environment getEnvironment() {
		return environment;
	}

	public void setEnvironment(@Autowired Environment environment) {
		System.out.println("Project Name"+environment.getProperty("configuration.projectName"));
		this.environment = environment;
	}

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigurationServerDemoApplication.class, args);
	}
}
