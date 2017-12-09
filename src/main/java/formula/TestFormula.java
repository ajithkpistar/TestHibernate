package formula;

import org.hibernate.Session;

import com.HibernateUtil;

public class TestFormula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formula formula = new Formula();
		formula.setCredit(26604.00);
		formula.setInterest(8.00);
		formula.setRate(5.00);
		Session session = HibernateUtil.getSessionFactory().openSession();
		 session.getTransaction().begin();
		//session.save(formula);
		Formula formula1 = (Formula)session.get("formula.Formula", 1l);
		System.out.println("formula >> "+formula1.getInterest());
		  session.getTransaction().commit();
		    session.close();
	}

}
