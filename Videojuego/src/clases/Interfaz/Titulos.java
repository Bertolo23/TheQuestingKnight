package clases.Interfaz;

import util.Utilidades;

/**
*  Clase que guarda todos los títulos de las diferentes secciones del Juego.
 * @author Iván Bertolo García
 * @version 2.0
 */
public class Titulos {

    /**
     * El uso del método repeat funciona escribiendo primero en formato String lo que quieres repetir, en mi caso un espacio " "
     * y como parametro las veces que lo quieres repetir, en mi caso una variable int que le doy un valor específico.
     */

     public static void imprimirCuadroTexto(String[] texto) {
        int ancho = 0;
        int margen = 30;
        for (String linea : texto) {
            if (linea.length() > ancho) {
                ancho = linea.length();
            }
        }

        System.out.println(" ".repeat(margen)+ Utilidades.ANSI_BOLD+"╔" + "═".repeat(ancho + 2) + "╗"); // Imprimir la parte superior del cuadro

        for (String linea : texto) {
            System.out.println(" ".repeat(margen) +"║ " + linea + " ".repeat(ancho - linea.length()) + " ║");  // Imprimir el texto dentro del cuadro
        }

        System.out.println(" ".repeat(margen) +"╚" + "═".repeat(ancho + 2) + "╝"+Utilidades.ANSI_RESET);  // Imprimir la parte inferior del cuadro
    }

    /**
     * Método para encuadrar textos de arrays de Strings.
     * @param texto Array de String que va a ser encuadrado.
     */
    public static void imprimirCuadroTextoInicial(String[] texto) {
        int ancho = 0;
        int margen = 30;
        for (String linea : texto) {
            if (linea.length() > ancho) {
                ancho = linea.length();
            }
        }

        System.out.println(" ".repeat(margen) +Utilidades.ANSI_YELLOW+"╔" + "═".repeat(ancho + 2) + "╗"); // Imprimir la parte superior del cuadro

        for (String linea : texto) {
            System.out.println(" ".repeat(margen) +"║ " + linea + " ".repeat(ancho - linea.length()) + " ║");  // Imprimir el texto dentro del cuadro
        }

        System.out.println(" ".repeat(margen) +"╚" + "═".repeat(ancho + 2) + "╝"+Utilidades.ANSI_RESET);  // Imprimir la parte inferior del cuadro
    }

    // Título Menu Acciones.
    public static void tituloMenuAcciones(){
        int margen = 50;
        System.out.println(Utilidades.ANSI_PURPLE+" ".repeat(margen) +"  __  __ _____ _   _ _   _   ____  _____      _    ____ ____ ___ ___  _   _ _____ ____  \r\n" + //
                                       " ".repeat(margen) +" |  \\/  | ____| \\ | | | | | |  _ \\| ____|    / \\  / ___/ ___|_ _/ _ \\| \\ | | ____/ ___| \r\n" + //
                                       " ".repeat(margen) +" | |\\/| |  _| |  \\| | | | | | | | |  _|     / _ \\| |  | |    | | | | |  \\| |  _| \\___ \\ \r\n" + //
                                       " ".repeat(margen) +" | |  | | |___| |\\  | |_| | | |_| | |___   / ___ \\ |__| |___ | | |_| | |\\  | |___ ___) |\r\n" + //
                                       " ".repeat(margen) +" |_|  |_|_____|_| \\_|\\___/  |____/|_____| /_/   \\_\\____\\____|___\\___/|_| \\_|_____|____/ \r\n"+Utilidades.ANSI_RESET  //
                            );
    }

    // Título del Campo de entrenamiento.
    public static void tituloEntrenamiento(){
        int margen = 30;
        System.out.println(Utilidades.ANSI_PURPLE+" ".repeat(margen) +"   ____    _    __  __ ____   ___    ____  _____   _____ _   _ _____ ____  _____ _   _    _    __  __ ___ _____ _   _ _____ ___  \r\n" + //
                                       " ".repeat(margen) + "  / ___|  / \\  |  \\/  |  _ \\ / _ \\  |  _ \\| ____| | ____| \\ | |_   _|  _ \\| ____| \\ | |  / \\  |  \\/  |_ _| ____| \\ | |_   _/ _ \\ \r\n" + //
                                       " ".repeat(margen) + " | |     / _ \\ | |\\/| | |_) | | | | | | | |  _|   |  _| |  \\| | | | | |_) |  _| |  \\| | / _ \\ | |\\/| || ||  _| |  \\| | | || | | |\r\n" + //
                                       " ".repeat(margen) + " | |___ / ___ \\| |  | |  __/| |_| | | |_| | |___  | |___| |\\  | | | |  _ <| |___| |\\  |/ ___ \\| |  | || || |___| |\\  | | || |_| |\r\n" + //
                                       " ".repeat(margen) + "  \\____/_/   \\_\\_|  |_|_|    \\___/  |____/|_____| |_____|_| \\_| |_| |_| \\_\\_____|_| \\_/_/   \\_\\_|  |_|___|_____|_| \\_| |_| \\___/ \r\n" + //
                                       " ".repeat(margen) + "                                                                                                                                 "+Utilidades.ANSI_RESET);    
        System.out.println();
        System.out.println();
        margen = 65;
        System.out.println(" ".repeat(margen) +"Enhorabuena has optenido un punto de experiencia");
    }
    

