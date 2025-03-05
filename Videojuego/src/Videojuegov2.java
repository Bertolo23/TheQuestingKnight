
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Utilidades.Utilidades;
/**
 * Clase Principal donde recojo todos los métodos y hago la estructura del juego
 */
public class Videojuegov2 {

    // Códigos ANSI para cambiar colores en la consola
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_UNDERLINE = "\u001B[4m";

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

    public static void main(String[] args)throws IOException {

        /**
         * Instanción de todos los objetos necesarios
         */
        Luchador luchador = new Luchador("Luchador", 0, 7, 7, 5, 2, 5, 0, 1, 8);
        Titulos titulo = new Titulos();
        Menus menu = new Menus();
        Tienda tienda = new Tienda();
        TablonMisiones tablonMisiones = new TablonMisiones();
        InfoMisiones info = new InfoMisiones();
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        boolean salir = false;
        String continuarDescripcion = " ";
        titulo.tituloInicio();
        continuar(continuarDescripcion);
        
        do{
            String opcion = "";  
            opcion = menu.menuPersonaje();// Solo esta disponible el Luchador 
             
                switch (opcion) {
                    case "l":// ------------------------------------------------------------------LUCHADOR----------------------------------------------------------------------- 
                            luchador.introduccionLuchador();
                            String continuar = continuar(opcion);
                            espacios();
                            boolean salirLuchador = false;
                               
                                do {
                                    salirLuchador = luchador.condiccionesVictoria(salirLuchador);
                                    
                                        // ------------------------------------------------------------------LUCHADOR/MENU ACCIONES-----------------------------------------------------------------------
                                        int eleccionAccion = 0;
                                        eleccionAccion = menu.menuAcciones(eleccionAccion, titulo, luchador, titulo);
                            
                                    switch (eleccionAccion) {
                                        case 1:// ------------------------------------------------------------------LUCHADOR/ENTRENAMIENTO-----------------------------------------------------------------------
                                                luchador.entrenamientoLuchador(luchador, titulo);
                                            break;
                                        case 2:// ------------------------------------------------------------------LUCHADOR/TIENDA-----------------------------------------------------------------------
                                                tienda.tiendaDeObjetos(titulo, menu, luchador);
                                            break;
                                        case 3:// ------------------------------------------------------------------LUCHADOR/MISIONES-----------------------------------------------------------------------
                                                tablonMisiones.tablonMisionesLuchador(titulo, menu, luchador, info);
                                            break;
                                        case 4:// ------------------------------------------------------------------LUCHADOR/STATS-----------------------------------------------------------------------
                                                luchador.enseñarEstadisticasLuchador(titulo);
                                            break;
                                        case 5:// ------------------------------------------------------------------LUCHADOR/SALIR-----------------------------------------------------------------------
                                                salirLuchador=true;
                                            break;
                                        default:
                                            System.out.println(ANSI_UNDERLINE+"Escriba una opción válida(1-5)"+ANSI_RESET);
                                            System.out.println();
                                            System.out.println();
                                            break;
                                    }                                   
                                } while (salirLuchador==false);
                                salirLuchador = true;
                        break;

                        case "s":// ------------------------------------------------------------------SALIDA-----------------------------------------------------------------------
                            salir = true;
                        break;
                  
                    default:
                            System.out.println(ANSI_UNDERLINE+"Escriba una inicial de personaje por favor"+ANSI_RESET);
                            System.out.println();
                            System.out.println();
                        break;
                } 
    
        }while(salir==false);
        System.out.println("Saliendo del programa");
    }
        
}

