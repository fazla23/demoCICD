package com.example.demoCICD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;


@SpringBootApplication
public class DemoCicdApplication {
	static Logger log = Logger.getLogger(DemoCicdApplication.class.getName());

	public static void main(String[] args) {
		log.info("Running from main app");
		SpringApplication.run(DemoCicdApplication.class, args);
	}

}
