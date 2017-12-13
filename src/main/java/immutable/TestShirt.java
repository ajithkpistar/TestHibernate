package immutable;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.HibernateUtil;
import com.github.javafaker.Faker;

public class TestShirt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		Faker faker = new Faker();

		session.getTransaction().begin();
		vv(session);

		session.getTransaction().commit();
		session.close();
		System.exit(0);
		 
	}

	private static void vv(Session session) {
		Shirt shirt = new Shirt();
		Faker faker = new  Faker();
		//shirt.setCreatedAt(new Date());
		
		shirt.setName(faker.name().fullName());
		session.save(shirt);
		 
	}

}
