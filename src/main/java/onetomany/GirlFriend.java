package onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class GirlFriend {
	private Integer id;
	private String name;
	private Integer age;
	private String height;
	private Boyfriend boyfriend;
	public GirlFriend() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public GirlFriend(String name, Integer age, String height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}





	public GirlFriend(String name, Integer age, String height, Boyfriend boyfriend) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.boyfriend = boyfriend;
	}
	
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name = "name",  nullable = false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Column(name = "age",  nullable = false)
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Column(name = "height",  nullable = false)
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Boyfriend getBoyfriend() {
		return boyfriend;
	}
	public void setBoyfriend(Boyfriend boyfriend) {
		this.boyfriend = boyfriend;
	}
	
	
	
	
	
	
}
