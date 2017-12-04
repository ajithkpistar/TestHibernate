package onetomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Boyfriend {
	private Integer id;
	private String name;
	private Integer age;
	private String height;
	private Set<GirlFriend> girlFriends = new HashSet<GirlFriend>(
			0);
	public Boyfriend() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Boyfriend(String name, Integer age, String height, Set<GirlFriend>  girlFriend) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.girlFriends = girlFriend;
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
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "boyfriend",cascade = CascadeType.ALL)

	public Set<GirlFriend>  getGirlFriend() {
		return girlFriends;
	}
	public void setGirlFriend(Set<GirlFriend>  girlFriend) {
		this.girlFriends = girlFriend;
	}
	
	
	
	
	
}
