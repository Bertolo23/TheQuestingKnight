package Misiones;

import java.io.IOException;
import Interfaz.Menus;
import Interfaz.Titulos;
import Personajes.Asesino;
import Personajes.Luchador;
import Personajes.Mago;
import Personajes.Personaje;
import Personajes.Tanque;
import util.Utilidades;

/**
 * Clase que se encarga de recoger los diferentes Tablosnes de misiones de cada tipo de personaje
 */
public class TablonMisiones {
    
        // Códigos ANSI para cambiar colores en la consola
        private static final String ANSI_RESET = "\u001B[0m";
        private static final String ANSI_RED = "\u001B[31m";
        private static final String ANSI_GREEN = "\u001B[32m";
        private static final String ANSI_YELLOW = "\u001B[33m";
        private static final String ANSI_BLUE = "\u001B[34m";
        private static final String ANSI_UNDERLINE = "\u001B[4m";
        private static final String ANSI_PURPLE = "\u001B[35m";

          
        /**
         * Método que se encarga de recoger el título, menú y todo sobre las misiones de personaje, incluye las restricciones y los mensajes de error o continuar
         * @param titulo Objeto para mostrar el título del menú del Tablon de Misiones y para encuadrar las descripciones de las misiones.
         * @param menu Objeto de la clase Menú que mostrar la opciones y te dara la opción escogida 
         * @param personaje Objeto de la clase personaje que realizará la misión
         * @param info Objeto de la clase InfoMisiones que nos envia la información especifica de cada misión
         * @throws IOException Si ocurre un error al leer la entrada del usuario.
         */
        public static void tablonMisiones(Personaje personaje)throws IOException{
            String nombreEstadisticaUnica = "";
            int valorEstadisticaUnica = 0;
            if(personaje instanceof Luchador){
                nombreEstadisticaUnica = "Coraje";
                valorEstadisticaUnica = ((Luchador) personaje).getCoraje();
            }
            if (personaje instanceof Asesino) {
                nombreEstadisticaUnica = "Sigilo";
                valorEstadisticaUnica = ((Asesino) personaje).getSigilo();
            }
            if (personaje instanceof Tanque) {
                nombreEstadisticaUnica = "Barrera";
                valorEstadisticaUnica = ((Tanque) personaje).getBarrera();
            }
            if (personaje instanceof Mago) {
                nombreEstadisticaUnica = "Poder de Habilidad";
                valorEstadisticaUnica = ((Mago) personaje).getPoderDeHabilidad();
            }
            boolean salirTablonMisiones = false;
            
            do {
                int opcionMision = 0;
                int[]pagaMision = InfoMisiones.pagaMision();
                double[]saludPerdida = InfoMisiones.saludPerdidaMision();
                Misiones mision1 = new Misiones(pagaMision[0], saludPerdida[0], InfoMisiones.textoMision1());
                Misiones mision2 = new Misiones(pagaMision[1], saludPerdida[1], InfoMisiones.textoMision2());
                Misiones mision3 = new Misiones(pagaMision[2], saludPerdida[2], InfoMisiones.textoMision3());
                Misiones mision4 = new Misiones(pagaMision[3], saludPerdida[3], InfoMisiones.textoMision4());

                Titulos.tablonMisiones();
                opcionMision = Menus.menuMisiones();
                                                
                switch (opcionMision) {
                    case 1:// ------------------------------------------------------------------personaje/MISION1-----------------------------------------------------------------------
                           if (personaje.getVitalidad()>=8 && personaje.getFuerza()>=8) {
                                Titulos.imprimirCuadroTextoInicial(mision1.getDescripcion());
                                String continuarMision = Utilidades.leerStringConTexto("Pulsa 'c' e intro para seguir con la mision u otra tecla para volver al menu de misiones");
                                System.out.println();
                                System.out.println();
                                if (continuarMision.equals("c")) {
                                    mision1.estructuraMision(mision1, personaje);
                                }else{
                                    salirTablonMisiones = true;
                                }
                           }else{
                                System.out.println(ANSI_UNDERLINE+"No puede cumplir esta misión"+ANSI_RESET+" ya que necesitaría 8 de "+ANSI_RED+"fuerza"+ANSI_RESET+" y de "+ANSI_GREEN+"vitalidad"+ANSI_RESET);
                                System.out.println();
                                String volverMenu = Utilidades.leerStringConTexto("Pulsa intro para volver al Tablón de Misiones");
                           } 
                        break;
                    case 2:// ------------------------------------------------------------------personaje/MISION2-----------------------------------------------------------------------
                            if (personaje.getVitalidad()>=9 && personaje.getFuerza()>=8 && personaje.getAgilidad()>=7 && valorEstadisticaUnica>=12) {
                                Titulos.imprimirCuadroTextoInicial(mision2.getDescripcion());                                
                                String continuarMision = Utilidades.leerStringConTexto("Pulsa 'c' e intro para seguir con la mision u otra tecla para volver al menu de misiones");
                                System.out.println();
                                System.out.println();
                                if (continuarMision.equals("c")) {
                                    mision2.estructuraMision(mision2, personaje);
                                }else{
                                    salirTablonMisiones = true;
                                }
                            }else{
                                System.out.println(ANSI_UNDERLINE+"No puede cumplir esta misión"+ANSI_RESET+" ya que necesitaría 9 de "+ANSI_GREEN+"vitalidad"+ANSI_RESET+", 8 de "+ANSI_RED+"fuerza"+ANSI_RESET+", 7 de "+ANSI_YELLOW+"Agilidad "+ANSI_RESET+" y 12 de "+ANSI_PURPLE+nombreEstadisticaUnica+ANSI_RESET);
                                System.out.println();
                                String volverMenu = Utilidades.leerStringConTexto("Pulsa intro para volver al Tablón de Misiones");                            } 
                        break;
                    case 3:// ------------------------------------------------------------------personaje/MISION3-----------------------------------------------------------------------
                            if (personaje.getVitalidad()>=10 && personaje.getFuerza()>=8 && personaje.getAgilidad()>=9 && personaje.getPercepcionMagica()>=5) {
                                Titulos.imprimirCuadroTextoInicial(mision3.getDescripcion());                                
                                String continuarMision = Utilidades.leerStringConTexto("Pulsa 'c' e intro para seguir con la mision u otra tecla para volver al menu de misiones");
                                System.out.println();
                                System.out.println();
                                if (continuarMision.equals("c")) {
                                    int probabilidadFallarMision = (int)(Math.random() * 10)+1;
                                    if (probabilidadFallarMision<=7) {
                                        mision3.estructuraMision(mision3, personaje);
                                    }
                                }else{
                                    salirTablonMisiones = true;
                                }
                            }else{
                                System.out.println(ANSI_UNDERLINE+"No puede cumplir esta misión"+ANSI_RESET+" ya que necesitaría 10 de "+ANSI_GREEN+"vitalidad"+ANSI_RESET+", 8 de "+ANSI_RED+"fuerza"+ANSI_RESET+", 9 de "+ANSI_YELLOW+"Agilidad "+ANSI_RESET+"y 5 de "+ANSI_BLUE+"Percepción Mágica "+ANSI_RESET);
                                System.out.println();
                                String volverMenu = Utilidades.leerStringConTexto("Pulsa intro para volver al Tablón de Misiones");                            } 
                        break;
                    case 4:// ------------------------------------------------------------------personaje/MISION4-----------------------------------------------------------------------
                            if (personaje.getVitalidad()>=12 && personaje.getFuerza()>=8 && personaje.getAgilidad()>=15 && valorEstadisticaUnica>=13) {
                                Titulos.imprimirCuadroTextoInicial(mision4.getDescripcion());                                
                                String continuarMision = Utilidades.leerStringConTexto("Pulsa 'c' e intro para seguir con la mision u otra tecla para volver al menu de misiones");
                                System.out.println();
                                System.out.println();
                                if (continuarMision.equals("c")) {
                                    mision4.estructuraMision(mision4, personaje);
                                }else{
                                    salirTablonMisiones = true;
                                }
                            }else{
                                System.out.println(ANSI_UNDERLINE+"No puede cumplir esta misión"+ANSI_RESET+" ya que necesitaría 12 de "+ANSI_GREEN+"vitalidad"+ANSI_RESET+", 8 de "+ANSI_RED+"fuerza"+ANSI_RESET+", 15 de "+ANSI_YELLOW+"Agilidad "+ANSI_RESET+" y 13 de "+ANSI_PURPLE+nombreEstadisticaUnica+ANSI_RESET);
                                System.out.println();
                                String volverMenu = Utilidades.leerStringConTexto("Pulsa intro para volver al Tablón de Misiones");
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
