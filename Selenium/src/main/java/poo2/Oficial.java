package poo2;

public class Oficial extends Operario {

	public Oficial(String nombre) {
		super(nombre);
		System.out.println("Constructor de oficial");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString()+ "Operario";
	}
}
