package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionHandlingAspect {
    @Before("aop.aspects.MyPointCuts.allAddMethods()")
    public void beforeGetExceptionHandlingAdvice() {
        System.out.println("beforeAddExceptionHandlingAdvice: ловим/обрабатываем " +
                "исключения при попытке получить книгу/журнал");
        System.out.println("________________________________");
    }
}