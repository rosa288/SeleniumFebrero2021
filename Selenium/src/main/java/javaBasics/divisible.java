package javaBasics;

import javax.swing.JOptionPane;

public class divisible {
/**
 * *6) lee un numero por teclado e indica si es divisible entre dos (resto=0)
 * *
 * * **/
	public static void main (String [] args) {
		int numero= Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
		if (numero%2==0) {
	System.out.println("El numero ingresado ["+ numero + "] es divisible entre 2");
} else {
	System.out.println("El numero ingresado ["+ numero + "] no es divisible entre 2");
	}
 
}
}//fin de calasse
