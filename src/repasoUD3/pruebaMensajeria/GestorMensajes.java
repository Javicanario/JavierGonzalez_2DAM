package repasoUD3.pruebaMensajeria;

import java.util.Scanner;

public class GestorMensajes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

       
        Mensaje m1 = null, m2 = null, m3 = null;

        System.out.println("=== REGISTRO DE MENSAJES ===");
        
        int contador = 1;
        do {
            System.out.println("\nDatos del Mensaje " + contador + ":");
            
            System.out.print("Introduce el autor: ");
            String autor = teclado.nextLine();
            while (autor.trim().equals("")) {
                System.out.print("Error. El autor no puede estar vacío. Introduce el autor: ");
                autor = teclado.nextLine();
            }

            System.out.print("Introduce el contenido: ");
            String contenido = teclado.nextLine();
            while (contenido.length() < 5 || contenido.length() > 200) {
                System.out.print("Error. Debe tener entre 5 y 200 caracteres. Introduce el contenido: ");
                contenido = teclado.nextLine();
            }

            if (contador == 1) {
                m1 = new Mensaje(autor, contenido);
            } else if (contador == 2) {
                m2 = new Mensaje(autor, contenido);
            } else {
                m3 = new Mensaje(autor, contenido);
            }
            
            contador++;
        } while (contador <= 3);

        int opcion = 0;
        
        while (opcion != 6) {
            System.out.println("\n--- MENÚ INTERACTIVO ---");
            System.out.println("1. Mostrar los mensajes registrados");
            System.out.println("2. Mostrar el mensaje más largo");
            System.out.println("3. Contar cuántas veces aparece una letra");
            System.out.println("4. Crear una versión invertida del contenido");
            System.out.println("5. Convertir un mensaje a Formato Título");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");

            try {
                opcion = Integer.parseInt(teclado.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Debes introducir un número entero válido.");
                opcion = 0; 
                continue;
            }

            if (opcion == 1) {
                System.out.println("\nMensaje 1 -> Autor: " + m1.getAutor() + " | Contenido: " + m1.getContenido());
                System.out.println("Mensaje 2 -> Autor: " + m2.getAutor() + " | Contenido: " + m2.getContenido());
                System.out.println("Mensaje 3 -> Autor: " + m3.getAutor() + " | Contenido: " + m3.getContenido());

            } else if (opcion == 2) {
                Mensaje masLargo = m1;
                if (m2.getContenido().length() > masLargo.getContenido().length()) {
                    masLargo = m2;
                }
                if (m3.getContenido().length() > masLargo.getContenido().length()) {
                    masLargo = m3;
                }
                System.out.println("\nEl mensaje más largo es de " + masLargo.getAutor() + ": \"" + masLargo.getContenido() + "\"");

            } else if (opcion == 3) {
                System.out.print("¿De qué mensaje quieres contar? (1, 2 o 3): ");
                int num = Integer.parseInt(teclado.nextLine());
                
                String texto = "";
                if (num == 1) texto = m1.getContenido();
                else if (num == 2) texto = m2.getContenido();
                else texto = m3.getContenido();

                System.out.print("Introduce la letra a buscar: ");
                char letra = teclado.nextLine().charAt(0);

                int veces = 0;
                for (int i = 0; i < texto.length(); i++) {
                    char actual = texto.charAt(i);
                    
                    if (actual == ' ') {
                        continue; 
                    }
                    if (actual == letra) {
                        veces++;
                    }
                }
                System.out.println("La letra '" + letra + "' aparece " + veces + " veces (sin contar espacios).");

            } else if (opcion == 4) {
                System.out.print("¿Qué mensaje deseas invertir? (1, 2 o 3): ");
                int num = Integer.parseInt(teclado.nextLine());
                
                String texto = (num == 1) ? m1.getContenido() : (num == 2) ? m2.getContenido() : m3.getContenido();
                
                String invertida = "";
                for (int i = texto.length() - 1; i >= 0; i--) {
                    invertida = invertida + texto.charAt(i); 
                }
                System.out.println("Contenido invertido: " + invertida);

            } else if (opcion == 5) {
                System.out.print("¿Qué mensaje deseas convertir a Formato Título? (1, 2 o 3): ");
                int num = Integer.parseInt(teclado.nextLine());
                
                String texto = (num == 1) ? m1.getContenido() : (num == 2) ? m2.getContenido() : m3.getContenido();
                
                String resultado = "";
                
                boolean siguienteMayuscula = true; 

                for (int i = 0; i < texto.length(); i++) {
                    char c = texto.charAt(i);

                    if (c == ' ') {
                        resultado += c;
                        siguienteMayuscula = true; 
                    } else {
                        if (siguienteMayuscula) {
                            resultado += Character.toUpperCase(c);
                            siguienteMayuscula = false; 
                        } else {
                            resultado += Character.toLowerCase(c);
                        }
                    }
                }
                System.out.println("Resultado: " + resultado);

            } else if (opcion == 6) {
                System.out.println("Saliendo del programa... Largo");
                break;
            } else {
                System.out.println("Opción no válida.");
            }
        }
        teclado.close();
    }
}



