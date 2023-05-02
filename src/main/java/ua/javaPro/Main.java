package ua.javaPro;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        Product apple = new Product(1, "apple", 28.56);
        Product lemon = new Product(2, "lemon", 50.15);
        Product pear = new Product(3, "pear", 41.78);
        ConfigurableApplicationContext context =
                new AnnotationConfigApplicationContext("ua.javaPro");
        Cart cart = context.getBean("cartBean", Cart.class);
        cart.addProduct(apple);
        cart.addProduct(lemon);
        cart.addProduct(pear);
        cart.deleteById(2);
        context.close();
    }
}
