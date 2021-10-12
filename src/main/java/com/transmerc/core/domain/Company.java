package com.transmerc.core.domain;
import com.transmerc.core.domain.util.*;
import java.util.ArrayList;

public class Company {
	private int id;
	private String name;
	private Address address;
	private ArrayList<Warehouse> warehouse;

	public Company() {
		
	}

	
	public Company(String name, Address address) {
	
		setName(name);
		setAddress(address);
		this.warehouse= new ArrayList<Warehouse>();
		
	}



	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) 
	{
		if(Validate.contieneSoloLetras(name)==true)
		this.name = name;
		else throw new IllegalArgumentException("El nombre de la empresa solo debe tener letras");
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public ArrayList<Warehouse> getWarehouse() {
		return warehouse;
	}

	public void addWarehouse(Warehouse warehouse) {
		if(warehouse!=null)
		this.warehouse.add(warehouse);
	}
	
}
