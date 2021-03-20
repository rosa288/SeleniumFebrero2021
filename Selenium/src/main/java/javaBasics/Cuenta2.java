package javaBasics;

public class Cuenta2 {

	private String nombre;
	private String numeroDeCuenta;
	private double interes =0;
	private double saldo=0;
	/**
	 * @param nombre
	 * @param numeroDeCuenta
	 * @param interes
	 * @param saldo
	 */
	public Cuenta2(String nombre, String numeroDeCuenta, double interes, double saldo) {
		this.nombre = nombre;
		this.numeroDeCuenta = numeroDeCuenta;
		this.interes = interes;
		this.saldo = saldo;
	}
	/**
	 * @param nombre
	 * @param numeroDeCuenta
	 * @param interes
	 * @param saldo
	 */
	public Cuenta2(Cuenta2 cuenta) {
		this.nombre = cuenta.nombre;
		this.numeroDeCuenta = cuenta.numeroDeCuenta;
		this.interes = cuenta.interes;
		this.saldo = cuenta.saldo;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the numeroDeCuenta
	 */
	public String getNumeroDeCuenta() {
		return numeroDeCuenta;
	}
	/**
	 * @param numeroDeCuenta the numeroDeCuenta to set
	 */
	public void setNumeroDeCuenta(String numeroDeCuenta) {
		this.numeroDeCuenta = numeroDeCuenta;
	}
	/**
	 * @return the interes
	 */
	public double getInteres() {
		return interes;
	}
	/**
	 * @param interes the interes to set
	 */
	public void setInteres(double interes) {
		this.interes = interes;
	}
	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
}
