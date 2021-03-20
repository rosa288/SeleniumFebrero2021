package Polimorfismo;

public class VehiculoTurismo extends Vehiculo {
	
	private int numeroPuertas;
	/**
	@param matricula
	 * @param marca
	 * @param modelo
	 */
	public VehiculoTurismo(int numeroPuertas, String matricula, String marca, String modelo) {
		super(matricula, marca, modelo);
		this.numeroPuertas=numeroPuertas;
	}
		// TODO Auto-generated constructor stub
	public int getNumeroPuertas() {
		return numeroPuertas;
	}
@Override
public String mostrarDatos() {
	return "Matricula: "+ matricula+ "\nMarca: " + marca+ " \nModelo: "+ modelo+ "\nNumero de puertas: "+numeroPuertas;
}
}
