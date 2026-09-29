package unidadRepaso;

import java.util.Scanner;

public class PrimerRepaso {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase;
		
		System.out.println("Introduzca una frase: ");
		
		frase = sc.nextLine();
		
		System.out.println("Longitud de la frase: "+frase.length());
		int longitud = frase.length();
		System.out.println("Primera y ultima letra: "+frase.charAt(0)+(frase.charAt(longitud-1)));
		System.out.println("Frase en mayusculas: "+frase.toUpperCase());
		System.out.println("Numero de palabras: " + frase.split("\\s+").length);
		System.out.println("Frase invertida: ");
	}

}
