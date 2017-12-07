package superclass;

import java.math.BigDecimal;

import javax.transaction.Transaction;

import org.hibernate.Session;

import com.HibernateUtil;

public class TestAccount {
	public static void main(String args[]) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		DebitAccount debitAccount = new DebitAccount();
		debitAccount.setBalance(new BigDecimal("20000.00"));
		debitAccount.setInterestRate(new BigDecimal("8.00"));
		debitAccount.setOverdraftFee(new BigDecimal("30.00"));
		debitAccount.setOwner("Feroz Siddiqui");
		
		CreditAccount creditAccount = new CreditAccount();
		creditAccount.setBalance(new BigDecimal("20000.00"));
		creditAccount.setCreditLimit(new BigDecimal("10000.00"));
		creditAccount.setInterestRate(new BigDecimal("8.00"));
		creditAccount.setOwner("Feroz Siddiqui");
		org.hibernate.Transaction tx = session.getTransaction();
		tx.begin();
		session.save(debitAccount);
		session.save(creditAccount);
		tx.commit();
		
		session.close();
		System.out.println("shut down");
	}

}
