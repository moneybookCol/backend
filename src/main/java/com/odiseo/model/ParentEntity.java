package com.odiseo.model;

import java.io.Serializable;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Access(AccessType.FIELD)
public class ParentEntity implements Serializable{
	private static final long serialVersionUID = 3404391946089072074L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idDpartment", unique=true, nullable = false)
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
