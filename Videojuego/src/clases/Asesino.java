


/**
 * Clase Asesino la cúal es hija de la clase Personaje
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
    public int getsigilo() {
        return sigilo;
    }

    /**
     * Método set para dar o actualizar el valor del atributo sigilo
     * @param sigilo coje el valor del parametro int y se lo asigna al atributo sigilo
     */
    public void setsigilo(int sigilo) {
        this.sigilo = sigilo;
    }

    public void introduccionAsesino(){

        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED_BACKGROUND = "\u001B[41m";
        super.introduccionPersonaje();
        System.out.println(ANSI_PURPLE+"Sigilo "+ANSI_RESET+sigilo);
        System.out.println("La salud del personaje es de "+ANSI_RED_BACKGROUND+getSalud()+ANSI_RESET+" y no se podra aumentar");
    }


    /**
     * TO STRING
     */

     @Override
     public String toString() {
         return super.toString() +" sigilo= " + sigilo;
     }
 
}
