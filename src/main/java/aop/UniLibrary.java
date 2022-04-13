package aop;

import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniLibrary extends AbstractLibrary{
    public void getBook() {
        System.out.println("Мы берём книгу из университета");
        System.out.println("________________________________");
    }

    public void getMagazine() {
        System.out.println("Мы берём журнал из университета");
        System.out.println("________________________________");
    }

    public void returnBook() {
        System.out.println("Мы возвращаем журнал в университет");
        System.out.println("________________________________");
    }

    public void returnMagazine() {
        System.out.println("Мы возвращаем журнал в университет");
        System.out.println("________________________________");
    }

    public void addBook(String personName, Book book) {
        System.out.println("Мы добавляем книгу в университет");
        System.out.println("________________________________");
    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал в университет");
        System.out.println("________________________________");
    }
}
