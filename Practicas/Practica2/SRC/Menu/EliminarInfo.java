package Menu;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import Entidades.Hotel;
import Entidades.Habitacion;


public class EliminarInfo implements OpcionMenu {

	@Override
	public void ejecutar(Scanner sc) throws InterruptedException {
		int menuUno = 0;
		do {
			try {
				System.out.println(Color.VERDE + "\nElije una de las siguientes opciones:\n\n "
						+ Color.AMARILLO + "1) " + Color.VERDE + "Eliminar hotel.\n "
						+ Color.AMARILLO + "2) " + Color.VERDE + "Eliminar Habitacion.\n "
						+ Color.AMARILLO + "3) " + Color.VERDE + "Eliminar Huesped.\n\n "
						+ Color.AMARILLO + "4) " + Color.VERDE + "Salir al menú inicial.");

				System.out.print(Color.AMARILLO + "\n Opcion: ");
				menuUno = sc.nextInt();

				switch (menuUno) {
					case 1: // Hotel
						eliminarHotel(sc);
						break;

					case 2:
						eliminarHabitacion(sc);
						break;

					case 3:
						eliminarHuesped(sc);
						break;

                    case 4:
                        break;
					default: // OPCION INVALIDA
                        System.out.println(Color.ROJO + "\nEsa opción no es válida\n");
                        Thread.sleep(1500);
                        menuUno = 6;
						break;
				}

			} catch (InputMismatchException ime) {
				System.out.println(Color.ROJO + "\nERROR: Ingresa un numero.\n" + Color.BLANCO);
				Thread.sleep(1500);
				sc.nextLine();
			}
		} while (menuUno != 4);
	}

	private void eliminarHotel(Scanner sc) throws InterruptedException {
		Boolean error = false;
		int idHotel = 0;
		do {
			try {

				System.out.print(Color.AMARILLO
						+ "\n---------------- Ingresa los datos del hotel ----------------\n");
				System.out.print(Color.AMARILLO + "\nIngresa el nombre del hotel: "
						+ Color.VERDE);
				String nombre = sc.next();
				System.out.print(Color.AMARILLO + "\nIngresa la calle del hotel: "
						+ Color.VERDE);
				String calle = sc.next();
				System.out.print(
						Color.AMARILLO + "\nIngresa el numero interior del hotel: "
								+ Color.VERDE);
				String numeroInterior = sc.next();
				System.out.print(
						Color.AMARILLO + "\nIngresa la numero exterior del hotel: "
								+ Color.VERDE);
				String numeroExterior = sc.next();
				System.out.print(Color.AMARILLO + "\nIngresa la colonia del hotel: "
						+ Color.VERDE);
				String colonia = sc.next();
				System.out.print(Color.AMARILLO
						+ "\nIngresa el estado del pais donde se encuenta el hotel: "
						+ Color.VERDE);
				String estado = sc.next();
				System.out
						.print(Color.AMARILLO + "\nIngresa el telefono del hotel: "
								+ Color.VERDE);
				int telefono = sc.nextInt();
				System.out.print(Color.AMARILLO
						+ "\nIngresa el numero de habitaciones totales del hotel: "
						+ Color.VERDE);
				int numHabitaciones = sc.nextInt();

				System.out.print(Color.AMARILLO
						+ "\nIngresa el numero de habitaciones disponibles del hotel: "
						+ Color.VERDE);
				int numHabitacionesDisponibles = sc.nextInt();

				System.out.print(Color.AMARILLO
						+ "\nIngresa el numero de habitaciones ocupadas del hotel: "
						+ Color.VERDE);
				int numHabitacionesOcupadas = sc.nextInt();
				/*
				 * 
				 * public Hotel(int idHotel, String nombreEstablecimiento, String calle, String
				 * numeroInterior, String numeroExterior,String colonia, String estado,
				 * List<Integer> telefono, int numHabitaciones, int
				 * numHabitacionesDisponibles,int numHabitacionesOcupadas)
				 */
				Hotel hotel = new Hotel(idHotel++, nombre, calle, numeroInterior, numeroExterior, colonia, estado,
						telefono,
						numHabitaciones, numHabitacionesDisponibles, numHabitacionesOcupadas);

				List<Hotel> hoteles = new ArrayList<>();

				hoteles.add(hotel); // calle,numInteior,etc.

				// agregaDato(algo);
				/*
				 * El algo puede ser una lista abstracta
				 * lista de Strings (Hay que convertir los int a string)
				 * array de strings (hay que cambiar los int a string)
				 * O tambien puede ser el objeto directamente, este creo que es el mas
				 * optimo pero quiza el mas complicado.
				 */

				System.out.println(
						Color.AZUL + "\nHotel ingresado con exito\n" + Color.BLANCO);
				Thread.sleep(1500);
			} catch (InputMismatchException ime) {
				System.out.println(
						Color.ROJO + "\nERROR: Ingresa un numero.\n" + Color.BLANCO);
				Thread.sleep(1500);
				error = true;
				sc.nextLine();
			}
		} while (error);
	}

	private void eliminarHabitacion(Scanner sc) throws InterruptedException {
		Boolean error = false;
		int idHabitacion = 0;
		do {
			try {
				System.out.print(Color.AMARILLO
						+ "\n---------------- Ingresa los datos de la habitacion ----------------\n");
				System.out.print(Color.AMARILLO + "\nIngresa el nombre del tipo de habitacion: "
						+ Color.VERDE);
				String nombreTipo = sc.next();
				System.out.print(Color.AMARILLO + "\nIngresa el numero de camas de la habitacion: "
						+ Color.VERDE);
				int numCamas = sc.nextInt();
				System.out.print(Color.AMARILLO + "\nIngresa el costo por noche de la habitacion: $"
						+ Color.VERDE);
				int costoNoche = sc.nextInt();
				/*
				 * public Habitacion(int numHabitacion, String nombreTipo, int numCamas, int
				 * costoPorNoche, boolean disponible) {
				 */
				Habitacion habitacion = new Habitacion(idHabitacion, nombreTipo, numCamas, costoNoche, true);

				List<Habitacion> habitaciones = new ArrayList<>();

				habitaciones.add(habitacion); // calle,numInteior,etc.
				System.out.println(
						Color.AZUL + "\nHabitacion ingresada con exito\n" + Color.BLANCO);
				Thread.sleep(1500);
			} catch (InputMismatchException ime) {
				System.out.println(
						Color.ROJO + "\nERROR: Ingresa un numero.\n" + Color.BLANCO);
				Thread.sleep(1500);
				error = true;
				sc.nextLine();
			}
		} while (error);
	}

	private void eliminarHuesped(Scanner sc) throws InterruptedException {

	}

}