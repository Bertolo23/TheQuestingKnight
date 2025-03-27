
import java.io.IOException;
import clases.Interfaz.Menus;
import clases.Personajes.*;

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
        Luchador luchador = new Luchador(ConstantesPersonaje.LUCHADOR_NOMBRE, ConstantesPersonaje.DINERO, ConstantesPersonaje.LUCHADOR_VITALIDAD, ConstantesPersonaje.LUCHADOR_FUERZA, ConstantesPersonaje.LUCHADOR_AGILIDAD, ConstantesPersonaje.LUCHADOR_PERCEPCION_MAGICA, ConstantesPersonaje.SALUD, ConstantesPersonaje.EXPERIENCIA, ConstantesPersonaje.NIVEL, ConstantesPersonaje.LUCHADOR_ESTADISTICA_ESPECIAL);
        Asesino asesino = new Asesino(ConstantesPersonaje.ASESINO_NOMBRE, ConstantesPersonaje.DINERO, ConstantesPersonaje.ASESINO_VITALIDAD, ConstantesPersonaje.ASESINO_FUERZA, ConstantesPersonaje.ASESINO_AGILIDAD, ConstantesPersonaje.ASESINO_PERCEPCION_MAGICA, ConstantesPersonaje.SALUD, ConstantesPersonaje.EXPERIENCIA, ConstantesPersonaje.NIVEL, ConstantesPersonaje.ASESINO_ESTADISTICA_ESPECIAL);
        Tanque tanque = new Tanque(ConstantesPersonaje.TANQUE_NOMBRE, ConstantesPersonaje.DINERO, ConstantesPersonaje.TANQUE_VITALIDAD, ConstantesPersonaje.TANQUE_FUERZA, ConstantesPersonaje.TANQUE_AGILIDAD, ConstantesPersonaje.TANQUE_PERCEPCION_MAGICA, ConstantesPersonaje.SALUD, ConstantesPersonaje.EXPERIENCIA, ConstantesPersonaje.NIVEL, ConstantesPersonaje.TANQUE_ESTADISTICA_ESPECIAL);
        Mago mago = new Mago(ConstantesPersonaje.MAGO_NOMBRE, ConstantesPersonaje.DINERO, ConstantesPersonaje.MAGO_VITALIDAD, ConstantesPersonaje.MAGO_FUERZA, ConstantesPersonaje.MAGO_AGILIDAD, ConstantesPersonaje.MAGO_PERCEPCION_MAGICA, ConstantesPersonaje.SALUD, ConstantesPersonaje.EXPERIENCIA, ConstantesPersonaje.NIVEL, ConstantesPersonaje.MAGO_ESTADISTICA_ESPECIAL);

        Menus.menuPrincipal(luchador, asesino, tanque, mago);
        
    } 

}

