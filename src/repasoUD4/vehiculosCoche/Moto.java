package repasoUD4.vehiculosCoche;

public class Moto extends Vehiculo{

	private int cilindrada;
	private String tipo;// (Deportiva / Scooter)
	
	public Moto(String marca, int velMax, int cilindrada, String tipo) {
		super(marca, velMax, false);

		this.cilindrada = cilindrada;
		this.tipo = tipo;

	}
	
	public void mostrarDatos() {
		super.mostrarDatos();
		
		System.out.println("Cilindrada :"+cilindrada);
		if(tipo.equalsIgnoreCase("Deportiva")) {
			System.out.println("Tipo de moto: Deportiva");
		}else {
			System.out.println("Tipo de moto: Scooter");
		}
		
	}
	
	public void arrancar(boolean caballete) {
		if(caballete=(true)) {
			System.out.println("No se puede arrancar la moto con el caballete puesto.");
		}else if (caballete=(false)){
			System.out.println("La moto ha arrancado correctamente.");
		}else {
			System.out.println("Arranque no reconocido");
		}
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	 
}
