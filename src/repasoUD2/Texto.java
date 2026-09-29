package repasoUD2;

public class Texto {

	public static void main(String[] args) {
		
		String texto= "         Hola java";
		
		System.out.println("Longitud: "+texto.length());
		System.out.println("Sin espacios: "+texto.trim());
		System.out.println("En mayusculas: "+texto.toUpperCase());
		System.out.println("Si contiene palabra: "+texto.contains("java"));
		
		
	}
	
	
	
}
