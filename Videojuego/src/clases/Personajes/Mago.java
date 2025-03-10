package Personajes;

import java.io.IOException;
import Interfaz.Titulos;
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
    public void introduccionMago(){

        int margenTexto = 50;
        int margenEntreNumeros = 7;
        super.introduccionPersonaje();
        System.out.println(Utilidades.ANSI_PURPLE + "║ PODER ║" + Utilidades.ANSI_CYAN + "║ SALUD ║");
        System.out.println(Utilidades.ANSI_GREEN + " ".repeat(margenTexto + 7) + "║ " + getVitalidad() + " ║" + " ".repeat(margenEntreNumeros) + Utilidades.ANSI_RED +
                "║ " + getFuerza() + " ║" + " ".repeat(margenEntreNumeros) + Utilidades.ANSI_YELLOW +
                "║ " + getAgilidad() + " ║" + " ".repeat(margenEntreNumeros + 5) + Utilidades.ANSI_BLUE +
                "║ " + getPercepcionMagica() + " ║" + " ".repeat(margenEntreNumeros) + Utilidades.ANSI_PURPLE +
                "║ " + poderDeHabilidad + " ║" + " ".repeat(margenEntreNumeros - 5) + Utilidades.ANSI_CYAN +
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
    public int preguntasEntrenamientoMago() throws IOException {
        int opcionMejora = 0;
        super.preguntasEntrenamiento();
        System.out.println(Utilidades.ANSI_PURPLE + "║ PODER ║" + Utilidades.ANSI_RESET);
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
     * Método que gestiona el entrenamiento del Mago, permitiendo mejorar sus estadísticas
     * utilizando puntos de experiencia acumulados. Tambien introduce el método subir nivel de la clase
     * Persona cuando llegas a un número múltiplo de 5 para subir un nivel
     * 
     * @throws IOException Si ocurre un error en la lectura de la entrada.
     */
    public void entrenamientoMago() throws IOException {
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
                    opcionMejora = preguntasEntrenamientoMago();

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
                        case 5: // Aumentar poder de habilidad
                            poderDeHabilidad++;
                            System.out.println("Poder: " + Utilidades.ANSI_PURPLE + poderDeHabilidad + Utilidades.ANSI_RESET);
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
         return super.toString() +" poderDeHabilidad= " + poderDeHabilidad;
     }
 
}
