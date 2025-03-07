package Personajes;
import java.io.IOException;
import Interfaz.Menus;
import Misiones.TablonMisiones;
import Tienda.Tienda;
import util.Utilidades;
/**
 * Clase que recoge las acciones de cada personaje en un swicth
 * @author Iván Bertolo García
 * @version 2.0
 */
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
                            luchador.entrenamientoLuchador();
                        break;
                    case 2:// ------------------------------------------------------------------LUCHADOR/TIENDA-----------------------------------------------------------------------
                            Tienda.tiendaDeObjetos(luchador);
                        break;
                    case 3:// ------------------------------------------------------------------LUCHADOR/MISIONES-----------------------------------------------------------------------
                            TablonMisiones.tablonMisiones(luchador);
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

    /**
     * Método que recoge todas las acciones de la clase Asesino
     * @param luchador
     * @param opcion
     * @throws IOException
     */
    public static void accionesAsesino(Asesino asesino, String opcion)throws IOException{
        asesino.introduccionAsesino();
        String continuar = Utilidades.continuar(opcion);
        Utilidades.espacios();
        boolean salirAsesino = false;
           
            do {
                salirAsesino = asesino.condiccionesVictoria(salirAsesino);
                
                    // ------------------------------------------------------------------ASESINO/MENU ACCIONES-----------------------------------------------------------------------
                    int eleccionAccion = 0;
                    eleccionAccion = Menus.menuAcciones(eleccionAccion, asesino);
        
                switch (eleccionAccion) {
                    case 1:// ------------------------------------------------------------------ASESINO/ENTRENAMIENTO-----------------------------------------------------------------------
                            asesino.entrenamientoAsesino();
                        break;
                    case 2:// ------------------------------------------------------------------ASESINO/TIENDA-----------------------------------------------------------------------
                            Tienda.tiendaDeObjetos(asesino);
                        break;
                    case 3:// ------------------------------------------------------------------ASESINO/MISIONES-----------------------------------------------------------------------
                            TablonMisiones.tablonMisiones(asesino);
                        break;
                    case 4:// ------------------------------------------------------------------ASESINO/STATS-----------------------------------------------------------------------
                            asesino.enseñarEstadisticasAsesino();
                        break;
                    case 5:// ------------------------------------------------------------------ASESINO/SALIR-----------------------------------------------------------------------
                    salirAsesino=true;
                        break;
                    default:
                        System.out.println(ANSI_UNDERLINE+"Escriba una opción válida(1-5)"+ANSI_RESET);
                        System.out.println();
                        System.out.println();
                        break;
                }                                   
            } while (salirAsesino==false);
            salirAsesino = true;
    }

    public static void accionesTanque(Tanque tanque, String opcion)throws IOException{
        tanque.introduccionTanque();
        String continuar = Utilidades.continuar(opcion);
        Utilidades.espacios();
        boolean salirTanque = false;
           
            do {
                salirTanque = tanque.condiccionesVictoria(salirTanque);
                
                    // ------------------------------------------------------------------TANQUE/MENU ACCIONES-----------------------------------------------------------------------
                    int eleccionAccion = 0;
                    eleccionAccion = Menus.menuAcciones(eleccionAccion, tanque);
        
                switch (eleccionAccion) {
                    case 1:// ------------------------------------------------------------------TANQUE/ENTRENAMIENTO-----------------------------------------------------------------------
                            tanque.entrenamientoTanque();
                        break;
                    case 2:// ------------------------------------------------------------------TANQUE/TIENDA-----------------------------------------------------------------------
                            Tienda.tiendaDeObjetos(tanque);
                        break;
                    case 3:// ------------------------------------------------------------------TANQUE/MISIONES-----------------------------------------------------------------------
                            TablonMisiones.tablonMisiones(tanque);
                        break;
                    case 4:// ------------------------------------------------------------------TANQUE/STATS-----------------------------------------------------------------------
                            tanque.enseñarEstadisticasTanque();
                        break;
                    case 5:// ------------------------------------------------------------------TANQUE/SALIR-----------------------------------------------------------------------
                    salirTanque=true;
                        break;
                    default:
                        System.out.println(ANSI_UNDERLINE+"Escriba una opción válida(1-5)"+ANSI_RESET);
                        System.out.println();
                        System.out.println();
                        break;
                }                                   
            } while (salirTanque==false);
            salirTanque = true;
    }

    public static void accionesMago(Mago mago, String opcion)throws IOException{
        mago.introduccionMago();
        String continuar = Utilidades.continuar(opcion);
        Utilidades.espacios();
        boolean salirMago = false;
           
            do {
                salirMago = mago.condiccionesVictoria(salirMago);
                
                    // ------------------------------------------------------------------MAGO/MENU ACCIONES-----------------------------------------------------------------------
                    int eleccionAccion = 0;
                    eleccionAccion = Menus.menuAcciones(eleccionAccion, mago);
        
                switch (eleccionAccion) {
                    case 1:// ------------------------------------------------------------------MAGO/ENTRENAMIENTO-----------------------------------------------------------------------
                            mago.entrenamientoMago();
                        break;
                    case 2:// ------------------------------------------------------------------MAGO/TIENDA-----------------------------------------------------------------------
                            Tienda.tiendaDeObjetos(mago);
                        break;
                    case 3:// ------------------------------------------------------------------MAGO/MISIONES-----------------------------------------------------------------------
                            TablonMisiones.tablonMisiones(mago);
                        break;
                    case 4:// ------------------------------------------------------------------MAGO/STATS-----------------------------------------------------------------------
                            mago.enseñarEstadisticasMago();
                        break;
                    case 5:// ------------------------------------------------------------------MAGO/SALIR-----------------------------------------------------------------------
                    salirMago=true;
                        break;
                    default:
                        System.out.println(ANSI_UNDERLINE+"Escriba una opción válida(1-5)"+ANSI_RESET);
                        System.out.println();
                        System.out.println();
                        break;
                }                                   
            } while (salirMago==false);
            salirMago = true;
    }


}
