package hibarnate_one_to_one;

import hibarnate_one_to_one.entity.Detail;
import hibarnate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        try {
/*            Employee emp = new Employee("Oleg", "Smirnov", "Sales", 1000);
            Detail details = new Detail("Moscow", "+37390445233", "oleg@yandex.ru");
            emp.setEmpDetail(details);*/

            session.beginTransaction();
            Employee emp = session.get(Employee.class, 2);
            System.out.println(emp);
            session.getTransaction().commit();
            System.out.println("DONE!!!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
