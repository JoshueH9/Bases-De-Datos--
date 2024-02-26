import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso
        List<Hotel> hoteles = new ArrayList<>();

        // Cargar datos desde CSV (ejemplo)
        // CsvFileManager.loadHoteles(hoteles);
        // CsvFileManager.loadHuespedes(huespedes);
        // CsvFileManager.loadCuartos(cuartos);

        // Realizar operaciones (ejemplo)
        Hotel nuevoHotel = new Hotel(0, 0, 0, 0, 0, 0, null, null, null, null/* Datos del nuevo hotel */);
        hoteles.add(nuevoHotel);

        // Guardar datos en CSV
        // CsvFileManager.saveHoteles(hoteles);
        // CsvFileManager.saveHuespedes(huespedes);
        // CsvFileManager.saveCuartos(cuartos);
    }
}