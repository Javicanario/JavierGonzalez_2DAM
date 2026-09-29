package repasoUD4.vehiculosCoche;

public class MainVehiculo {

	public static void main(String[] args) {
		
	Vehiculo v1 = new Vehiculo ("Citroen", 200, false);
	Vehiculo v2 = new Vehiculo ("Ford");
	Coche miCoche = new Coche ("Citroen", 210, false, 5, false);
	Moto miMoto = new Moto ("Kawasaki",310, 1000, "Deportiva");
	
	v1.setMarca("Renault");
	System.out.println("Se modifica la marca de v1: "+v1.getMarca());
	
	v2.setVelMax(150);
	System.out.println("Se modifica la velocidad máxima de v2: "+v2.getVelMax());

	miCoche.setNumPuertas(3);
	System.out.println("Se modifica el numero de puertas de miCoche: "+miCoche.getNumPuertas());

	miMoto.setVelMax(250);
	System.out.println("Se modifica la velocidad máxima de miMoto: "+miMoto.getVelMax());

	v1.mostrarDatos();
	v2.mostrarDatos();
	miCoche.mostrarDatos();
	miMoto.mostrarDatos();
	
	v1.arrancar();
	miCoche.arrancar("llave");
	miMoto.arrancar(true);
	miMoto.arrancar(false);
	
	Vehiculo masRapido = Vehiculo.vehiculoMasRapido(miCoche, miMoto);
	System.out.println("El más rápido es: ");
	masRapido.mostrarDatos();

	}

}
