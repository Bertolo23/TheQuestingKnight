package clases.Personajes;

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
     * TO STRING
     */

     @Override
     public String toString() {
         return super.toString() +" barrera= " + barrera;
     }
 
}
