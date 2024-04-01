package com.WebFluxProducer.WebFluxProducer.Services;

import com.WebFluxProducer.WebFluxProducer.DTO.ProductEvent;
import com.WebFluxProducer.WebFluxProducer.Models.Product;
import com.WebFluxProducer.WebFluxProducer.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;
    public Product createProduct(ProductEvent productEvent){
        Product productDO = productRepository.save(productEvent.getProduct());
        ProductEvent event=new ProductEvent("CreateProduct", productDO);
        kafkaTemplate.send("product-event-topic", event);
        return productDO;
    }

    public Product updateProduct(String id,ProductEvent productEvent){
        Product existingProduct = productRepository.findById(id).get();
        Product newProduct=productEvent.getProduct();
        existingProduct.setName(newProduct.getName());
        existingProduct.setPrice(newProduct.getPrice());
        existingProduct.setDescription(newProduct.getDescription());
        Product productDO = productRepository.save(existingProduct);
        ProductEvent event=new ProductEvent("UpdateProduct", productDO);
        kafkaTemplate.send("product-event-topic", event);
        return productDO;
    }
}


