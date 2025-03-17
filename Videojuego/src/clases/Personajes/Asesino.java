package clases.Personajes;
import java.io.IOException;
import util.Utilidades;

/**
 * Clase Asesino la cúal es hija de la clase Personaje
 * @author Iván Bertolo García
 * @version 2.0
 */
public class Asesino extends Personaje {
    
    /**
     * ATRIBUTOS
     */
    private int sigilo;// atributo único de la clase Asesino

    /**
     * CONSTRUCTORES
     */

    /**
     * Constructor principal que se 
     * @param vitalidad atributo heredado de Personaje referenciando la vitalidad del Asesino
     * @param fuerza atributo heredado de Personaje referenciando la fuerza del Asesino
     * @param agilidad atributo heredado de Personaje referenciando la agilidad del Asesino
     * @param percepcionMagica atributo heredado de Personaje referenciando la percepcionMagica del Asesino
     * @param salud atributo heredado de Personaje referenciando la salud del Asesino
     * @param sigilo atributo único de la clase Asesino
     */
    public Asesino(String nombre, int dinero, int vitalidad, int fuerza, int agilidad, int percepcionMagica,
            double salud, int experiencia, int nivel, int sigilo) {
        super(nombre, dinero, vitalidad, fuerza, agilidad, percepcionMagica, salud, experiencia, nivel);
        this.sigilo = sigilo;
    }

    /**
     * Constructor vacío para poder inicializarlo con los métodos set y get en la main
     */
    public Asesino() {
    }

    /**
     *  GETTERS Y SETTERS
     */

    /**
     * Método get que retorna el valor del atributo sigilo
     * @return devuelva el valor de sigilo
     */
    public int getSigilo() {
        return sigilo;
    }

    /**
     * Método set para dar o actualizar el valor del atributo sigilo
     * @param sigilo coje el valor del parametro int y se lo asigna al atributo sigilo
     */
    public void setSigilo(int sigilo) {
        this.sigilo = sigilo;
    }

    /**
     * Método que muestra la introducción del personaje Asesino, presentando sus estadísticas principales.
     * Muestra información en pantalla sobre la vitalidad, fuerza, agilidad, percepción mágica y sigilo.
     * Coje mediante super() la introducción de personaje de la clase Persona que se completa en este método 
     */
    public void introduccionPersonaje(){

        int margenEntreNumeros = 7;
        int margen = 50;
        System.out.println(" ".repeat(margen - 2) + Utilidades.ANSI_CYAN + "                    HAS ELEGIDO " + Utilidades.ANSI_UNDERLINE + getNombre().toUpperCase() + Utilidades.ANSI_RESET + Utilidades.ANSI_CYAN + " TUS ESTADÍSTICAS SON");
        Utilidades.espacios(3);
        System.out.println(Utilidades.ANSI_GREEN + " ".repeat(margen - 2) + "     ║ VITALIDAD ║" + Utilidades.ANSI_RED + "║ FUERZA ║" + Utilidades.ANSI_YELLOW + "║ AGILIDAD ║" + Utilidades.ANSI_BLUE + "║ PERCEPCIÓN MÁGICA ║"+Utilidades.ANSI_PURPLE + "║ SIGILO ║" + Utilidades.ANSI_CYAN + "║ SALUD ║");        
        System.out.println(Utilidades.ANSI_GREEN + " ".repeat(margen + 7) + "║ " + getVitalidad() + " ║" + " ".repeat(margenEntreNumeros) + Utilidades.ANSI_RED +
                "║ " + getFuerza() + " ║" + " ".repeat(margenEntreNumeros) + Utilidades.ANSI_YELLOW +
                "║ " + getAgilidad() + " ║" + " ".repeat(margenEntreNumeros + 5) + Utilidades.ANSI_BLUE +
                "║ " + getPercepcionMagica() + " ║" + " ".repeat(margenEntreNumeros + 2) + Utilidades.ANSI_PURPLE +
                "║ " + sigilo + " ║" + " ".repeat(margenEntreNumeros - 4) + Utilidades.ANSI_CYAN +
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
    public void enseñarEstadisticasAsesino() throws IOException {
        int margenTexto = 50;
        int margenEntreNumeros = 7;
        super.enseñarEstadisticas();
        System.out.println(Utilidades.ANSI_PURPLE + "║ SIGILO ║" + Utilidades.ANSI_RESET);
        System.out.println(Utilidades.ANSI_GREEN + " ".repeat(margenTexto + 8) + "║ " + getVitalidad() + " ║" + " ".repeat(margenEntreNumeros) + Utilidades.ANSI_RED +
                "║ " + getFuerza() + " ║" + " ".repeat(margenEntreNumeros) + Utilidades.ANSI_YELLOW +
                "║ " + getAgilidad() + " ║" + " ".repeat(margenEntreNumeros + 4) + Utilidades.ANSI_BLUE +
                "║ " + getPercepcionMagica() + " ║" + " ".repeat(margenEntreNumeros + 3) + Utilidades.ANSI_PURPLE +
                "║ " + sigilo + " ║" + Utilidades.ANSI_RESET);
        Utilidades.espacios(2);
        String vueltaAMenu = Utilidades.leerStringConTexto("Pulsa intro para volver al menú de acciones");
        Utilidades.espacios(2);
    }


    /**
     * TO STRING
     */

     @Override
     public String toString() {
         return super.toString() +" sigilo= " + sigilo;
     }
 
}
