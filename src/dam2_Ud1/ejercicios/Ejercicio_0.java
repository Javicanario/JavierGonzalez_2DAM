package dam2_Ud1.ejercicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ejercicio_0 {
	
	static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        

        //Mostramos la ruta absoluta de la carpeta actual
        System.out.println("=== 1. RUTA ABSOLUTA DE LA CARPETA ACTUAL ===");
        Path rutaActual = Paths.get("").toAbsolutePath();
        System.out.println("Ruta actual: " + rutaActual);
        System.out.println();

        //Pedimos por teclado una ruta y mostramos la información
        System.out.println("=== 2. INFORMACIÓN DE UN FICHERO O CARPETA ===");
        System.out.print("Introduce una ruta (fichero o carpeta): ");
        String entradaRuta = scanner.nextLine();
        Path rutaInfo = Paths.get(entradaRuta);

        if (Files.exists(rutaInfo)) {
            System.out.println("¡Existe!");
            System.out.println("¿Es un fichero?: " + (Files.isRegularFile(rutaInfo) ? "Sí" : "No"));
            System.out.println("¿Es una carpeta?: " + (Files.isDirectory(rutaInfo) ? "Sí" : "No"));
            try {
                FileTime fechaModificacion = Files.getLastModifiedTime(rutaInfo);
                long tamano = Files.size(rutaInfo);
                System.out.println("Última modificación: " + fechaModificacion);
                System.out.println("Tamaño: " + tamano + " bytes");
            } catch (IOException e) {
                System.out.println("Error al leer los atributos: " + e.getMessage());
            }
        } else {
            System.out.println("La ruta introducida no existe.");
        }
        System.out.println();

        //Mostramos el contenido de una carpeta
        System.out.println("=== 3. CONTENIDO DE UNA CARPETA ===");
        System.out.print("Introduce la ruta de una carpeta para listar su contenido: ");
        String entradaCarpetaListar = scanner.nextLine();
        Path rutaCarpetaListar = Paths.get(entradaCarpetaListar);

        if (Files.exists(rutaCarpetaListar) && Files.isDirectory(rutaCarpetaListar)) {
            System.out.println("Contenido de " + rutaCarpetaListar.toAbsolutePath() + ":");
            try (Stream<Path> stream = Files.list(rutaCarpetaListar)) {
                stream.forEach(p -> System.out.println("- " + p.getFileName() + (Files.isDirectory(p) ? " [Carpeta]" : " [Archivo]")));
            } catch (IOException e) {
                System.out.println("Error al listar la carpeta: " + e.getMessage());
            }
        } else {
            System.out.println("La ruta no existe o no es una carpeta válida.");
        }
        System.out.println();

        //Creamos una carpeta en la ruta por defecto
        System.out.println("=== 4. CREAR CARPETA EN RUTA POR DEFECTO ===");
        System.out.print("Introduce el nombre de la nueva carpeta: ");
        String nombreNuevaCarpeta = scanner.nextLine();
        Path nuevaCarpeta = Paths.get(nombreNuevaCarpeta); //Esta se crea relativo a la ruta por defecto

        if (!Files.exists(nuevaCarpeta)) {
            try {
                Files.createDirectory(nuevaCarpeta);
                System.out.println("Carpeta creada con éxito en: " + nuevaCarpeta.toAbsolutePath());
            } catch (IOException e) {
                System.out.println("Error al crear la carpeta: " + e.getMessage());
            }
        } else {
            System.out.println("Error: La carpeta ya existe.");
        }
        System.out.println();

        //Creamos un fichero
        System.out.println("=== 5. CREAR UN FICHERO ===");
        System.out.print("Introduce el nombre del nuevo fichero (ej. notas.txt): ");
        String nombreNuevoFichero = scanner.nextLine();
        Path nuevoFichero = Paths.get(nombreNuevoFichero);

        if (!Files.exists(nuevoFichero)) {
            try {
                Files.createFile(nuevoFichero);
                System.out.println("Fichero creado con éxito en: " + nuevoFichero.toAbsolutePath());
            } catch (IOException e) {
                System.out.println("Error al crear el fichero: " + e.getMessage());
            }
        } else {
            System.out.println("Error: El fichero ya existe.");
        }
        System.out.println();

        //Renomramos un fichero
        System.out.println("=== 6. RENOMBRAR UN FICHERO ===");
        System.out.print("Introduce la ruta del fichero que quieres renombrar: ");
        String rutaOrigenStr = scanner.nextLine();
        Path rutaOrigen = Paths.get(rutaOrigenStr);

        if (Files.exists(rutaOrigen) && Files.isRegularFile(rutaOrigen)) {
            System.out.print("Introduce el nuevo nombre para el fichero: ");
            String nuevoNombre = scanner.nextLine();
            
            //Resolvemos el nuevo nombre en la misma carpeta donde está el origen
            Path rutaDestino = rutaOrigen.resolveSibling(nuevoNombre);

            if (!Files.exists(rutaDestino)) {
                try {
                    Files.move(rutaOrigen, rutaDestino);
                    System.out.println("Fichero renombrado con éxito a: " + rutaDestino.getFileName());
                } catch (IOException e) {
                    System.out.println("Error al renombrar el fichero: " + e.getMessage());
                }
            } else {
                System.out.println("Error: El nuevo nombre ya está en uso por otro archivo o carpeta.");
            }
        } else {
            System.out.println("Error: El archivo de origen no existe o no es un fichero válido.");
        }

        scanner.close();
        System.out.println("\n=== Programa finalizado ===");
    }
}

