package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Component
@Aspect
@Order(1)
public class BeforeAspects {
//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromUnilibrary() {
//    }
//
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUnilibrary() {
//    }
//
//    @Pointcut("allMethodsFromUnilibrary() && !returnMagazineFromUnilibrary()")
//    private void allMethodsExceptReturnMagazine() {
//    }
//
//    @Before("allMethodsExceptReturnMagazine()")
//    public void BeforeAllMethodsExceptReturnMagazine() {
//        System.out.println("BeforeAllMethodsExceptReturnMagazine : log #4");
//    }

//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethods() {
//    }
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethods() {
//    }
//    @Pointcut("allGetMethods() || allReturnMethods()")
//    private void allGetAndReturnMethods(){
//
//    }
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice : log #1");
//    }
//    @Before("allReturnMethods()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice : log #2");
//    }
//    @Before("allGetAndReturnMethods()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice : log #3");
//    }

    // объявление pointcut @Before....
    // виды синтаксиса pointcut в анотации :
    //  aop.UniLibrary.getBook()) - расположение конкретного метода;
    // get*(*) - (*) - любой один параметр любых типов, get* - метод, начинающийся на get;
    // get*(..) -  (..) - любое количество параметров, любых типов;
    // getBook(aop.Book) - метод с названием getBook, (aop.Book) - расположение параметра обьекта Book;
    // (* *(..)) - любой возвращаемый тип метода, любое название метода, любое количество параметров, любых типов;
    @Before("aop.aspects.MyPointcuts.pointcutGet()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature : "
                + methodSignature);
        System.out.println("methodSignature.getMethod() - "
                + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() - "
                + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() - "
                + methodSignature.getName());
        if(methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for (Object obj: arguments) {
                if(obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("Info about Book - " + myBook.getName() + ","
                    + myBook.getAuthor() + "," + myBook.getYearOfPublication());
                }
                else if(obj instanceof String){
                    System.out.println(" The book added - " + obj);
                }
            }
        }
        LocalDate date = LocalDate.now();
        System.out.println("beforeAddLoggingAdvice - logging of try to add book/magazine at : " + date);
        System.out.println("__________________________________");
    }

}
