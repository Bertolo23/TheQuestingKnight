package Personajes;
import java.io.IOException;
import Interfaz.Menus;
import Misiones.TablonMisiones;
import Tienda.Tienda;
import util.Utilidades;

public class AccionesPersonajes {
    
    private static final String ANSI_UNDERLINE = "\u001B[4m";
    private static final String ANSI_RESET = "\u001B[0m";

    /**
     * Método que recoge todas las acciones de la clase luchador
     * @param luchador
     * @param opcion
     * @throws IOException
     */
    public static void accionesLuchador(Luchador luchador, String opcion)throws IOException{
        luchador.introduccionLuchador();
        String continuar = Utilidades.continuar(opcion);
        Utilidades.espacios();
        boolean salirLuchador = false;
           
            do {
                salirLuchador = luchador.condiccionesVictoria(salirLuchador);
                
                    // ------------------------------------------------------------------LUCHADOR/MENU ACCIONES-----------------------------------------------------------------------
                    int eleccionAccion = 0;
                    eleccionAccion = Menus.menuAcciones(eleccionAccion, luchador);
        
                switch (eleccionAccion) {
                    case 1:// ------------------------------------------------------------------LUCHADOR/ENTRENAMIENTO-----------------------------------------------------------------------
                            luchador.entrenamientoLuchador(luchador);
                        break;
                    case 2:// ------------------------------------------------------------------LUCHADOR/TIENDA-----------------------------------------------------------------------
                            Tienda.tiendaDeObjetos(luchador);
                        break;
                    case 3:// ------------------------------------------------------------------LUCHADOR/MISIONES-----------------------------------------------------------------------
                            TablonMisiones.tablonMisionesLuchador(luchador);
                        break;
                    case 4:// ------------------------------------------------------------------LUCHADOR/STATS-----------------------------------------------------------------------
                            luchador.enseñarEstadisticasLuchador();
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
    }
}
