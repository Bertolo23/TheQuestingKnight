package clases.estadísticas;

import java.io.IOException;

import clases.interfaz.Titulos;
import clases.personajes.Asesino;
import clases.personajes.CreacionPersonajes;
import clases.personajes.Enemigo;
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
        int margen = 55;
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
        System.out.println(" ".repeat(margen) +"SALUD  " + Utilidades.ANSI_CYAN + (double) Math.round(personaje.getSalud() * 100.0) / 100 + Utilidades.ANSI_RESET 
                + "       DINERO  " + Utilidades.ANSI_YELLOW + personaje.getDinero() + Utilidades.ANSI_RESET);
    }

    /**
     * Método que muestra la introducción del personaje Luchador, presentando sus estadísticas principales.
     * Muestra información en pantalla sobre la vitalidad, fuerza, agilidad, percepción mágica y coraje.
     * Coje mediante super() la introducción de personaje de la clase Persona que se completa en este método 
     */
    public static void introduccionPersonaje(Personaje personaje) {
        String tituloPersonaje = "";
        if(personaje instanceof Luchador){
            tituloPersonaje = Titulos.tituloLuchador();
        }
        if (personaje instanceof Asesino) {
            tituloPersonaje = Titulos.tituloAsesino();
        }
        if (personaje instanceof Tanque) {
            tituloPersonaje = Titulos.tituloTanque();
        }
        if (personaje instanceof Mago) {
            tituloPersonaje = Titulos.tituloMago();       
        }
        int margen = 74;
        System.out.println(tituloPersonaje);
        Utilidades.espacios(1);
        System.out.println(" ".repeat(margen) +Utilidades.ANSI_CYAN+" TUS ESTADÍSTICAS INICIALES SON");
        GestionEstadisticas.mostrarEstadisticas(personaje);
        Utilidades.espacios(1);
        GestionEstadisticas.mostrarSaludYDinero(personaje);
        Utilidades.espacios(1);
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
        personaje.setDinero(CreacionPersonajes.DINERO);
        personaje.setExperiencia(CreacionPersonajes.EXPERIENCIA);
        personaje.setNivel(CreacionPersonajes.NIVEL);
        personaje.setSalud(CreacionPersonajes.SALUD);
        personaje.setInventario(CreacionPersonajes.INVENTARIO);

        if (personaje instanceof Luchador) {
            personaje.setVitalidad(CreacionPersonajes.LUCHADOR_VITALIDAD);
            personaje.setFuerza(CreacionPersonajes.LUCHADOR_FUERZA);
            personaje.setAgilidad(CreacionPersonajes.LUCHADOR_AGILIDAD);
            personaje.setPercepcionMagica(CreacionPersonajes.LUCHADOR_PERCEPCION_MAGICA);
            ((Luchador) personaje).setCoraje(CreacionPersonajes.LUCHADOR_ESTADISTICA_ESPECIAL);
        }
        if (personaje instanceof Asesino) {
            personaje.setVitalidad(CreacionPersonajes.ASESINO_VITALIDAD);
            personaje.setFuerza(CreacionPersonajes.ASESINO_FUERZA);
            personaje.setAgilidad(CreacionPersonajes.ASESINO_AGILIDAD);
            personaje.setPercepcionMagica(CreacionPersonajes.ASESINO_PERCEPCION_MAGICA);
            ((Asesino) personaje).setSigilo(CreacionPersonajes.ASESINO_ESTADISTICA_ESPECIAL);
        }
        if (personaje instanceof Tanque) {
            personaje.setVitalidad(CreacionPersonajes.TANQUE_VITALIDAD);
            personaje.setFuerza(CreacionPersonajes.TANQUE_FUERZA);
            personaje.setAgilidad(CreacionPersonajes.TANQUE_AGILIDAD);
            personaje.setPercepcionMagica(CreacionPersonajes.TANQUE_PERCEPCION_MAGICA);
            ((Tanque) personaje).setBarrera(CreacionPersonajes.TANQUE_ESTADISTICA_ESPECIAL);
        }
        if (personaje instanceof Mago) {
            personaje.setVitalidad(CreacionPersonajes.MAGO_VITALIDAD);
            personaje.setFuerza(CreacionPersonajes.MAGO_FUERZA);
            personaje.setAgilidad(CreacionPersonajes.MAGO_AGILIDAD);
            personaje.setPercepcionMagica(CreacionPersonajes.MAGO_PERCEPCION_MAGICA);
            ((Mago) personaje).setPoderDeHabilidad(CreacionPersonajes.MAGO_ESTADISTICA_ESPECIAL);
        }
    }

    public static void reseteoEstadisticasEnemigo(Enemigo enemigo) {
        enemigo.setFatiga(CreacionPersonajes.ENEMIGO_FATIGA);
        
        if (enemigo.getTipo().equals("Campesino")) {
            enemigo.setVitalidad(CreacionPersonajes.ENEMIGO1_VITALIDAD);
            enemigo.setFuerza(CreacionPersonajes.ENEMIGO1_FUERZA);
            enemigo.setAgilidad(CreacionPersonajes.ENEMIGO1_AGILIDAD);
            enemigo.setSalud(CreacionPersonajes.ENEMIGO1_SALUD);
            enemigo.setNivel(CreacionPersonajes.ENEMIGO1_NIVEL);
        }
        if (enemigo.getTipo().equals("Caballero")) {
            enemigo.setVitalidad(CreacionPersonajes.ENEMIGO2_VITALIDAD);
            enemigo.setFuerza(CreacionPersonajes.ENEMIGO2_FUERZA);
            enemigo.setAgilidad(CreacionPersonajes.ENEMIGO2_AGILIDAD);
            enemigo.setSalud(CreacionPersonajes.ENEMIGO2_SALUD);
            enemigo.setNivel(CreacionPersonajes.ENEMIGO2_NIVEL);
        }
        if (enemigo.getTipo().equals("Bandido")) {
            enemigo.setVitalidad(CreacionPersonajes.ENEMIGO3_VITALIDAD);
            enemigo.setFuerza(CreacionPersonajes.ENEMIGO3_FUERZA);
            enemigo.setAgilidad(CreacionPersonajes.ENEMIGO3_AGILIDAD);
            enemigo.setSalud(CreacionPersonajes.ENEMIGO3_SALUD);
            enemigo.setNivel(CreacionPersonajes.ENEMIGO3_NIVEL);
        }
        if (enemigo.getTipo().equals("Mercenario")) {
            enemigo.setVitalidad(CreacionPersonajes.ENEMIGO4_VITALIDAD);
            enemigo.setFuerza(CreacionPersonajes.ENEMIGO4_FUERZA);
            enemigo.setAgilidad(CreacionPersonajes.ENEMIGO4_AGILIDAD);
            enemigo.setSalud(CreacionPersonajes.ENEMIGO4_SALUD);
            enemigo.setNivel(CreacionPersonajes.ENEMIGO4_NIVEL);
        }
    }
}
