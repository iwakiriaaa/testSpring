package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@Table(name="syain")
public class EntityClass {
    
  @Id
  @Column(name = "社員ID")
  private int id;

  @Column(name = "氏名")
  private String name;
  
  @Column(name = "年齢")
  private String age;
   
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
	
	public String getAge() {
		return this.age;
	}	
}