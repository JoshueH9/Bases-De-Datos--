import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvFileManager {
	private static final String FILENAME_HOTELES = "hoteles.csv";
	private static final String FILENAME_HUESPEDES = "huespedes.csv";
	private static final String FILENAME_CUARTOS = "cuartos.csv";

	// Métodos para escribir y leer archivos CSV
	public static void guardarCSV(String nombreArchivo, List<String[]> datos) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
			for (String[] fila : datos) {
				writer.write(String.join(",", fila));
				writer.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static List<String[]> leerCSV(String nombreArchivo) {
		List<String[]> datos = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
			String linea;
			while ((linea = reader.readLine()) != null) {
				String[] fila = linea.split(",");
				datos.add(fila);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return datos;
	}
}

// Ejemplo de uso
/*
 * public static void main(String[] args) {
 * // Ejemplo de datos
 * List<String[]> datosAGuardar = new ArrayList<>();
 * datosAGuardar.add(new String[]{"Nombre", "Edad", "Ciudad"});
 * datosAGuardar.add(new String[]{"Juan", "25", "Ciudad de Mexico"});
 * datosAGuardar.add(new String[]{"Maria", "30", "Buenos Aires"});
 * 
 * // Guardar en un archivo CSV
 * guardarCSV("datos.csv", datosAGuardar);
 * 
 * // Leer desde un archivo CSV
 * List<String[]> datosLeidos = leerCSV("datos.csv");
 * 
 * // Imprimir los datos leídos
 * for (String[] fila : datosLeidos) {
 * for (String valor : fila) {
 * System.out.print(valor + "\t");
 * }
 * System.out.println();
 * }
 * }
 */