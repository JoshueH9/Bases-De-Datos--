package Menu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

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
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;

		List<Hotel> hotel = new ArrayList<>();
		List<Huesped> huesped = new ArrayList<>();
		List<Habitacion> habitacion = new ArrayList<>();

		try {
			fileReader = new FileReader("SRC/Doc/Hotel.csv");
			bufferedReader = new BufferedReader(fileReader);
			String linea;
			while ((linea = bufferedReader.readLine()) != null) {
				String[] arreglo = linea.split(",");
				hotel.add(new Hotel(arreglo[0], arreglo[1], arreglo[2], arreglo[3], arreglo[4], arreglo[5],
						Integer.valueOf(arreglo[6]), Integer.valueOf(arreglo[7]), Integer.valueOf(arreglo[8]),
						Integer.valueOf(arreglo[9])));
			}
			// Integer.valueOf(arreglo[1])

		} catch (IOException e) {
			System.out.println("Excepción leyendo archivo: " + e.getMessage());
		} finally {
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

		try {
			fileReader = new FileReader("SRC/Doc/Huesped.csv");
			bufferedReader = new BufferedReader(fileReader);
			String linea2;
			while ((linea2 = bufferedReader.readLine()) != null) {
				String[] arreglo2 = linea2.split(",");
				huesped.add(new Huesped(arreglo2[0], arreglo2[1], arreglo2[2], arreglo2[3], arreglo2[4], arreglo2[5],
						Integer.valueOf(arreglo2[6]), arreglo2[7], Integer.valueOf(arreglo2[8])));
			}
			// Integer.valueOf(arreglo[1])

		} catch (IOException e) {
			System.out.println("Excepción leyendo archivo: " + e.getMessage());
		} finally {
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

		try {
			fileReader = new FileReader("SRC/Doc/Habitacion.csv");
			bufferedReader = new BufferedReader(fileReader);
			String linea3;
			while ((linea3 = bufferedReader.readLine()) != null) {
				String[] arreglo3 = linea3.split(",");
				habitacion.add(new Habitacion(arreglo3[0], Integer.valueOf(arreglo3[1]), Integer.valueOf(arreglo3[2]),
						Integer.valueOf(arreglo3[3])));
			}
			// Integer.valueOf(arreglo[1])

		} catch (IOException e) {
			System.out.println("Excepción leyendo archivo: " + e.getMessage());
		} finally {
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

		Listas.setListaHotel(hotel);
		Listas.setListaHuesped(huesped);
		Listas.setListaHabitacion(habitacion);

	}

	public static void exportaBaseDeDatos() {
		List<Hotel> hoteles = Listas.getListaHotel();
		List<Habitacion> habitaciones = Listas.getListaHabitacion();
		List<Huesped> huespedes = Listas.getListaHuesped();

		// Exportar hoteles
		exportarEntidades("SRC/Doc/Hotel.csv", hoteles, CsvFileManager::convertHotel);

		// Exportar habitaciones
		exportarEntidades("SRC/Doc/Habitacion.csv", habitaciones, CsvFileManager::convertHabitacion);

		// Exportar huéspedes
		exportarEntidades("SRC/Doc/Huesped.csv", huespedes, CsvFileManager::convertHuesped);
	}

	/*
	 * List<Hotel> hoteles = Listas.getListaHotel();
	 * List<Habitacion> habitaciones = Listas.getListaHabitacion();
	 * List<Huesped> huespedes = Listas.getListaHuesped();
	 * 
	 * try(
	 * BufferedWriter bufferedWriter = new BufferedWriter(new
	 * FileWriter("SRC/Doc/Huesped.csv")))
	 * {
	 * List<String> hotelesString = new ArrayList<>();
	 * for (Hotel hotel : hoteles)
	 * hotelesString.add(convertHotel(hotel));
	 * 
	 * for (String cadena : hotelesString) {
	 * String[] palabras = cadena.split(",");
	 * for (String palabra : palabras) {
	 * bufferedWriter.write(palabra);
	 * bufferedWriter.write(",");
	 * }
	 * bufferedWriter.newLine();
	 * }
	 * }catch(
	 * IOException e)
	 * {
	 * e.printStackTrace();
	 * }
	 * 
	 * /*
	 * Cuando se logre hacer para hoteles, hacer copia y pega para ajustar con
	 * cliente y habitacion en este mismo método
	 * 
	 */
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