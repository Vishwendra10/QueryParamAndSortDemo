package com.example.rentmanagment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name= "rentmanagment")


public class RentManagment {
	
	
	@Id
	private int id;
	private String name;
	private boolean rentPaid;
	
	
	
	
	public RentManagment() {
		
	}
	
	public RentManagment(int id, String name, boolean rentPaid) {
		this.id = id;
		this.name = name;
		this.rentPaid = rentPaid;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public boolean isRentPaid() {
		return rentPaid;
	}




	public void setRentPaid(boolean rentPaid) {
		this.rentPaid = rentPaid;
	}




	@Override
	public String toString() {
		return "RentManagment [id=" + id + ", name=" + name + ", rentPaid=" + rentPaid + "]";
	}
}
