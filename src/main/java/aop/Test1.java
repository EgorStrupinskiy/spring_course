package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("uniLibraryBean", UniLibrary.class);
        SchoolLibrary schoolLibrary = context.getBean("schoolLibraryBean", SchoolLibrary.class);
//        schoolLibrary.getBook();
        Book book = context.getBean("book", Book.class);
        uniLibrary.getBook();
 //       uniLibrary.getMagazine();
//        uniLibrary.returnMagazine();
        uniLibrary.addBook("Egor", book);
        uniLibrary.addMagazine();
//        uniLibrary.getMagazine();
//        uniLibrary.returnBook();

        context.close();
    }
}
