package clases.Tienda;
import java.io.IOException;
import clases.Personajes.Personaje;
import util.Utilidades;

/**
 * Clase que representa un objeto disponible en la tienda del juego
 * @author Iván Bertolo García
 * @version 2.0
 */
public class ObjetoTienda {
    
    /**
     * ATRIBUTOS DE LA CLASE OBJETO TIENDA
     */
    private String nombre; // Nombre del objeto en la tienda
    private int precio; // Precio del objeto en la tienda
    private boolean objetoComprado;
    /**
     * CONSTRUCTOR
     */

    /**
     * Constructor que inicializa un objeto de la tienda con su nombre y precio
     * @param nombre nombre del objeto
     * @param precio precio del objeto en la tienda
     */
    public ObjetoTienda(String nombre, int precio, boolean objetoComprado) {
        this.nombre = nombre;
        this.precio = precio;
        this.objetoComprado = objetoComprado;
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

    /**
     * Método get que retorna el precio del objeto
     * @return precio del objeto en la tienda
     */
    public boolean getObjetoComprado() {
        return objetoComprado;
    }

    /**
     * Método set para actualizar el precio del objeto
     * @param precio nuevo precio del objeto en la tienda
     */
    public void setObjetoComprado(boolean objetoComprado) {
        this.objetoComprado = objetoComprado;
    }

    /**
     * Método que recoge los objetos de la tienda y cual quieres comprar
     * @param objeto objeto de clase ObjetoTienda del cúal sacamos la información de cada objeto
     * @param personaje objeto de la clase Persona que usamos para verificar si puede comprar el objeto
     * @return falso si no tiene dinero o no quiere comprar el objeto y true si lo compra
     * @throws IOException para poder leer con BFReader
     */
     public boolean gestionCompra(ObjetoTienda objeto, Personaje personaje)throws IOException{
        
        String seguirCompra = Utilidades.leerStringConTexto("La "+objeto.getNombre()+" tiene un precio de "+Utilidades.ANSI_YELLOW+objeto.getPrecio()+Utilidades.ANSI_RESET+", Seguimos con la compra?(S/N)").toUpperCase();
        Utilidades.espacios(2);
        if (seguirCompra.equals("S")) {
            if (personaje.getDinero()>=objeto.getPrecio()){
                System.out.println("Gracias por la compra");
                    Utilidades.espacios(2);
                    return true;
            }else{
                System.out.println("No tienes suficiente " + Utilidades.ANSI_UNDERLINE + "dinero" + Utilidades.ANSI_RESET);
                Utilidades.espacios(2);
            }
        }else{
            System.out.println("Otra vez será");
            Utilidades.espacios(2);
        }
        String volverMenu = Utilidades.leerStringConTexto("Pulsa intro para volver a la Tienda");
        Utilidades.espacios(2);
        return false;
    }

}
