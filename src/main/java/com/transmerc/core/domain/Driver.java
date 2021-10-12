package com.transmerc.core.domain;
import com.transmerc.core.domain.util.*;


public class Driver {
private int id;
private String name;
private String phone;
private String userName;
private String password;
private Address address;
private String zone;
private boolean active;
private Vehicle vehicle;




public Driver(String name, String phone, String userName, String password, Address address, String zone, boolean active,
		Vehicle vehicle) {
	
	setName(userName);
	setPhone(phone);
	setUserName(userName);
	setPassword(password);
	setAddress(address);
	setZone(zone);
	setActive(active);
	setVehicle(vehicle);
}

public int getId() {
	return id;
}

public String getName() {
	return name;
}
public void setName(String name) {
	if(Validate.contieneSoloLetras(name)==true)
	this.name = name;
	else throw new IllegalArgumentException("El nombre solo debe contener letras");
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
  if(Validate.validarSoloNumeros(phone)==true)
	this.phone = phone;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	if(Validate.validarNoSimbolos(userName)==true)
	this.userName = userName;
	else throw new IllegalArgumentException("El usuario no debe contener caract\u00e9res especiales");
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	if(Validate.validarPassword(password)==true)
	this.password = password;
	else throw new IllegalArgumentException("La contrase\u00f1a debe tener al menos 8 d\u00edgitos, un n\u00famero, una letra may\\u00fscula, una letra min\\u00fscula, un caracter especial y no debe tener espacios en blanco");
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public String getZone() {
	return zone;
}
public void setZone(String zone) {
	if(Validate.validarNoSimbolos(zone)==true)
	this.zone = zone;
	else throw new IllegalArgumentException("S\u00f3lo deben haber letras y n\u00f3meros en la zona");
}
public boolean isActive() {
	return active;
}
public void setActive(boolean active) {
	this.active = active;
}
public Vehicle getVehicle() {
	return vehicle;
}
public void setVehicle(Vehicle vehicle) {
	this.vehicle = vehicle;
}



}
