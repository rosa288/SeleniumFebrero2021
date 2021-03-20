package javaBasics;

import java.util.Scanner;

public class TablaDeMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Tablas= new Scanner(System.in);
		int tabla1=0;
		int resultado=0;
		int temporal=0;
		
		System.out.println("ingrese el numero que quiera multiplicar");
		temporal= Tablas.nextInt();
		
		while (temporal<=0) {
			System.out.println("El numero que ingresaste debe ser mayo que cero, ingrese otro numero");
			temporal= Tablas.nextInt();
		}
		
		for(int indice=1; indice<=10;indice++) {
		 resultado= indice* temporal;
		 System.out.println("La multiplicación " + temporal+ " por "+ indice + " el resuldado es: "+ resultado);
		}
		
	}//main

}//class
