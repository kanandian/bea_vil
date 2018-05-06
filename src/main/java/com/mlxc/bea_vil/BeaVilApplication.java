package com.mlxc.bea_vil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.mlxc.controller")
@ComponentScan("com.mlxc.service")
@EntityScan({"com.mlxc.entity", "com.mlxc.entityrelation"})
@EnableJpaRepositories("com.mlxc.dao")
public class BeaVilApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeaVilApplication.class, args);
	}
}


