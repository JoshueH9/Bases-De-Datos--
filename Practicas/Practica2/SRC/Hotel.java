import java.util.List;

/**
* Representacion del hotel.
* @author Macal Cruz Brandon Brayan - 318085470
* @author Pintor Munoz Pedro Joshue - 420053796
* @author Rojo Trujillo Alessandro Gael - 317218385
* @author Hernandez Morales Jose Angel - 315137903
* @version 1.0 febrero 2024
* @since Clase de Bases de datos 2024-2
*/

public class Hotel {
	
	/* Numero identificador del hotel (Identificador) */
	private int idHotel;
	
	/* Nombre del hotel */
	private String nombreEstablecimiento;

	/* Calle del Hotel */
	private String calle;

	/* Numero interior del hotel */
	private String numeroInterior;
	
	/* Numero exterior del hotel */
	private String numeroExterior;

	/* Colonia en la que esta situado el hotel */
	private String colonia;

	/* Estado del pais en el que esta el hotel */
	private String estado;

	/* Numeros de telefono del hotel */
	private List<Integer> telefono;
	
	/* Numero de habitaciones totales del hotel */
	private int numHabitaciones;

	/* Numero de habitaciones disponibles del hotel */
	private int numHabitacionesDisponibles;

	/* Numero de habitaciones ocupadas del hotel */
	private int numHabitacionesOcupadas;

	/**
	 * Constructor de un Hotel 
	 * @param idHotel Numero identificador del hotel
	 * @param nombreEstablecimiento Nombre del hotel
	 * @param calle Calle del Hotel
	 * @param numeroInterior Numero interior del hotel
	 * @param numeroExterior Numero exterior del hotel
	 * @param colonia Colonia en la que esta situado el hotel
	 * @param estado Estado del pais en el que esta el hotel
	 * @param telefono Numeros de telefono del hotel
	 * @param numHabitaciones Numero de habitaciones totales del hotel
	 * @param numHabitacionesDisponibles Numero de habitaciones disponibles del hotel
	 * @param numHabitacionesOcupadas Numero de habitaciones ocupadas del hotel
	 */
	public Hotel(int idHotel, String nombreEstablecimiento, String calle, String numeroInterior, String numeroExterior,
			String colonia, String estado, List<Integer> telefono, int numHabitaciones, int numHabitacionesDisponibles,
			int numHabitacionesOcupadas) {
		this.idHotel = idHotel;
		this.nombreEstablecimiento = nombreEstablecimiento;
		this.calle = calle;
		this.numeroInterior = numeroInterior;
		this.numeroExterior = numeroExterior;
		this.colonia = colonia;
		this.estado = estado;
		this.telefono = telefono;
		this.numHabitaciones = numHabitaciones;
		this.numHabitacionesDisponibles = numHabitacionesDisponibles;
		this.numHabitacionesOcupadas = numHabitacionesOcupadas;
	}

	/* ---------------------------- GETTERS ------------------------------ */

	/**
	 * Regresa el identificador del hotel.
	 * @return el identificador del hotel.
	 */
	public int getIdHotel() {
		return idHotel;
	}

	/**
	 * Regresa el nombre del hotel.
	 * @return el nombre del hotel.
	 */
	public String getNombreEstablecimiento() {
		return nombreEstablecimiento;
	}

	/**
	 * Regresa el nombre de la calle del hotel.
	 * @return el nombre de la calle del hotel.
	 */
	public String getCalle() {
		return calle;
	}

	/**
	 * Regresa el numero interior del hotel.
	 * @return el numero interior del hotel.
	 */
	public String getNumeroInterior() {
		return numeroInterior;
	}

	/**
	 * Regresa el numero exterior del hotel.
	 * @return el numero exterior del hotel.
	 */
	public String getNumeroExterior() {
		return numeroExterior;
	}

	/**
	 * Regresa la colonia donde esta situada el hotel del hotel.
	 * @return la colonia donde esta situada el hotel del hotel.
	 */
	public String getColonia() {
		return colonia;
	}

	/**
	 * Regresa el estado del hotel.
	 * @return el estado del hotel.
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * Regresa los telefonos del hotel.
	 * @return los telefonos del hotel.
	 */
	public List<Integer> getTelefonos() {
		return telefono;
	}

	/**
	 * Regresa el numero total de habitaciones del hotel.
	 * @return el numero total de habitaciones del hotel.
	 */
	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	/**
	 * Regresa el numero de habitaciones disponibles que tiene el hotel.
	 * @return el numero de habitaciones disponibles que tiene el hotel.
	 */
	public int getNumHabitacionesDisponibles() {
		return numHabitacionesDisponibles;
	}

	/**
	 * Regresa el numero de habitaciones ocupadas que tiene el hotel.
	 * @return el numero de habitaciones ocupadas que tiene el hotel.
	 */
	public int getNumHabitacionesOcupadas() {
		return numHabitacionesOcupadas;
	}

	/* ---------------------------- SETTERS ------------------------------ */

	/**
	 * Modifica el nombre del hotel.
	 * @param nombreEstablecimiento
	 */
	public void setNombreEstablecimiento(String nombreEstablecimiento) {
		this.nombreEstablecimiento = nombreEstablecimiento;
	}

	/**
	 * Modifica la calle en donde se encuentra del hotel.
	 * @param calle
	 */
	public void setCalle(String calle) {
		this.calle = calle;
	}

	/**
	 * Modifica el numero interior del hotel.
	 * @param numeroInterior
	 */
	public void setNumeroInterior(String numeroInterior) {
		this.numeroInterior = numeroInterior;
	}

	/**
	 * Modifica el numero exterior del hotel.
	 * @param numeroExterior
	 */
	public void setNumeroExterior(String numeroExterior) {
		this.numeroExterior = numeroExterior;
	}

	/**
	 * Modifica la colonia donde se encuentra el hotel del hotel.
	 * @param colonia
	 */
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	/**
	 * Modifica el estado del hotel.
	 * @param estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * Modifica la lista de telefonos del hotel.
	 * @param telefono
	 */
	public void setTelefonos(List<Integer> telefono) {
		this.telefono = telefono;
	}

	/**
	 * Modifica el numero de habitaciones totales del hotel.
	 * @param numHabitaciones
	 */
	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	/**
	 * Modifica el numero de habitaciones disponibles del hotel.
	 * @param numHabitacionesDisponibles
	 */
	public void setNumHabitacionesDisponibles(int numHabitacionesDisponibles) {
		this.numHabitacionesDisponibles = numHabitacionesDisponibles;
	}

	/**
	 * Modifica el numero de habitaciones ocupadas del hotel.
	 * @param numHabitacionesOcupadas
	 */
	public void setNumHabitacionesOcupadas(int numHabitacionesOcupadas) {
		this.numHabitacionesOcupadas = numHabitacionesOcupadas;
	}
}
