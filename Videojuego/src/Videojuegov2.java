
import java.io.IOException;
import Interfaz.Menus;
import Personajes.Luchador;
/**
 * Clase Principal donde recojo todos los métodos y hago la estructura del juego
 */
public class Videojuegov2 {

    public static void main(String[] args)throws IOException {

        /**
         * Instanción de todos los objetos necesarios
         */
        Luchador luchador = new Luchador("Luchador", 0, 7, 7, 5, 2, 5, 0, 1, 8);

        Menus.menuPrincipal(luchador);
        
    } 

}

