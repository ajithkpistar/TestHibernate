package manytomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Author {
	private String name;
	private Set<Book> books = new HashSet<Book>(
			0);
	private Integer id;
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public Author(String name) {
		super();
		this.name = name;
	}





	public Author(String name, Set<Book> books) {
		super();
		this.name = name;
		this.books = books;
	}
	
	@Column(name = "name",  nullable = false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "author_book",  joinColumns = {
			@JoinColumn(name = "authorid", nullable = false, updatable = false) },
			inverseJoinColumns = { @JoinColumn(name = "bookid",
					nullable = false, updatable = false) })
	public Set<Book> getBooks() {
		return books;
	}
	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "authorid")

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	
}
