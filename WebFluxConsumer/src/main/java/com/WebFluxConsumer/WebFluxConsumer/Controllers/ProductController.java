package com.WebFluxConsumer.WebFluxConsumer.Controllers;
import com.WebFluxConsumer.WebFluxConsumer.Models.Product;
import com.WebFluxConsumer.WebFluxConsumer.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getProducts(){
        return productService.getProducts();
    }

}
