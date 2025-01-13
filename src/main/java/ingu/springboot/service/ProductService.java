package ingu.springboot.service;

import ingu.springboot.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    /**
     * ProductService is autowired in Controller class
     * so should not autowired in this class or injection errors
     */
    private List<Product> products;

    public ProductService() {
        this.products = new ArrayList<>();
        this.products.add(new Product(0, "coffee"));
        this.products.add(new Product(1, "tea"));
    }
    public List<Product> getProductNames() {
        return this.products;
    }
    public String getProductName(int id) {
        return this.products.get(id).getName();
    }
}
