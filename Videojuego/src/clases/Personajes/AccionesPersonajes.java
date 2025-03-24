package clases.Personajes;
import java.io.IOException;
import clases.Entrenamiento.Entrenamiento;
import clases.Interfaz.Menus;
import clases.Misiones.TablonMisiones;
import clases.Tienda.Tienda;
import util.Utilidades;
/**
 * Clase que recoge las acciones de cada personaje en un swicth
 * @author Iván Bertolo García
 * @version 2.0
 */
public class AccionesPersonajes {

    /**
     * Método que recoge todas las acciones de la clase personaje
     * @param personaje objeto necesario para poder acceder a sus métodos
     * @throws IOException Si ocurre un error al leer la entrada del usuario.
     */
    public static void accionesPersonaje(Personaje personaje)throws IOException{
        personaje.introduccionPersonaje(personaje);
        String opcion ="";
        String continuar = Utilidades.continuar(opcion);
        Utilidades.espacios(6);
        boolean salir = false;
           
            do {
                salir = personaje.condiccionesVictoria();
                
                    // -----------------------------------------------------------------MENU ACCIONES-----------------------------------------------------------------------
                    int eleccionAccion = 0;
                    eleccionAccion = Menus.menuAcciones(personaje);
        
                switch (eleccionAccion) {
                    case 1:// -----------------------------------------------------------------ENTRENAMIENTO-----------------------------------------------------------------------
                            Entrenamiento.entrenamientoPersonaje(personaje);
                        break;
                    case 2:// -----------------------------------------------------------------TIENDA-----------------------------------------------------------------------
                            Tienda.tiendaDeObjetos(personaje);
                        break;
                    case 3:// -----------------------------------------------------------------MISIONES-----------------------------------------------------------------------
                            TablonMisiones.tablonMisiones(personaje);
                        break;
                    case 4:// -----------------------------------------------------------------STATS-----------------------------------------------------------------------
                            personaje.enseñarEstadisticas(personaje);
                        break;
                    case 5:// -----------------------------------------------------------------SALIR-----------------------------------------------------------------------
                            salir=true;
                        break;
                    default:
                        System.out.println(Utilidades.ANSI_UNDERLINE+"Escriba una opción válida(1-5)"+Utilidades.ANSI_RESET);
                        Utilidades.espacios(2);
                        break;
                }                                   
            } while (salir==false);
            salir = true;
    }
}
