package clases.partida;

import util.Utilidades;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

import ficheros.GestionFicheros;
import clases.personajes.Personaje;
import clases.tienda.ObjetoTienda;
import clases.interfaz.Titulos;

/**
 * Clase que representa una partida en el videojuego. 
 * Contiene información sobre el inicio, el personaje utilizado, sus estadísticas y la finalización de la partida.
 * @version 1.0
 * @author IBG
 */
public class Partida {

    /**
     * ATRIBUTOS DE LA CLASE PARTIDA
     */
    private LocalDateTime fechaInicio;// Fecha y hora en la que comienza la partida.
    private Personaje personaje;// Personaje con el que se juega la partida.
    private int[] estadisticas;// Estadísticas finales del personaje al terminar la partida.
    private LocalDateTime fechaFinal;// Fecha y hora en la que finaliza la partida.
    private Duration duracion;// Duración total de la partida.
    private Boolean victoria;// Indica si la partida ha sido ganada (true) o perdida (false).

    /**
     * CONSTRUCTORES
     */

    /**
     * Constructor de la clase Partida.
     * @param fechaInicio Fecha y hora en que comienza la partida.
     * @param personaje Personaje con el que se juega la partida.
     * @param estadisticas Array de enteros que almacena las estadísticas finales del personaje.
     * @param fechaFinal Fecha y hora en que finaliza la partida.
     * @param duracion Duración total de la partida.
     * @param victoria Indica si se ha ganado la partida.
     */
    public Partida(LocalDateTime fechaInicio, Personaje personaje, int[] estadisticas, LocalDateTime fechaFinal, Duration duracion, Boolean victoria) {
        this.fechaInicio = fechaInicio;
        this.personaje = personaje;
        this.estadisticas = estadisticas;
        this.fechaFinal = fechaFinal;
        this.duracion = duracion;
        this.victoria = victoria;
    }

    /**
     *  GETTERS Y SETTERS
     */

    /**
     * Obtiene las estadísticas finales del personaje.
     * @return Un array de enteros con las estadísticas finales.
     */
    public int[] getEstadisticas() {
        return estadisticas;
    }

    /**
     * Establece las estadísticas finales del personaje.
     * @param estadisticas Array de enteros con las nuevas estadísticas.
     */
    public void setEstadisticas(int[] estadisticas) {
        this.estadisticas = estadisticas;
    }

    /**
     * Obtiene la fecha y hora de inicio de la partida.
     * @return Un objeto LocalDateTime con la fecha y hora de inicio.
     */
    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Establece la fecha y hora de inicio de la partida.
     * @param fechaInicio Un objeto LocalDateTime con la nueva fecha y hora de inicio.
     */
    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * Obtiene el personaje con el que se jugó la partida.
     * @return El personaje de la partida.
     */
    public Personaje getPersonaje() {
        return personaje;
    }

    /**
     * Establece el personaje con el que se jugará la partida.
     * @param personaje El personaje de la partida.
     */
    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    /**
     * Obtiene la fecha y hora de finalización de la partida.
     * @return Un objeto LocalDateTime con la fecha y hora de finalización.
     */
    public LocalDateTime getFechaFinal() {
        return fechaFinal;
    }

