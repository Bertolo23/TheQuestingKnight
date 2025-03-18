
import java.io.IOException;
import clases.Interfaz.Menus;
import clases.Personajes.*;

/**
 * Clase Principal donde recojo todos los métodos y hago la estructura del juego
 * @author Iván Bertolo García
 * @version 2.0
 */
public class Videojuegov2 {

    public static void main(String[] args)throws IOException {

        /**
         * Instanción de todos los objetos necesarios
         */
        Luchador luchador = new Luchador("Luchador", 0, 7, 7, 5, 2, 5, 0, 1, 8);
        Asesino asesino = new Asesino("Asesino", 0, 5, 6, 8, 3, 3.5, 0, 1, 9);
        Tanque tanque = new Tanque("Tanque", 0, 10, 7, 3, 0, 6, 0, 1, 7);
        Mago mago = new Mago("Mago", 0, 4, 3, 5, 10, 4, 0, 1, 10);

        Menus.menuPrincipal(luchador, asesino, tanque, mago);
        
    } 

}

