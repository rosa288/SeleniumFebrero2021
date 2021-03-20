package javaBasics;


public class HolaMundo {//open class
	
	String miNombre = "Sergio Ramones";
			int edad = 32;
	//casi no se usa
	float edadConDecimal = (float) 32.0;
	char letra = 'f';
	
	double edadDoble = 32.0000000;
	boolean bandera = true;
	
	
	
	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		
		double numero1=500.0035;
		double numero2=35.37;
		int edad = 32; 
		String nombre = "Rosa";

		String test = nombre+ numero2;
		double resultado=numero1+numero2;
		System.out.println("El resultado de la suma es: "+resultado);
		System.out.println("El resultado de la multiplicacion es: "+(numero1 *numero2));
		System.out.println("El resultado de la divion es: "+(numero1 /numero2));
		System.out.println("El resultado de la resta es: "+(numero1 -numero2));
	}
	
	
	
}//end classs
