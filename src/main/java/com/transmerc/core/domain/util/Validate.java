package com.transmerc.core.domain.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {

	//validar solo letras
	public static boolean contieneSoloLetras(String cadena) {
	    for (int x = 0; x < cadena.length(); x++) {
	        char c = cadena.charAt(x);
	        // Si no está entre a y z, ni entre A y Z, ni es un espacio
	        if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
	            return false;
	        }
	    }
	    return true;
	}
	//validar solo numeros
	public static boolean validarSoloNumeros(String cadena) {
		 Pattern pat = Pattern.compile("^[\\d]*$");
	        Matcher mat = pat.matcher(cadena);
		if (mat.matches()) {
			return true;
		} else {
			return false;
		}
	}
	//validar solo numeros
		public static boolean validarNoSimbolos(String cadena) {
			 Pattern pat = Pattern.compile("^[\\w]*$");
		        Matcher mat = pat.matcher(cadena);
			if (mat.matches()) {
				return true;
			} else {
				return false;
			}
		}
		//validar email
		public static boolean validarEmail(String cadena) {
			 Pattern pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		        Matcher mat = pat.matcher(cadena);
		        if(mat.matches())
		        	return true;
		        else return false;
		}
		//validar password
		public static boolean validarPassword(String cadena) {
			 Pattern pat = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
		        Matcher mat = pat.matcher(cadena);
		        if(mat.matches())
		        	return true;
		        else return false;
		}
}
