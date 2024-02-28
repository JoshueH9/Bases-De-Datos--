package Menu;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import Entidades.Hotel;
import Entidades.Habitacion;

/**
 * Clase que simula el menu para eliminar informacion.
 * 
 * @author Macal Cruz Brandon Brayan - 318085470
 * @author Pintor Munoz Pedro Joshue - 420053796
 * @author Rojo Trujillo Alessandro Gael - 317218385
 * @author Hernandez Morales Jose Angel - 315137903
 * @version 1.0 febrero 2024
 * @since Clase de Bases de datos 2024-2
 */
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
					case 1:
						eliminarHotel(sc);
						break;

					case 2:
						eliminarHabitacion(sc);
						break;

					case 3:
						eliminarHuesped(sc);
						break;

					case 4: // Solo regresa al menu inicial.
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
		do {
			try {
				System.out.print(Color.AMARILLO + "\nIngresa el ID del elemento que quieres borrar: "
						+ Color.VERDE);
				int id = sc.nextInt();

				/*
				 * Aqui nadamas se manda el archivo de donde se va a eliminar y el id del
				 * elemento
				 */
				// eliminaElemento(Hotel.csv, id);

				System.out.println(
						Color.AZUL + "\nElemento eliminado con exito\n" + Color.BLANCO);
				Thread.sleep(1500);
				error = false;
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
		do {
			try {
				System.out.print(Color.AMARILLO + "\nIngresa el ID del elemento que quieres borrar: "
						+ Color.VERDE);
				int id = sc.nextInt();

				/*
				 * Aqui nadamas se manda el archivo de donde se va a eliminar y el id del
				 * elemento
				 */
				// eliminaElemento(Habitacion.csv, id);

				System.out.println(
						Color.AZUL + "\nElemento eliminado con exito\n" + Color.BLANCO);
				Thread.sleep(1500);
				error = false;
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
		Boolean error = false;
		int idHotel = 0;
		do {
			try {
				System.out.print(Color.AMARILLO + "\nIngresa el ID del elemento que quieres borrar: "
						+ Color.VERDE);
				int id = sc.nextInt();

				/*
				 * Aqui nadamas se manda el archivo de donde se va a eliminar y el id del
				 * elemento
				 */
				// eliminaElemento(Huesped.csv, id);

				System.out.println(
						Color.AZUL + "\nElemento eliminado con exito\n" + Color.BLANCO);
				Thread.sleep(1500);
				error = false;
			} catch (InputMismatchException ime) {
				System.out.println(
						Color.ROJO + "\nERROR: Ingresa un numero.\n" + Color.BLANCO);
				Thread.sleep(1500);
				error = true;
				sc.nextLine();
			}
		} while (error);
	}

}