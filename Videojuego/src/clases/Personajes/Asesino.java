package Personajes;

import java.io.IOException;

import Interfaz.Titulos;
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

    private final String ANSI_PURPLE = "\u001B[35m";
    private final String ANSI_RESET = "\u001B[0m";
    private final String ANSI_RED_BACKGROUND = "\u001B[41m";
    private final String ANSI_RED = "\u001B[31m";
    private final String ANSI_GREEN = "\u001B[32m";
    private final String ANSI_YELLOW = "\u001B[33m";
    private final String ANSI_BLUE = "\u001B[34m";
    private final String ANSI_CYAN = "\u001B[36m";
    private final String ANSI_UNDERLINE = "\u001B[4m";

    /**
     * Método que muestra la introducción del personaje Asesino, presentando sus estadísticas principales.
     * Muestra información en pantalla sobre la vitalidad, fuerza, agilidad, percepción mágica y sigilo.
     * Coje mediante super() la introducción de personaje de la clase Persona que se completa en este método 
     */
    public void introduccionAsesino(){

        int margenTexto = 50;
        int margenEntreNumeros = 7;
        super.introduccionPersonaje();
        System.out.println(ANSI_PURPLE + "║ SIGILO ║" + ANSI_CYAN + "║ SALUD ║");
        System.out.println(ANSI_GREEN + " ".repeat(margenTexto + 7) + "║ " + getVitalidad() + " ║" + " ".repeat(margenEntreNumeros) + ANSI_RED +
                "║ " + getFuerza() + " ║" + " ".repeat(margenEntreNumeros) + ANSI_YELLOW +
                "║ " + getAgilidad() + " ║" + " ".repeat(margenEntreNumeros + 5) + ANSI_BLUE +
                "║ " + getPercepcionMagica() + " ║" + " ".repeat(margenEntreNumeros + 2) + ANSI_PURPLE +
                "║ " + sigilo + " ║" + " ".repeat(margenEntreNumeros - 4) + ANSI_CYAN +
                "║ " + getSalud() + " ║");
        Utilidades.espacios();
        System.out.println(ANSI_RED_BACKGROUND + "La salud del personaje no se podrá aumentar" + ANSI_RESET);
    }

    /**
     * Método que permite al usuario seleccionar una opción de mejora de estadísticas en el entrenamiento.
     * 
     * @return La opción de mejora seleccionada por el usuario.
     * @throws IOException Si ocurre un error en la lectura de la entrada.
     */
    public int preguntasEntrenamientoAsesino() throws IOException {
        final String ANSI_RESET = "\u001B[0m";
        int opcionMejora = 0;
        super.preguntasEntrenamiento();
        System.out.println(ANSI_PURPLE + "║ SIGILO ║" + ANSI_RESET);
        try {
            opcionMejora = Utilidades.leerEntero();
        } catch (NumberFormatException e) {
            System.out.println(ANSI_UNDERLINE + "Escriba un carácter válido" + ANSI_RESET);
        }
        System.out.println();
        System.out.println();
        return opcionMejora;
    }

    /**
     * Método que gestiona el entrenamiento del Asesino, permitiendo mejorar sus estadísticas
     * utilizando puntos de experiencia acumulados. Tambien introduce el método subir nivel de la clase
     * Persona cuando llegas a un número múltiplo de 5 para subir un nivel
     * 
     * @throws IOException Si ocurre un error en la lectura de la entrada.
     */
    public void entrenamientoAsesino() throws IOException {
        Titulos.tituloEntrenamiento();
        setExperiencia(getExperiencia() + 1);
        super.subirNivel();
        boolean salirBucleExperiencia = false;
        String eleccionMejora = " ";

        do {
            System.out.println("Tienes " + getExperiencia() + " puntos de experiencia");
            eleccionMejora = Utilidades.leerStringConTexto("¿Quieres gastar los puntos (S/N)?").toUpperCase();
            System.out.println();
            System.out.println();
            if (eleccionMejora.equals("S")) {
                setExperiencia(getExperiencia() - 1);
                int opcionMejora = 0;

                do {
                    opcionMejora = preguntasEntrenamientoAsesino();

                    switch (opcionMejora) {
                        case 1: // Aumentar Vitalidad
                            setVitalidad(getVitalidad() + 1);
                            System.out.println("Vitalidad: " + ANSI_GREEN + getVitalidad() + ANSI_RESET);
                            break;
                        case 2: // Aumentar Fuerza
                            setFuerza(getFuerza() + 1);
                            System.out.println("Fuerza: " + ANSI_RED + getFuerza() + ANSI_RESET);
                            break;
                        case 3: // Aumentar Agilidad
                            setAgilidad(getAgilidad() + 1);
                            System.out.println("Agilidad: " + ANSI_YELLOW + getAgilidad() + ANSI_RESET);
                            break;
                        case 4: // Aumentar Percepción Mágica
                            setPercepcionMagica(getPercepcionMagica() + 1);
                            System.out.println("Percepción Mágica: " + ANSI_BLUE + getPercepcionMagica() + ANSI_RESET);
                            break;
                        case 5: // Aumentar Sigilo
                            sigilo++;
                            System.out.println("Sigilo: " + ANSI_PURPLE + sigilo + ANSI_RESET);
                            break;
                        default:
                            System.out.println("Escriba una de las opciones (1-5)");
                            break;
                    }

                } while (opcionMejora < 1 || opcionMejora > 5);
            }
            if (eleccionMejora.equals("N")) {
                System.out.println("Te queda/n " + getExperiencia() + " puntos, hasta la próxima");
                salirBucleExperiencia = true;
                System.out.println();
            }
            if (getExperiencia() == 0) {
                System.out.println("No te queda más puntos de experiencia, hasta la próxima");
                System.out.println();
                salirBucleExperiencia = true;
            }
        } while (getExperiencia() > 0 && !salirBucleExperiencia);
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
        System.out.println(ANSI_PURPLE + "║ SIGILO ║" + ANSI_RESET);
        System.out.println(ANSI_GREEN + " ".repeat(margenTexto + 8) + "║ " + getVitalidad() + " ║" + " ".repeat(margenEntreNumeros) + ANSI_RED +
                "║ " + getFuerza() + " ║" + " ".repeat(margenEntreNumeros) + ANSI_YELLOW +
                "║ " + getAgilidad() + " ║" + " ".repeat(margenEntreNumeros + 4) + ANSI_BLUE +
                "║ " + getPercepcionMagica() + " ║" + " ".repeat(margenEntreNumeros + 3) + ANSI_PURPLE +
                "║ " + sigilo + " ║" + ANSI_RESET);
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
         return super.toString() +" sigilo= " + sigilo;
     }
 
}
