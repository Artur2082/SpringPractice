package aop.aspects;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class AfterThrowingAspect {
    @AfterThrowing(pointcut = "aop.aspects.MyPointcuts.pointcutGet()", throwing = "exception")
    public void beforeGetExceptionHandlingAdvice(Throwable exception){
        System.out.println("beforeGetExceptionHandlingAdvice : catch/handling exceptions when tried to add " +
                "book/magazine !" + exception);
        System.out.println("__________________________________");
    }
}
