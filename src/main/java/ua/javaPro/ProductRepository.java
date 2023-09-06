package ua.javaPro;

import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {
    private final List<Product> productList;

    public ProductRepository() {
        this.productList = new ArrayList<>();
    }

    public List<Product> getProductList() {
        return productList;
    }

    public List<Product> getAll() {
        return productList;
    }

    public Product findById(int id) {
        Product product = null;
        for (Product prod : productList) {
            if (id == prod.getId()) {
                product = prod;
            }
        }
        return product;
    }
}
