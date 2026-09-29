package repasoUD4.vehiculosCoche;

public class Coche extends Vehiculo{

	private int numPuertas;
	private boolean automatico;
	
	public Coche(String marca, int velMax, boolean enMarcha, int numPuertas, boolean automatico) {
		super(marca, velMax, enMarcha);
		this.numPuertas = numPuertas;
		this.automatico = automatico;
	}

	public void mostrarDatos() {
		super.mostrarDatos();
		
		System.out.println("Numero de puertas: "+numPuertas);
		System.out.println("Tipo de transmision: "+(this.automatico ? " Automatico " : " Manual"));
	}
	
	public void arrancar(String modo) {
		if(modo.equalsIgnoreCase("llave")) {
			System.out.println("Arrancando el coche con la llave.");
		}else if (modo.equalsIgnoreCase("boton")){
			System.out.println("Arrancando el coche con el boton.");
		}else {
			System.out.println("Arranque no reconocido");
		}
			
		
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public boolean isAutomatico() {
		return automatico;
	}

	public void setAutomatico(boolean automatico) {
		this.automatico = automatico;
	}
	
}
