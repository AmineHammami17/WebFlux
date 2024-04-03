package Webflux.Controllers;

import Webflux.DTO.ProductEvent;
import Webflux.Models.Product;
import Webflux.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
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
