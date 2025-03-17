package Interfaz;
import util.Utilidades;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import Partida.Partida;
import Personajes.*;

/**
 * Clase que gestiona los diferentes menús del juego.
 * @author Iván Bertolo García
 * @version 2.0
 */
public class Menus {

    /**
     * Muestra el menú de elección de personaje y recoge la opción seleccionada.
     * 
     * @return La opción elegida por el jugador en minúsculas.
     * @throws IOException Si ocurre un error al leer la entrada del usuario.
     */
    public static String menuPersonaje() throws IOException {
        int margen = 55;
        System.out.println(Utilidades.ANSI_RED + " ".repeat(margen) + "ELIJA SU PERSONAJE ESCRIBIENDO LA INICIAL (o 's' para salir)" + Utilidades.ANSI_RESET);
        System.out.println();
        System.out.println(Utilidades.ANSI_BLUE + " ".repeat(margen + 5) + "║ LUCHADOR ║║ ASESINO ║║ TANQUE ║║ MAGO ║║ SALIR ║" + Utilidades.ANSI_RESET);
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
    public static int menuTienda(Personaje personaje) throws IOException {
        int comprarObjetos = 0;
        try {
            System.out.println();
            System.out.println("1. Pechera de Placas(+ " + Utilidades.ANSI_GREEN + "4" + Utilidades.ANSI_RESET + " Vitalidad - " + Utilidades.ANSI_YELLOW + "2 " + Utilidades.ANSI_RESET + "Agilidad )");
            System.out.println("2. Mandoble de Acero de Damasco(+ " + Utilidades.ANSI_RED + "5" + Utilidades.ANSI_RESET + " Fuerza - " + Utilidades.ANSI_YELLOW + "1 " + Utilidades.ANSI_RESET + "Agilidad - " + Utilidades.ANSI_BLUE + "2" + Utilidades.ANSI_RESET + " Percepción Mágica)");
            System.out.println("3. Báculo de Piedra-Bruja(+ " + Utilidades.ANSI_BLUE + "7" + Utilidades.ANSI_RESET + " Percepción Mágica - " + Utilidades.ANSI_RED + "3" + Utilidades.ANSI_RESET + " Fuerza )");
            System.out.println("4. Manto Espectral(+ " + Utilidades.ANSI_YELLOW + "5" + Utilidades.ANSI_RESET + " Agilidad - " + Utilidades.ANSI_GREEN + "4" + Utilidades.ANSI_RESET + " Vitalidad + " + Utilidades.ANSI_BLUE + "2" + Utilidades.ANSI_RESET + " Percepción Mágica)");
            System.out.println("5. No comprar Nada");
            System.out.println("¿Qué objeto quieres comprar? (1-5)");
            System.out.println();
            personaje.mostrarSaludYDinero();

            comprarObjetos = Utilidades.leerEntero();
        } catch (NumberFormatException e) {
            System.out.println(Utilidades.ANSI_UNDERLINE + "Escriba un carácter válido" + Utilidades.ANSI_RESET);
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
    public static int menuAcciones(Personaje personaje) throws IOException {
        Titulos.tituloMenuAcciones();
        int eleccionAccion = 0;
        String [] textoMenuAcciones = {"Si entrenas, ganas experiencia y la puedes gastar en mejorar tus estadísticas. Cada vez que llegues a 5 o multiplo de 5 subiras un nivel.",
                                        "Si haces misiones, se te pagará, pero necesitarás unas buenas estadísticas y perderás salud.",
                                        "En la tienda se pueden comprar objetos con dinero que te modificarán las estadísticas."};
        int margen = 60;
            System.out.print(" ".repeat(margen) + Utilidades.ANSI_BLUE + "║ ENTRENAR ║ ║ TIENDA ║ ║ MISIONES ║ ║ ESTADÍSTICAS ║ ║ SALIR ║"+Utilidades.ANSI_RESET);
            System.out.println();
            System.out.println();
            System.out.println();
            Titulos.imprimirCuadroTexto(textoMenuAcciones);
            System.out.println();
            personaje.mostrarSaludYDinero();
            System.out.println();
            System.out.println("¿Qué deseas hacer?(1-5)");
            eleccionAccion = Utilidades.leerEntero();
        return eleccionAccion;
    }

    /**
     * Muestra el menú de misiones y recoge la opción seleccionada.
     * 
     * @return La opción elegida por el jugador.
     * @throws IOException Si ocurre un error al leer la entrada del usuario.
     */
    public static int menuMisiones(Personaje personaje) throws IOException {
        int opcionMision = 0;
        try {
            System.out.println();
            System.out.println("1. Unirte a la leva local y ayudarles a tomar un castillo.");
            System.out.println("2. Unirte a la guarnición del castillo.");
            System.out.println("3. Acompañar y proteger a un mercader durante una ruta peligrosa.");
            System.out.println("4. Traer de vuelta al hijo del Duque de tu provincia.");
            System.out.println("5. Volver al Menú.");
            System.out.println();
            personaje.mostrarSaludYDinero();
            
            opcionMision = Utilidades.leerEntero();
        } catch (NumberFormatException e) {
            System.out.println(Utilidades.ANSI_UNDERLINE + "Escriba un carácter válido" + Utilidades.ANSI_RESET);
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
        Partida partida = new Partida(null, null, null, null);
        Titulos.tituloInicio();
        Utilidades.continuar(continuarDescripcion);
        
        do{
            String opcion = "";  
            opcion = menuPersonaje(); 
             
                switch (opcion) {
                    case "l":// ------------------------------------------------------------------LUCHADOR----------------------------------------------------------------------- 
                                partida.setFechaInicio(LocalDateTime.now());
                                AccionesPersonajes.accionesLuchador(luchador);
                                partida.setEstadisticas(Personaje.sacarEstadisticasYNivel(luchador));
                                partida.setNombrePersonaje(luchador.getNombre());
                                salir = true;
                        break;
                        
                        case "a":
                                partida.setFechaInicio(LocalDateTime.now());
                                AccionesPersonajes.accionesAsesino(asesino);
                                partida.setEstadisticas(Personaje.sacarEstadisticasYNivel(asesino));
                                partida.setNombrePersonaje(asesino.getNombre());
                                salir = true;
                        break;
                        case "t":
                                partida.setFechaInicio(LocalDateTime.now());
                                AccionesPersonajes.accionesTanque(tanque);
                                partida.setEstadisticas(Personaje.sacarEstadisticasYNivel(tanque));
                                partida.setNombrePersonaje(tanque.getNombre());
                                salir = true;
                        break;
                        case "m":
                                partida.setFechaInicio(LocalDateTime.now());
                                AccionesPersonajes.accionesMago(mago);
                                partida.setEstadisticas(Personaje.sacarEstadisticasYNivel(mago));
                                partida.setNombrePersonaje(mago.getNombre());
                                salir = true;
                        break;
                        case "s":// ------------------------------------------------------------------SALIDA-----------------------------------------------------------------------
                            salir = true;
                        break;
                  
                    default:
                            System.out.println(Utilidades.ANSI_UNDERLINE+"Escriba una inicial de personaje por favor"+Utilidades.ANSI_RESET);
                            System.out.println();
                            System.out.println();
                        break;
                } 
    
        }while(salir==false);
        partida.setFechaFinal(LocalDateTime.now());
        Utilidades.espacios(3);
        Titulos.tituloResumenPartida();
        Utilidades.espacios(3);
        System.out.println(partida.toString());
    }
}
