package com.edigest.journalApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;

import java.net.Authenticator;

@SpringBootApplication
@EnableTransactionManagement
@EnableScheduling
public class JournalApplication {

public static void main(String[] args){
	SpringApplication.run(JournalApplication.class, args);
}
@Bean
	public PlatformTransactionManager x(MongoDatabaseFactory dbFactory){
	return new MongoTransactionManager(dbFactory);
}
@Bean
public RestTemplate restTemplate(){
	return new RestTemplate();
}
}
//platformTransactionManager
//mongoTransactionManager

