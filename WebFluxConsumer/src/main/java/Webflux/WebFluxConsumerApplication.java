package Webflux;

import Webflux.Models.Product;
import Webflux.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories

public class WebFluxConsumerApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(WebFluxConsumerApplication.class, args
		);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}

