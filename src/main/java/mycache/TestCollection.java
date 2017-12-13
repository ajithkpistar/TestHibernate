package mycache;

import org.hibernate.Session;

import com.HibernateUtil;

public class TestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		 session.getTransaction().begin();
		MyCollections myCollections = new MyCollections();
		myCollections.addCollection("hello");
		myCollections.addCollection("hello1");
		session.save(myCollections);
		
		
		  session.getTransaction().commit();
		    session.close();

	}

}
