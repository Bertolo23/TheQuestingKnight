
import java.io.IOException;

import clases.interfaz.Menus;
import clases.interfaz.Titulos;
import clases.personajes.*;
import util.Utilidades;

/**
 * Clase Principal donde ejecuto el juego
 * @author Iván Bertolo García
 * @version 2.0
 */
public class Videojuegov2 {

    public static void main(String[] args)throws IOException {

        /**
         * Instanción de todos los objetos necesarios
         */
        Luchador luchador = ConstantesPersonaje.luchador;
        Asesino asesino = ConstantesPersonaje.asesino;
        Tanque tanque = ConstantesPersonaje.tanque;
        Mago mago = ConstantesPersonaje.mago;

        Menus.menuPrincipal(luchador, asesino, tanque, mago);  
    } 
}