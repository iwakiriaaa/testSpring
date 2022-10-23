package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@Table(name="upload")
public class EntityClass {
    
	  @Id
	  @Column(name = "ID")
	  private int id;

	  @Column(name = "imageFile")
	  private String image;
   
	public int getID() {
		return id;
	}
	public void setID(int iD) {
		id = iD;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String imageFile) {
		this.image = imageFile;
	}
}