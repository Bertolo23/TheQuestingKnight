package clases.Interfaz;
import util.Utilidades;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import clases.Partida.Partida;
import clases.Personajes.*;

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
        System.out.println(Utilidades.ANSI_RED + " ".repeat(margen-15) + "ELIJA SU PERSONAJE ESCRIBIENDO LA INICIAL ('p' para el Historial de Partidas o 's' para salir)" + Utilidades.ANSI_RESET);
        System.out.println();
        System.out.println(Utilidades.ANSI_BLUE + " ".repeat(margen -2) + "║ LUCHADOR ║║ ASESINO ║║ TANQUE ║║ MAGO ║║ PARTIDAS ║║ SALIR ║" + Utilidades.ANSI_RESET);
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
        return comprarObjetos;
    }

    /**
     * Muestra el menú de acciones donde el jugador puede elegir qué hacer en el juego.
     * 
     * @param personaje Objeto del personaje para mostrar su estado actual.
     * @return La opción elegida por el jugador.
     * @throws IOException Si ocurre un error al leer la entrada del usuario.
     */
    public static int menuAcciones(Personaje personaje) throws IOException {
        Titulos.tituloMenuAcciones();
        int eleccionAccion = 0;
        String [] textoMenuAcciones = {"Si entrenas, ganas experiencia y la puedes gastar en mejorar tus estadísticas. Cada vez que llegues a 5 o multiplo de 5 subiras un nivel.",
                                        "Si haces misiones, se te pagará y y perderás salud, pero habrá requisitos para realizarlas.",
                                        "En la tienda se pueden comprar objetos con dinero que te modificarán las estadísticas y daran acceso a misiones."};
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
     * Método que gestiona la eleccion del personaje y sus acciones
     * @param luchador objeto luchador necesario para las acciones de luchador
     * @param asesino objeto asesino necesario para las acciones de asesino
     * @param tanque objeto tanque necesario para las acciones de tanque
     * @param mago objeto mago necesario para las acciones de mago
     * @throws IOException
     */
    public static void menuPrincipal(Luchador luchador, Asesino asesino, Tanque tanque, Mago mago)throws IOException{
        boolean salir = false;
        String continuarDescripcion = " ";
        ArrayList<Partida> partidas = new ArrayList<>();
        Titulos.tituloInicio();
        Utilidades.continuar(continuarDescripcion);
        String opcion = ""; 
        
        do{
            opcion = menuPersonaje(); 
            Partida partida = new Partida(null, null, null, null);
                switch (opcion) {
                    case "l":// ------------------------------------------------------------------LUCHADOR----------------------------------------------------------------------- 
                                partida.setFechaInicio(LocalDateTime.now());
                                AccionesPersonajes.accionesPersonaje(luchador);
                                partida.setEstadisticas(Personaje.sacarEstadisticasYNivel(luchador));
                                partida.setNombrePersonaje(luchador.getNombre());
                        break;
                        
                        case "a":// ------------------------------------------------------------------ASESONO----------------------------------------------------------------------- 
                                partida.setFechaInicio(LocalDateTime.now());
                                AccionesPersonajes.accionesPersonaje(asesino);
                                partida.setEstadisticas(Personaje.sacarEstadisticasYNivel(asesino));
                                partida.setNombrePersonaje(asesino.getNombre());
                        break;
                        case "t":// ------------------------------------------------------------------TANQUE----------------------------------------------------------------------- 
                                partida.setFechaInicio(LocalDateTime.now());
                                AccionesPersonajes.accionesPersonaje(tanque);
                                partida.setEstadisticas(Personaje.sacarEstadisticasYNivel(tanque));
                                partida.setNombrePersonaje(tanque.getNombre());
                        break;
                        case "m":// ------------------------------------------------------------------MAGO----------------------------------------------------------------------- 
                                partida.setFechaInicio(LocalDateTime.now());
                                AccionesPersonajes.accionesPersonaje(mago);
                                partida.setEstadisticas(Personaje.sacarEstadisticasYNivel(mago));
                                partida.setNombrePersonaje(mago.getNombre());
                        break;
                        case "p":// ------------------------------------------------------------------PARTIDAS-----------------------------------------------------------------------
                                String rutaPartidas = "TheKingv2_IvanBertolo/Videojuego/src/HistorialPartidas.txt";
                                FileReader fr = new FileReader(rutaPartidas);
                            
                        break;
                        case "s":// ------------------------------------------------------------------SALIDA-----------------------------------------------------------------------
                                salir = true;
                        break;
                    default:
                            System.out.println(Utilidades.ANSI_UNDERLINE+"Escriba una inicial de personaje por favor"+Utilidades.ANSI_RESET);
                            Utilidades.espacios(2);
                        break;
                }
            partida.setFechaFinal(LocalDateTime.now());
            partidas.add(partida);
            Utilidades.espacios(3);         
        }while(salir==false);
        if (partidas.isEmpty()) {
            System.out.println("Hasta Luego.");
        }else{
            String rutaPartidas = "TheKingv2_IvanBertolo/Videojuego/src/HistorialPartidas.txt";
            Titulos.tituloResumenPartida();
            Utilidades.espacios(3);
            int i = 0;
            for (Partida cadaPartida : partidas) {
                if (cadaPartida.getNombrePersonaje() != null){
                    i++;
                    Utilidades.llevarInfoAFichero(rutaPartidas," ".repeat(15)+"GAME  "+i+"\n\n"+ cadaPartida.toString()+"\n\n"+"-".repeat(45)+"\n");  
                }
            }  
        }

    }
}
