package repasoUD5.videojuegos;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorTienda {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ArrayList<Videojuego> listaMenu = new ArrayList<Videojuego>();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("--- MENÚ DE OPCIONES ---");
            System.out.println("1. Añadir Videojuego:");
            System.out.println("2. Eliminar por Título:");
            System.out.print("3. Búsqueda Inteligente (Clase String): ");
            System.out.println("4. Cambiar Prioridad de Escaparate (Swap):");
            System.out.println("5. Análisis de Precios (Clase Math):");
            System.out.print("6. Listado Completo: ");
            System.out.println("7. Salir");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Mostrar datos: ");
                    break;
                case 2:
                    System.out.println("Ejecutando: Eliminar por Título...");
                    break;
                case 3:
                    System.out.println("Ejecutando: Búsqueda Inteligente...");
                    break;
                case 4:
                    System.out.println("Ejecutando: Cambiar Prioridad...");
                    break;
                case 5:
                    System.out.println("Ejecutando: Análisis de Precios...");
                    break;
                case 6:
                    System.out.println("Ejecutando: Listado Completo...");
                    break;
                case 7:
                    System.out.println("Saliendo del menú de gestión.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, introduce un número del 1 al 7.");
                    break;
            }

        } while (opcion != 7);


        System.out.println("Programa finalizado.");
        sc.close();
    }
}
