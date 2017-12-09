package where;

import java.util.List;

import org.hibernate.Session;

import com.HibernateUtil;

public class TestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		 session.getTransaction().begin();
		 
		  List<ClientAccount> accounts = session.createQuery("select a from ClientAccount a", ClientAccount.class).getResultList();
		  System.out.println(accounts.size());
		 /*Client client = new Client();
		    client.setName( "John Doe" );
		    session.persist( client );

		    ClientAccount account1 = new ClientAccount( );
		    account1.setType( ClientAccount.AccountType.CREDIT );
		    account1.setAmount( 5000d );
		    account1.setRate( 1.25 / 100 );
		    account1.setActive( true );
		    account1.setClient( client );
		    client.getCreditAccounts().add( account1 );
		    session.persist( account1 );

		    ClientAccount account2 = new ClientAccount( );
		    account2.setType(ClientAccount.AccountType.DEBIT);
		    account2.setAmount( 0d );
		    account2.setRate( 1.05 / 100 );
		    account2.setActive( false );
		    account2.setClient( client );
		    client.getDebitAccounts().add( account2 );
		    session.persist( account2 );

		    ClientAccount account3 = new ClientAccount( );
		    account3.setType( ClientAccount.AccountType.CREDIT );
		    account3.setAmount( 250d );
		    account3.setRate( 1.05 / 100 );
		    account3.setActive( true );
		    account3.setClient( client );
		    client.getDebitAccounts().add( account3 ); 
		    session.persist( account3 );*/

		 
		 
		  session.getTransaction().commit();
		    session.close();
	}

}
