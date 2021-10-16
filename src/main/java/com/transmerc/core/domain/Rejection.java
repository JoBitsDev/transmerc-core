package com.transmerc.core.domain;

import com.transmerc.core.domain.util.Validate;

public class Rejection {
   private int id;
   private String cause;

   public Rejection() {
	
}

public Rejection(String cause) {

	this.cause = cause;
}

public int getId() {
	return id;
}


public String getCause() {
	return cause;
}

public void setCause(String cause) {
	if(Validate.validarNoSimbolos(cause))
	this.cause = cause;
	else throw new IllegalArgumentException("No deben haber simbolos en la causa");
}
   
   
   
   
}
