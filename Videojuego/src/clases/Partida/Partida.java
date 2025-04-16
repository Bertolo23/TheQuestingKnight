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
    private LocalDateTime fechaInicio; // Fecha y hora de inicio de la partida.
    private Personaje personaje; // Nombre del personaje con el que se juega la partida.
    private int[] estadisticas; // Estadísticas finales del personaje al terminar la partida.
    private LocalDateTime fechaFinal; // Fecha y hora de finalización de la partida.
    private Duration duracion;
    private Boolean victoria;

    /**
     * CONSTRUCTORES
     */

    /**
     * Constructor de la clase Partida.
     * @param fechaInicio Fecha y hora en que comienza la partida.
     * @param nombrePersonaje Nombre del personaje con el que se juega la partida.
     * @param estadisticas Array de enteros que almacena las estadísticas finales del personaje.
     * @param fechaFinal Fecha y hora en que finaliza la partida.
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
     * GETTERS Y SETTERS
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
     * Obtiene el tipo de personaje con el que se jugó la partida.
     * @return El tipo de personaje.
     */
    public Personaje getPersonaje() {
        return personaje;
    }

    /**
     * Establece el tipo de personaje con el que se jugará la partida.
     * @param personaje El tipo de personaje.
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

    public Duration getDuracion() {
        return duracion;
    }

    public void setDuracion(Duration duracion) {
        this.duracion = duracion;
    }

    public Boolean getVictoria() {
        return victoria;
    }

    public void setVictoria(Boolean victoria) {
        this.victoria = victoria;
    }

    /**
     * Método que formatea una fecha y hora en una cadena legible.
     * @param tiempo Un objeto LocalDateTime con la fecha y hora a formatear.
     * @return Una cadena con la fecha y hora formateadas en el formato "HH:MM:SS el DD/MM/YYYY".
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

    public String duracionPartida(Duration duracion){
        long hora = duracion.toHours();
        long minutos = duracion.toMinutes();
        long segundos = duracion.toSeconds();

        return hora + ":" + minutos + ":" + segundos;
    }

    public static void exportarAFichero(ArrayList<Partida> partidas, File file){

        int i = 0;
        GestionFicheros.llevarInfoAFichero(file," ".repeat(15)+"PARTIDA\n\n"+"=".repeat(50)+"\n\n");
        for (Partida cadaPartida : partidas) {
            if (cadaPartida.getPersonaje() != null){
                i++;
                GestionFicheros.llevarInfoAFichero(file," ".repeat(12)+"GAME  "+i+"\n\n"+ cadaPartida.toString()+"\n\n"+"-".repeat(45)+"\n");  
            }
        } 
        GestionFicheros.llevarInfoAFichero(file,"\n\n"+"=".repeat(50)+"\n\n");
    }

    public static void mostrarPartida(ArrayList<Partida> partidas){

        int i = 0;
        Titulos.tituloResumenPartida();
        for (Partida cadaPartida : partidas) {
            if (cadaPartida.getPersonaje() != null){
                i++;
                System.out.println(" ".repeat(15)+"GAME  "+i+"\n\n"+ cadaPartida.toString()+"\n\n"+"-".repeat(45)+"\n");  
            }
        } 
    }

    private static String mostrarInventarioPartida(Personaje personaje){
        String[] arrayNombresObjetos = new String[personaje.getInventario().size()];

        for (int i = 0;i<personaje.getInventario().size();i++){
            arrayNombresObjetos[i] = personaje.getInventario().get(i).getNombre();
        }
        return Arrays.toString(arrayNombresObjetos);
    }

    /**
     * Representación en cadena de la información de la partida.
     * @return Una cadena con la fecha de inicio, el nombre del personaje, las estadísticas y la fecha de finalización.
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
        "\nY la partida terminó a las " + horaYFechaCompleta(fechaFinal)+
        "\nTeniendo una duración de "+duracionPartida(duracion);
    }

    
}
