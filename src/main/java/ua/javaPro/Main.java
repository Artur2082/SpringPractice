package ua.javaPro;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new AnnotationConfigApplicationContext("ua.javaPro");
        Cart cart = context.getBean("cartBean", Cart.class);
        Product apple = context.getBean("productBean", Product.class);
        apple.setId(1);
        apple.setName("apple");
        apple.setPrice(23);
        Product lemon = context.getBean("productBean", Product.class);
        lemon.setId(2);
        lemon.setName("lemon");
        lemon.setPrice(875);
        Product pear = context.getBean("productBean", Product.class);
        pear.setId(3);
        pear.setName("pear");
        pear.setPrice(45);
        cart.addProduct(apple);
        cart.addProduct(lemon);
        cart.addProduct(pear);
        cart.deleteById(2);
        context.close();
    }
}
