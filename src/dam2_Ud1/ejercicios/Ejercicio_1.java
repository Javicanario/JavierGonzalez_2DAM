package dam2_Ud1.ejercicios;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio_1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Introduce el nombre de un fichero (ej. notas.txt): ");
        String nombreFichero = sc.nextLine();

        Path ruta = Paths.get(nombreFichero);

        if (Files.exists(ruta)) {
            System.out.println("El fichero existe, bravo por ti.");
            System.out.println("");
        }else
        System.out.println("El fichero no se encuentra");
    }
}
