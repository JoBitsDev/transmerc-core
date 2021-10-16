package com.transmerc.core.domain;

import com.transmerc.core.domain.util.Validate;

public class DeliveryInfo {

	private int id;
	private Rejection rejection;
	private String comment;
	private String photoUrl;
	private String eSignatureUrl;
	private String nombreReceptor;
	private int clasification;
	private Status status;
	
	public DeliveryInfo() {
		
	}

	public DeliveryInfo(Rejection rejection, String comment, String photoUrl, String eSignatureUrl,
			String nombreReceptor, int clasification, Status status) {
		super();
		setRejection(rejection);
		setComment(comment);
		setPhotoUrl(photoUrl);
		seteSignatureUrl(eSignatureUrl);
		setNombreReceptor(nombreReceptor);
		setClasification(clasification);
        setStatus(status);
	}

	public int getId() {
		return id;
	}

	public Rejection getRejection() {
		return rejection;
	}

	public void setRejection(Rejection rejection) {
		this.rejection = rejection;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		if(!(photoUrl.equals("")))
				if(Validate.validarUrl(photoUrl))
		this.photoUrl = photoUrl;
				else throw new IllegalArgumentException("La url no es valida");
	}

	public String geteSignatureUrl() {
		return eSignatureUrl;
	}

	public void seteSignatureUrl(String eSignatureUrl) {
		if(!(eSignatureUrl.equals("")))
			if(Validate.validarUrl(eSignatureUrl))
		this.eSignatureUrl = eSignatureUrl;
			else throw new IllegalArgumentException("La url no es valida");
	}

	public String getNombreReceptor() {
		return nombreReceptor;
	}

	public void setNombreReceptor(String nombreReceptor) {
		if(!(nombreReceptor.equals("")))
			if(Validate.contieneSoloLetras(nombreReceptor))
		this.nombreReceptor = nombreReceptor;
			else throw new IllegalArgumentException("El nombre del receptor debe contener letras solamente");
	}

	public int getClasification() {
		return clasification;
	}

	public void setClasification(int clasification) {
		if(clasification>=0 && clasification<=5)
		this.clasification = clasification;
		else throw new IllegalArgumentException("La clasificaci'on debe estar comprendidad de 0 a 5 puntos");
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	
}
