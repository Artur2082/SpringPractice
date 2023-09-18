package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice(){
//        System.out.println("beforeGetStudentsLoggingAdvice : logging list of students before method ");
//    }


//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students){
//        Student firstStudent = students.get(0);
//        String name ="Mr." + firstStudent.getNameSurname();
//        firstStudent.setNameSurname(name);
//        double avgGrade = firstStudent.getAverageGrade() + 2;
//        firstStudent.setAverageGrade(avgGrade);
//        System.out.println("afterReturningGetStudentsLoggingAdvice : logging list of students after method ");
//    }

//    @AfterThrowing(pointcut = " execution(* getStudents())", throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception){
//        System.out.println("afterThrowingGetStudentsLoggingAdvice - log of caught exception " + exception);
//    }

    @After(" execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice : log of normal ending/catching exception  of method getStudents");
    }

}
