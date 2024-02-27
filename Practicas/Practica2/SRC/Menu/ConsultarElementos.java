package Menu;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import Entidades.Hotel;
import Entidades.Huesped;
import Entidades.Habitacion;

/**
 * Clase que simula el menu para consultar elementos en la BD.
 * 
 * @author Macal Cruz Brandon Brayan - 318085470
 * @author Pintor Munoz Pedro Joshue - 420053796
 * @author Rojo Trujillo Alessandro Gael - 317218385
 * @author Hernandez Morales Jose Angel - 315137903
 * @version 1.0 febrero 2024
 * @since Clase de Bases de datos 2024-2
 */
public class ConsultarElementos implements OpcionMenu {
	/*
	 * Reemplazar despues por los datos reales
	 */
	int idHotel = 1;
	int idHabitacion = 1;
	int idHuesped = 1;
	Hotel hotel1 = new Hotel(idHotel++, "Hotel1", "calle1", null, null, null, null, 0, 0, 0, 0);
	Hotel hotel2 = new Hotel(idHotel++, null, null, null, null, null, null, 0, 0, 0, 0);
	Hotel hotel3 = new Hotel(idHotel++, null, null, null, null, null, null, 0, 0, 0, 0);
	Habitacion habitacion1 = new Habitacion(idHabitacion++, "Habitacion1", idHotel, idHabitacion, true);
	Habitacion habitacion2 = new Habitacion(idHabitacion++, "Habitacion2", idHotel, idHabitacion, true);
	Habitacion habitacion3 = new Habitacion(idHabitacion++, "Habitacion3", idHotel, idHabitacion, true);
	Huesped huesped1 = new Huesped(idHuesped++, "Huesped1", null, null, null, null, null, idHotel, null, idHabitacion);
	Huesped huesped2 = new Huesped(idHuesped++, "Huesped2", null, null, null, null, null, idHotel, null, idHabitacion)
	Huesped huesped3 = new Huesped(idHuesped++, "Huesped3", null, null, null, null, null, idHotel, null, idHabitacion);

	List<Hotel> hoteles = new ArrayList<Hotel>();
	List<Habitacion> habitaciones = new ArrayList<Habitacion>();
	List<Huesped> huespedes = new ArrayList<Huesped>();

	@Override
	public void ejecutar(Scanner sc) throws InterruptedException {
		int menuUno = 0;
		/*
		 * Reemplazar despues por los datos reales
		 */
		hoteles.add(hotel1);
		hoteles.add(hotel2);
		hoteles.add(hotel3);
		habitaciones.add(habitacion1);
		habitaciones.add(habitacion2);
		habitaciones.add(habitacion3);
		do {
			try {
				System.out.println(Color.VERDE + "\nElije una de las siguientes opciones:\n\n "
						+ Color.AMARILLO + "1) " + Color.VERDE + "Consultar hotel.\n "
						+ Color.AMARILLO + "2) " + Color.VERDE + "Consultar Habitacion.\n "
						+ Color.AMARILLO + "3) " + Color.VERDE + "Consultar Huesped.\n\n "
						+ Color.AMARILLO + "4) " + Color.VERDE + "Salir del menú.");

				System.out.print(Color.AMARILLO + "\n Opcion: ");
				menuUno = sc.nextInt();

				switch (menuUno) {
					case 1: // Hotel
						consultarHotel(sc, hoteles);
						break;

					case 2: // Habitacion
						consultarHabitacion(sc, habitaciones);
						break;

					case 3: // Huesped
						consultarHuesped(sc, huespedes);
						break;

					default:
						break;
				}

			} catch (InputMismatchException ime) {
				System.out.println(Color.ROJO + "\nERROR: Ingresa un numero.\n" + Color.BLANCO);
				Thread.sleep(1500);
				sc.nextLine();
			}
		} while (menuUno != 4);
	}

