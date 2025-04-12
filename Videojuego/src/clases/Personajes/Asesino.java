package clases.personajes;

import java.util.ArrayList;

import clases.tienda.ObjetoTienda;

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
            double salud, int experiencia, int nivel, int sigilo, ArrayList<ObjetoTienda> inventario) {
        super(nombre, dinero, vitalidad, fuerza, agilidad, percepcionMagica, salud, experiencia, nivel, inventario);
        this.sigilo = sigilo;
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
     * TO STRING
     */

     @Override
     public String toString() {
         return super.toString() +" sigilo= " + sigilo;
     }
 
}
