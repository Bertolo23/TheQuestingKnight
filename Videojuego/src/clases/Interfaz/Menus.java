package clases.Interfaz;
import util.Utilidades;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;

import BBDD.CRUD;
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
        return entrada;
    }

    /**
     * Muestra el menú de la tienda y recoge la opción seleccionada.
     * 
     * @return La opción elegida por el jugador.
     * @throws IOException Si ocurre un error al leer la entrada del usuario.
     */
    public static int menuTienda(Personaje personaje) throws IOException {
        int comprarObjetos = 0;
        int margen = 67;
        System.out.println(Utilidades.ANSI_BLUE + " ".repeat(margen -2) + "║ ESPADA ║║ ARMADURA ║║ CABALLO ║║ ESCUDO ║║ VOLVER ║" + Utilidades.ANSI_RESET);
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
        ArrayList<Partida> partidas = new ArrayList<>();
        Instant inicioPartida = null;;
        Instant finPartida;
        Duration duracionPartida;
        ConstantesPersonaje.inPutSerializacionPersonajes();
        File file = new File("Videojuego/src/HistorialPartidas.txt");
        Titulos.tituloInicio();
        Utilidades.continuar();
        String opcion = ""; 
        
        do{
            opcion = menuPersonaje().toLowerCase(); 
            Partida partida = new Partida(null, null, null, null, null);
                switch (opcion) {
                    case "l":// ------------------------------------------------------------------LUCHADOR----------------------------------------------------------------------- 
                                inicioPartida = Instant.now();
                                partida.setFechaInicio(LocalDateTime.now());
                                AccionesPersonajes.accionesPersonaje(luchador);
                                partida.setEstadisticas(Personaje.sacarEstadisticasYNivel(luchador));
                                partida.setPersonaje(luchador);
                                luchador.reseteoEstadisticas(luchador);
                        break;
                        
                        case "a":// ------------------------------------------------------------------ASESONO----------------------------------------------------------------------- 
                                inicioPartida = Instant.now();
                                partida.setFechaInicio(LocalDateTime.now());
                                AccionesPersonajes.accionesPersonaje(asesino);
                                partida.setEstadisticas(Personaje.sacarEstadisticasYNivel(asesino));
                                partida.setPersonaje(asesino);
                                asesino.reseteoEstadisticas(asesino);
                        break;
                        case "t":// ------------------------------------------------------------------TANQUE----------------------------------------------------------------------- 
                                inicioPartida = Instant.now();
                                partida.setFechaInicio(LocalDateTime.now());
                                AccionesPersonajes.accionesPersonaje(tanque);
                                partida.setEstadisticas(Personaje.sacarEstadisticasYNivel(tanque));
                                partida.setPersonaje(tanque);
                                tanque.reseteoEstadisticas(tanque);
                        break;
                        case "m":// ------------------------------------------------------------------MAGO----------------------------------------------------------------------- 
                                inicioPartida = Instant.now();
                                partida.setFechaInicio(LocalDateTime.now());
                                AccionesPersonajes.accionesPersonaje(mago);
                                partida.setEstadisticas(Personaje.sacarEstadisticasYNivel(mago));
                                partida.setPersonaje(mago);
                                mago.reseteoEstadisticas(mago);
                        break;
                        case "p":// ------------------------------------------------------------------PARTIDAS-----------------------------------------------------------------------
                                Titulos.tituloHistorialPartidas();
                                Utilidades.traerInfoFichero(file);
                            
                        break;
                        case "s":// ------------------------------------------------------------------SALIDA-----------------------------------------------------------------------
                                salir = true;
                        break;
                    default:
                            System.out.println(Utilidades.ANSI_UNDERLINE+"Escriba una inicial de personaje por favor"+Utilidades.ANSI_RESET);
                            Utilidades.espacios(2);
                        break;
                }
            finPartida = Instant.now();
            partida.setDuracion(Duration.between(inicioPartida, finPartida));
            partida.setFechaFinal(LocalDateTime.now());
            partidas.add(partida);
            Utilidades.espacios(3);

        }while(salir==false);
        Partida.mostrarPartida(partidas);
        Partida.exportarAFichero(partidas, file);
        for (Partida cadaPartida : partidas) {
            if (cadaPartida.getPersonaje() != null) {
                CRUD.insertarPartidaSQL(cadaPartida);
                
            }else{
                System.out.println("Hasta Luego.");
            }
        }
    }
}