	private void consultarHotel(Scanner sc, List<Hotel> hoteles) throws InterruptedException {
		Boolean error = false;
		do {
			try {
				System.out.print(Color.AMARILLO
						+ "\n---------------- Ingresa los datos del hotel ----------------\n");
				System.out.print(Color.AMARILLO + "\nIngresa el id del hotel: "
						+ Color.VERDE);
				int idHotel = sc.nextInt();

				Optional<Hotel> hotelEncontrado = hoteles.stream()
						.filter(hotel -> hotel.getIdHotel() == idHotel)
						.findFirst();

				if (hotelEncontrado.isPresent()) {
					Hotel hotelConsultado = hotelEncontrado.get();
					System.out.println(Color.AZUL + "\"\\n" + //
							"---------------- Hotel encontrado ----------------\\n" + //
							"\"" + Color.BLANCO);
					System.out
							.println(Color.AMARILLO + "\nId del hotel: " + Color.VERDE + hotelConsultado.getIdHotel());
					System.out.println(Color.AMARILLO + "\nNombre del hotel: " + Color.VERDE
							+ hotelConsultado.getNombreEstablecimiento());

					System.out.print(Color.AMARILLO + "\nCalle del hotel: "
							+ Color.VERDE + hotelConsultado.getCalle());
					System.out.print(
							Color.AMARILLO + "\nNumero interior del hotel: "
									+ Color.VERDE + hotelConsultado.getNumeroInterior());
					System.out.print(
							Color.AMARILLO + "\nNumero exterior del hotel: "
									+ Color.VERDE + hotelConsultado.getNumeroExterior());
					System.out.print(Color.AMARILLO + "\nColonia del hotel: "
							+ Color.VERDE + hotelConsultado.getColonia());
					System.out.print(Color.AMARILLO
							+ "\nEstado del pais el hotel: "
							+ Color.VERDE + hotelConsultado.getEstado());
					System.out
							.print(Color.AMARILLO + "\nTelefono del hotel: "
									+ Color.VERDE + hotelConsultado.getTelefono());
					System.out.print(Color.AMARILLO
							+ "\nNumero de habitaciones totales del hotel: "
							+ Color.VERDE + hotelConsultado.getNumHabitaciones());

					System.out.print(Color.AMARILLO
							+ "\nNumero de habitaciones disponibles del hotel: "
							+ Color.VERDE + hotelConsultado.getNumHabitacionesDisponibles());

					System.out.print(Color.AMARILLO
							+ "\nNumero de habitaciones ocupadas del hotel: "
							+ Color.VERDE + hotelConsultado.getNumHabitacionesOcupadas());
					Thread.sleep(1500);
				} else {
					throw new IllegalStateException();
				}
			} catch (InputMismatchException ime) {
				System.out.println(Color.ROJO + "\nERROR: No se encontró ningún hotel con el ID proporcionado.\n"
						+ Color.BLANCO);
				Thread.sleep(1500);
				error = true;
				sc.nextLine();
			}
		} while (error);
	}

