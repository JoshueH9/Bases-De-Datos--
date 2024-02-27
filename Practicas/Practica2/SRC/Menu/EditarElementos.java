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
						editarHotel(sc, hoteles);
						break;

					case 2: // Habitacion
						editarHabitacion(sc, habitaciones);
						break;

					case 3: // Huesped
						editarHuesped(sc, huespedes);
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

	private void editarHotel(Scanner sc, List<Hotel> hoteles) throws InterruptedException {
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
						editarHotel(sc, hoteles);
						break;

					case 2: // Calle
						editarHabitacion(sc, habitaciones);
						break;

					case 3: // Numero interior
						editarHuesped(sc, huespedes);
						break;

					case 4: // Numero exterior
						break;

					case 5: // Colonia
						break;

					case 6: // Estado
						break;

					case 7: // Telefono
						break;

					case 8: // Numero de habitaciones
						break;

					case 9: // Habitaciones disponibles
						break;

					case 10: // Habitaciones ocupadas
						break;
					default:
						break;
				}

			} catch (InputMismatchException ime) {
				System.out.println(Color.ROJO + "\nERROR: Ingresa un numero.\n" + Color.BLANCO);
				Thread.sleep(1500);
				sc.nextLine();
			}
		} while (error);
	}

	private void editarHabitacion(Scanner sc, List<Habitacion> habitaciones) throws InterruptedException {
		Boolean error = false;
		do {
			try {

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

	private void editarHuesped(Scanner sc, List<Huesped> huespedes) throws InterruptedException {
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