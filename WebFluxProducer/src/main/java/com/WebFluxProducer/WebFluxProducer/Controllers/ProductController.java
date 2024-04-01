package com.WebFluxProducer.WebFluxProducer.Controllers;

import com.WebFluxProducer.WebFluxProducer.DTO.ProductEvent;
import com.WebFluxProducer.WebFluxProducer.Models.Product;
import com.WebFluxProducer.WebFluxProducer.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping
    public Product createProduct(@RequestBody ProductEvent productEvent) {
        return productService.createProduct(productEvent);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable String id, @RequestBody ProductEvent productEvent) {
        return productService.updateProduct(id, productEvent);
    }
}
