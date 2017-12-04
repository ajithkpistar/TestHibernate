package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)

public class Test {
	
	private Integer id;
	private String name;
	private String type;

	public Test() {
		super();
		// TODO Auto-generated constructor stub yoyo
	}
	
	
	public Test(Integer id, String name, String type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
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


	@Column(name = "type",  nullable = false)

	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
	
	

}
