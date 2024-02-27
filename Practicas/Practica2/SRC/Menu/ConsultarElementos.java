package Menu;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
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
	int idHotel = 0;
	int idHabitacion = 0;
	Hotel hotel1 = new Hotel(idHotel++, null, null, null, null, null, null, 0, 0, 0, 0);
	Hotel hotel2 = new Hotel(idHotel++, null, null, null, null, null, null, 0, 0, 0, 0);
	Hotel hotel3 = new Hotel(idHotel++, null, null, null, null, null, null, 0, 0, 0, 0);
	List<Hotel> hoteles = new ArrayList<Hotel>();

	@Override
	public void ejecutar(Scanner sc) throws InterruptedException {
		int menuUno = 0;
		hoteles.add(hotel1);
		hoteles.add(hotel2);
		hoteles.add(hotel3);

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
					System.out.println();
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

	private void consultarHabitacion(Scanner sc) throws InterruptedException {

	}

	private void consultarHuesped(Scanner sc) throws InterruptedException {

	}

}