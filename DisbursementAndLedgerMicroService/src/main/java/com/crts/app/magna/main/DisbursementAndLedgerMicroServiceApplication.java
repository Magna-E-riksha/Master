package com.crts.app.magna.main;

import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.scheduling.annotation.EnableScheduling;
@EnableScheduling
@EnableEurekaClient
@EntityScan(basePackages = "com.crts.app.magna")
@EnableJpaRepositories
@SpringBootApplication
public class DisbursementAndLedgerMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisbursementAndLedgerMicroServiceApplication.class, args);
	}
	
	@Bean
	 public JavaMailSender javaMailService() {
	        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();

	        javaMailSender.setHost("smtp.gmail.com");
	        javaMailSender.setPort(465);

	        javaMailSender.setJavaMailProperties(getMailProperties());
	        javaMailSender.setUsername("nileshg.pawar017@gmail.com");
	        javaMailSender.setPassword("Nilesh@12345");

	        return javaMailSender;
	    }

	    private Properties getMailProperties() {
	        Properties properties = new Properties();
	        properties.setProperty("mail.transport.protocol", "smtp");
	        properties.setProperty("mail.smtp.auth", "true");
	        properties.setProperty("mail.smtp.starttls.enable", "true");
	        properties.setProperty("mail.debug", "true");
	        properties.setProperty("mail.smtp.ssl.enable","true");
	        properties.setProperty("mail.test-connection","true");
	        return properties;
	    }


}
