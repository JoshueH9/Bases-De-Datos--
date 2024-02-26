/**
* Representacion de un empleado del hotel
* @author Macal Cruz Brandon Brayan - 318085470
* @author Pintor Munoz Pedro Joshue - 420053796
* @author Rojo Trujillo Alessandro Gael - 317218385
* @author Hernandez Morales Jose Angel - 315137903
* @version 1.0 febrero 2024
* @since Clase de Bases de datos 2024-2
*/
public class Empleado {
	
	/** RFC */
	private int RFC, telefono1, telefono2;
	// String
	private String nombre, direccion, fechaInicioContratacion, fechaNacimiento, correo1, correo2, genero, horario;

	// Constructor
	// @param id , telefono1, telefono2, nombre, direccion, fechaInicioContratacion,
	// fechaNacimiento, correo1, correo2,genero, horario,
	public Empleado(int RFC, int telefono1, int telefono2, String nombre, String direccion,
			String fechaInicioContratacion, String fechaNacimiento, String correo1, String correo2,
			String genero, String horario) {
		this.RFC = RFC;
		this.telefono1 = telefono1;
		this.telefono2 = telefono2;
		this.nombre = nombre;
		this.direccion = direccion;
		this.fechaInicioContratacion = fechaInicioContratacion;
		this.fechaNacimiento = fechaNacimiento;
		this.correo1 = correo1;
		this.correo2 = correo2;
		this.genero = genero;
		this.horario = horario;
	}
	// Getters

	// Setters

	// Metodo para agregar informacion

	// Metodo para consultar

	// Metodo para editar

	// Metodo para eliminar informacion
}
