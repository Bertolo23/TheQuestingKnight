package Misiones;

/**
 * Clase que almacena la información de las misiones disponibles para el personaje
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
     * Método que genera y retorna la cantidad de salud perdida en cada misión del luchador.
     * @return array de valores double que representan la salud perdida en cada misión
     */
    public static double[] saludPerdidaMision() {
        double[] saludPerdida = new double[4];
        saludPerdida[0] = Math.round((0.25 + (Math.random() * (0.75 - 0.25))) * 10) / 10.0;
        saludPerdida[1] = Math.round((0.25 + (Math.random() * (1.5 - 0.5))) * 10) / 10.0;
        saludPerdida[2] = Math.round((0.25 + (Math.random() * (1 - 0.3))) * 10) / 10.0;
        saludPerdida[3] = Math.round((0.25 + (Math.random() * (1.75 - 0.75))) * 10) / 10.0;
        return saludPerdida;
    }

    /**
     * Método que genera y retorna la paga de cada misión del luchador.
     * @return array de valores enteros que representan la paga en dinero de cada misión
     */
    public static int[] pagaMision() {
        int[] pagaMision = new int[4]; 
        pagaMision[0] = (int)(Math.random() * (15 - 10 + 1)) + 10;
        pagaMision[1] = (int)(Math.random() * (50 - 30 + 1)) + 30;
        pagaMision[2] = (int)(Math.random() * (35 - 20 + 1)) + 20;
        pagaMision[3] = (int)(Math.random() * (80 - 40 + 1)) + 20;
        return pagaMision;
    }
}
