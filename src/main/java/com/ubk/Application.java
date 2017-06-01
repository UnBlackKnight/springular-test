package com.ubk;

import com.ubk.domain.Spending;
import com.ubk.repository.SpendingRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableAutoConfiguration
public class Application {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);

	@Autowired
	SpendingRepository spendingRepository;

	@Bean
	public EmbeddedServletContainerCustomizer containerCustomizer(){
		return ( container -> {
			ErrorPage custom404Page = new ErrorPage(HttpStatus.NOT_FOUND,"/404");
			container.addErrorPages(custom404Page);
		});
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@PostConstruct
	void seeSpendings(){
		logger.info("seeSpendings method called...");
		for (Spending spending : spendingRepository.findAll()){
			logger.info(spending.toString());
		}
	}
}
