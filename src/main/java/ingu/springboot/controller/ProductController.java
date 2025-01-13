package ingu.springboot.controller;

import ingu.springboot.model.Product;
import ingu.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products/")
    public List<Product> getProductNames() {
        return productService.getProductNames();
    }
    @GetMapping("/products/{id}")
    public String getProductName(@PathVariable int id){
        return productService.getProductName(id);
    }

}
