package com.mlxc.bea_vil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mlxc.controller")
@ComponentScan("com.mlxc.entity")
public class BeaVilApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeaVilApplication.class, args);
	}
}
