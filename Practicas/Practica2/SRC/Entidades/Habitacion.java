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
	private Integer numHabitacion = 1;

	/* Nombre del tipo de habitacion */
	private String nombreTipo;

	/* Numero de camas que tiene la habitacion */
	private Integer numCamas;

	/* Costo que tiene la habitacion por noche */
	private Integer costoPorNoche;

	/* Determina si la habitación esta disponible */
	private Integer disponible;

	/**
	 * Constructor de una Habitacion
	 * 
	 * @param numHabitacion Numero de identificacion de la habitacion
	 * @param nombreTipo    Nombre del tipo de habitacion
	 * @param numCamas      Numero de camas que tiene la habitacion
	 * @param costoPorNoche Costo que tiene la habitacion por noche
	 * @param disponible    Determina si la habitación esta disponible
	 */
	public Habitacion(String nombreTipo, Integer numCamas, Integer costoPorNoche, Integer disponible) {
		this.numHabitacion++;
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
	public Integer getNumHabitacion() {
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
	public Integer getNumCamas() {
		return numCamas;
	}

	/**
	 * Regresa el costo de la habitacion por noche
	 * 
	 * @return el costo de la habitacion por noche
	 */
	public Integer getCostoPorNoche() {
		return costoPorNoche;
	}

	/**
	 * Regresa si la habitacion esta disponible
	 * 
	 * @return si la habitacion esta disponible
	 */
	public Integer isDisponible() {
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
	public void setNumCamas(Integer numCamas) {
		this.numCamas = numCamas;
	}

	/**
	 * Modifica el costo por noche de la habitacion.
	 * 
	 * @param costoPorNoche nuevo costo por noche.
	 */
	public void setCostoPorNoche(Integer costoPorNoche) {
		this.costoPorNoche = costoPorNoche;
	}

	/**
	 * Modifica el status de la habitacion.
	 * 
	 * @param disponible nuevo estatus de la habitacion.
	 */
	public void setDisponible(Integer disponible) {
		this.disponible = disponible;
	}
}
