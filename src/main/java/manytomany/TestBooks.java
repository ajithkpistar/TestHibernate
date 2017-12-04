package manytomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.HibernateUtil;

public class TestBooks {
	
	public static void main(String[] args) {
		Set<Book> books = new HashSet<Book>(
				0);
		 Set<Author> authors = new HashSet<Author>(
				0);
		// TODO Auto-generated method stub
		Author author = new Author("Martin");
		Book book = new Book("English");
		Book book1 = new Book("English US");
		
		books.add(book);
		books.add(book1);
		author.setBooks(books);
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		
		
		session.save(author);
		
		
		session.getTransaction().commit();
		
		session.close();
		System.out.println("Done :");
		
		
	}

}
