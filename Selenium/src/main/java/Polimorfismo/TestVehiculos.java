package Polimorfismo;

public class TestVehiculos {

	public static void main(String[] args) {
		Vehiculo misVehiculos[]=new Vehiculo [3];
		misVehiculos[0]=new Vehiculo ("GFER324", "Ford","2009");
		misVehiculos[1]=new VehiculoTurismo (8, "GFER324", "Ford","2009");
		misVehiculos[2]=new VehiculoDeportivo ("GFH-45-6","Ford","2009",8);
		
		for(Vehiculo vehiculos: misVehiculos) {
			System.out.println(vehiculos.mostrarDatos());
			System.out.println(" ");
		}

	}

}
