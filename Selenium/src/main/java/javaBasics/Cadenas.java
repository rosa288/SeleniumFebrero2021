package javaBasics;

public class Cadenas {
//Dada una cadena de caracters, extraer la cuarta y quinta letra usando el metodo substring
	
	public static void main(String[]args) {
		String Cadena= "s Hola Curso selenium";
		String subcadena = Cadena.substring(0, 4);
		
		System.out.println(subcadena);
		
		if(Cadena.equals("Hola Curso Selenium")) {
			System.out.println("Las cadenas son iguales");
		}else {
			System.out.println("las cadenas no son iguales");
		}
		
		
		if(Cadena.equalsIgnoreCase("Hola Curso Selenium")) {
			System.out.println("Las cadenas son iguales");
		}else {
			System.out.println("las cadenas no son iguales");
	
		}
		if(Cadena.contains("Curso")) {
			System.out.println("si esta el elemento");
		}else {
			System.out.println("las cadenas no son iguales");
		}
	}
	
	
}
