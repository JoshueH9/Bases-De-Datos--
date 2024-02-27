package Entidades;

import java.util.List;

/**
* Representacion de un huesped de hotel
* @author Macal Cruz Brandon Brayan - 318085470
* @author Pintor Munoz Pedro Joshue - 420053796
* @author Rojo Trujillo Alessandro Gael - 317218385
* @author Hernandez Morales Jose Angel - 315137903
* @version 1.0 febrero 2024
* @since Clase de Bases de datos 2024-2
*/
public class Huesped {
	
	/* Numero identificador del cliente (Identificador) */
	private int idHuesped;
	
	/* Nombre del huesped */
	private String nombre;

	/* Apellido paterno del huesped */
	private String apellidoPaterno;
	
	/* Apellido materno del huesped */
	private String apellidoMaterno;

	/* Nacionalidad del huesped */
	private String nacionalidad;

	/* Fecha de nacimiento del huesped */
	private String fechaNacimiento;

	/* Genero del huesped */
	private String genero;

	/* Numero de membresia del huesped */
	private int numeroMembresia;

	/* Correos electronicos del huesped */
	private List<String> correo;

	/* Numeros de telefono del huesped */
	private List<Integer> telefono;

	/** 
	 * Constructor de un Huesped 
	 * @param idHuesped Identificador del cliente
	 * @param nombre Nombre del huesped
	 * @param apellidoPaterno Apellido paterno del huesped
	 * @param apellidoMaterno Apellido materno del huesped
	 * @param nacionalidad Nacionalidad del huesped
	 * @param fechaNacimiento Fecha de nacimiento del huesped
	 * @param genero Genero del huesped
	 * @param numeroMembresia Membresia del huesped (0 en caso de no tener)
	 * @param correo Correos electronicos del huesped
	 * @param telefono Lista de telefonos del huesped
	*/
	public Huesped(int idHuesped, String nombre, String apellidoPaterno, String apellidoMaterno, String nacionalidad,
			String fechaNacimiento, String genero, int numeroMembresia, List<String> correo,
			List<Integer> telefono) {
		this.idHuesped = idHuesped;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.nacionalidad = nacionalidad;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.numeroMembresia = numeroMembresia;
		this.correo = correo;
		this.telefono = telefono;
	}

	/* ---------------------------- GETTERS ------------------------------ */

	/**
	 * Regresa el identificador del huesped.
	 * @return el identificador del huesped.
	 */
	public int getIdHuesped() {
		return idHuesped;
	}

	/**
	 * Regresa el nombre del huesped.
	 * @return el nombre del huesped.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Regresa el apellido paterno del huesped.
	 * @return el apellido paterno del huesped.
	 */
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	/**
	 * Regresa el apellido materno del huesped.
	 * @return el apellido materno del huesped.
	 */
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	/**
	 * Regresa la nacionalidad del huesped.
	 * @return la nacionalidad del huesped.
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}

	/**
	 * Regresa la fecha de nacimiento del huesped.
	 * @return la fecha de nacimiento del huesped.
	 */
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * Regresa el genero del huesped.
	 * @return el genero del huesped.
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * Regresa el número de membresia del huesped.
	 * @return el número de membresia del huesped.
	 */
	public int getNumeroMembresia() {
		return numeroMembresia;
	}

	/**
	 * Regresa la lista de correos del huesped.
	 * @return la lista de correos del huesped.
	 */
	public List<String> getCorreos() {
		return correo;
	}

	/**
	 * Regresa la lista de telefonos del huesped.
	 * @return la lista de telefonos del huesped.
	 */
	public List<Integer> getTelefonos() {
		return telefono;
	}

	/* ---------------------------- SETTERS ------------------------------ */

	/**
	 * Modifica el nombre del huesped
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Modifica el apellido paterno del huesped
	 * @param apellidoPaterno
	 */
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	/**
	 * Modifica el apellido materno del huesped
	 * @param apellidoMaterno
	 */
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * Modifica la nacionalidad del huesped
	 * @param nacionalidad
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	/**
	 * Modifica el genero del huesped
	 * @param genero
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * Modifica el numero de membresia del huesped
	 * @param numeroMembresia
	 */
	public void setNumeroMembresia(int numeroMembresia) {
		this.numeroMembresia = numeroMembresia;
	}

	/**
	 * Modifica la lista de correos del huesped
	 * @param correo
	 */
	public void setCorreos(List<String> correo) {
		this.correo = correo;
	}

	/**
	 * Modifica la lista de telefonos del huesped
	 * @param telefono
	 */
	public void setTelefonos(List<Integer> telefono) {
		this.telefono = telefono;
	}
}
