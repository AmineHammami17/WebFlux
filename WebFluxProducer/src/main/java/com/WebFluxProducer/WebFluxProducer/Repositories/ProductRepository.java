package com.WebFluxProducer.WebFluxProducer.Repositories;

import com.WebFluxProducer.WebFluxProducer.Models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
}
