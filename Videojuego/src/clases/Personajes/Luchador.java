package clases.Personajes;

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
     * TO STRING
     */

     @Override
     public String toString() {
         return super.toString() +" coraje= " + coraje;
     }
 
}
