package util;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Clase en la que recogo métodos útiles, los cuales tienen funciones muy usadas que de otra forma repetiria en las clases una y otra vez
 * @author Iván Bertolo García
 * @version 1.0
 */
public class Utilidades{

    /** Constantes ANSI para cambiar colores en la consola */
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_UNDERLINE = "\u001B[4m";
    public static final String FONDO_AMARILLO = "\u001B[43m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_BOLD = "\u001B[1m";
    
    /** Número de estadísticas utilizadas en el juego incluyendo el nivel */
    public static final int NUMERO_ESTADISTICAS = 6;

    /** BufferedReader para leer la entrada del usuario */
    static BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Lee un número entero desde la entrada estándar con un mensaje previo.
     * @param texto Mensaje que se mostrará antes de la entrada del usuario.
     * @return El número entero ingresado por el usuario.
     * @throws IOException Si ocurre un error en la entrada.
     */
    public static int leerEnteroConTexto(String texto) throws IOException {
        int entrada = 0;
        System.out.println(texto);
        try {
            entrada = Integer.parseInt(lector.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Escriba un valor correcto");
        }
        return entrada;
    }

    /**
     * Lee un número entero desde la entrada estándar sin mensaje previo.
     * @return El número entero ingresado por el usuario.
     * @throws IOException Si ocurre un error en la entrada.
     */
    public static int leerEntero() throws IOException {
        int entrada = 0;
        try {
            entrada = Integer.parseInt(lector.readLine());
        } catch (NumberFormatException e) {
            System.out.println(ANSI_UNDERLINE + "Escriba un valor correcto" + ANSI_RESET);
        }
        return entrada;
    }

    /**
     * Lee un número decimal (double) con un mensaje previo.
     * @param texto Mensaje que se mostrará antes de la entrada del usuario.
     * @return El número decimal ingresado por el usuario.
     * @throws IOException Si ocurre un error en la entrada.
     */
    public static double leerDoubleConTexto(String texto) throws IOException {
        double entrada = 0;
        System.out.println(texto);
        try {
            entrada = Double.parseDouble(lector.readLine());
        } catch (NumberFormatException e) {
            System.out.println(ANSI_UNDERLINE + "Escriba un valor correcto" + ANSI_RESET);
        }
        return entrada;
    }

    /**
     * Lee un número decimal (double) sin mensaje previo.
     * @return El número decimal ingresado por el usuario.
     * @throws IOException Si ocurre un error en la entrada.
     */
    public static double leerDouble() throws IOException {
        double entrada = 0;
        try {
            entrada = Double.parseDouble(lector.readLine());
        } catch (NumberFormatException e) {
            System.out.println(ANSI_UNDERLINE + "Escriba un valor correcto" + ANSI_RESET);
        }
        return entrada;
    }

    /**
     * Lee una cadena de texto con un mensaje previo.
     * @param texto Mensaje que se mostrará antes de la entrada del usuario.
     * @return La cadena de texto ingresada por el usuario.
     * @throws IOException Si ocurre un error en la entrada.
     */
    public static String leerStringConTexto(String texto) throws IOException {
        System.out.println(texto);
        return lector.readLine();
    }

    /**
     * Lee una cadena de texto sin mensaje previo.
     * @return La cadena de texto ingresada por el usuario.
     * @throws IOException Si ocurre un error en la entrada.
     */
    public static String leerString() throws IOException {
        return lector.readLine();
    }

    /**
     * Lee un número entero dentro de un rango determinado.
     * @param minimo Valor mínimo permitido.
     * @param maximo Valor máximo permitido.
     * @return El número ingresado por el usuario dentro del rango especificado.
     * @throws IOException Si ocurre un error en la entrada.
     */
    public static int leerNumeroEntre(int minimo, int maximo) throws IOException {
        int entrada = 0;
        System.out.println("Escriba un número entre " + minimo + " y " + maximo);
        try {
            entrada = Integer.parseInt(lector.readLine());  
        } catch (NumberFormatException e) {
            System.out.println(ANSI_UNDERLINE + "Escriba un valor correcto" + ANSI_RESET);
        }
        if (entrada < minimo || entrada > maximo) {
            System.out.println("Entrada inválida");
        }
        return entrada;
    }

    /**
     * Genera un número específico de líneas en blanco en la salida de la consola.
     * @param numeroEspacios Número de líneas en blanco a imprimir.
     */
    public static void espacios(int numeroEspacios) {
        System.out.println("\n".repeat(numeroEspacios));
    }

    /**
     * Pausa la ejecución del programa hasta que el usuario presione "Intro".
     * @param continuar Cadena de texto que captura la entrada del usuario.
     * @return La cadena ingresada por el usuario.
     * @throws IOException Si ocurre un error en la entrada.
     */
    public static String continuar(String continuar) throws IOException {
        continuar = Utilidades.leerStringConTexto("Pulse intro para continuar");
        return continuar;
    }

    public static void llevarInfoAFichero(String ruta, String contenido){
        try {
            FileWriter escritor = new FileWriter(ruta, true);
            escritor.write(contenido);
            escritor.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}