package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {
//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary() {
//    }
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary() {
//
//    }
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnAdvice() {
//        System.out.println("beforeAllMethodsExceptReturnAdvice: writing log #1");
//    }
//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary(){
//    }
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary(){
//    }
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allReturnAndGetMethodsFromUniLibrary(){
//    }
//
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("BeforeGetLoggingAdvice: writing log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("BeforeReturnLoggingAdvice: writing log #2");
//    }
//
//    @Before("allReturnAndGetMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("BeforeGetAndReturnLoggingAdvice: writing log #3");
//    }


    @Before("aop.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Method signature  " + signature);

        System.out.println("Method signature  getMethod() " + signature.getMethod());

        System.out.println("Method signature  getReturnType " + signature.getReturnType());

        System.out.println("Method signature  getName " + signature.getName());

        if(signature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object obj: arguments) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("Информация о книге: Название - " +
                            myBook.getName() + ", автор - " +
                            myBook.getAuthor() + ", год издания - " + myBook.getYearOfPublication());

                } else if (obj instanceof String) {
                    System.out.println("Книгу в библиотек добавляет - " + obj);
                }
            }
        }
        System.out.println("BeforeGetLoggingAdvice: логирование попытки получить " +
                "книгу/журнал");
        System.out.println("________________________________");
    }



}
