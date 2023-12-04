package com.aop.demo;

import com.aop.demo.services.CustomFilter;
import com.aop.demo.services.UserFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@Slf4j
public class SpringAopBasicsApplication implements CommandLineRunner {

	@Autowired
	private UserFilter userFilter;

	@Autowired
	private CustomFilter customFilter;

	public static void main(String[] args) {
		SpringApplication.run(SpringAopBasicsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("{}", customFilter.applyFilter());
		log.info("{}", userFilter.applyFilter());
	}
}
