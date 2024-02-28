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
 * Clase que simula el menu para editar elementos en la BD.
 * 
 * @author Macal Cruz Brandon Brayan - 318085470
 * @author Pintor Munoz Pedro Joshue - 420053796
 * @author Rojo Trujillo Alessandro Gael - 317218385
 * @author Hernandez Morales Jose Angel - 315137903
 * @version 1.0 febrero 2024
 * @since Clase de Bases de datos 2024-2
 */
public class EditarElementos implements OpcionMenu {
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
	Huesped huesped2 = new Huesped(idHuesped++, "Huesped2", null, null, null, null, null, idHotel, null, idHabitacion);
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
		huespedes.add(huesped1);
		huespedes.add(huesped2);
		huespedes.add(huesped3);
		do {
			try {
				System.out.println(Color.VERDE + "\nElije una de las siguientes opciones:\n\n "
						+ Color.AMARILLO + "1) " + Color.VERDE + "Editar hotel.\n "
						+ Color.AMARILLO + "2) " + Color.VERDE + "Editar Habitacion.\n "
						+ Color.AMARILLO + "3) " + Color.VERDE + "Editar Huesped.\n\n "
						+ Color.AMARILLO + "4) " + Color.VERDE + "Salir del menú.");

				System.out.print(Color.AMARILLO + "\n Opcion: " + Color.VERDE);
				menuUno = sc.nextInt();

				switch (menuUno) {
					case 1: // Hotel
						pedirIdHotel(sc, hoteles);
						break;

					case 2: // Habitacion
						pedirIdHabitacion(sc, habitaciones);
						break;

					case 3: // Huesped
						pedirIdHuesped(sc, huespedes);
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

	private void pedirIdHotel(Scanner sc, List<Hotel> hoteles) throws InterruptedException {
		Boolean error = false;
		do {
			try {
				System.out.print(Color.AMARILLO
						+ "\n---------------- Ingresa los datos del hotel ----------------\n");
				System.out.print(Color.AMARILLO + "\nIngresa el id del hotel a editar: "
						+ Color.VERDE);
				int idHotel = sc.nextInt();
				Optional<Hotel> hotelEncontrado = hoteles.stream()
						.filter(hotel -> hotel.getIdHotel() == idHotel)
						.findFirst();

				if (hotelEncontrado.isPresent()) {
					Hotel hotelConsultado = hotelEncontrado.get();
					editarHotel(sc, hotelConsultado);
				} else {
					throw new IllegalStateException("");
				}

			} catch (IllegalStateException e) {
				System.out.println(
						Color.ROJO + "\nERROR: No se pudo encontrar un hotel con el id proporcionado\n" + Color.BLANCO);
				Thread.sleep(1500);
				sc.nextLine();
			}
		} while (error);
	}

	private void pedirIdHabitacion(Scanner sc, List<Habitacion> habitaciones) throws InterruptedException {
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
					editarHabitacion(sc, habitacionConsultada);
					Thread.sleep(1500);
				} else {
					throw new InputMismatchException();
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

	private void pedirIdHuesped(Scanner sc, List<Huesped> huespedes) throws InterruptedException {
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

					editarHuesped(sc, huespedConsultado);
				} else {
					throw new IllegalStateException("");
				}

			} catch (IllegalStateException e) {
				System.out.println(
						Color.ROJO + "\nERROR: No se pudo encontrar un hotel con el id proporcionado\n" + Color.BLANCO);
				Thread.sleep(1500);
				sc.nextLine();
			}
		} while (error);
	}

	private void editarHotel(Scanner sc, Hotel hotel) throws InterruptedException {
		Boolean error = false;
		do {
			try {
				System.out.println(Color.VERDE + "\nElije una de las siguientes opciones para editar:\n\n "
						+ Color.AMARILLO + "1) " + Color.VERDE + "Editar nombre del hotel.\n "
						+ Color.AMARILLO + "2) " + Color.VERDE + "Editar calle del hotel.\n "
						+ Color.AMARILLO + "3) " + Color.VERDE + "Editar numero interior.\n "
						+ Color.AMARILLO + "4) " + Color.VERDE + "Editar numero exterior.\n"
						+ Color.AMARILLO + "5) " + Color.VERDE + "Editar colonia.\n"
						+ Color.AMARILLO + "6) " + Color.VERDE + "Editar estado.\n"
						+ Color.AMARILLO + "7) " + Color.VERDE + "Editar telefono.\n"
						+ Color.AMARILLO + "8) " + Color.VERDE + "Editar numero de habitaciones.\n"
						+ Color.AMARILLO + "9) " + Color.VERDE + "Editar numero de habitaciones disponibles.\n"
						+ Color.AMARILLO + "10) " + Color.VERDE + "Editar numero de habitaciones ocupadas.\n"
						+ Color.AMARILLO + "11) " + Color.VERDE + "Salir del menú.");

				System.out.print(Color.AMARILLO + "\n Opcion: " + Color.VERDE);
				int menuDos = sc.nextInt();

				switch (menuDos) {
					case 1: // Nombre
						System.out.println(Color.AZUL + "\nNombre actual del hotel: " + Color.BLANCO
								+ hotel.getNombreEstablecimiento());
						System.out.print(Color.AMARILLO + "\nIngresa el nuevo nombre del hotel: "
								+ Color.VERDE);
						String nombre = sc.next();
						hotel.setNombreEstablecimiento(nombre);
						break;

					case 2: // Calle
						System.out.println(Color.AZUL + "\nCalle actual del hotel: " + Color.BLANCO
								+ hotel.getCalle());
						System.out.print(Color.AMARILLO + "\nIngresa la nueva calle del hotel: "
								+ Color.VERDE);
						String calle = sc.next();
						hotel.setCalle(calle);

						break;

					case 3: // Numero interior
						System.out.println(Color.AZUL + "\nNumero interior actual del hotel: " + Color.BLANCO
								+ hotel.getNumeroInterior());
						System.out.print(Color.AMARILLO + "\nIngresa el nuevo numero interior del hotel: "
								+ Color.VERDE);
						String numeroInterior = sc.next();
						hotel.setNumeroInterior(numeroInterior);
						break;

					case 4: // Numero exterior
						System.out.println(Color.AZUL + "\nNumero exterior actual del hotel: " + Color.BLANCO
								+ hotel.getNombreEstablecimiento());
						System.out.print(Color.AMARILLO + "\nIngresa el nuevo numero exterior del hotel: "
								+ Color.VERDE);
						String numeroExterior = sc.next();
						hotel.setNumeroExterior(numeroExterior);

						break;

					case 5: // Colonia
						System.out.println(Color.AZUL + "\nColonia actual del hotel: " + Color.BLANCO
								+ hotel.getColonia());
						System.out.print(Color.AMARILLO + "\nIngresa la nueva colonia del hotel: "
								+ Color.VERDE);
						String colonia = sc.next();
						hotel.setColonia(colonia);
						break;

					case 6: // Estado
						System.out.println(Color.AZUL + "\nEstado actual del hotel: " + Color.BLANCO
								+ hotel.getEstado());
						System.out.print(Color.AMARILLO + "\nIngresa el nuevo estado del hotel: "
								+ Color.VERDE);
						String estado = sc.next();
						hotel.setEstado(estado);
						break;

					case 7: // Telefono
						System.out.println(Color.AZUL + "\nTelefono actual del hotel: " + Color.BLANCO
								+ hotel.getTelefono());
						System.out.print(Color.AMARILLO + "\nIngresa el nuevo telefono del hotel: "
								+ Color.VERDE);
						int telefono = sc.nextInt();
						hotel.setTelefonos(telefono);
						break;

					case 8: // Numero de habitaciones
						System.out.println(Color.AZUL + "\nNumero de habitaciones actuales del hotel: " + Color.BLANCO
								+ hotel.getNumHabitaciones());
						System.out.print(Color.AMARILLO + "\nIngresa el nuevo numero de habitaciones del hotel: "
								+ Color.VERDE);
						int numeroHabitaciones = sc.nextInt();
						hotel.setNumHabitaciones(numeroHabitaciones);
						break;

					case 9: // Habitaciones disponibles
						System.out.println(
								Color.AZUL + "\nNumero de habitaciones disponibles actuales del hotel: " + Color.BLANCO
										+ hotel.getNumHabitacionesDisponibles());
						System.out.print(
								Color.AMARILLO + "\nIngresa el nuevo numero de habitaciones disponibles del hotel: "
										+ Color.VERDE);
						int numeroHabitacionesDisponibles = sc.nextInt();
						hotel.setNumHabitacionesDisponibles(numeroHabitacionesDisponibles);
						break;

					case 10: // Habitaciones ocupadas
						System.out.println(
								Color.AZUL + "\nNumero de habitaciones ocupadas actual del hotel: " + Color.BLANCO
										+ hotel.getNumHabitacionesOcupadas());
						System.out
								.print(Color.AMARILLO + "\nIngresa el nuevo numero de habitaciones ocupadas del hotel: "
										+ Color.VERDE);
						int numeroHabitacionesOcupadas = sc.nextInt();
						hotel.setNumHabitacionesOcupadas(numeroHabitacionesOcupadas);
						break;
					default:
						throw new InputMismatchException();
				}
				System.out.println(
						Color.AZUL + "\nHotel editado con exito\n" + Color.BLANCO);
				Thread.sleep(1500);

			} catch (InputMismatchException ime) {
				System.out.println(Color.ROJO + "\nERROR: Ingresa un numero. del 1 al 11\n" + Color.BLANCO);
				error = true;
				Thread.sleep(1500);
				sc.nextLine();
			}
		} while (error);
	}

	private void editarHabitacion(Scanner sc, Habitacion habitacion) throws InterruptedException {
		Boolean error = false;
		do {
			try {
				System.out.println(Color.VERDE + "\nElije una de las siguientes opciones para editar:\n\n "
						+ Color.AMARILLO + "1) " + Color.VERDE + "Editar el nombre del tipo de la habitacion.\n "
						+ Color.AMARILLO + "2) " + Color.VERDE + "Editar numero de camas de la habitacion.\n "
						+ Color.AMARILLO + "3) " + Color.VERDE + "Editar costo por noche de la habitacion.\n"
						+ Color.AMARILLO + "4) " + Color.VERDE + "Editar disponibilidad de la habitacion.\n"
						+ Color.AMARILLO + "5) " + Color.VERDE + "Salir del menú.");

				System.out.print(Color.AMARILLO + "\n Opcion: " + Color.VERDE);
				int menuDos = sc.nextInt();

				switch (menuDos) {
					case 1: // Nombre
						System.out.println(Color.AZUL + "\nNombre actual del tipo de habitacion: " + Color.BLANCO
								+ habitacion.getNombreTipo());
						System.out.print(Color.AMARILLO + "\nIngresa el nuevo nombre del tipo de habitacion: "
								+ Color.VERDE);
						String nombre = sc.next();
						habitacion.setNombreTipo(nombre);
						break;
					case 2: // Numero de camas
						System.out.println(Color.AZUL + "\nCosto por noche actual de la habitacion: " + Color.BLANCO
								+ habitacion.getNombreTipo());
						System.out.print(Color.AMARILLO + "\nIngresa el nuevo costo por noche de la habitacion: "
								+ Color.VERDE);
						int costoNoche = sc.nextInt();
						habitacion.setCostoPorNoche(costoNoche);
						;
						break;
					case 3: // Costo por noche
						System.out.println(Color.AZUL + "\nNumero de camas actual de la habitacion: " + Color.BLANCO
								+ habitacion.getNombreTipo());
						System.out.print(Color.AMARILLO + "\nIngresa el nuevo numero de camas de la habitacion: "
								+ Color.VERDE);
						int numeroCamas = sc.nextInt();
						habitacion.setNumCamas(numeroCamas);
						break;
					default:
						throw new InputMismatchException();
				}
				System.out.println(
						Color.AZUL + "\nhabitacion editado con exito\n" + Color.BLANCO);
				Thread.sleep(1500);

			} catch (InputMismatchException ime) {
				System.out.println(Color.ROJO + "\nERROR: Ingresa un numero. del 1 al 11\n" + Color.BLANCO);
				error = true;
				Thread.sleep(1500);
				sc.nextLine();
			}
		} while (error);
	}

	private void editarHuesped(Scanner sc, Huesped huesped) throws InterruptedException {
		Boolean error = false;
		do {
			try {

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