package any;

import org.hibernate.Session;

import com.HibernateUtil;

public class TestAny {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		 session.getTransaction().begin();
		 
		 IntegerProperty ageProperty = new IntegerProperty();
		    ageProperty.setName( "age" );
		    ageProperty.setValue( 23 );

		    StringProperty nameProperty = new StringProperty();
		    nameProperty.setName( "name" );
		    nameProperty.setValue( "John Doe" );

		    session.persist( ageProperty );
		    session.persist( nameProperty );

		    PropertyHolder namePropertyHolder = new PropertyHolder();
		    namePropertyHolder.setProperty( nameProperty );
		    session.persist( namePropertyHolder );
		    
		    session.getTransaction().commit();
		    session.close();
	}

}
