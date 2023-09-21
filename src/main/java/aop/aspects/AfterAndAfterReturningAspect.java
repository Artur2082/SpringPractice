package aop.aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AfterAndAfterReturningAspect {


//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students){
//        Student firstStudent = students.get(0);
//        String name ="Mr." + firstStudent.getNameSurname();
//        firstStudent.setNameSurname(name);
//        double avgGrade = firstStudent.getAverageGrade() + 2;
//        firstStudent.setAverageGrade(avgGrade);
//        System.out.println("afterReturningGetStudentsLoggingAdvice : logging list of students after method ");
//    }


//    @After(" execution(* getStudents())")
//    public void afterGetStudentsLoggingAdvice(){
//        System.out.println("afterGetStudentsLoggingAdvice : log of normal ending/catching exception to method getStudents");
//    }

}
