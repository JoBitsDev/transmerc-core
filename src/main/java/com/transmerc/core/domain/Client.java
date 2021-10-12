package com.transmerc.core.domain;
import com.transmerc.core.domain.util.*;
import java.lang.Math;
public class Client {
 private int id;
 private int ci;
 private String name;
 private int lineTelephone;
 private int cell;
 private String mail;
 
 public Client() {
	 
 }

public Client(int id, int ci, String name, int lineTelephone, int cell, String mail) {

   setId(id);
   setCi(ci);
   setName(name);
   setLineTelephone(lineTelephone);
   setMail(mail);
   setCell(cell);
}

public int getId() {
	return id;
}
		
public void setId(int id) {
	this.id = id;
}

public int getCi() {
	return ci;
}

public void setCi (int ci) {
	int cant=(int)Math.log10(ci)+1;
	if(cant==11) {
	this.ci = ci;
	}
	else
		throw new IllegalArgumentException("El carnet debe tener 11 digitos");
		
}

public String getName() {
	
	return name;
}

public void setName(String name) {
	if(!(name.isEmpty()) && Validate.contieneSoloLetras(name)==true){
	this.name = name;
}
	else 
		throw new IllegalArgumentException("Solo debe haber letras en el nombre");
}

public int getLineTelephone() {
	return lineTelephone;
}

public void setLineTelephone(int lineTelephone) {
	this.lineTelephone = lineTelephone;
}

public int getCell() {
	return cell;
}

public void setCell(int cell) {
	this.cell = cell;
}

public String getMail() {
	return mail;
}

public void setMail(String email) {
	if(Validate.validarEmail(email)==true)
	this.mail = email;
	else throw new IllegalArgumentException("Formato de email incorrecto");
}


}
