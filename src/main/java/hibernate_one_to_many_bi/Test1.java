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
//            Department dep = new Department("Sales", 800, 1500);
//            Employee emp1 = new Employee("Zaur", "Tregulov", 800);
//            Employee emp2 = new Employee("Elena", "Smirnova", 1500);
//            Employee emp3 = new Employee("Anton", "Sidorov", 1200);
//            dep.addDemployeeToDepartment(emp1);
//            dep.addDemployeeToDepartment(emp2);
//            dep.addDemployeeToDepartment(emp3);
//
//            session.beginTransaction();
//            session.save(dep);
//            session.getTransaction().commit();
//            System.out.println("DONE!!!");

            session.beginTransaction();

            System.out.println("get department");
            Department dep = session.get(Department.class, 6);

            System.out.println("show department");
            System.out.println(dep);

            System.out.println("show employees");
            System.out.println(dep.getEmps());

            session.getTransaction().commit();
            System.out.println("------------------SUCCESS--------------------------");
        } finally {
            session.close();
            factory.close();
        }
    }
}
