package ingu.springboot.service;

import ingu.springboot.common.Util;
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
        for (int i = 0; i < 100; i++) {
            this.products.add(new Product(i, Util.faker().commerce().productName()));
        }
    }
    public List<Product> getProductNames() {
        Util.sleepSeconds(1);
        return this.products;
    }
    public String getProductName(int id) {
        Util.sleepSeconds(1);
        return this.products.get(id).getId() + ":" + this.products.get(id).getName();
    }
}
