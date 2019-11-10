package com.crts.app.magna.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EntityScan(basePackages = "com.crts.app.magna")
@EnableJpaRepositories
@SpringBootApplication
public class DisbursementAndLedgerMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisbursementAndLedgerMicroServiceApplication.class, args);
	}

}
