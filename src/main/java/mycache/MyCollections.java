package mycache;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
@Entity
public class MyCollections {
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	private Long id;
	
	@ElementCollection
	private List<String> myarray = new ArrayList<>();
	public MyCollections() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<String> getMyarray() {
		return myarray;
	}
	public void setMyarray(List<String> myarray) {
		this.myarray = myarray;
	}
	
	public void addCollection(String s) {
		myarray.add(s);
		
	}
	public void removeCollection(String s) {
		myarray.remove(s);
	}
	
	
	
	
	
}
