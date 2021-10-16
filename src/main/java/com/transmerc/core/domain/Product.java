package com.transmerc.core.domain;

import com.transmerc.core.domain.util.Validate;

public class Product {
	
	private int id;
	private String name;
	private float height;
	private float length;
	private float width;
	private float weight;
	private float price;
	private int quantity;
	private int pallets;
	private float volume;
	private float cashOnDelivery;
	private String note;
	
	public Product() {
		
	}
	
	public Product(String name, float height, float length, float width, float weight, float price,
			int quantity, int pallets, float volume, float cashOnDelivery, String note) {
		
		this.name = name;
		this.height = height;
		this.length = length;
		this.width = width;
		this.weight = weight;
		this.price = price;
		this.quantity = quantity;
		this.pallets = pallets;
		this.volume = volume;
		this.cashOnDelivery = cashOnDelivery;
		this.note = note;
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
		else throw new IllegalArgumentException("Deben haber solo lertas en el nombre");
	}
	public float getHeight() {
		return height;
	}
	//definir si le paso a todos el mensaje de warning-----------------
	public void setHeight(float height) {
		
		this.height = height;
	/*if (height==0)
		throw new IllegalArgumentException("Deber\u00eda rellenar los campos de dimensiones");*/
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		if(price> 0)
		this.price = price;
		else throw new IllegalArgumentException("El precio debe ser mayor que cero");
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if(quantity>0)
		this.quantity = quantity;
		else throw new IllegalArgumentException("La cantidad de productos debe ser de al menos 1");
	}
	public int getPallets() {
		return pallets;
	}
	public void setPallets(int pallets) {
		this.pallets = pallets;
	}
	public float getVolume() {
		return volume;
	}
	public void setVolume(float volume) {
		this.volume = volume;
	}
	public float getCashOnDelivery() {
		return cashOnDelivery;
	}
	public void setCashOnDelivery(float cashOnDelivery) {
		this.cashOnDelivery = cashOnDelivery;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
		}
	

}
