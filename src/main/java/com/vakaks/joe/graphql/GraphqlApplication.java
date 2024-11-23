package com.vakaks.joe.graphql;

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
			productRepository.save(new Product(null, "Wireless Earbuds", "Compact and high-quality wireless earbuds with noise cancellation.", 89.99));
			productRepository.save(new Product(null, "Gaming Chair", "Ergonomic gaming chair with adjustable armrests and lumbar support.", 249.99));
			productRepository.save(new Product(null, "Smartwatch Pro", "Advanced smartwatch with health tracking and GPS capabilities.", 199.99));
			productRepository.save(new Product(null, "Electric Scooter", "Foldable electric scooter with a 20-mile range and LED display.", 499.99));
			productRepository.save(new Product(null, "4K Smart TV", "55-inch Ultra HD smart TV with built-in streaming apps.", 699.99));
			productRepository.save(new Product(null, "Fitness Tracker", "Lightweight fitness tracker with heart rate monitoring and step counter.", 59.99));
			productRepository.save(new Product(null, "Laptop Stand", "Adjustable aluminum laptop stand for improved posture and cooling.", 39.99));
			productRepository.save(new Product(null, "Noise-Cancelling Headphones", "Over-ear headphones with premium sound quality and noise cancellation.", 129.99));
			productRepository.save(new Product(null, "Portable Power Bank", "10,000mAh power bank with fast charging and dual USB ports.", 29.99));
			productRepository.save(new Product(null, "Smart Home Camera", "Wi-Fi-enabled smart home security camera with night vision and two-way audio.", 89.99));
		};
	}

}
