import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal donde crearemos el menú para interactuar con la base de
 * datos.
 * 
 * @author Macal Cruz Brandon Brayan - 318085470
 * @author Pintor Munoz Pedro Joshue - 420053796
 * @author Rojo Trujillo Alessandro Gael - 317218385
 * @author Hernandez Morales Jose Angel - 315137903
 * @version 1.0 febrero 2024
 * @since Clase de Bases de datos 2024-2
 */
public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso
        List<Hotel> hoteles = new ArrayList<>();
        List<String[]> datos = new ArrayList<>();
        // Cargar datos desde CSV (ejemplo)
        // CsvFileManager.loadHoteles(hoteles);
        // CsvFileManager.loadHuespedes(huespedes);
        // CsvFileManager.loadCuartos(cuartos);

        datos = CsvFileManager.leerCSV("Practicas/Practica2/SRC/Archivo.csv");

        // Imprimir los datos leídos
        for (String[] fila : datos) {
            for (String valor : fila) {
                System.out.print("+" + valor + "\t");
            }
            System.out.println();
        }

        // Realizar operaciones (ejemplo)
        Hotel nuevoHotel = new Hotel(0, null, null, null, null, null, null, null, 0, 0, 0);/* Datos del nuevo hotel */
        hoteles.add(nuevoHotel);

        // Guardar datos en CSV
        // CsvFileManager.saveHoteles(hoteles);
        // CsvFileManager.saveHuespedes(huespedes);
        // CsvFileManager.saveCuartos(cuartos);
    }
}