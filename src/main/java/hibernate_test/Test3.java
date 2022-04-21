package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            List emps = session.createQuery("from Employee where " +
                    "name = 'Max' AND salary > 1000")
                    .getResultList();

            for (Object emp : emps) {
                System.out.println(emp);
            }
            session.getTransaction().commit();

            System.out.println("DONE!!!");
        }
    }
}
