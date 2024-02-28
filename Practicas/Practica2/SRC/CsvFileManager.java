import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

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

	public static String convertHotel(Hotel hotel) {
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

	public static void cargarBaseDeDatos() {
		String rutaAbsoluta = "SRC/Doc/";
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;

		List<Hotel> hotel = new ArrayList<>();
		List<Huesped> huesped = new ArrayList<>();
		List<Habitacion> habitacion = new ArrayList<>();

		try {
			fileReader = new FileReader(rutaAbsoluta + "Hotel.csv");
			bufferedReader = new BufferedReader(fileReader);
			String linea;
			while ((linea = bufferedReader.readLine()) != null) {
				String[] arreglo = linea.split(",");
				// Verificar si el arreglo tiene al menos 10 elementos antes de intentar
				// convertir a entero
				if (arreglo.length >= 10) {
					hotel.add(new Hotel(arreglo[1], arreglo[2], arreglo[3], arreglo[4], arreglo[5],
							arreglo[6], Integer.parseInt(arreglo[7]), Integer.parseInt(arreglo[8]),
							Integer.parseInt(arreglo[9]), Integer.parseInt(arreglo[10])));
				} else {
					// Manejar el caso donde el arreglo no tiene suficientes elementos
					System.out.println("Error: Hotel con formato incorrecto en la línea: " + linea);
				}
			}
		} catch (IOException | NumberFormatException e) {
			System.out.println("Excepción leyendo archivo: " + e.getMessage());
		} finally {
			cerrarRecursos(fileReader, bufferedReader);
		}

		// Repetir el mismo proceso para "Habitacion.csv"
		try {
			fileReader = new FileReader(rutaAbsoluta + "Habitacion.csv");
			bufferedReader = new BufferedReader(fileReader);
			String linea2;
			while ((linea2 = bufferedReader.readLine()) != null) {
				String[] arreglo2 = linea2.split(",");
				// Verificar si el arreglo tiene al menos 5 elementos antes de intentar
				// convertir a entero
				if (arreglo2.length >= 5) {
					habitacion.add(
							new Habitacion(arreglo2[1], Integer.parseInt(arreglo2[2]), Integer.parseInt(arreglo2[3]),
									Integer.parseInt(arreglo2[4])));
				} else {
					// Manejar el caso donde el arreglo no tiene suficientes elementos
					System.out.println("Error: Habitacion con formato incorrecto en la línea: " + linea2);
				}
			}
		} catch (IOException | NumberFormatException e) {
			System.out.println("Excepción leyendo archivo: " + e.getMessage());
		} finally {
			cerrarRecursos(fileReader, bufferedReader);
		}

		// Repetir el mismo proceso para Huesped.csv
		try {
			fileReader = new FileReader(rutaAbsoluta + "Huesped.csv");
			bufferedReader = new BufferedReader(fileReader);
			String linea2;
			while ((linea2 = bufferedReader.readLine()) != null) {
				String[] arreglo2 = linea2.split(",");
				// Verificar si el arreglo tiene al menos 10 elementos antes de intentar
				// convertir a entero
				if (arreglo2.length >= 10) {
					huesped.add(new Huesped(arreglo2[1], arreglo2[2], arreglo2[3], arreglo2[4],
							arreglo2[5],
							arreglo2[6], Integer.parseInt(arreglo2[7]), arreglo2[8], Integer.parseInt(arreglo2[9])));
				} else {
					// Manejar el caso donde el arreglo no tiene suficientes elementos
					System.out.println("Error: Huesped con formato incorrecto en la línea: " + linea2);
				}
			}
		} catch (IOException | NumberFormatException e) {
			System.out.println("Excepción leyendo archivo: " + e.getMessage());
		} finally {
			cerrarRecursos(fileReader, bufferedReader);
		}

		Listas.setListaHotel(hotel);
		Listas.setListaHuesped(huesped);
		Listas.setListaHabitacion(habitacion);
	}

	private static void cerrarRecursos(FileReader fileReader, BufferedReader bufferedReader) {
		try {
			if (fileReader != null) {
				fileReader.close();
			}
			if (bufferedReader != null) {
				bufferedReader.close();
			}
		} catch (IOException e) {
			System.out.println("Excepción cerrando: " + e.getMessage());
		}
	}

	public static void exportaBaseDeDatos() {
		List<Hotel> hoteles = Listas.getListaHotel();
		List<Habitacion> habitaciones = Listas.getListaHabitacion();
		List<Huesped> huespedes = Listas.getListaHuesped();

		// Exportar hoteles
		exportarEntidades("SRC/Doc/Hotel.csv", hoteles, CsvFileManager::convertHotel);

		// Exportar habitaciones
		exportarEntidades("SRC/Doc/Habitacion.csv", habitaciones,
				CsvFileManager::convertHabitacion);

		// Exportar huéspedes
		exportarEntidades("SRC/Doc/Huesped.csv", huespedes, CsvFileManager::convertHuesped);
	}

	private static <T> void exportarEntidades(String nombreArchivo, List<T> entidades,
			Function<T, String> convertidor) {
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(nombreArchivo))) {
			List<String> entidadesString = new ArrayList<>();
			for (T entidad : entidades)
				entidadesString.add(convertidor.apply(entidad));

			for (String cadena : entidadesString) {
				String[] palabras = cadena.split(",");
				for (String palabra : palabras) {
					bufferedWriter.write(palabra);
					bufferedWriter.write(",");
				}
				bufferedWriter.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}