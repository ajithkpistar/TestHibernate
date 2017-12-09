package columntransformer;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Project {
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
    private Long id;
	@ManyToMany
    private List<Employee> employees = new ArrayList<>();
	
	
		
	

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Long getId() {
		return id;
	}





	public void setId(Long id) {
		this.id = id;
	}





	public List<Employee> getEmployees() {
		return employees;
	}





	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
	
	
}
