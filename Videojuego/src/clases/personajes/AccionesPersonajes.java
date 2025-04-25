package clases.personajes;
import java.io.IOException;

import clases.estadísticas.GestionEstadisticas;
import clases.interfaz.*;
import clases.misiones.TablonMisiones;
import clases.tienda.Tienda;
import clases.entrenamiento.Entrenamiento;
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
        Utilidades.continuar("continuar");
        Utilidades.espacios(6);
        boolean salir = false;
           
            do {
                if (personaje.condiccionesFinalizacion() == true) {
                    salir = true;
                    if (personaje.condiccionesVictoria() == true) {
                        Titulos.nombramiento();
                        Titulos.tituloVictoria();
                    }else{
                        Titulos.calavera();
                        Titulos.GameOver();
                    }
                    Utilidades.espacios(3);
                    Utilidades.leerString("Pulsa intro para ir al menú de inicio");
                }else{
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
                                GestionEstadisticas.enseñarEstadisticas(personaje);
                            break;
                        case 5:// -----------------------------------------------------------------STATS-----------------------------------------------------------------------
                                personaje.mostrarInventario();
                        break;
                        case 6:// -----------------------------------------------------------------SALIR-----------------------------------------------------------------------
                                salir=true;
                            break;
                        default:
                            System.out.println(Utilidades.ANSI_UNDERLINE+"Escriba una opción válida(1-5)"+Utilidades.ANSI_RESET);
                            Utilidades.espacios(2);
                            break;
                    }   
                }                                   
            } while (salir==false);
    }
}
