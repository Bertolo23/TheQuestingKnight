package clases.misiones;
import java.io.IOException;
import java.util.ArrayList;

import clases.interfaz.*;
import clases.personajes.ConstantesPersonaje;
import clases.personajes.Personaje;
import clases.tienda.*;
import clases.estadísticas.GestionEstadisticas;
import util.Utilidades;

/**
 * Clase que se encarga de recoger los diferentes Tablosnes de misiones de cada tipo de personaje
 * @author Iván Bertolo García
 * @version 2.0
 */
public class TablonMisiones {
          
        /**
         * Método que se encarga de recoger el título, menú y todo sobre las misiones de personaje, incluye las restricciones y los mensajes de error o continuar
         * @param personaje Objeto de la clase personaje que realizará la misión
         * @throws IOException Si ocurre un error al leer la entrada del usuario.
         */
        public static void tablonMisiones(Personaje personaje)throws IOException{
            ArrayList<ObjetoTienda> listaObjetos = Tienda.arrayObjetosTienda();
            String nombreEstadisticaUnica = GestionEstadisticas.nombreEstadisticaUnica(personaje);
            int valorEstadisticaUnica = GestionEstadisticas.valorEstadisticaUnica(personaje);
            boolean salirTablonMisiones = false;
            do {
                if(personaje.condiccionesVictoria() == true){
                    salirTablonMisiones = true;
                }else{
                    int opcionMision = 0;
                    int[]pagaMision = InfoMisiones.pagaMision();
                    double[]saludPerdida = InfoMisiones.saludPerdidaMision();
                    Misiones mision1 = new Misiones(pagaMision[0], saludPerdida[0], InfoMisiones.textoMision1());
                    Misiones mision2 = new Misiones(pagaMision[1], saludPerdida[1], InfoMisiones.textoMision2());
                    Misiones mision3 = new Misiones(pagaMision[2], saludPerdida[2], InfoMisiones.textoMision3());
                    Misiones mision4 = new Misiones(pagaMision[3], saludPerdida[3], InfoMisiones.textoMision4());
    
                    Titulos.tablonMisiones();
                    opcionMision = Menus.menuMisiones(personaje);
                                                    
                    switch (opcionMision) {
                        case 1:// ------------------------------------------------------------------personaje/MISION1-----------------------------------------------------------------------
                               if (personaje.getVitalidad()>=8 && personaje.getFuerza()>=8) {
                                    Titulos.imprimirCuadroTexto(mision1.getDescripcion(), 30, Utilidades.ANSI_CYAN);
                                    String continuarMision = Utilidades.leerString("Pulsa 'c' e intro para seguir con la mision u otra tecla para volver al menu de misiones");
                                    Utilidades.espacios(2);
                                    if (continuarMision.equals("c")) {
                                        mision1.estructuraMision(mision1, personaje, ConstantesPersonaje.enemigo1, listaObjetos);
                                    }
                               }else{
                                    System.out.println(Utilidades.ANSI_UNDERLINE+"No puede cumplir esta misión"+Utilidades.ANSI_RESET+" ya que necesitaría 8 de "+Utilidades.ANSI_RED+"fuerza"+Utilidades.ANSI_RESET+" y de "+Utilidades.ANSI_GREEN+"vitalidad"+Utilidades.ANSI_RESET);
                                    System.out.println();
                                    String volverMenu = Utilidades.leerString("Pulsa intro para volver al Tablón de Misiones");
                               } 
                            break;
                        case 2:// ------------------------------------------------------------------personaje/MISION2-----------------------------------------------------------------------
                                if (personaje.getVitalidad()>=9 && personaje.getFuerza()>=8 && personaje.getAgilidad()>=7 && valorEstadisticaUnica>=12) {
                                    if (personaje.getInventario().contains(listaObjetos.get(0)) && personaje.getInventario().contains(listaObjetos.get(1))) {
                                        Titulos.imprimirCuadroTexto(mision2.getDescripcion(), 30, Utilidades.ANSI_CYAN);                                
                                        String continuarMision = Utilidades.leerString("Pulsa 'c' e intro para seguir con la mision u otra tecla para volver al menu de misiones");
                                        Utilidades.espacios(2);
                                        if (continuarMision.equals("c")) {
                                            mision2.estructuraMision(mision2, personaje, ConstantesPersonaje.enemigo2, listaObjetos);
                                        }
                                    }else{
                                        System.out.println("No puede empezar la misión, necesita los objetos:\n"+listaObjetos.get(0).getNombre()+"\n"+listaObjetos.get(1).getNombre());
                                    }         
                                }else{
                                    System.out.println(Utilidades.ANSI_UNDERLINE+"No puede cumplir esta misión"+Utilidades.ANSI_RESET+" ya que necesitaría 9 de "+Utilidades.ANSI_GREEN+"vitalidad"+Utilidades.ANSI_RESET+", 8 de "+Utilidades.ANSI_RED+"fuerza"+Utilidades.ANSI_RESET+", 7 de "+Utilidades.ANSI_YELLOW+"Agilidad "+Utilidades.ANSI_RESET+" y 12 de "+Utilidades.ANSI_PURPLE+nombreEstadisticaUnica+Utilidades.ANSI_RESET);
                                    System.out.println();
                                    String volverMenu = Utilidades.leerString("Pulsa intro para volver al Tablón de Misiones");                            } 
                            break;
                        case 3:// ------------------------------------------------------------------personaje/MISION3-----------------------------------------------------------------------
                                if (personaje.getVitalidad()>=10 && personaje.getFuerza()>=8 && personaje.getAgilidad()>=9 && personaje.getPercepcionMagica()>=5) {
                                    if (personaje.getInventario().contains(listaObjetos.get(0)) && personaje.getInventario().contains(listaObjetos.get(1)) && personaje.getInventario().contains(listaObjetos.get(2))) {
                                        Titulos.imprimirCuadroTexto(mision2.getDescripcion(), 30, Utilidades.ANSI_CYAN);                                
                                        String continuarMision = Utilidades.leerString("Pulsa 'c' e intro para seguir con la mision u otra tecla para volver al menu de misiones");
                                        Utilidades.espacios(2);
                                        if (continuarMision.equals("c")) {
                                            int probabilidadFallarMision = (int)(Math.random() * 10)+1;
                                            if (probabilidadFallarMision<=7) {
                                                mision3.estructuraMision(mision3, personaje, ConstantesPersonaje.enemigo3, listaObjetos);
                                            }else{
                                                System.out.println("Misión fallada");
                                            }
                                        }
                                    }else{
                                        System.out.println("No puede empezar la misión, necesita los objetos:\n"+listaObjetos.get(0).getNombre()+"\n"+listaObjetos.get(1).getNombre()+"\n"+listaObjetos.get(2).getNombre());
                                    }
                                }else{
                                    System.out.println(Utilidades.ANSI_UNDERLINE+"No puede cumplir esta misión"+Utilidades.ANSI_RESET+" ya que necesitaría 10 de "+Utilidades.ANSI_GREEN+"vitalidad"+Utilidades.ANSI_RESET+", 8 de "+Utilidades.ANSI_RED+"fuerza"+Utilidades.ANSI_RESET+", 9 de "+Utilidades.ANSI_YELLOW+"Agilidad "+Utilidades.ANSI_RESET+"y 5 de "+Utilidades.ANSI_BLUE+"Percepción Mágica "+Utilidades.ANSI_RESET);
                                    System.out.println();
                                    String volverMenu = Utilidades.leerString("Pulsa intro para volver al Tablón de Misiones");                            } 
                            break;
                        case 4:// ------------------------------------------------------------------personaje/MISION4-----------------------------------------------------------------------
                                if (personaje.getVitalidad()>=12 && personaje.getFuerza()>=8 && personaje.getAgilidad()>=15 && valorEstadisticaUnica>=13) {
                                    if (personaje.getInventario().contains(listaObjetos.get(1)) && personaje.getInventario().contains(listaObjetos.get(3))) {
                                        Titulos.imprimirCuadroTexto(mision4.getDescripcion(), 30, Utilidades.ANSI_CYAN);                                
                                        String continuarMision = Utilidades.leerString("Pulsa 'c' e intro para seguir con la mision u otra tecla para volver al menu de misiones");
                                        Utilidades.espacios(2);
                                        if (continuarMision.equals("c")) {
                                            mision4.estructuraMision(mision4, personaje, ConstantesPersonaje.enemigo4, listaObjetos);
                                        }
                                    }else{
                                        System.out.println("No puede empezar la misión, necesita los objetos:\n"+listaObjetos.get(1).getNombre()+"\n"+listaObjetos.get(3).getNombre());
                                    }
                                }else{
                                    System.out.println(Utilidades.ANSI_UNDERLINE+"No puede cumplir esta misión"+Utilidades.ANSI_RESET+" ya que necesitaría 12 de "+Utilidades.ANSI_GREEN+"vitalidad"+Utilidades.ANSI_RESET+", 8 de "+Utilidades.ANSI_RED+"fuerza"+Utilidades.ANSI_RESET+", 15 de "+Utilidades.ANSI_YELLOW+"Agilidad "+Utilidades.ANSI_RESET+" y 13 de "+Utilidades.ANSI_PURPLE+nombreEstadisticaUnica+Utilidades.ANSI_RESET);
                                    System.out.println();
                                    String volverMenu = Utilidades.leerString("Pulsa intro para volver al Tablón de Misiones");
                                }
                            break;
                        case 5:
                                salirTablonMisiones=true;
                            break;
                        default:
                                System.out.println("Escriba una opción válida (1-5)");
                                Utilidades.espacios(2);
                            break;
                    }
                } 
                Utilidades.espacios(2);
            } while (salirTablonMisiones==false);
        
    }
}
