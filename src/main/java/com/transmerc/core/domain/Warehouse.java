package com.transmerc.core.domain;

import java.util.ArrayList;

public class Warehouse {
private int id;
private Address address;
private String name;
private ArrayList<Driver> drivers;
private ArrayList<Vehicle> vehicles;


public Warehouse(Address address, String name) {
	
	setAddress(address);
	setName(name);
	this.drivers= new ArrayList<Driver>();
	this.vehicles= new ArrayList<Vehicle>();
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getId() {
	return id;
}

public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}

public ArrayList<Driver> getDrivers() {
	return drivers;
}

public void addDriver(Driver driver) {
	this.drivers.add(driver);
}

public ArrayList<Vehicle> getVehicles() {
	return vehicles;
}

public void addVehicle(Vehicle vehicle) {
	this.vehicles.add(vehicle);
}


}
