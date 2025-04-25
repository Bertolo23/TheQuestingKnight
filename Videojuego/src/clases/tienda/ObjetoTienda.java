package clases.tienda;

import java.io.IOException;
import clases.personajes.Personaje;
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
    private int precio;    // Precio del objeto en la tienda

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

    /**
     * Método que gestiona la lógica de confirmación de compra por parte del jugador.
     * Pregunta si desea comprar el objeto y verifica si tiene suficiente dinero.
     * 
     * @param objeto objeto que se está intentando comprar
     * @param personaje personaje del jugador que realiza la compra
     * @return true si la compra se realiza con éxito, false en caso contrario
     * @throws IOException para la lectura de entrada del usuario
     */
    public boolean comprobacionCompra(ObjetoTienda objeto, Personaje personaje)throws IOException {
        String seguirCompra = Utilidades.leerString("La "+objeto.getNombre()+" tiene un precio de "+Utilidades.ANSI_YELLOW+objeto.getPrecio()+Utilidades.ANSI_RESET+", ¿Seguimos con la compra?(S/N)").toUpperCase();
        Utilidades.espacios(2);
        if (seguirCompra.equals("S")) {
            if (personaje.getDinero() >= objeto.getPrecio()) {
                System.out.println("Gracias por la compra");
                Utilidades.espacios(2);
                return true;
            } else {
                System.out.println("No tienes suficiente " + Utilidades.ANSI_UNDERLINE + "dinero" + Utilidades.ANSI_RESET);
                Utilidades.espacios(2);
            }
        } else {
            System.out.println("Otra vez será");
            Utilidades.espacios(2);
        }
        String volverMenu = Utilidades.leerString("Pulsa intro para volver a la Tienda");
        Utilidades.espacios(2);
        return false;
    }

    /**
     * Método estático que gestiona todo el proceso de compra de un objeto:
     * muestra el objeto, verifica si ya lo tiene, realiza la compra si se puede.
     * 
     * @param personaje personaje que realiza la compra
     * @param objetoTienda objeto que se está comprando
     * @param ascci representación en texto del objeto (ej. arte ASCII)
     * @throws IOException para la lectura del usuario
     */
    public static void gestionCompra(Personaje personaje, ObjetoTienda objetoTienda, String ascci)throws IOException {
        // Verificamos si el personaje ya tiene el objeto en su inventario
        if (personaje.getInventario().contains(objetoTienda)) {
            System.out.println("Ya tienes el objeto");
            Utilidades.espacios(1);
            Utilidades.continuar("volver a la tienda");
        } else {
            // Mostramos el nombre del objeto y su representación visual
            System.out.println(objetoTienda.getNombre().toUpperCase());
            System.out.println(ascci);
            // Se llama al método comprobacionCompra para ver si puede adquirirlo
            if (objetoTienda.comprobacionCompra(objetoTienda, personaje)) {
                personaje.setDinero(personaje.getDinero() - objetoTienda.getPrecio());
                System.out.println("Ahora tienes equipado el objeto "+objetoTienda.getNombre());
                personaje.getInventario().add(objetoTienda); // Añade el objeto al inventario
            }
        }        
    }
}
