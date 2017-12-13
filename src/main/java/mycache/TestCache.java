package mycache;

import org.hibernate.Session;

import com.HibernateUtil;
import com.github.javafaker.Faker;

public class TestCache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 	      long startTime = System.currentTimeMillis();

		Session session = HibernateUtil.getSessionFactory().openSession();
		 session.getTransaction().begin();
		 Faker faker = new Faker();

		for(int i=0;i<1000000;i++) { 
		Phone phone = new Phone();		
		Person person = new Person();
		person.setCode(faker.book().author());
		person.setName(faker.name().fullName());
	
		session.save(person);

		phone.setPerson(person);
		session.save(phone);
		}
		  session.getTransaction().commit();
		    session.close();
	}

}
