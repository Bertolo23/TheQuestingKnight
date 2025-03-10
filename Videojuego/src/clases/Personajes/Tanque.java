package Personajes;

import java.io.IOException;

import Entrenamiento.Entrenamiento;
import Interfaz.Titulos;
import util.Utilidades;

/**
 * Clase Tanque la cúal es hija de la clase Personaje
 * @author Iván Bertolo García
 * @version 2.0
 */
public class Tanque extends Personaje {
    
    /**
     * ATRIBUTOS
     */
    private int barrera;// atributo único de la clase Tanque

    /**
     * CONSTRUCTORES
     */

    /**
     * Constructor principal que se 
     * @param vitalidad atributo heredado de Personaje referenciando la vitalidad del Tanque
     * @param fuerza atributo heredado de Personaje referenciando la fuerza del Tanque
     * @param agilidad atributo heredado de Personaje referenciando la agilidad del Tanque
     * @param percepcionMagica atributo heredado de Personaje referenciando la percepcionMagica del Tanque
     * @param salud atributo heredado de Personaje referenciando la salud del Tanque
     * @param barrera atributo único de la clase Tanque
     */
    public Tanque(String nombre, int dinero, int vitalidad, int fuerza, int agilidad, int percepcionMagica,
            double salud, int experiencia, int nivel, int barrera) {
        super(nombre, dinero, vitalidad, fuerza, agilidad, percepcionMagica, salud, experiencia, nivel);
        this.barrera = barrera;
    }

    /**
     * Constructor vacío para poder inicializarlo con los métodos set y get en la main
     */
    public Tanque() {
    }

    /**
     *  GETTERS Y SETTERS
     */

    /**
     * Método get que retorna el valor del atributo barrera
     * @return devuelva el valor de barrera
     */
    public int getBarrera() {
        return barrera;
    }

    /**
     * Método set para dar o actualizar el valor del atributo barrera
     * @param barrera coje el valor del parametro int y se lo asigna al atributo barrera
     */
    public void setBarrera(int barrera) {
        this.barrera = barrera;
    }

    /**
     * Método que muestra la introducción del personaje Tanque, presentando sus estadísticas principales.
     * Muestra información en pantalla sobre la vitalidad, fuerza, agilidad, percepción mágica y barrera.
     * Coje mediante super() la introducción de personaje de la clase Persona que se completa en este método 
     */
    public void introduccionTanque(){

        int margenTexto = 50;
        int margenEntreNumeros = 7;
        super.introduccionPersonaje();
        System.out.println(Utilidades.ANSI_PURPLE + "║ BARRERA ║" + Utilidades.ANSI_CYAN + "║ SALUD ║");
        System.out.println(Utilidades.ANSI_GREEN + " ".repeat(margenTexto + 7) + "║ " + getVitalidad() + " ║" + " ".repeat(margenEntreNumeros) + Utilidades.ANSI_RED +
                "║ " + getFuerza() + " ║" + " ".repeat(margenEntreNumeros) + Utilidades.ANSI_YELLOW +
                "║ " + getAgilidad() + " ║" + " ".repeat(margenEntreNumeros + 5) + Utilidades.ANSI_BLUE +
                "║ " + getPercepcionMagica() + " ║" + " ".repeat(margenEntreNumeros + 2) + Utilidades.ANSI_PURPLE +
                "║ " + barrera + " ║" + " ".repeat(margenEntreNumeros - 4) + Utilidades.ANSI_CYAN +
                "║ " + getSalud() + " ║");
        Utilidades.espacios(4);
        System.out.println(Utilidades.ANSI_RED_BACKGROUND + "La salud del personaje no se podrá aumentar" + Utilidades.ANSI_RESET);
    }

    /**
     * Método que muestra las estadísticas actuales del Asesino.
     * Primero cogiendo el método generico de Personaje y completandolo aquí
     * 
     * @throws IOException Si ocurre un error en la lectura de la entrada.
     */
    public void enseñarEstadisticasTanque() throws IOException {
        int margenTexto = 50;
        int margenEntreNumeros = 7;
        super.enseñarEstadisticas();
        System.out.println(Utilidades.ANSI_PURPLE + "║ BARRERA ║" + Utilidades.ANSI_RESET);
        System.out.println(Utilidades.ANSI_GREEN + " ".repeat(margenTexto + 8) + "║ " + getVitalidad() + " ║" + " ".repeat(margenEntreNumeros) + Utilidades.ANSI_RED +
                "║ " + getFuerza() + " ║" + " ".repeat(margenEntreNumeros) + Utilidades.ANSI_YELLOW +
                "║ " + getAgilidad() + " ║" + " ".repeat(margenEntreNumeros + 4) + Utilidades.ANSI_BLUE +
                "║ " + getPercepcionMagica() + " ║" + " ".repeat(margenEntreNumeros + 3) + Utilidades.ANSI_PURPLE +
                "║ " + barrera + " ║" + Utilidades.ANSI_RESET);
        System.out.println();
        System.out.println();
        String vueltaAMenu = Utilidades.leerStringConTexto("Pulsa intro para volver al menú de acciones");
        System.out.println();
        System.out.println();
    }


    /**
     * TO STRING
     */

     @Override
     public String toString() {
         return super.toString() +" barrera= " + barrera;
     }
 
}
