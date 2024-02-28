import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Entidades.Habitacion;
import Entidades.Hotel;
import Entidades.Huesped;

/**
 * Clase para manejar archivos csv.
 * 
 * @author Macal Cruz Brandon Brayan - 318085470
 * @author Pintor Munoz Pedro Joshue - 420053796
 * @author Rojo Trujillo Alessandro Gael - 317218385
 * @author Hernandez Morales Jose Angel - 315137903
 * @version 1.0 febrero 2024
 * @since Clase de Bases de datos 2024-2
 */
public class CsvFileManager {

	public static String convertHotel (Hotel hotel) {
		return hotel.getIdHotel() + "," +
		hotel.getNombreEstablecimiento() + "," +
                hotel.getCalle() + "," +
                hotel.getNumeroInterior() + "," +
                hotel.getNumeroExterior() + "," +
                hotel.getColonia() + "," +
                hotel.getEstado() + "," +
                hotel.getTelefono() + "," +
                hotel.getNumHabitaciones() + "," +
                hotel.getNumHabitacionesDisponibles() + "," +
                hotel.getNumHabitacionesOcupadas();
	}

	public static String convertHabitacion(Habitacion habitacion) {
		return habitacion.getNumHabitacion() + "," +
                habitacion.getNombreTipo() + "," +
                habitacion.getNumCamas() + "," +
                habitacion.getCostoPorNoche() + "," +
                habitacion.isDisponible();

	}

	public static String convertHuesped(Huesped huesped) {
		return huesped.getIdHuesped() + "," +
                huesped.getNombre() + "," +
                huesped.getApellidoPaterno() + "," +
                huesped.getApellidoMaterno() + "," +
                huesped.getNacionalidad() + "," +
                huesped.getFechaNacimiento() + "," +
                huesped.getGenero() + "," +
                huesped.getNumeroMembresia() + "," +
                huesped.getCorreos() + "," +
                huesped.getTelefonos();
	}

    public static void guardarCSV(String nombreArchivo, String dato) {
	File file = new File(nombreArchivo);
	try {
		file.getParentFile().mkdirs(); // Crear el directorio si no existe
		if (!file.exists()) {
			file.createNewFile(); // Crear el archivo si no existe
		}
	} catch (IOException e) {
		e.printStackTrace();
	}

        try (FileWriter writer = new FileWriter(nombreArchivo, true)) {
		writer.append(dato).append("\n");
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
 * List<Hotel> hoteles = new ArrayList<>();
 * List<String[]> datos = new ArrayList<>();
 * // Cargar datos desde CSV (ejemplo)
 * // CsvFileManager.loadHoteles(hoteles);
 * // CsvFileManager.loadHuespedes(huespedes);
 * // CsvFileManager.loadCuartos(cuartos);
 * 
 * datos = CsvFileManager.leerCSV("Practicas/Practica2/SRC/Archivo.csv");
 * 
 * Imprimir los datos leídos
 * for (String[] fila : datos) {
 * for (String valor : fila) {
 * System.out.print("+" + valor + "\t");
 * }
 * System.out.println();
 * }
 * }
 * }
 */
