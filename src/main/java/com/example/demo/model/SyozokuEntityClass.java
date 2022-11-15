package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class SyozokuEntityClass implements Serializable{
	
  @Id
  private String syozokuId;
  
  @Column  
  private String syozokuName;

  @ManyToOne
  @JoinColumn(name="syainId")
  private SyainEntityClass syainentity;

	public void setSyozokuName(String syozokuName) {
		this.syozokuName = syozokuName;
	}
	
	public String getSyozokuName() {
		return this.syozokuName;
	}

    public SyainEntityClass getSyainEntityClass() {
        return syainentity;
    }

    public void setSyainEntityClass(SyainEntityClass syainEntityClass) {
        this.syainentity = syainEntityClass;
    }
}