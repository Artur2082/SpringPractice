package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAOP3 {
    public static void main(String[] args) {
        System.out.println("Method main starts !");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        String bookName = uniLibrary.returnBook();
        System.out.println("Returned book - " + bookName);
        context.close();
        System.out.println("Method main ends !");
    }
}
