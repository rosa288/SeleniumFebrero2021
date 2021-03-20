package javaBasics;

import javax.swing.Spring;

public class Cuenta {

	private String nombre;
	private String numeroCuenta;
	private double tipoInteres;
	private double saldo;

	/**
	 * @author Sergio Ramones
	 * @date 06/03/2021
	 * @param N/A
	 **/
	public Cuenta() {
	}

	public Cuenta(String nombre, String numeroCuenta, double tipoInteres, double saldo) {
		this.nombre = nombre;
		this.numeroCuenta = numeroCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;
	}
	public Cuenta(Cuenta c) {
		this.nombre = c.nombre;
		this.numeroCuenta = c.numeroCuenta;
		this.tipoInteres = c.tipoInteres;
		this.saldo = c.saldo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;

	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public void setTipoInteres(double saldo) {
		this.saldo = saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getNumeroCuenta() {
		return this.numeroCuenta;
	}

	public double getTipoInteres() {
		return this.tipoInteres;
	}

	public double getSaldo() {
		return this.saldo;
	}
//	public boolean ingreso(double n) {
//		 boolean ingresoCorrecto=true;
//		if(n<0) {
//		}else{
//			saldo=saldo+n;
//		}
//		return ingresoCorrecto;
//		
//	}
//	public boolean reintegro(double n) {
//		boolean reintegroCorrecto=true;
//		if(n<0) {
//			reintegroCorrecto=true;
//		}else if (saldo>=n) {
//			saldo -=saldo+n;
//		}else {
//			reintegroCorrecto = false;
//		}
//		return reintegroCorrecto;
//	}
//	
//	public boolean transferencia(Cuenta c, double n) {
//		boolean Correcto=true;
//		if(n<0) {
//			Correcto=true;
//		}else if (saldo>=n) {
//			reintegro(n);
//			c.ingreso(n);
//
//		}else {
//			Correcto = false;
//		}
//		return Correcto;
//	}
	

	/**
	 * @author Sergio Ramones
	 * @date 04/03/2021
	 * @param N/A
	 * @return boolean
	 */
  public boolean ingreso(double n) {
      boolean ingresoCorrecto = true;
      if (n < 0) {
          ingresoCorrecto = false;
      } else {
          saldo = saldo + n;
      }
      return ingresoCorrecto;
  }

  /**
 	 * @author Sergio Ramones
 	 * @date 04/03/2021
 	 * @param N/A
 	 * @return boolean
 	 */
  public boolean reintegro(double n) {
      boolean reintegroCorrecto = true;                                                                         
      if (n < 0) {
          reintegroCorrecto = false;
      } else if (saldo >= n) {
          saldo -= n;
      } else {
          reintegroCorrecto = false;
      }
      return reintegroCorrecto;
  }

  /**
 	 * @author Sergio Ramones
 	 * @date 04/03/2021
 	 * @param N/A
 	 * @return boolean
 	 */
  public boolean transferencia(Cuenta c, double n) {
      boolean correcto = true;
      if (n < 0) {
          correcto = false;
      } else if (saldo >= n) {
          reintegro(n);
          c.ingreso(n);
      } else {
          correcto = false;
      }
      return correcto;
  }

}// end class
