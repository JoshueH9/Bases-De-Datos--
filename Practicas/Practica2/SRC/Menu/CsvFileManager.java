package Menu;
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

	public static void cargarBaseDeDatos(){
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;

		Listas l = new Listas();
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
				Integer.valueOf(arreglo[6]),Integer.valueOf(arreglo[7]), Integer.valueOf(arreglo[8]), Integer.valueOf(arreglo[9])));
			}
			//Integer.valueOf(arreglo[1])

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
				huesped.add(new Huesped(arreglo2[0], arreglo2[1], arreglo2[2], arreglo2[3], arreglo2[4], arreglo2[5], Integer.valueOf(arreglo2[6]), arreglo2[7], Integer.valueOf(arreglo2[8])));
			}
			//Integer.valueOf(arreglo[1])

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
				habitacion.add(new Habitacion(arreglo3[0], Integer.valueOf(arreglo3[1]), Integer.valueOf(arreglo3[2]), Integer.valueOf(arreglo3[3])));
			}
			//Integer.valueOf(arreglo[1])

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

		l.setListaHotel(hotel);
		l.setListaHuesped(huesped);
		l.setListaHabitacion(habitacion);

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
