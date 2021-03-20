package javaBasics;

import java.util.Scanner;

public class SumerParEimpar {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float par = 0;
		float impar = 0;
		float residuo;
		float numeroTemp;
		// int numeroDeVecesARepetir;

		for (int i = 1; i <= 5; i++) {
			System.out.println("ingrese el numero: [" + i + "]");
			numeroTemp = teclado.nextFloat();

			while (numeroTemp < 0) {
				System.out.println("El numero debe ser mayo a cero y tu numero es " + numeroTemp + " Ingresa de nuevo");
				numeroTemp = teclado.nextFloat();
			} // end while
			residuo = numeroTemp % 2;

			if (residuo == 0) {
				par += numeroTemp;
				System.out.println("El numero es par: " + numeroTemp);
			}
			if (residuo != 0 && residuo < 0) {
				impar += numeroTemp;
				System.out.println("El numero es par: " + numeroTemp);

			}

		} // for
		teclado.close();
		System.out.println("La sumatoria de los pares es:["+par+"]");
		System.out.println("La sumatoria de los impares es:["+par+"]");
	}// main
}// class

