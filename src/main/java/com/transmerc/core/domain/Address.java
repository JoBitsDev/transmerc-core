package com.transmerc.core.domain;
import com.transmerc.core.domain.util.*;

public class Address {
private int id;
private int number;
private String mainStreet;
private String betweenStreet;
private String betweeStreet2;
private String neighborhood;
private String municipality;
private String province;
private double latitude;
private double longitude;
private int postalCode;





public Address( int placeNumber, String mainStreet, String betweenStreet, String betweeStreet2,
		String neighborhood, String municipality, String province,int postalCode, double latitude, double longitude) {
    setPlaceNumber(placeNumber);
    setMainStreet(mainStreet);
    setBetweenStreet(betweenStreet);
    setBetweeStreet2(betweeStreet2);
    setNeighborhood(neighborhood);
    setMunicipality(municipality);
    setProvince(province);
    setPostalCode(postalCode);
    setLatitude(latitude);
    setLongitude(longitude);

}
public int getId() {
	return id;
}

public int getPlaceNumber() {
	return number;
}
public void setPlaceNumber(int placeNumber) {
	if(placeNumber>0) {
	this.number = placeNumber;
	}
	else throw new IllegalArgumentException("El numero de local debe ser mayor que 0");
}
public String getMainStreet() {
	return mainStreet;
}
public void setMainStreet(String mainStreet) {
	if(!(mainStreet.isEmpty()))
	this.mainStreet = mainStreet;
	else 
		throw new IllegalArgumentException("Debe rellenar la calle principal");
}
public String getBetweenStreet() {
	return betweenStreet;
}
public void setBetweenStreet(String betweenStreet) {
	if(!(betweenStreet.isEmpty()))
	this.betweenStreet = betweenStreet;
	else
		throw new IllegalArgumentException("Debe rellenar la calle aleda\u00f1a");
}
public String getBetweeStreet2() {
	return betweeStreet2;
}
public void setBetweeStreet2(String betweeStreet2) {
	this.betweeStreet2 = betweeStreet2;
}
public String getNeighborhood() {
	
	return neighborhood;
	
}
public void setNeighborhood(String neighborhood) {
	if(!(neighborhood.isEmpty())) {
		if(Validate.contieneSoloLetras(neighborhood)==true)
		this.neighborhood = neighborhood;
		else throw new IllegalArgumentException("El vecindario no debe contener n\u00fameros");
	}
		else throw new IllegalArgumentException("Debe rellenar el campo de vacindario");
}
public String getMunicipality() {
	return municipality;
}
public void setMunicipality(String municipality) {
	if(!(municipality.isEmpty())) {
		if(Validate.contieneSoloLetras(municipality)==true)
	    this.municipality = municipality;
		else throw new IllegalArgumentException("El municipio solo debe contener letras");
	}
	else throw new IllegalArgumentException("Debe rellenar el campo de municipio");
	}
public double getLatitude() {
	return latitude;
}
public void setLatitude(double latitude) {
	this.latitude = latitude;
}
public double getLongitude() {
	return longitude;
}
public void setLongitude(double longitude) {
	this.longitude = longitude;
}
public int getPostalCode() {
	return postalCode;
}
public void setPostalCode(int postalCode) {
	if(postalCode>10000)
	this.postalCode = postalCode;
	else throw new IllegalArgumentException("El c\u00f3digo postal debe ser v\u00e1lido");
}
public String getProvince() {
	return province;
}
public void setProvince(String provincia) {
	if(Validate.contieneSoloLetras(provincia)==true)
	this.province = provincia;
	else throw new IllegalArgumentException("El nombre de la provincia no debe tener n\u00fameros");
}



}
