package Interfaz;
import util.Utilidades;
import java.io.IOException;
import Personajes.*;
import util.Utilidades;

/**
 * Clase que gestiona los diferentes menús del juego.
 */
public class Menus {

    // Códigos ANSI para cambiar colores en la consola
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_UNDERLINE = "\u001B[4m";
    private static final String ANSI_CYAN = "\u001B[36m";

    /**
     * Muestra el menú de elección de personaje y recoge la opción seleccionada.
     * 
     * @return La opción elegida por el jugador en minúsculas.
     * @throws IOException Si ocurre un error al leer la entrada del usuario.
     */
    public static String menuPersonaje() throws IOException {
        int margen = 55;
        System.out.println(ANSI_RED + " ".repeat(margen) + "ELIJA SU PERSONAJE ESCRIBIENDO LA INICIAL (o 's' para salir)" + ANSI_RESET);
        System.out.println();
        System.out.println(ANSI_BLUE + " ".repeat(margen + 5) + "║ LUCHADOR ║║ ASESINO ║║ TANQUE ║║ MAGO ║║ SALIR ║" + ANSI_RESET);
        System.out.println();
        
        String entrada = Utilidades.leerString();
        return entrada.toLowerCase();
    }

    /**
     * Muestra el menú de la tienda y recoge la opción seleccionada.
     * 
     * @return La opción elegida por el jugador.
     * @throws IOException Si ocurre un error al leer la entrada del usuario.
     */
    public static int menuTienda() throws IOException {
        int comprarObjetos = 0;
        try {
            System.out.println();
            System.out.println("1. Pechera de Placas(+ " + ANSI_GREEN + "4" + ANSI_RESET + " Vitalidad - " + ANSI_YELLOW + "2 " + ANSI_RESET + "Agilidad )");
            System.out.println("2. Mandoble de Acero de Damasco(+ " + ANSI_RED + "5" + ANSI_RESET + " Fuerza - " + ANSI_YELLOW + "1 " + ANSI_RESET + "Agilidad - " + ANSI_BLUE + "2" + ANSI_RESET + " Percepción Mágica)");
            System.out.println("3. Báculo de Piedra-Bruja(+ " + ANSI_BLUE + "7" + ANSI_RESET + " Percepción Mágica - " + ANSI_RED + "3" + ANSI_RESET + " Fuerza )");
            System.out.println("4. Manto Espectral(+ " + ANSI_YELLOW + "5" + ANSI_RESET + " Agilidad - " + ANSI_GREEN + "4" + ANSI_RESET + " Vitalidad + " + ANSI_BLUE + "2" + ANSI_RESET + " Percepción Mágica)");
            System.out.println("5. No comprar Nada");
            System.out.println("¿Qué objeto quieres comprar? (1-5)");
            System.out.println();

            comprarObjetos = Utilidades.leerEntero();
        } catch (NumberFormatException e) {
            System.out.println(ANSI_UNDERLINE + "Escriba un carácter válido" + ANSI_RESET);
        }
        return comprarObjetos;
    }

    /**
     * Muestra el menú de acciones donde el jugador puede elegir qué hacer en el juego.
     * 
     * @param eleccionAccion Variable que almacena la elección del jugador.
     * @param titulos Objeto para mostrar los títulos de los menús.
     * @param personaje Objeto del personaje para mostrar su estado actual.
     * @return La opción elegida por el jugador.
     * @throws IOException Si ocurre un error al leer la entrada del usuario.
     */
    public static int menuAcciones(int eleccionAccion, Personaje personaje) throws IOException {
        Titulos.tituloMenuAcciones();
        String [] textoMenuAcciones = {"Si entrenas, ganas experiencia y la puedes gastar en mejorar tus estadísticas. Cada vez que llegues a 5 o multiplo de 5 subiras un nivel.",
                                        "Si haces misiones, se te pagará, pero necesitarás unas buenas estadísticas y perderás salud.",
                                        "En la tienda se pueden comprar objetos con dinero que te modificarán las estadísticas."};
        int margen = 60;
        try {
            System.out.print(" ".repeat(margen) + ANSI_BLUE + "║ ENTRENAR ║ ║ TIENDA ║ ║ MISIONES ║ ║ ESTADÍSTICAS ║ ║ SALIR ║"+ANSI_RESET);
            System.out.println();
            System.out.println();
            System.out.println();
            Titulos.imprimirCuadroTexto(textoMenuAcciones);
            System.out.println();
            margen = 80;
            System.out.println(" ".repeat(margen) +"SALUD  " + ANSI_CYAN + personaje.getSalud() + ANSI_RESET + "       DINERO  " + ANSI_YELLOW + personaje.getDinero() + ANSI_RESET + "");
            System.out.println();
            System.out.println("¿Qué deseas hacer?(1-5)");
            eleccionAccion = Utilidades.leerEntero();
        } catch (NumberFormatException e) {
            System.out.println(ANSI_UNDERLINE + "Escriba un carácter válido" + ANSI_RESET);
        }
        return eleccionAccion;
    }

    /**
     * Muestra el menú de misiones y recoge la opción seleccionada.
     * 
     * @return La opción elegida por el jugador.
     * @throws IOException Si ocurre un error al leer la entrada del usuario.
     */
    public static int menuMisiones() throws IOException {
        int opcionMision = 0;
        try {
            System.out.println();
            System.out.println("1. Unirte a la leva local y ayudarles a tomar un castillo.");
            System.out.println("2. Unirte a la guarnición del castillo.");
            System.out.println("3. Acompañar y proteger a un mercader durante una ruta peligrosa.");
            System.out.println("4. Traer de vuelta al hijo del Duque de tu provincia.");
            System.out.println("5. Volver al Menú.");
            System.out.println();
            
            opcionMision = Utilidades.leerEntero();
        } catch (NumberFormatException e) {
            System.out.println(ANSI_UNDERLINE + "Escriba un carácter válido" + ANSI_RESET);
        }
        return opcionMision;
    }

    /**
     * Método que establece el menu principal del programa
     * @param luchador objeto luchador necesario para las acciones de luchador
     * @throws IOException si ocurre un error al leer la entrada del usuario.
     */
    public static void menuPrincipal(Luchador luchador, Asesino asesino, Tanque tanque, Mago mago)throws IOException{
        boolean salir = false;
        String continuarDescripcion = " ";
        Titulos.tituloInicio();
        Utilidades.continuar(continuarDescripcion);
        
        do{
            String opcion = "";  
            opcion = menuPersonaje();// Solo esta disponible el Luchador 
             
                switch (opcion) {
                    case "l":// ------------------------------------------------------------------LUCHADOR----------------------------------------------------------------------- 
                                AccionesPersonajes.accionesLuchador(luchador, opcion);
                        break;
                        
                        case "a":
                                AccionesPersonajes.accionesAsesino(asesino, opcion);

                        break;
                        case "t":
                                AccionesPersonajes.accionesTanque(tanque, opcion);

                        break;
                        case "m":
                                AccionesPersonajes.accionesMago(mago, opcion);

                        break;
                        case "s":// ------------------------------------------------------------------SALIDA-----------------------------------------------------------------------
                            salir = true;
                        break;
                  
                    default:
                            System.out.println(ANSI_UNDERLINE+"Escriba una inicial de personaje por favor"+ANSI_RESET);
                            System.out.println();
                            System.out.println();
                        break;
                } 
    
        }while(salir==false);
        System.out.println("Saliendo del programa");
    }
}
