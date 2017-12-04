package onetoone;

import org.hibernate.Session;

import com.HibernateUtil;

public class TestHusband {
	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Husband hus = (Husband) session.get("onetoone.Husband", 1);
		System.out.println(hus.getWife().getName());

		//testHus();
	}
	
	
	public static void testHus(){
		Husband hus = new Husband();
		hus.setEmail("yellow@hello.com");
		hus.setName("Maooo");
		hus.setPhone("266363636");
		
		
		Wife wife = new Wife();
		wife.setEmail("chuimui@hello.com");
		wife.setName("Gaooon");
		wife.setPhone("44444444");
		//wife.setHusband(hus);

		hus.setWife(wife);
		
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		
		
		session.save(hus);
		
		
		session.getTransaction().commit();
		
		session.close();
		System.out.println("Done :");
	}
}
