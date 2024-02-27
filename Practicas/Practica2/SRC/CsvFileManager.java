import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
* Clase para manejar archivos csv.
* @author Macal Cruz Brandon Brayan - 318085470
* @author Pintor Munoz Pedro Joshue - 420053796
* @author Rojo Trujillo Alessandro Gael - 317218385
* @author Hernandez Morales Jose Angel - 315137903
* @version 1.0 febrero 2024
* @since Clase de Bases de datos 2024-2
*/
public class CsvFileManager {
	private static final String FILENAME_HOTELES = "hoteles.csv";
	private static final String FILENAME_HUESPEDES = "huespedes.csv";
	private static final String FILENAME_CUARTOS = "cuartos.csv";

<<<<<<< HEAD
	public static <T> void guardarCSV(String nombreArchivo, List<T> datos) {
=======
	public CsvFileManager() {
	}

	// Métodos para escribir y leer archivos CSV
	public static void guardarCSV(String nombreArchivo, List<String[]> datos) {
>>>>>>> 933b2ddb80b828fbc392fb3186ca3b4d6da53cff
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
			for (int i=0; i<datos.size(); i++) {
				CharSequence fila = "";
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

	// Crear ID en CSV.
	public static int generarIdUnico(String nombreArchivo) {
		List<String[]> datos = leerCSV(nombreArchivo);
		int maxId = datos.stream()
				.mapToInt(item -> Integer.parseInt(item[0]))
				.max()
				.orElse(0);
		return maxId + 1;
	}

	// Metodo para AGREGAR un nuevo dato en CSV.
	// Se pasa el dato sin ID.
	public static void agregarDato(String nombreArchivo, String[] nuevoDato) {
		int idUnico = generarIdUnico(nombreArchivo);

		String[] datoConId = new String[nuevoDato.length + 1];
		datoConId[0] = String.valueOf(idUnico);
		System.arraycopy(nuevoDato, 0, datoConId, 1, nuevoDato.length);

		List<String[]> datos = leerCSV(nombreArchivo);
		datos.add(datoConId);
		guardarCSV(nombreArchivo, datos);
	}

	// Metodo para CONSULTAR datos por id en CSV.
	public static String[] consultarDatos(String nombreArchivo, String id) {
		List<String[]> datos = leerCSV(nombreArchivo);

		// Encontrar el indice del dato con el ID proporcionado.
		for (String[] dato : datos) {
			if (dato[0].equals(id)) {
				return dato;
			}
		}
		return null;
	}

	// Metodo para EDITAR un dato en CSV.
	public static void editarDato(String nombreArchivo, String[] datoEditado, String id) {
		List<String[]> datos = leerCSV(nombreArchivo);

		// Encontrar el indice del dato con el ID proporcionado.
		int index = -1;
		for (int i = 0; i < datos.size(); i++) {
			if (datos.get(i)[0].equals(id)) {
				index = i;
				break;
			}
		}

		// Si se encontro el dato, replazarlo con la version editada.
		if (index != -1) {
			datos.set(index, datoEditado);
			guardarCSV(nombreArchivo, datos);
		}
	}

	// Metodo para ELIMINAR un dato en CSV.
	public static void eliminarDato(String nombreArchivo, String id) {
		List<String[]> datos = leerCSV(nombreArchivo);

		// Encontrar el indice del dato con el ID proporcionado.
		int index = -1;
		for (int i = 0; i < datos.size(); i++) {
			if (datos.get(i)[0].equals(id)) {
				index = i;
				break;
			}
		}

		// Si se encontro el dato, eliminarlo.
		if (index != -1) {
			datos.remove(index);
			guardarCSV(nombreArchivo, datos);
		}
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
