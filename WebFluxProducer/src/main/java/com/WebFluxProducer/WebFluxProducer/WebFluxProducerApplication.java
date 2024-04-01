package com.WebFluxProducer.WebFluxProducer;

import com.WebFluxProducer.WebFluxProducer.Models.Product;
import com.WebFluxProducer.WebFluxProducer.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class WebFluxProducerApplication implements CommandLineRunner {

	private final ProductRepository productRepository;
	@Autowired
	public WebFluxProducerApplication(ProductRepository productRepository){
		this.productRepository = productRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(WebFluxProducerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		}

	}

