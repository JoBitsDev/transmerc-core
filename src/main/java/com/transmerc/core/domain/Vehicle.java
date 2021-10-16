package com.transmerc.core.domain;
import com.transmerc.core.domain.util.*;

import java.time.LocalDate;

public class Vehicle {

	private int id;
	private LocalDate startTime;
	private int workTime;
	private float weight;
	private float volume;
	private int pallets;
	private String carrierCode;
	private Restriction restriction;
	private RouteRate routeRate;
	private Driver driver;
	private Address depotAddress;
	
	
	
	public Vehicle() {
		
	}




	public Vehicle(LocalDate startTime, int workTime, float weight, float volume, int pallets, String carrierCode,
			Restriction restriction, RouteRate routeRate, Driver driver, Address depotAddress) {
		
		setStartTime(startTime);
		setWorkTime(workTime);
		setWeight(weight);
		setVolume(volume);
		setPallets(pallets);
		setCarrierCode(carrierCode);
		setRestriction(restriction);
		setRouteRate(routeRate);
		setDriver(driver);
		setDepotAddress(depotAddress);
	}

	
	
	
	public int getId() {
		return id;
	}

	public LocalDate getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalDate startTime) {
		this.startTime = startTime;
	}
	public int getWorkTime() {
		return workTime;
	}
	public void setWorkTime(int workTime) {
		if(workTime> 0 && workTime<=24)
		this.workTime = workTime;
		else throw new IllegalArgumentException("EL tiempo de trabajo debe ser de 1 a 24 horas diarias");
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		if(weight>0)
		this.weight = weight;
		else throw new IllegalArgumentException("El peso del veh\u00edculo debe ser mayor que 0 toneladas");
	}
	public float getVolume() {
		return volume;
	}
	public void setVolume(float volume) {
		if(volume>0)
		this.volume = volume;
		else throw new IllegalArgumentException("El volumen debe ser mayor que 1");
	}
	public int getPallets() {
		return pallets;
	}
	public void setPallets(int pallets) {
		if(pallets>=0)
		this.pallets = pallets;
		else throw new IllegalArgumentException("La cantidad de pallets debe ser mayor que 0");
	}
	public String getCarrierCode() {
		return carrierCode;
	}
	public void setCarrierCode(String carrierCode) {
		if(Validate.validarNoSimbolos(carrierCode)==true)
		this.carrierCode = carrierCode;
		else throw new IllegalArgumentException("El c\u00f3digo de portador no debe contener s\u00edmbolos");
	}
	public Restriction getRestriction() {
		return restriction;
	}
	public void setRestriction(Restriction restriction) {
		this.restriction = restriction;
	}
	public RouteRate getRouteRate() {
		return routeRate;
	}
	public void setRouteRate(RouteRate routeRate) {
		this.routeRate = routeRate;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Address getDepotAddress() {
		return depotAddress;
	}

	public void setDepotAddress(Address depotAddress) {
		if(depotAddress!=null)
		this.depotAddress = depotAddress;
		else throw new IllegalArgumentException("El vehiculo debe tener la direccion donde radica");
	}
	
	
	
}
