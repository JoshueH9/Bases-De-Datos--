package Menu;
import java.util.ArrayList;
import java.util.List;

import Entidades.Habitacion;
import Entidades.Hotel;
import Entidades.Huesped;

public class Listas {
	public static List<Hotel> hotelGlobal;
	public static List<Huesped> huespedGlobal;
	public static List<Habitacion> habitacionGlobal;

	public static List<Hotel> getListaHotel() {
		return hotelGlobal;
	}

	public static List<Huesped> getListaHuesped() {
		return huespedGlobal;
	}

	public static List<Habitacion> getListaHabitacion() {
		return habitacionGlobal;
	}

	public static void setListaHotel(List<Hotel> hotelGlobalN) {
		hotelGlobal = hotelGlobalN;
	}

	public static void setListaHuesped(List<Huesped> huespedGlobalN) {
		huespedGlobal = huespedGlobalN;
	}

	public static void setListaHabitacion(List<Habitacion> habitacionGlobalN) {

		habitacionGlobal = habitacionGlobalN;
	}
}
