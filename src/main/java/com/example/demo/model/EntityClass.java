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
    @Column(name="ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String imageFile;
    
	public int getID() {
		return id;
	}
	public void setID(int iD) {
		id = iD;
	}
	public String getImageFile() {
		return imageFile;
	}
	public void setImageFile(String ImageFile) {
		this.imageFile = ImageFile;
	}
}