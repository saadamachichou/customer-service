package org.ensa.ensacustomerservice;

import org.ensa.ensacustomerservice.dto.CustomerRequestDTO;

import org.ensa.ensacustomerservice.services.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EnsaCustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnsaCustomerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CustomerService customerService){
		return args -> {
			customerService.save(new CustomerRequestDTO("C01","Karim","akrim@gmail.com"));
			customerService.save(new CustomerRequestDTO("C02","Zakaria","zakaria@gmail.com"));
			customerService.save(new CustomerRequestDTO("C03","xxx","xxx@gmail.com"));
		};
	}
}
