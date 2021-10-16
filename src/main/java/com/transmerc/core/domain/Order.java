package com.transmerc.core.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.transmerc.core.domain.util.Validate;

public class Order {
    
	
	private int id;
	private Client client;
	private Address address;
	private String contactName;
	private int contactPhone;
	private String eMail;
	private Date dateCreated;
	private float price;
	private String priority;
	private int barcode;
	private LocalDate serviceTime;
	private PickupInfo pickup;
	private float cashOnDelivery;
	private Status status;
	private LocalDate departed;
	private LocalDate arrived;
	private String eta;
	private String mi;
	private boolean blocked;
	private DeliveryInfo deliveryInfo;
	List <Product> products;
	public Order() {
		
	}
	
	

	public Order(Client client, Address address, String contactName, int contactPhone, String eMail, Date dateCreated,
			float price, String priority, int barcode, LocalDate serviceTime, PickupInfo pickup, float cashOnDelivery,
			Status status, LocalDate departed, LocalDate arrived, String eta, String mi, boolean blocked,
			DeliveryInfo deliveryInfo) {
		this.products= new ArrayList<Product>();
		setClient(client);
		setAddress(address);
		setContactName(contactName);
		setContactPhone(contactPhone);
		seteMail(eMail);
		setDateCreated(dateCreated);
		setPrice(price);
		setPriority(priority);
		setBarcode(barcode);
		setServiceTime(serviceTime);
		setPickup(pickup);
		setCashOnDelivery(cashOnDelivery);
		setStatus(status);
		setDeparted(departed);
		setArrived(arrived);
		setEta(eta);
		setMi(mi);
		setBlocked(blocked);
		setDeliveryInfo(deliveryInfo);
	}



	public int getId() {
		return id;
	}


	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		if(client!=null)
		this.client = client;
		else throw new IllegalArgumentException("La orden debe tener un cliente receptor");
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		if(address!=null)
		this.address = address;
		else throw new IllegalArgumentException("La orden debe tener una direcci\u00f3n de entrega");
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		if(!(contactName.equals(""))) {
		if(Validate.contieneSoloLetras(contactName))
		this.contactName = contactName;
		else throw new IllegalArgumentException("El nombre de contacto debe contener solo letras");
	}
		
	}

	public int getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(int contactPhone) {
		if(contactPhone!=0)
		this.contactPhone = contactPhone;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		if(!(eMail.equals(""))) {
			if(Validate.validarEmail(eMail))
		this.eMail = eMail;
			else throw new IllegalArgumentException("El formato de email es incorrecto.\n Ejemplo:joseR@gmail.com");
		}
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		if(dateCreated!=null)
		this.dateCreated = dateCreated;
		else throw new IllegalArgumentException("Debe introducir una fecha de creaci\u00f3n");
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		if(price>0)
		this.price = price;
		else throw new IllegalArgumentException("El precio de cualquier producto debe ser superior a 0");
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public int getBarcode() {
		return barcode;
	}

	public void setBarcode(int barcode) {
		this.barcode = barcode;
	}

	public LocalDate getServiceTime() {
		return serviceTime;
	}

	public void setServiceTime(LocalDate serviceTime) {
		this.serviceTime = serviceTime;
	}

	public PickupInfo getPickup() {
		return pickup;
	}

	public void setPickup(PickupInfo pickup) {
		this.pickup = pickup;
	}

	public float getCashOnDelivery() {
		return cashOnDelivery;
	}

	public void setCashOnDelivery(float cashOnDelivery) {
		this.cashOnDelivery = cashOnDelivery;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public LocalDate getDeparted() {
		return departed;
	}

	public void setDeparted(LocalDate departed) {
		this.departed = departed;
	}

	public LocalDate getArrived() {
		return arrived;
	}

	public void setArrived(LocalDate arrived) {
		this.arrived = arrived;
	}

	public String getEta() {
		return eta;
	}

	public void setEta(String eta) {
		this.eta = eta;
	}

	public String getMi() {
		return mi;
	}

	public void setMi(String mi) {
		this.mi = mi;
	}

	public boolean isBlocked() {
		return blocked;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

	public DeliveryInfo getDeliveryInfo() {
		return deliveryInfo;
	}

	public void setDeliveryInfo(DeliveryInfo deliveryInfo) {
		if(deliveryInfo!=null)
		this.deliveryInfo = deliveryInfo;
		else throw new IllegalArgumentException("La orden debe tener la informacion de entrega si quiere terminarla");
	}
	
	
}
