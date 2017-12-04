package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "test_id")

public class TestSub extends Test {
	String killer_name;

	public TestSub() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	public TestSub(String killer_name) {
		super();
		this.killer_name = killer_name;
	}




	@Column(name = "name",  nullable = false)
	public String getKiller_name() {
		return killer_name;
	}

	public void setKiller_name(String killer_name) {
		this.killer_name = killer_name;
	}

	
	
	
	
	

}