    /**
     * Establece la fecha y hora de finalización de la partida.
     * @param fechaFinal Un objeto LocalDateTime con la nueva fecha y hora de finalización.
     */
    public void setFechaFinal(LocalDateTime fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    /**
     * Obtiene la duración total de la partida.
     * @return Objeto Duration con la duración.
     */
    public Duration getDuracion() {
        return duracion;
    }

    /**
     * Establece la duración total de la partida.
     * @param duracion Objeto Duration con la nueva duración.
     */
    public void setDuracion(Duration duracion) {
        this.duracion = duracion;
    }

    /**
     * Indica si la partida fue ganada.
     * @return true si fue victoria, false si fue derrota.
     */
    public Boolean getVictoria() {
        return victoria;
    }

    /**
     * Establece el resultado final de la partida.
     * @param victoria true si se ganó la partida, false en caso contrario.
     */
    public void setVictoria(Boolean victoria) {
        this.victoria = victoria;
    }

    /**
     * Formatea una fecha y hora en una cadena legible.
     * @param tiempo Objeto LocalDateTime a formatear.
     * @return Cadena con la hora y fecha en formato "HH:MM:SS el DD/MM/YYYY".
     */
    public String horaYFechaCompleta(LocalDateTime tiempo){
        int año = tiempo.getYear();
        int mes = tiempo.getMonthValue();
        int dia = tiempo.getDayOfMonth();
        int hora = tiempo.getHour();
        int minutos = tiempo.getMinute();
        int segundos = tiempo.getSecond();
        return hora + ":" + minutos + ":" + segundos + " el " + dia + "/" + mes + "/" + año;
    }

    /**
     * Devuelve la duración de la partida en formato "HH:MM:SS".
     * @param duracion Objeto Duration con la duración total.
     * @return Cadena con la duración formateada.
     */
    public String duracionPartida(Duration duracion){
        long hora = duracion.toHours();
        long minutos = duracion.toMinutes() % 60;
        long segundos = duracion.getSeconds() % 60;
        return String.format("%02d:%02d:%02d", hora, minutos, segundos);
    }

    /**
     * Exporta una lista de partidas a un fichero de texto.
     * @param partidas Lista de partidas a exportar.
     * @param file Fichero de destino.
     */
    public static void exportarAFichero(ArrayList<Partida> partidas, File file){
        int i = 0;
        GestionFicheros.llevarInfoAFichero(file," ".repeat(10)+"SESIÓN DE PARTIDAS\n\n"+"=".repeat(50)+"\n\n");
        for (Partida cadaPartida : partidas) {
            if (cadaPartida.getPersonaje() != null){
                i++;
                GestionFicheros.llevarInfoAFichero(file," ".repeat(12)+"PARTIDA  "+i+"\n\n"+ cadaPartida.toString()+"\n\n"+"-".repeat(45)+"\n");  
            }
        } 
        GestionFicheros.llevarInfoAFichero(file,"\n\n"+"=".repeat(50)+"\n\n");
    }

    /**
     * Muestra por pantalla un resumen de las partidas jugadas.
     * @param partidas Lista de partidas a mostrar.
     */
    public static void mostrarPartida(ArrayList<Partida> partidas){
        int i = 0;
        Titulos.tituloResumenPartida();
        for (Partida cadaPartida : partidas) {
            if (cadaPartida.getPersonaje() != null){
                i++;
                System.out.println(" ".repeat(15)+"PARTIDA  "+i+"\n\n"+ cadaPartida.toString()+"\n\n"+"-".repeat(45)+"\n");  
            }
        } 
    }

    /**
     * Devuelve una cadena con los nombres de los objetos en el inventario del personaje.
     * @param personaje Personaje del que se desea mostrar el inventario.
     * @return Cadena con los nombres de los objetos.
     */
    private static String mostrarInventarioPartida(Personaje personaje){
        String[] arrayNombresObjetos = new String[personaje.getInventario().size()];
        for (int i = 0;i<personaje.getInventario().size();i++){
            arrayNombresObjetos[i] = personaje.getInventario().get(i).getNombre();
        }
        return Arrays.toString(arrayNombresObjetos);
    }

    /**
     * Representación en cadena de la información de la partida.
     * @return Cadena con todos los datos relevantes de la partida.
     */
    @Override
    public String toString() {
        return "Partida empezada a las " + horaYFechaCompleta(fechaInicio) + 
        "\nCon el personaje " + Utilidades.ANSI_UNDERLINE + personaje.getNombre() + Utilidades.ANSI_RESET + 
        "\nLas estadísticas y el nivel finales fueron: " +
        Utilidades.ANSI_GREEN + estadisticas[0] + " " + 
        Utilidades.ANSI_RED + estadisticas[1] + " " + 
        Utilidades.ANSI_YELLOW + estadisticas[2] + " " + 
        Utilidades.ANSI_BLUE + estadisticas[3] + " " + 
        Utilidades.ANSI_PURPLE + estadisticas[4] + " " + 
        Utilidades.ANSI_RESET + estadisticas[5] + 
        "\nCompraste "+personaje.getInventario().size()+" objetos fueron: "+mostrarInventarioPartida(personaje)+
        "\nConcluyó con una victoria: "+victoria+
        "\nTerminó a las " + horaYFechaCompleta(fechaFinal)+
        "\nTeniendo una duración de "+duracionPartida(duracion);
    }
}
