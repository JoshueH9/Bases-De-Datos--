import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
* Clase principal donde crearemos el menú para interactuar con la base de datos.
* @author Macal Cruz Brandon Brayan - 318085470
* @author Pintor Munoz Pedro Joshue - 420053796
* @author Rojo Trujillo Alessandro Gael - 317218385
* @author Hernandez Morales Jose Angel - 315137903
* @version 1.0 febrero 2024
* @since Clase de Bases de datos 2024-2
*/
public class Main {

    /* Ruta de carpetas donde se encuentran los archivos .csv */
    public static final String rutaAbsoluta = "SRC/Doc/";

    public static <T> void main(String[] args) throws InterruptedException {
        CsvFileManager file = new CsvFileManager();
        List<T> a = new ArrayList<>();

        String[] xd = {"a","b","d"};

        CsvFileManager.guardarCSV(rutaAbsoluta+"Huesped.csv", a); 
        CsvFileManager.agregarDato(rutaAbsoluta+"Huesped.csv", xd);
        
        menu();


    }


    private static void menu() throws InterruptedException{
        String negro = "\u001B[30m";
        String rojo = "\u001B[31m";
        String verde = "\u001B[32m";
        String amarillo = "\u001B[33m";
        String azul = "\u001B[34m";
        String morado = "\u001B[35m";
        String cyan = "\u001B[36m";
        String blanco = "\u001B[37m";
        
        Scanner sc = new Scanner(System.in);
        int menu = 0;	

        System.out.println(rojo+"\n   Practica 2: Sistema de Archivos vs Bases de Datos \n");
        
            do{
                System.out.println(verde+"\nHOLA BIENVENID@ AL MENU.\n");

                System.out.println(verde+"Elije una de las siguientes opciones:\n\n "
                        +amarillo+"1) "+verde+"Agregar elementos.\n "
                        +amarillo+"2) "+verde+"Consultar base de datos.\n "
                        +amarillo+"3) "+verde+"Editar base de datos.\n "
                        +amarillo+"4) "+verde+"Eliminar información.\n\n "
                        +amarillo+"5) "+verde+"Salir del menú.");

                try{
                    System.out.print(amarillo+"\n Opcion: ");
                    menu = sc.nextInt();
                    switch(menu){

                        case 1: // AGREGAR ELEMENTOS
                            int menuUno = 0;
                            do{
                                try{
                                    System.out.println(verde+"\nElije una de las siguientes opciones:\n\n "
                                        +amarillo+"1) "+verde+"Agregar hotel.\n "
                                        +amarillo+"2) "+verde+"Agregar Habitacion.\n "
                                        +amarillo+"3) "+verde+"Agregar Huesped.\n\n "
                                        +amarillo+"4) "+verde+"Salir del menú.");

                                    System.out.print(amarillo+"\n Opcion: ");
                                    menuUno = sc.nextInt();

                                    switch (menuUno) {
                                        case 1: //Hotel

                                            Boolean error = false;
                                            do {
                                                try {
                                                    System.out.print(amarillo+"\n---------------- Ingresa los datos del hotel ----------------\n");
                                                    System.out.print(amarillo+"\nIngresa el nombre del hotel: "+verde);
                                                    String nombre = sc.next();
                                                    System.out.print(amarillo+"\nIngresa la calle del hotel: "+verde);
                                                    String calle = sc.next();
                                                    System.out.print(amarillo+"\nIngresa el numero interior del hotel: "+verde);
                                                    int numeroInterior = sc.nextInt();
                                                    System.out.print(amarillo+"\nIngresa la numero exterior del hotel: "+verde);
                                                    int numeroExterior = sc.nextInt();
                                                    System.out.print(amarillo+"\nIngresa la colonia del hotel: "+verde);
                                                    String colonia = sc.next();
                                                    System.out.print(amarillo+"\nIngresa el estado del pais donde se encuenta el hotel: "+verde);
                                                    String estado = sc.next();
                                                    System.out.print(amarillo+"\nIngresa el telefono del hotel: "+verde);
                                                    int telefono = sc.nextInt();
                                                    System.out.print(amarillo+"\nIngresa el numero de habitaciones totales del hotel: "+verde);
                                                    int numHabitaciones = sc.nextInt();

                                                    //List<T> hotel = new ArrayList<>(); ESTO PUEDE SER <t> es decir abstracto o <String> 
                                                    // Tambien no tiene por que ser lista sino podemos hacer arreglo String[] nadamas que no se
                                                    // si arreglo se pueda hacer abstracto (creo que no)

                                                    // hotel.add(nombre)... calle,numInteior,etc.

                                                    // OPCION 1. Cuando llenamos la lista/arreglo, lo podemos mandar como atributo al metodo para agregar.

                                                    // OPCION 2. En vez de crear una lista manejamos directamente los objetos, es decir, en vez de hacer una lista,
                                                    // mandamos el objeto como tal. de igual manera hay que enviarlo al método

                                                    // agregaDato(algo);
                                                    /*  El algo puede ser una lista abstracta 
                                                     * lista de Strings (Hay que convertir los int a string) 
                                                     * array de strings (hay que cambiar los int a string)
                                                     * O tambien puede ser el objeto directamente, este creo que es el mas optimo pero quiza el mas complicado.
                                                    */

                                                    error = false;
                                                    System.out.println(azul+"\nHotel ingresado con exito\n"+blanco);
                                                    Thread.sleep(1500);
                                                }catch(InputMismatchException ime){
                                                    System.out.println(rojo+"\nERROR: Ingresa un numero.\n"+blanco);
                                                    Thread.sleep(1500);
                                                    error = true;
                                                    sc.nextLine();                                                
                                                }
                                            } while(error);
                                            
                                            break;
                                        
                                        case 2:
                                            
                                            break;
                                    
                                        case 3:
                                            
                                            break;
                                        
                                        default:
                                            break;
                                    }


                                }catch(InputMismatchException ime){
                                    System.out.println(rojo+"\nERROR: Ingresa un numero.\n"+blanco);
                                    Thread.sleep(1500);
                                    sc.nextLine();
                                }
                            }while (menuUno!=4);
                        break;

                        
                        case 2: // CONSULTAR BASE DE DATOS

                        break;

                        
                        case 3: // EDITAR BASE DE DATOS

                        break;

                        
                        case 4: // ELIMINAR INFORMACION

                        break;

                        case 5: // SALIDA DEL MENU
                        System.out.println(rojo+"\n ¡Adioooos!\n"+blanco);
                        break;

                        
                        default: // OPCION INVALIDA
                        System.out.println(rojo+"\nEsa opción no es válida\n");
                        Thread.sleep(1500);
                        menu=6;
                        break;
                    
                    }
                }catch(InputMismatchException ime){
                    System.out.println(rojo+"\nERROR: Ingresa un numero.\n"+blanco);
                    Thread.sleep(1500);
                    sc.nextLine();
                }
            }while (menu!=5);
    }
}

