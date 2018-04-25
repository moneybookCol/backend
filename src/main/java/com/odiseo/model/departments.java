package com.odiseo.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="departments")
@Access(AccessType.FIELD)
public class departments extends ParentEntity{

	private static final long serialVersionUID = 2530675374883580453L;

	@Column(name = "nameDepartment", nullable = false, length=15)
	private String nameDepartment;
	
	@Column(name = "idCountry", nullable = false, length=3)
	private int idCountry;
		
	public String getNameDepartment() {
		return nameDepartment;
	}
	public void setNameDepartment(String nameDepartment) {
		this.nameDepartment = nameDepartment;
	}
	public int getIdCountry() {
		return idCountry;
	}
	public void setIdCountry(int idCountry) {
		this.idCountry = idCountry;
	}
}
