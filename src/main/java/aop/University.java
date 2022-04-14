package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("universityBean")
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student stud1 = new Student("Egor Strupinski", 4, 7.5);
        Student stud2 = new Student("Ivan Sakun", 2, 10.0);
        Student stud3 = new Student("Vlad Grinev", 1, 8.2);
        students.add(stud1);
        students.add(stud2);
        students.add(stud3);
    }

    public List<Student> getStudents() {
        System.out.println("Before returning students list");
//        System.out.println(students.get(3));
        System.out.println("Information from method getStudents: ");
        System.out.println(students);
        return students;
    }
}
