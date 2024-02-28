import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

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
	List<Hotel> hoteles = Listas.getListaHotel();
	List<Habitacion> habitaciones = Listas.getListaHabitacion();
	List<Huesped> huespedes = Listas.getListaHuesped();

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
						eliminarHotel(sc, hoteles);
						break;

					case 2:
						eliminarHabitacion(sc, habitaciones);
						break;

					case 3:
						eliminarHuesped(sc, huespedes);
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

	private void eliminarHotel(Scanner sc, List<Hotel> hoteles) throws InterruptedException {
		Boolean error = false;
		do {
			try {
				System.out.print(Color.AMARILLO + "\nIngresa el ID del elemento que quieres borrar: "
						+ Color.VERDE);
				int idHotel = sc.nextInt();

				boolean eliminado = false;
				for (int i = 0; i < hoteles.size(); i++) {
					Hotel hotel = hoteles.get(i);
					if (hotel.getIdHotel() == idHotel) {
						hoteles.remove(i); // Eliminar el Hotel de la lista
						eliminado = true;
						Listas.setListaHotel(hoteles);
						break;
					}
				}

				if (eliminado) {
					System.out.println(Color.AZUL + "\nHotel eliminado con éxito\n" + Color.BLANCO);
				} else {
					System.out.println(
							Color.ROJO + "\nERROR: No se encontró un hotel con el ID proporcionado\n" + Color.BLANCO);
				}

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

	private void eliminarHabitacion(Scanner sc, List<Habitacion> habitaciones) throws InterruptedException {
		Boolean error = false;
		do {
			try {
				System.out.print(Color.AMARILLO + "\nIngresa el ID del elemento que quieres borrar: "
						+ Color.VERDE);
				int numHabitacion = sc.nextInt();

				boolean eliminada = false;
				for (int i = 0; i < habitaciones.size(); i++) {
					Habitacion habitacion = habitaciones.get(i);
					if (habitacion.getNumHabitacion() == numHabitacion) {
						habitaciones.remove(i); // Eliminar la Habitacion de la lista
						eliminada = true;
						Listas.setListaHabitacion(habitaciones);
						break;
					}
				}
				if (eliminada) {
					System.out.println(Color.AZUL + "\nHabitación eliminada con éxito\n" + Color.BLANCO);
				} else {
					System.out.println(Color.ROJO + "\nERROR: No se encontró una habitación con el ID proporcionado\n"
							+ Color.BLANCO);
				}

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

	private void eliminarHuesped(Scanner sc, List<Huesped> huespedes) throws InterruptedException {
		Boolean error = false;
		do {
			try {
				System.out.print(Color.AMARILLO + "\nIngresa el ID del elemento que quieres borrar: "
						+ Color.VERDE);
				int idHuesped = sc.nextInt();
				boolean eliminado = false;
				for (int i = 0; i < huespedes.size(); i++) {
					Huesped huesped = huespedes.get(i);
					if (huesped.getIdHuesped() == idHuesped) {
						huespedes.remove(i); // Eliminar el Huésped de la lista
						eliminado = true;
						Listas.setListaHuesped(huespedes);
						break;
					}
				}

				if (eliminado) {
					System.out.println(Color.AZUL + "\nHuésped eliminado con éxito\n" + Color.BLANCO);
				} else {
					System.out.println(
							Color.ROJO + "\nERROR: No se encontró un huésped con el ID proporcionado\n" + Color.BLANCO);
				}

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