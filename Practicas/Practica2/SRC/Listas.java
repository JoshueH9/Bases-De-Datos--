import java.util.List;

import Entidades.Habitacion;
import Entidades.Hotel;
import Entidades.Huesped;

public class Listas {
	public static List<Hotel> hotelGlobal;
	public static List<Huesped> huespedGlobal;
	public static List<Habitacion> habitacionGlobal;

	public Listas() {

	}

	public List<Hotel> getListaHotel(List<Hotel> hotelGlobal) {
		return hotelGlobal;
	}

	public List<Huesped> getListaHuesped(List<Huesped> huespedGlobal) {
		return huespedGlobal;
	}

	public List<Habitacion> getListaHabitacion(List<Habitacion> habitacionGlobal) {
		return habitacionGlobal;
	}

	public void setListaHotel(List<Hotel> hotelGlobal) {
		this.hotelGlobal = hotelGlobal;
	}

	public void setListaHuesped(List<Huesped> huespedGlobal) {
		this.huespedGlobal = huespedGlobal;
	}

	public void setListaHabitacion(List<Habitacion> habitacionGlobal) {

		this.habitacionGlobal = habitacionGlobal;
	}
}
