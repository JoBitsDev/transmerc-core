package com.transmerc.core.domain;
public class Restriction {
	private int id;
	private int maxOrders;
	private float maxDailyKm;
	private float speedRatio;
	
	
	
	
	
	public Restriction(int maxOrders, float maxDailyKm, float speedRatio) {
		
	    setMaxOrders(maxOrders);
		setMaxDailyKm(maxDailyKm);
		setSpeedRatio(speedRatio);
	}
	public int getId() {
		return id;
	}
	public int getMaxOrders() {
		return maxOrders;
	}
	public void setMaxOrders(int maxOrders) {
		if(maxOrders>0)
		this.maxOrders = maxOrders;
		else throw new IllegalArgumentException("La cantidad de \u00f3rdenes debe ser mayor que 0 ");
	}
	public float getMaxDailyKm() {
		return maxDailyKm;
	}
	public void setMaxDailyKm(float maxDailyKm) {
		if(maxDailyKm>0)
		this.maxDailyKm = maxDailyKm;
		else throw new IllegalArgumentException("La cantidad de kil\u00f3metros m\u00e1ximos debe ser mayor que 0");
	}
	public float getSpeedRatio() {
		return speedRatio;
	}
	public void setSpeedRatio(float speedRatio) {
		if(speedRatio>0)
		this.speedRatio = speedRatio;
		else throw new IllegalArgumentException("El promedio de velocidad debe ser mayor que 0");
	}
	
	

}
