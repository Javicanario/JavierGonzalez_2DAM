package dam2_Ud1.ejemplos;

import java.nio.file.*;
import java.io.IOException;

public class OperacionesFichero {
    public static void main(String[] args) throws IOException {
        Path origen  = Path.of("catalogo/config.txt");
        Path copia   = Path.of("catalogo/config_copia.txt");
        Path destino = Path.of("catalogo/backup/config.txt");

        // Copiar (sobrescribiendo si ya existe)
        Files.copy(origen, copia, StandardCopyOption.REPLACE_EXISTING);

        // Mover / renombrar
        Files.createDirectories(destino.getParent());
        Files.move(copia, destino, StandardCopyOption.REPLACE_EXISTING);

        // Borrar de forma segura
        boolean borrado = Files.deleteIfExists(Path.of("catalogo/fichero_temporal.tmp"));
        System.out.println("¿Se borró el fichero temporal? " + borrado);
    }
}