package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Clase que recogo métodos útiles que tienen funciones muy usadas que de otra forma repetiria en las clases una y otra vez
 * @author Iván Bertolo García
 * @version 1.0
 */
public class Utilidades{

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

     static BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

     public static int leerEnteroConTexto(String texto)throws IOException{
        int entrada = 0;
        System.out.println(texto);
        try {
            entrada = Integer.parseInt(lector.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Escriba un valor correcto");
        }
        
        return entrada;

    }

    public static int leerEntero()throws IOException{
        int entrada = 0;
        try {
            entrada = Integer.parseInt(lector.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Escriba un valor correcto");
        }
        
        return entrada;

    }

    public static double leerDoubleConTexto(String texto)throws IOException{
        double entrada = 0;
        System.out.println(texto);
        try {
            entrada = Double.parseDouble(lector.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Escriba un valor correcto");
        }
        
        return entrada;

    }

    public static double leerDouble()throws IOException{
        double entrada = 0;
        try {
            entrada = Double.parseDouble(lector.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Escriba un valor correcto");
        }
        
        return entrada;

    }

    public static String leerStringConTexto(String texto)throws IOException{
        System.out.println(texto);

        return  lector.readLine();
    }

    public static String leerString()throws IOException{

        return  lector.readLine();
    }

    public static boolean leerYCompararString(String patron, String mensaje, String MensajeError)throws IOException{

        String entrada;
        boolean salir = false;
        while (!salir) {
            entrada = leerStringConTexto(mensaje);
            if (entrada.toUpperCase().matches(patron)) {  // patron de Matricula: "^[0-9]{4}[^AEIOUÑQ]{3}$";
                salir = true;
            }else{
                System.out.println(MensajeError);
            }
        }
        
        return true;
    }

    public static int leerNumeroEntre(int minimo, int maximo)throws IOException{
        int entrada = 0;
        System.out.println("Escriba un número entre "+minimo+" y "+maximo);
        try {
            entrada = Integer.parseInt(lector.readLine());  
        } catch (NumberFormatException e) {
            System.out.println("Escriba un valor correcto");
        }
        if (entrada<minimo || entrada>maximo) {
            System.out.println("Entrada inválida");
        }
        return entrada;

    }

    /**
     * Método para meter espacio entre líneas
     */
    public static void espacios(){

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
    }

    /**
     * Metodo que uso en varias ocasiones para poder hacer una pausa entre suceso y suceso del juego
     * @param lector BufferedReader para leer la entrada del usuario.
     * @param continuar recoge un String que será leido
     * @return devuelve el mismo String pero con el valor escrito por el usuario
     * @throws IOException Si ocurre un error al leer la entrada del usuario.
     */
    public static String continuar(String continuar)throws IOException{

        continuar = Utilidades.leerStringConTexto("Pulse intro para continuar");

        return continuar;
    }



}