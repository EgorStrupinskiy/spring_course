package hibernate_one_to_many_bi;

import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {
//            Department dep = new Department("IT", 300, 1200);
//            Employee emp1 = new Employee("Zaur", "Tregulov", 800);
//            Employee emp2 = new Employee("Elena", "Smirnova", 1000);
//            dep.addDemployeeToDepartment(emp1);
//            dep.addDemployeeToDepartment(emp2);
//
//            session.beginTransaction();
//            session.save(dep);
//            session.getTransaction().commit();
//            System.out.println("DONE!!!");

            session.beginTransaction();

            Employee emp = session.get(Employee.class, 6);
            session.delete(emp);

            session.getTransaction().commit();
            System.out.println("------------------SUCCESS--------------------------");
        } finally {
            session.close();
            factory.close();
        }
    }
}
