package uuid;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.HibernateUtil;

public class TestTakla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session = HibernateUtil.getSessionFactory().openSession();
		 session.getTransaction().begin();
		 Takla takla = new Takla();
		 takla.setName("Sumanth ganju");
		 
		 List<Change> changes = new ArrayList<>();
		 changes.add(new Change("path1","change1"));
		 changes.add(new Change("path2","change2"));
		 takla.setChanges(changes);
		session.save(takla);
		  session.getTransaction().commit();
		    session.close();
	}

}
