package com.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

	@Bean
	@Scope(scopeName="prototype")
	public Student getStudent() {
		return new Student();
	}
}
