package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AroundLoggingAspect {
    @Around("execution(public String returnBook())")
    public Object aroundReturnBookAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Try to return book");
      //  long begin = System.currentTimeMillis();
        Object targetMethod;
        try{
            targetMethod = proceedingJoinPoint.proceed();
        }catch (Exception e){
            System.out.println("aroundReturnBookAdvice :  " + e);
            throw e;
        }

     //   long end = System.currentTimeMillis();
        System.out.println("aroundReturnBookAdvice : book returned to the library ");
     //   System.out.println("aroundReturnBookAdvice - time of execution of method = " + (end - begin));
        return targetMethod;
    }
}
