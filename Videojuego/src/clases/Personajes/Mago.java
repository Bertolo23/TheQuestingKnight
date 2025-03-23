package clases.Personajes;

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
     * TO STRING
     */

     @Override
     public String toString() {
         return super.toString() +" poderDeHabilidad= " + poderDeHabilidad;
     }
 
}
