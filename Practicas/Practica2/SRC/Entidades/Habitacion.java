package Entidades;

/**
 * Representacion del Habitaciones.
 * 
 * @author Macal Cruz Brandon Brayan - 318085470
 * @author Pintor Munoz Pedro Joshue - 420053796
 * @author Rojo Trujillo Alessandro Gael - 317218385
 * @author Hernandez Morales Jose Angel - 315137903
 * @version 1.0 febrero 2024
 * @since Clase de Bases de datos 2024-2
 */
public class Habitacion {

	/* Numero de identificacion de la habitacion (Identificador) */
	private int numHabitacion;

	/* Nombre del tipo de habitacion */
	private String nombreTipo;

	/* Numero de camas que tiene la habitacion */
	private int numCamas;

	/* Costo que tiene la habitacion por noche */
	private int costoPorNoche;

	/* Determina si la habitación esta disponible */
	private boolean disponible;

	/**
	 * Constructor de una Habitacion
	 * 
	 * @param numHabitacion Numero de identificacion de la habitacion
	 * @param nombreTipo    Nombre del tipo de habitacion
	 * @param numCamas      Numero de camas que tiene la habitacion
	 * @param costoPorNoche Costo que tiene la habitacion por noche
	 * @param disponible    Determina si la habitación esta disponible
	 */
	public Habitacion(int numHabitacion, String nombreTipo, int numCamas, int costoPorNoche, boolean disponible) {
		this.numHabitacion = numHabitacion;
		this.nombreTipo = nombreTipo;
		this.numCamas = numCamas;
		this.costoPorNoche = costoPorNoche;
		this.disponible = disponible;
	}

	/* ---------------------------- GETTERS ------------------------------ */

	/**
	 * Regresa el numero de la habitacion
	 * 
	 * @return el numero de la habitacion
	 */
	public int getNumHabitacion() {
		return numHabitacion;
	}

	/**
	 * Regresa el nombre de la habitacion
	 * 
	 * @return el nombre de la habitacion
	 */
	public String getNombreTipo() {
		return nombreTipo;
	}

	/**
	 * Regresa el numero de camas de la habitacion
	 * 
	 * @return el numero de camas de la habitacion
	 */
	public int getNumCamas() {
		return numCamas;
	}

	/**
	 * Regresa el costo de la habitacion por noche
	 * 
	 * @return el costo de la habitacion por noche
	 */
	public int getCostoPorNoche() {
		return costoPorNoche;
	}

	/**
	 * Regresa si la habitacion esta disponible
	 * 
	 * @return si la habitacion esta disponible
	 */
	public boolean isDisponible() {
		return disponible;
	}

	/* ---------------------------- SETTERS ------------------------------ */

	/**
	 * Modifica el nombre/Tipo de habitacion.
	 * 
	 * @param nombreTipo nuevo nombre de la habitacion
	 */
	public void setNombreTipo(String nombreTipo) {
		this.nombreTipo = nombreTipo;
	}

	/**
	 * Modifica el numero de camas de la habitacion.
	 * 
	 * @param numCamas nuevo numero de camas de la habitacion.
	 */
	public void setNumCamas(int numCamas) {
		this.numCamas = numCamas;
	}

	/**
	 * Modifica el costo por noche de la habitacion.
	 * 
	 * @param costoPorNoche nuevo costo por noche.
	 */
	public void setCostoPorNoche(int costoPorNoche) {
		this.costoPorNoche = costoPorNoche;
	}

	/**
	 * Modifica el status de la habitacion.
	 * 
	 * @param disponible nuevo estatus de la habitacion.
	 */
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
}
