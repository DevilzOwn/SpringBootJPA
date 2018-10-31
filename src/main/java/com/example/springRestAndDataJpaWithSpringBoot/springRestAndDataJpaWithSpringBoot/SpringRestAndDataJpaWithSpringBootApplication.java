package com.example.springRestAndDataJpaWithSpringBoot.springRestAndDataJpaWithSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@SpringBootApplication
@EnableSwagger2
@EnableJpaRepositories("nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.repository")
@ComponentScan("nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot")
@EntityScan("nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.entity")
public class SpringRestAndDataJpaWithSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestAndDataJpaWithSpringBootApplication.class, args);
	}
}
