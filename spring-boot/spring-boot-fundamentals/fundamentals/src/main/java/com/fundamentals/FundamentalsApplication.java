package com.fundamentals;

import com.fundamentals.entity.Application;
import com.fundamentals.repository.ApplicationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FundamentalsApplication {

	private static final Logger log = LoggerFactory.getLogger(FundamentalsApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(FundamentalsApplication.class, args);
    	System.out.println("Application Running");
	}

	@Bean
	public CommandLineRunner demo(ApplicationRepository repo) {
		return (args) -> {
			repo.save(new Application("Trackzilla", "kesha.williams", "Application for tracking bugs"));
			repo.save(new Application("Expenses", "mary.jones", "Application to track expenses"));
			repo.save(new Application("Notifications", "karen.kane", "Application to send alerts"));
			for(Application app: repo.findAll()) {
				log.info("The application is: " + app.toString());
			}
		};
	}
}
