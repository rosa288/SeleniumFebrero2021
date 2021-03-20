package javaBasics;

import java.util.Scanner;

public class CompararCadenas {

	public static void main (String[]arg) {
		
		Scanner leer= new Scanner (System.in);
		
		System.out.println("Escribir la primera Palabra");
		String palabra1= leer.next();
 
		System.out.println("Escribir la primera Palabra");
		String palabra2= leer.next();
		leer.close();
		
		if(palabra1.equals(palabra2)) {
			System.out.println("son iguales");
		}else {
			System.out.println("No son iguales");
		}
		
		String texto="un 45 texto";
		String textoSinespacio=texto.replace(" ", "");
		
		System.out.println(textoSinespacio);
		System.out.println("El texto tiene["+texto.length()+"]");
		
		
//	if(cadena.equals(cadena2)) {
//		System.out.println("Es igual");
//	}
//	else {
	//	System.out.println("Es diferente");
//	}
//	if(cadena.equalsIgnoreCase (Cadena2)) {
//		Sistem.out.println ("Es igual");
//	}else {
//		System.out.println();
//	}
	
	}//fin de main
}//fin de la clase
