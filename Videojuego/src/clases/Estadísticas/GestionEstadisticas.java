package clases.estadísticas;

import java.io.IOException;

import clases.interfaz.Titulos;
import clases.personajes.Asesino;
import clases.personajes.ConstantesPersonaje;
import clases.personajes.Luchador;
import clases.personajes.Mago;
import clases.personajes.Personaje;
import clases.personajes.Tanque;
import util.Utilidades;

public class GestionEstadisticas {
    
    /**
     * Muestra las estadísticas actuales del personaje.
     */
    public static void enseñarEstadisticas(Personaje personaje) throws IOException {
        Titulos.tituloEstadisticas();
        mostrarEstadisticas(personaje);
        String vueltaAMenu = Utilidades.leerString("Pulsa intro para volver al menú de acciones");
        Utilidades.espacios(2);
    }

    /**
     * Obtiene el valor de la estadística única de un personaje en función de su clase específica.
     * Cada clase de personaje tiene una estadística única que la distingue de las demás.
     * 
     * @param personaje Objeto de tipo Personaje cuya estadística única se desea obtener.
     * @return El valor de la estadística única correspondiente a la clase del personaje.
     */
    public static int valorEstadisticaUnica(Personaje personaje){
        int valorEstadisticaUnica = 0;
        if(personaje instanceof Luchador){
            valorEstadisticaUnica = ((Luchador) personaje).getCoraje();
        }
        if (personaje instanceof Asesino) {
            valorEstadisticaUnica = ((Asesino) personaje).getSigilo();
        }
        if (personaje instanceof Tanque) {
            valorEstadisticaUnica = ((Tanque) personaje).getBarrera();
        }
        if (personaje instanceof Mago) {
            valorEstadisticaUnica = ((Mago) personaje).getPoderDeHabilidad();
        }
        return valorEstadisticaUnica;
    }

    /**
     * Obtiene el nombre de la estadística única de un personaje en función de su clase específica.
     * Cada clase de personaje tiene una estadística única que la distingue de las demás.
     * 
     * @param personaje Objeto de tipo Personaje cuya estadística única se desea conocer.
     * @return El nombre de la estadística única correspondiente a la clase del personaje.
     */
    public static String nombreEstadisticaUnica(Personaje personaje){
        String nombreEstadisticaUnica = "";
        if(personaje instanceof Luchador){
            nombreEstadisticaUnica = "Coraje";
        }
        if (personaje instanceof Asesino) {
            nombreEstadisticaUnica = "Sigilo";
        }
        if (personaje instanceof Tanque) {
            nombreEstadisticaUnica = "Barrera";
        }
        if (personaje instanceof Mago) {
            nombreEstadisticaUnica = "Poder de Habilidad";
        }
        return nombreEstadisticaUnica;
    }

    /**
     * Método que muestra todas la estadísticas completas de cada tipo de personaje, incluida la única
     * @param personaje objeto personaje para saber que estadística única va a ser
     */
    public static void mostrarEstadisticas(Personaje personaje){
        int valorEstadisticaUnica = valorEstadisticaUnica(personaje);
        String nombreEstadisticaUnica = nombreEstadisticaUnica(personaje).toUpperCase();
        int margenEntreNumeros = 7;
        int margen = 50;
        Utilidades.espacios(2);
        System.out.println(" ".repeat(margen) + Utilidades.ANSI_GREEN + "     ║ VITALIDAD ║" + Utilidades.ANSI_RED + "║ FUERZA ║" + Utilidades.ANSI_YELLOW + "║ AGILIDAD ║" + Utilidades.ANSI_BLUE + "║ PERCEPCIÓN MÁGICA ║"+Utilidades.ANSI_PURPLE + "║ "+nombreEstadisticaUnica+" ║" + Utilidades.ANSI_RESET);
        System.out.println(Utilidades.ANSI_GREEN + " ".repeat(margen + 8) + "║ " + personaje.getVitalidad() + " ║" + " ".repeat(margenEntreNumeros) + Utilidades.ANSI_RED +
                "║ " + personaje.getFuerza() + " ║" + " ".repeat(margenEntreNumeros) + Utilidades.ANSI_YELLOW +
                "║ " + personaje.getAgilidad() + " ║" + " ".repeat(margenEntreNumeros + 4) + Utilidades.ANSI_BLUE +
                "║ " + personaje.getPercepcionMagica() + " ║" + " ".repeat(margenEntreNumeros + 3) + Utilidades.ANSI_PURPLE +
                "║ " + valorEstadisticaUnica + " ║" + Utilidades.ANSI_RESET);
        Utilidades.espacios(2);
    }

    
    /**
     * Muestra la salud y el dinero actual del personaje en la partida.
     * Se formatea la salida para que se vea correctamente en la interfaz.
     */
    public static void mostrarSaludYDinero(Personaje personaje){
        int margen = 80;
        System.out.println(" ".repeat(margen) +"SALUD  " + Utilidades.ANSI_CYAN + personaje.getSalud() + Utilidades.ANSI_RESET 
                + "       DINERO  " + Utilidades.ANSI_YELLOW + personaje.getDinero() + Utilidades.ANSI_RESET);
    }

    /**
     * Método que muestra la introducción del personaje Luchador, presentando sus estadísticas principales.
     * Muestra información en pantalla sobre la vitalidad, fuerza, agilidad, percepción mágica y coraje.
     * Coje mediante super() la introducción de personaje de la clase Persona que se completa en este método 
     */
    public static void introduccionPersonaje(Personaje personaje) {
        int margen = 50;
        System.out.println(" ".repeat(margen - 2) + Utilidades.ANSI_CYAN + "                    HAS ELEGIDO " + Utilidades.ANSI_UNDERLINE + personaje.getNombre().toUpperCase() + Utilidades.ANSI_RESET + Utilidades.ANSI_CYAN + " TUS ESTADÍSTICAS SON");
        Utilidades.espacios(3);
        GestionEstadisticas.mostrarEstadisticas(personaje);
        Utilidades.espacios(2);
        GestionEstadisticas.mostrarSaludYDinero(personaje);
        Utilidades.espacios(2);
        System.out.println(Utilidades.ANSI_RED_BACKGROUND + "La salud del personaje no se podrá aumentar" + Utilidades.ANSI_RESET);
    }

    


