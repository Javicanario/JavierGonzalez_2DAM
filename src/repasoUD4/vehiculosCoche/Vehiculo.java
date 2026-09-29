package repasoUD4.vehiculosCoche;

public class Vehiculo {

	private String marca;
	private int velMax;
	private boolean enMarcha;
	
	public Vehiculo(String marca, int velMax, boolean enMarcha) {
		super();
		this.marca = marca;
		this.velMax = velMax;
		this.enMarcha = false;
	}

	public Vehiculo(String marca) {
		super();
		this.marca = marca;
		this.velMax = 120;
		this.enMarcha = false;
	}

	void arrancar() {
		if(enMarcha) {
			enMarcha = true;
			System.out.println("El vehiculo ha arrancado.");
		}
	}
	
	void detener() {
		if(enMarcha) {
			enMarcha = false;
			System.out.println("El vehiculo se ha detenido.");
		}
	}
	
	void mostrarDatos() {
		System.out.println("Marca del vehiculo: "+marca);
		System.out.println("Velocidad maxima: "+velMax);
		System.out.println("Estado del vehiculo: "+enMarcha);
	}
	
	public static Vehiculo vehiculoMasRapido(Vehiculo v1, Vehiculo v2) {
		if(v2.getVelMax()>v1.getVelMax()) {
			return v2;
		}
			return v1;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getVelMax() {
		return velMax;
	}

	public void setVelMax(int velMax) {
		this.velMax = velMax;
	}

	public boolean isEnMarcha() {
		return enMarcha;
	}

	public void setEnMarcha(boolean enMarcha) {
		this.enMarcha = enMarcha;
	}
	
	
	
	
	
	
	
	
	
}
