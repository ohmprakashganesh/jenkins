package com.jenkins;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsApplication {
  public static Logger logger= LoggerFactory.getLogger(JenkinsApplication.class);

	@PostConstruct
	public  void init(){
		logger.info("application for jenkins started");
	}

	public static void main(String[] args) {
		logger.info("application started");
		SpringApplication.run(JenkinsApplication.class, args);
	}

}
