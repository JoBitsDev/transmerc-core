package com.transmerc.core.domain;
import com.transmerc.core.domain.util.*;
public class Admin {
 private int id;
 private String user;
 private String password;
 private String name;
 private String email;
 private String cell;
 
public int getId() {
	return id;
}
public String getUser() {
	return user;
}
public void setUser(String user) {
	if(Validate.validarNoSimbolos(user)==true)
	this.user = user;
	else throw new IllegalArgumentException("El nombre de usuario no debe contener espacios ni carat\u00e9res especiales");
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	if(Validate.validarPassword(password))
	this.password = password;
	else throw new IllegalArgumentException("La contrase\u00f1a debe tener al menos 8 d\u00edgitos, un n\u00famero, una letra may\\u00fscula, una letra min\\u00fscula, un caracter especial y no debe tener espacios en blanco");
}
public String getName() {

	return name;
}
public void setName(String name) {
	if(Validate.contieneSoloLetras(name))
	this.name = name;
	else throw new IllegalArgumentException("El nombre no debe contener s\u00f3lo letras");
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	if(Validate.validarEmail(email)==true)
	this.email = email;
	else throw new IllegalArgumentException("Formato de email incorrecto");
}
public String getCell() {
	return cell;
}
public void setCell(String cell) {
	if(Validate.validarSoloNumeros(cell)==true)
	this.cell = cell;
	else throw new IllegalArgumentException("El n\u00famero de contacto solo debe contener n\u00fameros");
}
 
 
 
 
}
