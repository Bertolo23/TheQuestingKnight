package Misiones;

import util.Utilidades;
import java.io.IOException;
import Personajes.Personaje;

/**
 * Clase que representa la estructura de como van a ser las misiones que los personajes pueden completar
 */
public class Misiones {
    
    /**
     * ATRIBUTOS DE LA CLASE MISIONES
     */
    private int pagaMision; // Representa la cantidad de dinero que el personaje recibe al completar la misión
    private double saludPerdida; // Indica la cantidad de salud que el personaje pierde al realizar la misión
    private String[] descripcion; // Almacena la descripción de la misión en un array de Strings

    /**
     * CONSTRUCTOR
     */

    /**
     * Constructor que inicializa los atributos de la misión
     * @param pagaMision cantidad de dinero que se obtiene al completar la misión
     * @param saludPerdida cantidad de salud que se pierde al realizar la misión
     * @param descripcion descripción de la misión
     */
    public Misiones(int pagaMision, double saludPerdida, String[] descripcion) {
        this.pagaMision = pagaMision;
        this.saludPerdida = saludPerdida;
        this.descripcion = descripcion;
    }

    /**
     * GETTERS Y SETTERS
     */

    /**
     * Método get que retorna la paga de la misión
     * @return cantidad de dinero que otorga la misión
     */
    public int getPagaMision() {
        return pagaMision;
    }

    /**
     * Método set para actualizar la paga de la misión
     * @param pagaMision nuevo valor de la paga de la misión
     */
    public void setPagaMision(int pagaMision) {
        this.pagaMision = pagaMision;
    }

    /**
     * Método get que retorna la cantidad de salud perdida en la misión
     * @return cantidad de salud que se pierde
     */
    public double getSaludPerdida() {
        return saludPerdida;
    }

    /**
     * Método set para actualizar la cantidad de salud perdida en la misión
     * @param saludPerdida nuevo valor de salud perdida
     */
    public void setSaludPerdida(double saludPerdida) {
        this.saludPerdida = saludPerdida;
    }

    /**
     * Método get que retorna la descripción de la misión
     * @return array de Strings con la descripción de la misión
     */
    public String[] getDescripcion() {
        return descripcion;
    }

    /**
     * Método set para actualizar la descripción de la misión
     * @param descripcion nuevo array de Strings con la descripción de la misión
     */
    public void setDescripcion(String[] descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * CONSTANTES ANSI PARA FORMATO DE TEXTO EN CONSOLA
     */
    private final String ANSI_RESET = "\u001B[0m"; 
    private final String ANSI_YELLOW = "\u001B[33m"; 
    private final String ANSI_UNDERLINE = "\u001B[4m"; 
    private final String ANSI_CYAN = "\u001B[36m";

    /**
     * Método que estructura la misión, actualiza los atributos del personaje y muestra los resultados en consola
     * @param mision objeto de la clase Misiones con los datos de la misión actual
     * @param personaje objeto de la clase Personaje que realizará la misión
     * @throws IOException si hay un error en la entrada del usuario
     */
    public void estructuraMision(Misiones mision, Personaje personaje)throws IOException{

        personaje.setSalud(personaje.getSalud()-mision.getSaludPerdida());
        personaje.setDinero(personaje.getDinero()+mision.getPagaMision());
        System.out.println("Misión terminada");
        System.out.println("Has perdido "+ANSI_UNDERLINE+ANSI_CYAN+mision.getSaludPerdida()+ANSI_RESET+" de salud");
        System.out.println("Has ganado "+ANSI_UNDERLINE+ANSI_YELLOW+mision.getPagaMision()+ANSI_RESET+" de dinero");
        System.out.println();
        String vueltaAMenu = Utilidades.leerStringConTexto("Pulsa intro para volver al menú de misiones");
        System.out.println();
        System.out.println();
    }

        
}