	private void consultarHabitacion(Scanner sc, List<Habitacion> habitaciones) throws InterruptedException {
		Boolean error = false;
		do {
			try {
				System.out.print(Color.AMARILLO
						+ "\n---------------- Ingresa los datos de la habitacion ----------------\n");
				System.out.print(Color.AMARILLO + "\nIngresa el numero de la habitacion: "
						+ Color.VERDE);
				int idHabitacion = sc.nextInt();

				Optional<Habitacion> habitacionEncontrada = habitaciones.stream()
						.filter(habitacion -> habitacion.getNumHabitacion() == idHabitacion)
						.findFirst();

				if (habitacionEncontrada.isPresent()) {
					Habitacion habitacionConsultada = habitacionEncontrada.get();
					System.out.println(Color.AZUL + "\"\\n" + //
							"---------------- Habitacion encontrada ----------------\\n" + //
							"\"" + Color.BLANCO);
					System.out
							.println(Color.AMARILLO + "\nNumero de habitacion: " + Color.VERDE
									+ habitacionConsultada.getNumHabitacion());
					System.out.println(Color.AMARILLO + "\nNombre del tipo de habitacion: " + Color.VERDE
							+ habitacionConsultada.getNombreTipo());

					System.out.print(Color.AMARILLO + "\nNumero de camas de la habitacion: "
							+ Color.VERDE + habitacionConsultada.getNumCamas());
					System.out.print(
							Color.AMARILLO + "\nCosto por noche de la habitacion: "
									+ Color.VERDE + habitacionConsultada.getCostoPorNoche());
					System.out.println(Color.AMARILLO + "\nDisponibilidad de la habitacion: "
							+ (habitacionConsultada.isDisponible() ? "DISPONIBLE" : "NO DISPONIBLE"));
					Thread.sleep(1500);
				} else {
					throw new IllegalStateException();
				}
			} catch (InputMismatchException ime) {
				System.out.println(
						Color.ROJO + "\nERROR: No se encontró ninguna habitacion con el numero proporcionado.\n"
								+ Color.BLANCO);
				Thread.sleep(1500);
				error = true;
				sc.nextLine();
			}
		} while (error);
	}

	private void consultarHuesped(Scanner sc, List<Huesped> huespedes) throws InterruptedException {
		Boolean error = false;
		do {
			try {
				System.out.print(Color.AMARILLO
						+ "\n---------------- Ingresa los datos del cliente ----------------\n");
				System.out.print(Color.AMARILLO + "\nIngresa el identificador del cliente: "
						+ Color.VERDE);
				int idHuesped = sc.nextInt();

				Optional<Huesped> huespedEncontrado = huespedes.stream()
						.filter(huesped -> huesped.getIdHuesped() == idHuesped)
						.findFirst();

				if (huespedEncontrado.isPresent()) {
					Huesped huespedConsultado = huespedEncontrado.get();
					System.out.println(Color.AZUL + "\"\\n" + //
							"---------------- Huesped encontrado ----------------\\n" + //
							"\"" + Color.BLANCO);
					System.out
							.println(Color.AMARILLO + "\nNumero de huesped: " + Color.VERDE
									+ huespedConsultado.getIdHuesped());
					System.out.println(Color.AMARILLO + "\nNombre completo del huesped: " + Color.VERDE
							+ huespedConsultado.getNombre() + huespedConsultado.getApellidoPaterno()
							+ huespedConsultado.getApellidoMaterno());
					System.out.print(Color.AMARILLO + "\nNacionalidad del huesped: "
							+ Color.VERDE + huespedConsultado.getNacionalidad());
					System.out.print(
							Color.AMARILLO + "\nFecha de nacimiento del huesped: "
									+ Color.VERDE + huespedConsultado.getFechaNacimiento());
					System.out.println(
							Color.AMARILLO + "\nGenero del huesped: " + Color.VERDE + huespedConsultado.getGenero());
					System.out.print(
							Color.AMARILLO + "\nNumero de membresia del huesped: "
									+ Color.VERDE + huespedConsultado.getNumeroMembresia());
					System.out.print(
							Color.AMARILLO + "\nCorreo del huesped: "
									+ Color.VERDE + huespedConsultado.getCorreos());
					System.out.print(
							Color.AMARILLO + "\nTelefono del huesped: "
									+ Color.VERDE + huespedConsultado.getTelefonos());
					Thread.sleep(1500);
				} else {
					throw new IllegalStateException();
				}
			} catch (InputMismatchException ime) {
				System.out.println(
						Color.ROJO + "\nERROR: No se encontró ninguna huesped con el identificador proporcionado.\n"
								+ Color.BLANCO);
				Thread.sleep(1500);
				error = true;
				sc.nextLine();
			}
		} while (error);
	}

}