package Personajes;
import util.Utilidades;
import java.io.IOException;

import Entrenamiento.Entrenamiento;
import Interfaz.Titulos;

/**
 * Clase Luchador la cúal es hija de la clase Personaje
 * @author Iván Bertolo García
 * @version 2.0
 */
public class Luchador extends Personaje {
    
    /**
     * ATRIBUTOS
     */
    private int coraje;// atributo único de la clase Luchador

    /**
     * CONSTRUCTORES
     */

    /**
     * Constructor principal que se 
     * @param vitalidad atributo heredado de Personaje referenciando la vitalidad del Luchador
     * @param fuerza atributo heredado de Personaje referenciando la fuerza del Luchador
     * @param agilidad atributo heredado de Personaje referenciando la agilidad del Luchador
     * @param percepcionMagica atributo heredado de Personaje referenciando la percepcionMagica del Luchador
     * @param salud atributo heredado de Personaje referenciando la salud del Luchador
     * @param coraje atributo único de la clase Luchador
     */
    public Luchador(String nombre, int dinero, int vitalidad, int fuerza, int agilidad, int percepcionMagica,
            double salud, int experiencia, int nivel, int coraje) {
        super(nombre, dinero, vitalidad, fuerza, agilidad, percepcionMagica, salud, experiencia, nivel);
        this.coraje = coraje;
    }

    /**
     * Constructor vacío para poder inicializarlo con los métodos set y get en la main
     */
    public Luchador() {
    }

    /**
     *  GETTERS Y SETTERS
     */

    /**
     * Método get que retorna el valor del atributo coraje
     * @return devuelva el valor de coraje
     */
    public int getCoraje() {
        return coraje;
    }

    /**
     * Método set para dar o actualizar el valor del atributo coraje
     * @param coraje coje el valor del parametro int y se lo asigna al atributo coraje
     */
    public void setCoraje(int coraje) {
        this.coraje = coraje;
    }

    /**
     * Método que muestra la introducción del personaje Luchador, presentando sus estadísticas principales.
     * Muestra información en pantalla sobre la vitalidad, fuerza, agilidad, percepción mágica y coraje.
     * Coje mediante super() la introducción de personaje de la clase Persona que se completa en este método 
     */
    public void introduccionLuchador() {
        int margenTexto = 50;
        int margenEntreNumeros = 7;
        super.introduccionPersonaje();
        System.out.println(Utilidades.ANSI_PURPLE + "║ CORAJE ║" + Utilidades.ANSI_CYAN + "║ SALUD ║");
        System.out.println(Utilidades.ANSI_GREEN + " ".repeat(margenTexto + 7) + "║ " + getVitalidad() + " ║" + " ".repeat(margenEntreNumeros) + Utilidades.ANSI_RED +
                "║ " + getFuerza() + " ║" + " ".repeat(margenEntreNumeros) + Utilidades.ANSI_YELLOW +
                "║ " + getAgilidad() + " ║" + " ".repeat(margenEntreNumeros + 5) + Utilidades.ANSI_BLUE +
                "║ " + getPercepcionMagica() + " ║" + " ".repeat(margenEntreNumeros + 2) + Utilidades.ANSI_PURPLE +
                "║ " + coraje + " ║" + " ".repeat(margenEntreNumeros - 4) + Utilidades.ANSI_CYAN +
                "║ " + getSalud() + " ║");
        Utilidades.espacios(4);
        System.out.println(Utilidades.ANSI_RED_BACKGROUND + "La salud del personaje no se podrá aumentar" + Utilidades.ANSI_RESET);
    }

    /**
     * Método que muestra las estadísticas actuales del luchador.
     * Primero cogiendo el método generico de Personaje y completandolo aquí
     * 
     * @param titulo Objeto Titulos para mostrar encabezados en pantalla.
     * @throws IOException Si ocurre un error en la lectura de la entrada.
     */
    public void enseñarEstadisticasLuchador() throws IOException {
        int margenTexto = 50;
        int margenEntreNumeros = 7;
        super.enseñarEstadisticas();
        System.out.println(Utilidades.ANSI_PURPLE + "║ CORAJE ║" + Utilidades.ANSI_RESET);
        System.out.println(Utilidades.ANSI_GREEN + " ".repeat(margenTexto + 8) + "║ " + getVitalidad() + " ║" + " ".repeat(margenEntreNumeros) + Utilidades.ANSI_RED +
                "║ " + getFuerza() + " ║" + " ".repeat(margenEntreNumeros) + Utilidades.ANSI_YELLOW +
                "║ " + getAgilidad() + " ║" + " ".repeat(margenEntreNumeros + 4) + Utilidades.ANSI_BLUE +
                "║ " + getPercepcionMagica() + " ║" + " ".repeat(margenEntreNumeros + 3) + Utilidades.ANSI_PURPLE +
                "║ " + coraje + " ║" + Utilidades.ANSI_RESET);
        Utilidades.espacios(2);
        String vueltaAMenu = Utilidades.leerStringConTexto("Pulsa intro para volver al menú de acciones");
        Utilidades.espacios(2);
    }

    /**
     * TO STRING
     */

     @Override
     public String toString() {
         return super.toString() +" coraje= " + coraje;
     }
 
}
