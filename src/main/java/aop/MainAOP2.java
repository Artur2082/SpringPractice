package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MainAOP2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        University university = context.getBean("university", University.class);
        university.addStudent();
        try {
            List<Student> students = university.getStudents();
            System.out.println(students);
        }catch (Exception e){
            System.out.println("Caught exception - " + e);
        }
        context.close();
    }
}
