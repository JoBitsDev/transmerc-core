package com.transmerc.core.domain;

import com.transmerc.core.domain.util.Validate;

public class PickupInfo {

	private int id;
	private Client client;
	private Address address;
	private String contactName;
	private String eMail;
	private boolean blocked;
	private Rejection rejection;
	
	
	
	public PickupInfo() {
	
	}

	public PickupInfo( Client client, Address address, String contactName, String eMail,Rejection rejection, boolean blocked) {

		setClient(client);
		setAddress(address);
		setContactName(contactName);
		seteMail(eMail);
		setBlocked(blocked);
		setRejection(rejection);
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
		else throw new IllegalArgumentException("Debe existir un cliente en la informacion de recogida");
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		if(address!=null)
		this.address = address;
		else throw new IllegalArgumentException("La direccion es un campo obligatorio");
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		if(!(contactName.equals("")))
			if(Validate.contieneSoloLetras(contactName))
		this.contactName = contactName;
			else throw new IllegalArgumentException("El nombre no debe tener nada excepto letras");
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		if(!(eMail.equals("")))
			if(Validate.validarEmail(contactName))
		this.eMail = eMail;
			else throw new IllegalArgumentException("El formato del eMail es incorrecto");
	}
	public boolean isBlocked() {
		return blocked;
	}
	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

	public Rejection getRejection() {
		return rejection;
	}

	public void setRejection(Rejection rejection) {
		this.rejection = rejection;
	}

	
	
	
}
