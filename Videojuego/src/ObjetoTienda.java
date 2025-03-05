import java.io.BufferedReader;
import java.io.IOException;

import Utilidades.Utilidades;

/**
 * Clase que representa un objeto disponible en la tienda del juego
 */
public class ObjetoTienda {
    
    /**
     * ATRIBUTOS DE LA CLASE OBJETO TIENDA
     */
    private String nombre; // Nombre del objeto en la tienda
    private int precio; // Precio del objeto en la tienda

    /**
     * CONSTRUCTOR
     */

    /**
     * Constructor que inicializa un objeto de la tienda con su nombre y precio
     * @param nombre nombre del objeto
     * @param precio precio del objeto en la tienda
     */
    public ObjetoTienda(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * GETTERS Y SETTERS
     */

    /**
     * Método get que retorna el nombre del objeto
     * @return nombre del objeto en la tienda
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método set para actualizar el nombre del objeto
     * @param nombre nuevo nombre del objeto en la tienda
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método get que retorna el precio del objeto
     * @return precio del objeto en la tienda
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Método set para actualizar el precio del objeto
     * @param precio nuevo precio del objeto en la tienda
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_UNDERLINE = "\u001B[4m";;

    /**
     * Método que recoge los objetos de la tienda y cual quieres comprar
     * @param objeto objeto de clase ObjetoTienda del cúal sacamos la información de cada objeto
     * @param personaje objeto de la clase Persona que usamos para verificar si puede comprar el objeto
     * @return falso si no tiene dinero o no quiere comprar el objeto y true si lo compra
     * @throws IOException para poder leer con BFReader
     */
     public boolean objetoTienda(ObjetoTienda objeto, Personaje personaje)throws IOException{
        
        String seguirCompra = Utilidades.leerStringConTexto("La "+objeto.getNombre()+" tiene un precio de "+ANSI_YELLOW+objeto.getPrecio()+ANSI_RESET+", Seguimos con la compra?(S/N)");
        System.out.println();
        System.out.println();
            if (personaje.getDinero()>=objeto.getPrecio()) {
                if (seguirCompra.equals("S")) {
                    System.out.println("Gracias por la compra");
                    System.out.println();
                    System.out.println();
                    return true;
                } else {
                    System.out.println("Otra vez será");
                    System.out.println();
                    System.out.println();
                    
                }
            } else {
                System.out.println("No tienes suficiente " + ANSI_UNDERLINE + "dinero" + ANSI_RESET);
                System.out.println();
                System.out.println();
                String volverMenu = Utilidades.leerStringConTexto("Pulsa cualquier tecla para volver a la Tienda");
                System.out.println();
                System.out.println();
            }
            return false;
    }
}
