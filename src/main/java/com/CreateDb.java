package com;

import org.hibernate.Session;

public class CreateDb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSub test = new TestSub();
		test.setName("ssssss");
		test.setType("Hello");
		test.setKiller_name("Killer baby");
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		
		
		session.save(test);
		
		
		session.getTransaction().commit();
		
		session.close();
		
		
	}

}
