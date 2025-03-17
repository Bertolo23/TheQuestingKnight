package clases.Personajes;
import java.io.IOException;
import util.Utilidades;

/**
 * Clase Mago la cúal es hija de la clase Personaje
 * @author Iván Bertolo García
 * @version 2.0
 */
public class Mago extends Personaje {
    
    /**
     * ATRIBUTOS
     */
    private int poderDeHabilidad;// atributo único de la clase Mago

    /**
     * CONSTRUCTORES
     */

    /**
     * Constructor principal que se 
     * @param vitalidad atributo heredado de Personaje referenciando la vitalidad del Mago
     * @param fuerza atributo heredado de Personaje referenciando la fuerza del Mago
     * @param agilidad atributo heredado de Personaje referenciando la agilidad del Mago
     * @param percepcionMagica atributo heredado de Personaje referenciando la percepcionMagica del Mago
     * @param salud atributo heredado de Personaje referenciando la salud del Mago
     * @param poderDeHabilidad atributo único de la clase Mago
     */
    public Mago(String nombre, int dinero, int vitalidad, int fuerza, int agilidad, int percepcionMagica, double salud,
            int experiencia, int nivel, int poderDeHabilidad) {
        super(nombre, dinero, vitalidad, fuerza, agilidad, percepcionMagica, salud, experiencia, nivel);
        this.poderDeHabilidad = poderDeHabilidad;
    }

    /**
     * Constructor vacío para poder inicializarlo con los métodos set y get en la main
     */
    public Mago() {
    }

    /**
     *  GETTERS Y SETTERS
     */

    /**
     * Método get que retorna el valor del atributo poderDeHabilidad
     * @return devuelva el valor de poderDeHabilidad
     */
    public int getPoderDeHabilidad() {
        return poderDeHabilidad;
    }

    /**
     * Método set para dar o actualizar el valor del atributo poderDeHabilidad
     * @param poderDeHabilidad coje el valor del parametro int y se lo asigna al atributo poderDeHabilidad
     */
    public void setPoderDeHabilidad(int poderDeHabilidad) {
        this.poderDeHabilidad = poderDeHabilidad;
    }


    /**
     * Método que muestra la introducción del personaje Mago, presentando sus estadísticas principales.
     * Muestra información en pantalla sobre la vitalidad, fuerza, agilidad, percepción mágica y poder de habilidad.
     * Coje mediante super() la introducción de personaje de la clase Persona que se completa en este método 
     */
    public void introduccionPersonaje(){

        int margenEntreNumeros = 7;
        int margen = 50;
        System.out.println(" ".repeat(margen - 2) + Utilidades.ANSI_CYAN + "                    HAS ELEGIDO " + Utilidades.ANSI_UNDERLINE + getNombre().toUpperCase() + Utilidades.ANSI_RESET + Utilidades.ANSI_CYAN + " TUS ESTADÍSTICAS SON");
        Utilidades.espacios(3);
        System.out.println(Utilidades.ANSI_GREEN + " ".repeat(margen - 2) + "     ║ VITALIDAD ║" + Utilidades.ANSI_RED + "║ FUERZA ║" + Utilidades.ANSI_YELLOW + "║ AGILIDAD ║" + Utilidades.ANSI_BLUE + "║ PERCEPCIÓN MÁGICA ║"+Utilidades.ANSI_PURPLE + "║ PODER ║" + Utilidades.ANSI_CYAN + "║ SALUD ║");        
        System.out.println(Utilidades.ANSI_GREEN + " ".repeat(margen + 7) + "║ " + getVitalidad() + " ║" + " ".repeat(margenEntreNumeros) + Utilidades.ANSI_RED +
                "║ " + getFuerza() + " ║" + " ".repeat(margenEntreNumeros-1) + Utilidades.ANSI_YELLOW +
                "║ " + getAgilidad() + " ║" + " ".repeat(margenEntreNumeros + 5) + Utilidades.ANSI_BLUE +
                "║ " + getPercepcionMagica() + " ║" + " ".repeat(margenEntreNumeros + 1) + Utilidades.ANSI_PURPLE +
                "║ " + poderDeHabilidad + " ║" + " ".repeat(margenEntreNumeros - 5) + Utilidades.ANSI_CYAN +
                "║ " + getSalud() + " ║");
        Utilidades.espacios(4);
        System.out.println(Utilidades.ANSI_RED_BACKGROUND + "La salud del personaje no se podrá aumentar" + Utilidades.ANSI_RESET);
    }

    /**
     * Método que muestra las estadísticas actuales del Mago.
     * Primero cogiendo el método generico de Personaje y completandolo aquí
     * 
     * @throws IOException Si ocurre un error en la lectura de la entrada.
     */
    public void enseñarEstadisticasMago() throws IOException {
        int margenTexto = 50;
        int margenEntreNumeros = 7;
        super.enseñarEstadisticas();
        System.out.println(Utilidades.ANSI_PURPLE + "║ PODER ║" + Utilidades.ANSI_RESET);
        System.out.println(Utilidades.ANSI_GREEN + " ".repeat(margenTexto + 8) + "║ " + getVitalidad() + " ║" + " ".repeat(margenEntreNumeros) + Utilidades.ANSI_RED +
                "║ " + getFuerza() + " ║" + " ".repeat(margenEntreNumeros) + Utilidades.ANSI_YELLOW +
                "║ " + getAgilidad() + " ║" + " ".repeat(margenEntreNumeros + 4) + Utilidades.ANSI_BLUE +
                "║ " + getPercepcionMagica() + " ║" + " ".repeat(margenEntreNumeros+1) + Utilidades.ANSI_PURPLE +
                "║ " + poderDeHabilidad + " ║" + Utilidades.ANSI_RESET);
        Utilidades.espacios(2);
        String vueltaAMenu = Utilidades.leerStringConTexto("Pulsa intro para volver al menú de acciones");
        Utilidades.espacios(2);
    }


    /**
     * TO STRING
     */

     @Override
     public String toString() {
         return super.toString() +" poderDeHabilidad= " + poderDeHabilidad;
     }
 
}
