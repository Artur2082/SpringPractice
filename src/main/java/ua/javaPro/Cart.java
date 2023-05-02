package ua.javaPro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component("cartBean")
public class Cart {
    private ProductRepository productRepository;

    @Autowired
    public Cart(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public void addProduct(Product product) {
        productRepository.getProductList().add(product);
        System.out.println(product.getName() + " added ,cart contains : " + '\n' + productRepository.getAll());
    }

    public void deleteById(int id) {
        System.out.println("Removing product by id = " + id + '\n' + productRepository.findById(id));
        productRepository.getProductList().removeIf(product -> product.getId().equals(id));
        System.out.println("Cart contains : " + '\n' + productRepository.getAll());
    }
}
