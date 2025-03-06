package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utilidades{

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



}