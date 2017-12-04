package manytomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;
@Entity
public class Book {
	private Set<Author> authors = new HashSet<Author>(
			0);
	private String book_name;
	private Integer id;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Book(String book_name) {
		super();
		this.book_name = book_name;
	}




	public Book(Set<Author> authors, String book_name) {
		super();
		this.authors = authors;
		this.book_name = book_name;
	}
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "books")
	public Set<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}
	
	
	@Column(name = "name",  nullable = false)
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	
	
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "bookid")

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	
}
