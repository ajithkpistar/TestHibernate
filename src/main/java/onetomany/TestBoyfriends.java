package onetomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.HibernateUtil;

public class TestBoyfriends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Set<GirlFriend> girlFriends = new HashSet<GirlFriend>(
				0);
		 
		 
		 
		 Boyfriend boyfriend = new Boyfriend();
		 boyfriend.setAge(27);
		 boyfriend.setHeight("5' 8");
		 boyfriend.setName("Dhoondu");
		 
		 for(int i=0;i<2;i++){
			 GirlFriend girlFriend = new GirlFriend("Chameli "+i, 20+i, "5' "+i,boyfriend);
			 girlFriends.add(girlFriend);
		 }
		 boyfriend.setGirlFriend(girlFriends);

		 
		 Session session = HibernateUtil.getSessionFactory().openSession();
			session.getTransaction().begin();
			
			
			session.save(boyfriend);
			
			
			session.getTransaction().commit();
			
			session.close();
			System.out.println("Done :");
		 
	}

}