    /**
     * Metodo que te permite mejorar la estadistica unica de cada personaje
     * @param personaje objeto necesario para poder obtener la estadistica y mejorarla
     * @param cantidadMejorar cantidad de puntos a mejorar
     */
    public static void mejoraEstadisticaUnica(Personaje personaje, int cantidadMejorar){

        if(personaje instanceof Luchador){
            ((Luchador) personaje).setCoraje(((Luchador)personaje).getCoraje()+cantidadMejorar);
        }
        if (personaje instanceof Asesino) {
            ((Asesino) personaje).setSigilo(((Asesino)personaje).getSigilo()+cantidadMejorar);
        }
        if (personaje instanceof Tanque) {
            ((Tanque) personaje).setBarrera(((Tanque)personaje).getBarrera()+cantidadMejorar);
        }
        if (personaje instanceof Mago) {
            ((Mago) personaje).setPoderDeHabilidad(((Mago)personaje).getPoderDeHabilidad()+cantidadMejorar);
        }

    }

    /**
     * Extrae las estadísticas principales y el nivel del personaje y las almacena en un array.
     * El array resultante contiene los valores en el siguiente orden:
     * vitalidad, fuerza, agilidad, percepción mágica, estadística única, nivel.
     * 
     * @param personaje Objeto de tipo Personaje del cual se extraerán las estadísticas.
     * @return Un array de enteros que contiene las estadísticas principales y el nivel del personaje.
     */
    public static int[] sacarEstadisticasYNivel(Personaje personaje){
        int[] estadisticas = new int[Utilidades.NUMERO_ESTADISTICAS];
        estadisticas[0] = personaje.getVitalidad();
        estadisticas[1] = personaje.getFuerza();
        estadisticas[2] = personaje.getAgilidad();
        estadisticas[3] = personaje.getPercepcionMagica();
        estadisticas[4] = valorEstadisticaUnica(personaje);
        estadisticas[5] = personaje.getNivel();
        return estadisticas;
    }
        /**
     * Restaura las estadísticas de un personaje a sus valores iniciales según su clase específica.
     * Se restablecen atributos generales como dinero, experiencia, nivel y salud, 
     * además de los atributos específicos según si el personaje es un Luchador, Asesino, Tanque o Mago.
     * 
     * @param personaje El personaje cuya estadística será restablecida a los valores predeterminados.
     *                  Se determina su clase específica y se asignan los valores correspondientes.
     */
    public static void reseteoEstadisticas(Personaje personaje) {
        personaje.setDinero(ConstantesPersonaje.DINERO);
        personaje.setExperiencia(ConstantesPersonaje.EXPERIENCIA);
        personaje.setNivel(ConstantesPersonaje.NIVEL);
        personaje.setSalud(ConstantesPersonaje.SALUD);
        personaje.setInventario(ConstantesPersonaje.INVENTARIO);

        if (personaje instanceof Luchador) {
            personaje.setVitalidad(ConstantesPersonaje.LUCHADOR_VITALIDAD);
            personaje.setFuerza(ConstantesPersonaje.LUCHADOR_FUERZA);
            personaje.setAgilidad(ConstantesPersonaje.LUCHADOR_AGILIDAD);
            personaje.setPercepcionMagica(ConstantesPersonaje.LUCHADOR_PERCEPCION_MAGICA);
            ((Luchador) personaje).setCoraje(ConstantesPersonaje.LUCHADOR_ESTADISTICA_ESPECIAL);
        }
        if (personaje instanceof Asesino) {
            personaje.setVitalidad(ConstantesPersonaje.ASESINO_VITALIDAD);
            personaje.setFuerza(ConstantesPersonaje.ASESINO_FUERZA);
            personaje.setAgilidad(ConstantesPersonaje.ASESINO_AGILIDAD);
            personaje.setPercepcionMagica(ConstantesPersonaje.ASESINO_PERCEPCION_MAGICA);
            ((Asesino) personaje).setSigilo(ConstantesPersonaje.ASESINO_ESTADISTICA_ESPECIAL);
        }
        if (personaje instanceof Tanque) {
            personaje.setVitalidad(ConstantesPersonaje.TANQUE_VITALIDAD);
            personaje.setFuerza(ConstantesPersonaje.TANQUE_FUERZA);
            personaje.setAgilidad(ConstantesPersonaje.TANQUE_AGILIDAD);
            personaje.setPercepcionMagica(ConstantesPersonaje.TANQUE_PERCEPCION_MAGICA);
            ((Tanque) personaje).setBarrera(ConstantesPersonaje.TANQUE_ESTADISTICA_ESPECIAL);
        }
        if (personaje instanceof Mago) {
            personaje.setVitalidad(ConstantesPersonaje.MAGO_VITALIDAD);
            personaje.setFuerza(ConstantesPersonaje.MAGO_FUERZA);
            personaje.setAgilidad(ConstantesPersonaje.MAGO_AGILIDAD);
            personaje.setPercepcionMagica(ConstantesPersonaje.MAGO_PERCEPCION_MAGICA);
            ((Mago) personaje).setPoderDeHabilidad(ConstantesPersonaje.MAGO_ESTADISTICA_ESPECIAL);
        }
    }
}
