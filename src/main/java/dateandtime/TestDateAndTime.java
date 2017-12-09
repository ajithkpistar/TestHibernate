package dateandtime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;

import org.hibernate.Session;

import com.HibernateUtil;

public class TestDateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		/*DateEvent dateEvent = new DateEvent();
		dateEvent.setTimestamp(new Date());*/
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1960, Month.JANUARY, 1);
       
        LocalDate nextBDay = birthday.withYear(today.getYear());
        //Period p = Period.between(today, birthday);
        //dateEvent.setSpan(p);
        Product p = new Product();
        p.setName("Googly");
        p.setNumber("1234");
		session.getTransaction().begin();
		session.save(p);
		session.getTransaction().commit();
		session.close();
		
	}

}
