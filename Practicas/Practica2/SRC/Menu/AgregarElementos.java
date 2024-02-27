package Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgregarElementos implements OpcionMenu {

	public void ejecutar(Scanner sc) throws InterruptedException {
		int menuUno = 0;
		do {
			try {
				System.out.println(Color.VERDE + "\nElije una de las siguientes opciones:\n\n "
						+ Color.AMARILLO + "1) " + Color.VERDE + "Agregar hotel.\n "
						+ Color.AMARILLO + "2) " + Color.VERDE + "Agregar Habitacion.\n "
						+ Color.AMARILLO + "3) " + Color.VERDE + "Agregar Huesped.\n\n "
						+ Color.AMARILLO + "4) " + Color.VERDE + "Salir del menú.");

				System.out.print(Color.AMARILLO + "\n Opcion: ");
				menuUno = sc.nextInt();

				switch (menuUno) {
					case 1: // Hotel

						Boolean error = false;
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
								int numeroInterior = sc.nextInt();
								System.out.print(
										Color.AMARILLO + "\nIngresa la numero exterior del hotel: "
												+ Color.VERDE);
								int numeroExterior = sc.nextInt();
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

								// List<T> hotel = new ArrayList<>(); ESTO PUEDE SER <t> es decir
								// abstracto o <String>
								// Tambien no tiene por que ser lista sino podemos hacer arreglo
								// String[] nadamas que no se
								// si arreglo se pueda hacer abstracto (creo que no)

								// hotel.add(nombre)... calle,numInteior,etc.

								// OPCION 1. Cuando llenamos la lista/arreglo, lo podemos mandar como
								// atributo al metodo para agregar.

								// OPCION 2. En vez de crear una lista manejamos directamente los
								// objetos, es decir, en vez de hacer una lista,
								// mandamos el objeto como tal. de igual manera hay que enviarlo al
								// método

								// agregaDato(algo);
								/*
								 * El algo puede ser una lista abstracta
								 * lista de Strings (Hay que convertir los int a string)
								 * array de strings (hay que cambiar los int a string)
								 * O tambien puede ser el objeto directamente, este creo que es el mas
								 * optimo pero quiza el mas complicado.
								 */

								error = false;
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

						break;

					case 2:

						break;

					case 3:

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
}