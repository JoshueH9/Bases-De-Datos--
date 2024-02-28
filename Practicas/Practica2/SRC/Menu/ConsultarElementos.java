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

	List<Hotel> hoteles = Listas.getListaHotel();
	List<Habitacion> habitaciones = Listas.getListaHabitacion();
	List<Huesped> huespedes = Listas.getListaHuesped();

	@Override
	public void ejecutar(Scanner sc) throws InterruptedException {

		int menuUno = 0;

		do {
			try {
				System.out.println(Color.VERDE + "\nElije una de las siguientes opciones:\n\n "
						+ Color.AMARILLO + "1) " + Color.VERDE + "Consultar hotel.\n "
						+ Color.AMARILLO + "2) " + Color.VERDE + "Consultar Habitacion.\n "
						+ Color.AMARILLO + "3) " + Color.VERDE + "Consultar Huesped.\n\n "
						+ Color.AMARILLO + "4) " + Color.VERDE + "Salir al menú inicial.");

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
					System.out.println(Color.AZUL + "\n" + //
							"---------------- Hotel encontrado ----------------\n" //
							+ Color.BLANCO);
					System.out
							.println(Color.AZUL + "\nId del hotel: " + Color.BLANCO + hotelConsultado.getIdHotel());
					System.out.println(Color.AZUL + "\nNombre del hotel: " + Color.BLANCO
							+ hotelConsultado.getNombreEstablecimiento());

					System.out.print(Color.AZUL + "\nCalle del hotel: "
							+ Color.BLANCO + hotelConsultado.getCalle());
					System.out.print(
							Color.AZUL + "\nNumero interior del hotel: "
									+ Color.BLANCO + hotelConsultado.getNumeroInterior());
					System.out.print(
							Color.AZUL + "\nNumero exterior del hotel: "
									+ Color.BLANCO + hotelConsultado.getNumeroExterior());
					System.out.print(Color.AZUL + "\nColonia del hotel: "
							+ Color.BLANCO + hotelConsultado.getColonia());
					System.out.print(Color.AZUL
							+ "\nEstado del pais el hotel: "
							+ Color.BLANCO + hotelConsultado.getEstado());
					System.out
							.print(Color.AZUL + "\nTelefono del hotel: "
									+ Color.BLANCO + hotelConsultado.getTelefono());
					System.out.print(Color.AZUL
							+ "\nNumero de habitaciones totales del hotel: "
							+ Color.BLANCO + hotelConsultado.getNumHabitaciones());

					System.out.print(Color.AZUL
							+ "\nNumero de habitaciones disponibles del hotel: "
							+ Color.BLANCO + hotelConsultado.getNumHabitacionesDisponibles());

					System.out.print(Color.AZUL
							+ "\nNumero de habitaciones ocupadas del hotel: "
							+ Color.BLANCO + hotelConsultado.getNumHabitacionesOcupadas() + "\n");
					Thread.sleep(1500);
					error = false;
				} else {
					throw new IllegalStateException();
				}
			} catch (InputMismatchException ime) {
				System.out.println(Color.ROJO + "\nERROR: Ingresa un numero valido.\n"
						+ Color.BLANCO);
				Thread.sleep(1500);
				error = true;
				sc.nextLine();
			} catch (IllegalStateException ise) {
				System.out.println(Color.ROJO + "\nERROR: No se encontró ningún hotel con el ID proporcionado.\n"
						+ Color.BLANCO);
				Thread.sleep(1500);
				error = false;
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
					System.out.println(Color.AZUL + "\n" + //
							"---------------- Habitacion encontrada ----------------\n" + //
							Color.BLANCO);
					System.out
							.println(Color.AZUL + "\nNumero de habitacion: " + Color.BLANCO
									+ habitacionConsultada.getNumHabitacion());
					System.out.println(Color.AZUL + "\nNombre del tipo de habitacion: " + Color.BLANCO
							+ habitacionConsultada.getNombreTipo());

					System.out.print(Color.AZUL + "\nNumero de camas de la habitacion: "
							+ Color.BLANCO + habitacionConsultada.getNumCamas());
					System.out.print(
							Color.AZUL + "\nCosto por noche de la habitacion: "
									+ Color.BLANCO + habitacionConsultada.getCostoPorNoche());
					System.out.println(Color.AZUL + "\nDisponibilidad de la habitacion: "
							+ ((habitacionConsultada.isDisponible() > 0) ? "DISPONIBLE" : "NO DISPONIBLE") + "\n");
					Thread.sleep(1500);
					error = false;
				} else {
					throw new IllegalStateException();
				}
			} catch (InputMismatchException ime) {
				System.out.println(Color.ROJO + "\nERROR: Ingresa un numero valido.\n"
						+ Color.BLANCO);
				Thread.sleep(1500);
				error = true;
				sc.nextLine();
			} catch (IllegalStateException ise) {
				System.out.println(Color.ROJO + "\nERROR: No se encontró ningún hotel con el ID proporcionado.\n"
						+ Color.BLANCO);
				Thread.sleep(1500);
				error = false;
			}
		} while (error);
	}

	private void consultarHuesped(Scanner sc, List<Huesped> huespedes) throws InterruptedException {
		Boolean error = false;
		do {
			try {
				System.out.print(Color.AMARILLO
						+ "\n---------------- Ingresa los datos del cliente ----------------\n");
				System.out.print(Color.AMARILLO + "\nIngresa el identificador del huesped: "
						+ Color.VERDE);
				int idHuesped = sc.nextInt();

				Optional<Huesped> huespedEncontrado = huespedes.stream()
						.filter(huesped -> huesped.getIdHuesped() == idHuesped)
						.findFirst();

				if (huespedEncontrado.isPresent()) {
					Huesped huespedConsultado = huespedEncontrado.get();
					System.out.println(Color.AZUL + "\n" + //
							"---------------- Huesped encontrado ----------------\n" + //
							Color.BLANCO);
					System.out
							.println(Color.AZUL + "\nNumero de huesped: " + Color.BLANCO
									+ huespedConsultado.getIdHuesped());
					System.out.println(Color.AZUL + "\nNombre completo del huesped: " + Color.BLANCO
							+ huespedConsultado.getNombre() + " " + huespedConsultado.getApellidoPaterno() + " "
							+ huespedConsultado.getApellidoMaterno());
					System.out.print(Color.AZUL + "\nNacionalidad del huesped: "
							+ Color.BLANCO + huespedConsultado.getNacionalidad());
					System.out.print(
							Color.AZUL + "\nFecha de nacimiento del huesped: "
									+ Color.BLANCO + huespedConsultado.getFechaNacimiento());
					System.out.println(
							Color.AZUL + "\nGenero del huesped: " + Color.BLANCO + huespedConsultado.getGenero());
					System.out.print(
							Color.AZUL + "\nNumero de membresia del huesped: "
									+ Color.BLANCO + huespedConsultado.getNumeroMembresia());
					System.out.print(
							Color.AZUL + "\nCorreo del huesped: "
									+ Color.BLANCO + huespedConsultado.getCorreos());
					System.out.print(
							Color.AZUL + "\nTelefono del huesped: "
									+ Color.BLANCO + huespedConsultado.getTelefonos() + "\n");
					Thread.sleep(1500);
					error = false;
				} else {
					throw new IllegalStateException();
				}
			} catch (InputMismatchException ime) {
				System.out.println(Color.ROJO + "\nERROR: Ingresa un numero valido.\n"
						+ Color.BLANCO);
				Thread.sleep(1500);
				error = true;
				sc.nextLine();
			} catch (IllegalStateException ise) {
				System.out.println(Color.ROJO + "\nERROR: No se encontró ningún hotel con el ID proporcionado.\n"
						+ Color.BLANCO);
				Thread.sleep(1500);
				error = false;
			}
		} while (error);
	}

}