import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import Entidades.Hotel;
import Entidades.Huesped;
import Entidades.Habitacion;

import Menu.AgregarElementos;
import Menu.ConsultarElementos;
import Menu.EditarBD;
import Menu.EliminarInfo;

import Menu.Color;
import Menu.OpcionMenu;

/**
 * Clase principal donde crearemos el menú para interactuar con la base de
 * datos.
 * 
 * @author Macal Cruz Brandon Brayan - 318085470
 * @author Pintor Munoz Pedro Joshue - 420053796
 * @author Color.ROJO Trujillo Alessandro Gael - 317218385
 * @author Hernandez Morales Jose Angel - 315137903
 * @version 1.0 febrero 2024
 * @since Clase de Bases de datos 2024-2
 */
public class Main {
    // <<<<<<< HEAD

    /* Ruta de carpetas donde se encuentran los archivos .csv */
    public static final String rutaAbsoluta = "SRC/Doc/";

    public static <T> void main(String[] args) throws InterruptedException {

        /* Aqui inician las pruebas de Alessandro */
        List<Hotel> hoteles = new ArrayList<>();

        // Realizar operaciones (ejemplo)

        /* Aqui terminan las pruebas de alessandro */

        // Descomentar lo siguiente si se quiere hacer pruebas

        // CsvFileManager file = new CsvFileManager();
        // List<T> a = new ArrayList<>();

        // String[] xd = {"a","b","d"};

        // CsvFileManager.guardarCSV(rutaAbsoluta+"Huesped.csv", a);
        // CsvFileManager.agregarDato(rutaAbsoluta+"Huesped.csv", xd);

        /*
         * AQUI SE MANDA A LLAMAR EL MENU, DESCOMENTAR SI SE QUIERE UTILIZAR O PROBAR
         * COSAS
         */

        // menu();

        // =======

        // >>>>>>> 933b2ddb80b828fbc392fb3186ca3b4d6da53cff

        Scanner sc = new Scanner(System.in);
        int menu = 0;

        OpcionMenu[] opciones = {
                new AgregarElementos(), new ConsultarElementos(), new EditarBD(), new EliminarInfo()
                // Crear instancias de otras clases según sea necesario
        };

        System.out.println(Color.ROJO + "\n   Practica 2: Sistema de Archivos vs Bases de Datos \n");

        do {
            System.out.println(Color.VERDE + "\nHOLA BIENVENID@ AL MENU.\n");

            System.out.println(Color.VERDE + "Elije una de las siguientes opciones:\n\n "
                    + Color.AMARILLO + "1) " + Color.VERDE + "Agregar elementos.\n "
                    + Color.AMARILLO + "2) " + Color.VERDE + "Consultar base de datos.\n "
                    + Color.AMARILLO + "3) " + Color.VERDE + "Editar base de datos.\n "
                    + Color.AMARILLO + "4) " + Color.VERDE + "Eliminar información.\n\n "
                    + Color.AMARILLO + "5) " + Color.VERDE + "Salir del menú.");

            try {
                System.out.print(Color.AMARILLO + "\n Opcion: ");
                menu = sc.nextInt();
                switch (menu) {

                    case 1: // AGREGAR ELEMENTOS
                        opciones[0].ejecutar(sc);
                        break;

                    case 2: // CONSULTAR BASE DE DATOS
                        opciones[1].ejecutar(sc);
                        break;

                    case 3: // EDITAR BASE DE DATOS
                        opciones[2].ejecutar(sc);
                        break;

                    case 4: // ELIMINAR INFORMACION
                        opciones[3].ejecutar(sc);
                        break;

                    case 5: // SALIDA DEL MENU
                        System.out.println(Color.ROJO + "\n ¡Adioooos!\n" + Color.BLANCO);
                        break;

                    default: // OPCION INVALIDA
                    System.out.println(Color.ROJO + "\nEsa opción no es válida\n");
                    Thread.sleep(1500);
                    menu = 6;
                        break;

                }
            } catch (InputMismatchException ime) {
                System.out.println(Color.ROJO + "\nERROR: Ingresa un numero.\n" + Color.BLANCO);
                Thread.sleep(1500);
                sc.nextLine();
            }
        } while (menu != 5);
    }

}
