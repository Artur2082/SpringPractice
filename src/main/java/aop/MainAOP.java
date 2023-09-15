package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAOP {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("aop");
        UniLibrary unilibrary = context.getBean("uniLibrary", UniLibrary.class);
        Book book = context.getBean("book", Book.class);
        unilibrary.addBook("Artur",book);
        unilibrary.addMagazine();
//        unilibrary.returnMagazine();
//        unilibrary.addBook();
        context.close();
    }
}
