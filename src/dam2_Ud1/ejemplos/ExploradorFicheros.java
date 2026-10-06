package dam2_Ud1.ejemplos;

import java.nio.file.*;
import java.io.IOException;
import java.util.stream.Stream;

public class ExploradorFicheros {
    public static void main(String[] args) throws IOException {
        Path raiz = Path.of("catalogo");

        // Listar solo el contenido directo (no recursivo)
        try (Stream<Path> listado = Files.list(raiz)) {
            listado.forEach(System.out::println);
        }

        // Recorrer TODO el árbol de subdirectorios (recursivo)
        try (Stream<Path> arbol = Files.walk(raiz)) {
            arbol.filter(Files::isRegularFile)
                 .forEach(p -> System.out.println("Fichero encontrado: " + p));
        }
    }
}
