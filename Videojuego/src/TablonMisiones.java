import java.io.BufferedReader;
import java.io.IOException;

import Utilidades.Utilidades;
/**
 * Clase que se encarga de recoger los diferentes Tablosnes de misiones de cada tipo de personaje
 */
public class TablonMisiones {
    
        // Códigos ANSI para cambiar colores en la consola
        private  final String ANSI_RESET = "\u001B[0m";
        private  final String ANSI_RED = "\u001B[31m";
        private  final String ANSI_GREEN = "\u001B[32m";
        private  final String ANSI_YELLOW = "\u001B[33m";
        private  final String ANSI_BLUE = "\u001B[34m";
        private  final String ANSI_UNDERLINE = "\u001B[4m";
        private final String ANSI_PURPLE = "\u001B[35m";

          
        /**
         * Método que se encarga de recoger el título, menú y todo sobre las misiones de Luchador, incluye las restricciones y los mensajes de error o continuar
         * @param titulo Objeto para mostrar el título del menú del Tablon de Misiones y para encuadrar las descripciones de las misiones.
         * @param menu Objeto de la clase Menú que mostrar la opciones y te dara la opción escogida 
         * @param luchador Objeto de la clase Luchador que realizará la misión
         * @param info Objeto de la clase InfoMisiones que nos envia la información especifica de cada misión
         * @throws IOException Si ocurre un error al leer la entrada del usuario.
         */
        public void tablonMisionesLuchador(Titulos titulo, Menus menu, Luchador luchador, InfoMisiones info)throws IOException{

            boolean salirTablonMisiones = false;
            
            do {
                int opcionMision = 0;
                int[]pagaMision = info.pagaMisionLuchador();
                double[]saludPerdida = info.saludPerdidaMisionLuchador();
                Misiones mision1 = new Misiones(pagaMision[0], saludPerdida[0], info.textoMision1Luchador());
                Misiones mision2 = new Misiones(pagaMision[1], saludPerdida[1], info.textoMision2Luchador());
                Misiones mision3 = new Misiones(pagaMision[2], saludPerdida[2], info.textoMision3Luchador());
                Misiones mision4 = new Misiones(pagaMision[3], saludPerdida[3], info.textoMision4Luchador());

                titulo.tablonMisiones();
                opcionMision = menu.menuMisiones();
                                                
                switch (opcionMision) {
                    case 1:// ------------------------------------------------------------------LUCHADOR/MISION1-----------------------------------------------------------------------
                           if (luchador.getVitalidad()>=8 && luchador.getFuerza()>=8) {
                                titulo.imprimirCuadroTextoInicial(mision1.getDescripcion());
                                String continuarMision = Utilidades.leerStringConTexto("Pulsa 'c' e intro para seguir con la mision u otra tecla para volver al menu de misiones");
                                System.out.println();
                                System.out.println();
                                if (continuarMision.equals("c")) {
                                    mision1.estructuraMision(mision1, luchador);
                                }else{
                                    salirTablonMisiones = true;
                                }
                           }else{
                                System.out.println(ANSI_UNDERLINE+"No puede cumplir esta misión"+ANSI_RESET+" ya que necesitaría 8 de "+ANSI_RED+"fuerza"+ANSI_RESET+" y de "+ANSI_GREEN+"vitalidad"+ANSI_RESET);
                                System.out.println();
                                System.out.println("Pulsa cualquier tecla para volver al Menú de Acciones");
                                String volverMenu = Utilidades.leerStringConTexto("Pulsa cualquier tecla para volver al Menú de Acciones");
                                salirTablonMisiones = true;
                           } 
                        break;
                    case 2:// ------------------------------------------------------------------LUCHADOR/MISION2-----------------------------------------------------------------------
                            if (luchador.getVitalidad()>=9 && luchador.getFuerza()>=8 && luchador.getAgilidad()>=7 && luchador.getCoraje()>=12) {
                                titulo.imprimirCuadroTextoInicial(mision2.getDescripcion());                                
                                String continuarMision = Utilidades.leerStringConTexto("Pulsa 'c' e intro para seguir con la mision u otra tecla para volver al menu de misiones");
                                System.out.println();
                                System.out.println();
                                if (continuarMision.equals("c")) {
                                    mision2.estructuraMision(mision2, luchador);
                                }else{
                                    salirTablonMisiones = true;
                                }
                            }else{
                                System.out.println(ANSI_UNDERLINE+"No puede cumplir esta misión"+ANSI_RESET+" ya que necesitaría 9 de "+ANSI_GREEN+"vitalidad"+ANSI_RESET+", 8 de "+ANSI_RED+"fuerza"+ANSI_RESET+", 7 de "+ANSI_YELLOW+"Agilidad "+ANSI_RESET+" y 12 de "+ANSI_PURPLE+" Coraje"+ANSI_RESET);
                                System.out.println();
                                String volverMenu = Utilidades.leerStringConTexto("Pulsa cualquier tecla para volver al Menú de Acciones");
                                salirTablonMisiones = true;
                            } 
                        break;
                    case 3:// ------------------------------------------------------------------LUCHADOR/MISION3-----------------------------------------------------------------------
                            if (luchador.getVitalidad()>=10 && luchador.getFuerza()>=8 && luchador.getAgilidad()>=9 && luchador.getPercepcionMagica()>=5) {
                                titulo.imprimirCuadroTextoInicial(mision3.getDescripcion());                                
                                String continuarMision = Utilidades.leerStringConTexto("Pulsa 'c' e intro para seguir con la mision u otra tecla para volver al menu de misiones");
                                System.out.println();
                                System.out.println();
                                if (continuarMision.equals("c")) {
                                    int probabilidadFallarMision = (int)(Math.random() * 10)+1;
                                    if (probabilidadFallarMision<=7) {
                                        mision3.estructuraMision(mision3, luchador);
                                    }
                                }else{
                                    salirTablonMisiones = true;
                                }
                            }else{
                                System.out.println(ANSI_UNDERLINE+"No puede cumplir esta misión"+ANSI_RESET+" ya que necesitaría 10 de "+ANSI_GREEN+"vitalidad"+ANSI_RESET+", 8 de "+ANSI_RED+"fuerza"+ANSI_RESET+", 9 de "+ANSI_YELLOW+"Agilidad "+ANSI_RESET+"y 5 de "+ANSI_BLUE+"Percepción Mágica "+ANSI_RESET);
                                System.out.println();
                                String volverMenu = Utilidades.leerStringConTexto("Pulsa cualquier tecla para volver al Menú de Acciones");
                                salirTablonMisiones = true;
                            } 
                        break;
                    case 4:// ------------------------------------------------------------------LUCHADOR/MISION4-----------------------------------------------------------------------
                            if (luchador.getVitalidad()>=12 && luchador.getFuerza()>=8 && luchador.getAgilidad()>=15 && luchador.getCoraje()>=13) {
                                titulo.imprimirCuadroTextoInicial(mision4.getDescripcion());                                
                                String continuarMision = Utilidades.leerStringConTexto("Pulsa 'c' e intro para seguir con la mision u otra tecla para volver al menu de misiones");
                                System.out.println();
                                System.out.println();
                                if (continuarMision.equals("c")) {
                                    mision4.estructuraMision(mision4, luchador);
                                }else{
                                    salirTablonMisiones = true;
                                }
                            }else{
                                System.out.println(ANSI_UNDERLINE+"No puede cumplir esta misión"+ANSI_RESET+" ya que necesitaría 12 de "+ANSI_GREEN+"vitalidad"+ANSI_RESET+", 8 de "+ANSI_RED+"fuerza"+ANSI_RESET+", 15 de "+ANSI_YELLOW+"Agilidad "+ANSI_RESET+" y 13 de "+ANSI_PURPLE+" Coraje"+ANSI_RESET);
                                System.out.println();
                                String volverMenu = Utilidades.leerStringConTexto("Pulsa cualquier tecla para volver al Menú de Acciones");
                                salirTablonMisiones = true;
                            }
                        break;
                    case 5:
                            salirTablonMisiones=true;
                        break;
                    default:
                            System.out.println("Escriba una opción válida (1-5)");
                            System.out.println();
                            System.out.println();
                        break;
                }
                System.out.println();
                System.out.println();
            } while (salirTablonMisiones==false);
        
    }
}
