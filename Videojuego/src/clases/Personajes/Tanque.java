package Personajes;

import java.io.IOException;

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
     * Método que permite al usuario seleccionar una opción de mejora de estadísticas en el entrenamiento.
     * 
     * @return La opción de mejora seleccionada por el usuario.
     * @throws IOException Si ocurre un error en la lectura de la entrada.
     */
    public int preguntasEntrenamientoTanque() throws IOException {

        int opcionMejora = 0;
        super.preguntasEntrenamiento();
        System.out.println(Utilidades.ANSI_PURPLE + "║ BARRERA ║" + Utilidades.ANSI_RESET);
        try {
            opcionMejora = Utilidades.leerEntero();
        } catch (NumberFormatException e) {
            System.out.println(Utilidades.ANSI_UNDERLINE + "Escriba un carácter válido" + Utilidades.ANSI_RESET);
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
    public void entrenamientoTanque() throws IOException {
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
                    opcionMejora = preguntasEntrenamientoTanque();

                    switch (opcionMejora) {
                        case 1: // Aumentar Vitalidad
                            setVitalidad(getVitalidad() + 1);
                            System.out.println("Vitalidad: " + Utilidades.ANSI_GREEN + getVitalidad() + Utilidades.ANSI_RESET);
                            break;
                        case 2: // Aumentar Fuerza
                            setFuerza(getFuerza() + 1);
                            System.out.println("Fuerza: " + Utilidades.ANSI_RED + getFuerza() + Utilidades.ANSI_RESET);
                            break;
                        case 3: // Aumentar Agilidad
                            setAgilidad(getAgilidad() + 1);
                            System.out.println("Agilidad: " + Utilidades.ANSI_YELLOW + getAgilidad() + Utilidades.ANSI_RESET);
                            break;
                        case 4: // Aumentar Percepción Mágica
                            setPercepcionMagica(getPercepcionMagica() + 1);
                            System.out.println("Percepción Mágica: " + Utilidades.ANSI_BLUE + getPercepcionMagica() + Utilidades.ANSI_RESET);
                            break;
                        case 5: // Aumentar Barrera
                            barrera++;
                            System.out.println("Barrera: " + Utilidades.ANSI_PURPLE + barrera + Utilidades.ANSI_RESET);
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
