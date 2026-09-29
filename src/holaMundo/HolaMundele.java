package holaMundo;

import java.util.Scanner;

public class HolaMundele {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre;
		System.out.println("Dime tu nombre: ");
		
		nombre=sc.nextLine();
		
		System.out.println("Hola "+nombre);
	}

}
