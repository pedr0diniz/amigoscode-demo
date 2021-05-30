package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

	// running the application without setting up a database will lead to an error: Failed to determine a suitable driver class
	// let's comment the jpa dependency in pom.xml in order to avoid this error for now
	// after commenting the jpa dependency, right click on the pom.xml file > Maven > Reload Project and then run it again
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
