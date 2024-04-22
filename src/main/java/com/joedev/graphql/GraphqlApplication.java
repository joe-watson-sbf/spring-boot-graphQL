package com.joedev.graphql;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ProductRepository productRepository) {
		return args -> {
			productRepository.save(new Product(null, "Product 1", "Description of product 1", 100.0));
			productRepository.save(new Product(null, "Product 2", "Description of product 2", 200.0));
			productRepository.save(new Product(null, "Product 3", "Description of product 3", 300.0));
			productRepository.save(new Product(null, "Product 4", "Description of product 4", 400.0));
			productRepository.save(new Product(null, "Product 5", "Description of product 5", 500.0));
			productRepository.save(new Product(null, "Product 6", "Description of product 6", 600.0));
			productRepository.save(new Product(null, "Product 7", "Description of product 7", 700.0));
			productRepository.save(new Product(null, "Product 8", "Description of product 8", 800.0));
			productRepository.save(new Product(null, "Product 9", "Description of product 9", 900.0));
			productRepository.save(new Product(null, "Product 10", "Description of product 10", 1000.0));
		};
	}

}
