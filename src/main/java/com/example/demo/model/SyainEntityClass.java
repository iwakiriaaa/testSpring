package com.example.demo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class SyainEntityClass implements Serializable{
  
  @Id
  @GeneratedValue
  private int syainId;

  @Column  
  private String name;
  
  @Column  
  private String age;
  
  @OneToMany(mappedBy="syainentity", cascade=CascadeType.ALL)
  private List<SyozokuEntityClass> syozokuEntity;
   
	public void setSyainId(int id) {
		this.syainId = id;
	}
	
	public int getSyainId() {
		return this.syainId;
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

    public List<SyozokuEntityClass> getSyozokuEntity() {
    	return syozokuEntity;
    }

    public void setEquipments(List<SyozokuEntityClass> syozokuEntity) {
        this.syozokuEntity = syozokuEntity;
    }
}