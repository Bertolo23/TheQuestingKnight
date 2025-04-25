package clases.misiones;

import java.util.ArrayList;

/**
 * Clase que almacena la información de las misiones disponibles para el personaje
 * @author Iván Bertolo García
 * @version 2.0
 */
public class InfoMisiones {
    
    // ----------------------------------------------------------------------------------- MISIONES PARA LUCHADOR --------------------------------------------------------------------------------------

    /**
     * Método que retorna la descripción de la Misión 1 para el luchador
     * @return array de Strings con la descripción de la misión
     */
    public static String[] textoMision1() {
        String[] texto = {
            "La plebe se ha cansado de los altísimos impuestos de la nobleza.",
            "¡Van a asaltar el castillo! Se pagará la parte proporcional del saqueo."
        };          
        return texto;
    }

    /**
     * Método que retorna la descripción de la Misión 2 para el luchador
     * @return array de Strings con la descripción de la misión
     */
    public static String[] textoMision2() {
        String[] texto = {
            "La población del pueblo local se ha subordinado y marchan contra el castillo.",
            "Es muy peligroso ya que hay 1 defensor por cada 3 campesinos, pero si se vence, el noble pagará muy generosamente."
        };          
        return texto;
    }

    /**
     * Método que retorna la descripción de la Misión 3 para el luchador
     * @return array de Strings con la descripción de la misión
     */
    public static String[] textoMision3() {
        String[] texto = {
            "Un mercader quiere ir a buscar unas telas muy codiciadas, pero el camino está lleno de peligros.",
            "Bandidos, trampas, animales salvajes y hasta otros mercaderes pueden poner en riesgo esta misión."
        };    
        return texto;
    }

    /**
     * Método que retorna la descripción de la Misión 4 para el luchador
     * @return array de Strings con la descripción de la misión
     */
    public static String[] textoMision4() {
        String[] texto = {
            "Han raptado al Duque de tu región, deberás encontrar a los secuestradores y traer sano y salvo al niño.",
            "Se te recompensará muy bien."
        };    
        return texto;
    }

    /**
     * Método que genera y retorna la paga de cada misión del luchador.
     * @return array de valores enteros que representan la paga en dinero de cada misión
     */
    public static ArrayList<Integer> pagaMision() {
        ArrayList<Integer> listaPagaMisiones = new ArrayList<>(); 
        listaPagaMisiones.add((int)(Math.random() * (45 - 20 + 1)) + 10);
        listaPagaMisiones.add((int)(Math.random() * (50 - 30 + 1)) + 30);
        listaPagaMisiones.add((int)(Math.random() * (35 - 20 + 1)) + 20);
        listaPagaMisiones.add((int)(Math.random() * (80 - 40 + 1)) + 20);

        return listaPagaMisiones;
    }
}
