import java.util.Scanner;

/**
 * Interfaz que provee el métodos referente al menu.
 * 
 * @author Macal Cruz Brandon Brayan - 318085470
 * @author Pintor Munoz Pedro Joshue - 420053796
 * @author Rojo Trujillo Alessandro Gael - 317218385
 * @author Hernandez Morales Jose Angel - 315137903
 * @version 1.0 febrero 2024
 * @since Clase de Bases de datos 2024-2
 */

public interface OpcionMenu {
	/**
	 * Ejecuta el metodo del menu segun la clase que se necesite.
	 */
	void ejecutar(Scanner sc) throws InterruptedException;
}