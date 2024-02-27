package Menu;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import Entidades.Hotel;
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

	@Override
	public void ejecutar(Scanner sc) throws InterruptedException {
		int menuUno = 0;
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
						consultarHotel(sc);
						break;

					case 2:
						consultarHabitacion(sc);
						break;

					case 3:
						consultarHuesped(sc);
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

	private void consultarHotel(Scanner sc) throws InterruptedException {

	}

	private void consultarHabitacion(Scanner sc) throws InterruptedException {

	}

	private void consultarHuesped(Scanner sc) throws InterruptedException {

	}

}