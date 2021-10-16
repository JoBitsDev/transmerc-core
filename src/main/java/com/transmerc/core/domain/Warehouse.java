package com.transmerc.core.domain;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
private int id;
private Address address;
private String name;
private List<Vehicle> vehicles;


public Warehouse(Address address, String name) {
	setAddress(address);
	setName(name);
	this.vehicles= new ArrayList<Vehicle>();
}

public String getName() {
	return name;
}

public void setName(String name) {
	if(!(name.equals("")))
	this.name = name;
	else throw new IllegalArgumentException("El almacen debe estar provisto de un nombre por convenio.");
}

public int getId() {
	return id;
}

public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	if(address!=null)
	this.address = address;
	else throw new IllegalArgumentException("La direccion del almacen es un campo obligatorio");
}


public List<Vehicle> getVehicles() {
	return vehicles;
}

public void addVehicle(Vehicle vehicle) {
	this.vehicles.add(vehicle);
}


}
