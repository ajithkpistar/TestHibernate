package columntransformer;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.HibernateUtil;

public class TestEmployee {
	public static void main(String args []) {
		Session session = HibernateUtil.getSessionFactory().openSession();
	     List<Employee> employees = new ArrayList<>();
	     List<Project> projects = new ArrayList<>();
	     Department department = new Department();
		 session.getTransaction().begin();
		 Employee employee = new Employee();
		 employee.setAccessLevel(3);
		 employee.setPassword("Password");
		 employee.setUsername("Ddljdd");
		 //session.save(employee);
		 		 
		Employee employee1 = (Employee) session.get("columntransformer.Employee", 1l); 
		System.out.println("Password 000 > "+employee1.getPassword());
	    session.getTransaction().commit();
	    session.close();
		
	}
}
