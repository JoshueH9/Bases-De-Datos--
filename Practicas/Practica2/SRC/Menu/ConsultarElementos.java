package Menu;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import Entidades.Hotel;
import Entidades.Habitacion;

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