   // Título del Juego más una breve descripción.
    public static void tituloInicio(){
        int margen = 60;
        System.out.println(Utilidades.ANSI_YELLOW+ " ".repeat(margen) +" _____  _   _  _____   _   __ _____  _   _  _____ \r\n" + //
                                        " ".repeat(margen) +"|_   _|| | | ||  ___| | | / /|_   _|| \\ | ||  __ \\\r\n" + //
                                        " ".repeat(margen) +"  | |  | |_| || |__   | |/ /   | |  |  \\| || |  \\/\r\n" + //
                                        " ".repeat(margen) +"  | |  |  _  ||  __|  |    \\   | |  | . ` || | __ \r\n" + //
                                        " ".repeat(margen) +"  | |  | | | || |___  | |\\  \\ _| |_ | |\\  || |_\\ \\\r\n" + //
                                        " ".repeat(margen) +"  \\_/  \\_| |_/\\____/  \\_| \\_/ \\___/ \\_| \\_/ \\____/\r\n" + //
                                        Utilidades.ANSI_RESET);
        String[]texto ={"En este Juego podrás elegir un personaje único que tendra unas estadísticas propias junto con misiones personalizadas.",
                        "También tendrás la capacidad de entrenar o comprar objetos en la tienda para mejorar tus estadísticas.",
                        "El objetivo es convertirse en rey o morir intentandolo. Suerte!!"
                        };
                        imprimirCuadroTextoInicial(texto);

    }

    // Título de la tienda.
    public static void tituloTienda(){

        int margen = 70;
        System.out.println(Utilidades.ANSI_PURPLE+" ".repeat(margen) +"  _____ ___ _____ _   _ ____    _    \r\n" + //
                                       " ".repeat(margen) +" |_   _|_ _| ____| \\ | |  _ \\  / \\   \r\n" + //
                                       " ".repeat(margen) +"   | |  | ||  _| |  \\| | | | |/ _ \\  \r\n" + //
                                       " ".repeat(margen) +"   | |  | || |___| |\\  | |_| / ___ \\ \r\n" + //
                                       " ".repeat(margen) +"   |_| |___|_____|_| \\_|____/_/   \\_\\\r\n"+Utilidades.ANSI_RESET  //
        );
    }

    // Título de la opción 4 del menu de acciones en la que se muestran tus estadísticas.
    public static void tituloEstadisticas(){
        int margen = 55;
        System.out.println(Utilidades.ANSI_PURPLE+" ".repeat(margen) +"  _____ ____ _____  _    ____   __ ____ _____ ___ ____    _    ____  \r\n" + //
                                       " ".repeat(margen) +" | ____/ ___|_   _|/ \\  |  _ \\ /_// ___|_   _|_ _/ ___|  / \\  / ___| \r\n" + //
                                       " ".repeat(margen) +" |  _| \\___ \\ | | / _ \\ | | | |_ _\\___ \\ | |  | | |     / _ \\ \\___ \\ \r\n" + //
                                       " ".repeat(margen) +" | |___ ___) || |/ ___ \\| |_| || | ___) || |  | | |___ / ___ \\ ___) |\r\n" + //
                                       " ".repeat(margen) +" |_____|____/ |_/_/   \\_\\____/|___|____/ |_| |___\\____/_/   \\_\\____/ \r\n" + //
                                       " ".repeat(margen) +"                                                                     "+Utilidades.ANSI_RESET);
    }

     // Título del Tablón de Misiones.
     public static void tablonMisiones(){
        int margen = 40;
        System.out.println(Utilidades.ANSI_PURPLE+  " ".repeat(margen) + " _____  _    ____  _     ___  _   _   ____  _____   __  __ ___ ____ ___ ___  _   _ _____ ____  \r\n" + //
                                        " ".repeat(margen) +" |_   _|/ \\  | __ )| |   / _ \\| \\ | | |  _ \\| ____| |  \\/  |_ _/ ___|_ _/ _ \\| \\ | | ____/ ___| \r\n" + //
                                        " ".repeat(margen) +"   | | / _ \\ |  _ \\| |  | | | |  \\| | | | | |  _|   | |\\/| || |\\___ \\| | | | |  \\| |  _| \\___ \\ \r\n" + //
                                        " ".repeat(margen) +"   | |/ ___ \\| |_) | |__| |_| | |\\  | | |_| | |___  | |  | || | ___) | | |_| | |\\  | |___ ___) |\r\n" + //
                                        " ".repeat(margen) +"   |_/_/   \\_\\____/|_____\\___/|_| \\_| |____/|_____| |_|  |_|___|____/___\\___/|_| \\_|_____|____/ \r\n" + //
                                        " ".repeat(margen) +"                                                                                                "+Utilidades.ANSI_RESET);

    }

    // Título del Resumen de la partida.
    public static void tituloResumenPartida(){
        int margen = 40;
        System.out.println(Utilidades.ANSI_PURPLE+  " ".repeat(margen) +"  ____  _____ ____  _   _ __  __ _____ _   _   ____  _____   ____   _    ____ _____ ___ ____    _    \r\n" + //
                                                    " ".repeat(margen) +" |  _ \\| ____/ ___|| | | |  \\/  | ____| \\ | | |  _ \\| ____| |  _ \\ / \\  |  _ \\_   _|_ _|  _ \\  / \\   \r\n" + //
                                                    " ".repeat(margen) +" | |_) |  _| \\___ \\| | | | |\\/| |  _| |  \\| | | | | |  _|   | |_) / _ \\ | |_) || |  | || | | |/ _ \\  \r\n" + //
                                                    " ".repeat(margen) +" |  _ <| |___ ___) | |_| | |  | | |___| |\\  | | |_| | |___  |  __/ ___ \\|  _ < | |  | || |_| / ___ \\ \r\n" + //
                                                    " ".repeat(margen) +" |_| \\_\\_____|____/ \\___/|_|  |_|_____|_| \\_| |____/|_____| |_| /_/   \\_\\_| \\_\\|_| |___|____/_/   \\_\\\r\n" + //
                                                    " ".repeat(margen) +"                                                                                                     "+Utilidades.ANSI_RESET);
    }
}
