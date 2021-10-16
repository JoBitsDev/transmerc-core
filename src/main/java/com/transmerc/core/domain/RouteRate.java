package com.transmerc.core.domain;
public class RouteRate {
	
	private  int id;
	private  int costPerKm;
	private  float costPerHour;
	private  int bareFare;
	
	
	
	
	
	
	public RouteRate() {
		
	}

	public RouteRate(int costPerKm, float costPerHour, int bareFare) {
		
		setCostPerHour(costPerHour);
		setCostPerKm(costPerKm);
		setBareFare(bareFare);
	}
	
	public int getId() {
		return id;
	}
	public int getCostPerKm() {
		return costPerKm;
	}
	public void setCostPerKm(int costPerKm) {
		if(costPerKm>0)
		this.costPerKm = costPerKm;
		else throw new IllegalArgumentException("El costo por kil\u00f3metro debe ser mayor que 0");
	}
	public float getCostPerHour() {
		return costPerHour;
	}
	public void setCostPerHour(float costPerHour) {
		if(costPerHour>0)
		this.costPerHour = costPerHour;
		else throw new IllegalArgumentException("El costo por hora debe ser mayor que 0");
	}
	public int getBareFare() {
		return bareFare;
	}
	public void setBareFare(int bareFare) {
		if(bareFare>0)
		this.bareFare = bareFare;
		else throw new IllegalArgumentException("La tarifa debe ser mayor que 0");
	}
	
	
	

}
