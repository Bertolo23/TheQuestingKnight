package clases.interfaz;
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
     * 
     * @param texto necesario para poder crear el cuadro alrededor del mismo texto
     */
     public static void imprimirCuadroTexto(String[] texto, int margen, String formato) {
        int ancho = 0;
        for (String linea : texto) {
            if (linea.length() > ancho) {
                ancho = linea.length();
            }
        }
        System.out.println(" ".repeat(margen)+ formato+"╔" + "═".repeat(ancho + 2) + "╗"); // Imprimir la parte superior del cuadro

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
        int margen = 30;
        System.out.println(
     Utilidades.ANSI_YELLOW+" ".repeat(margen) + "  _______ _    _ ______    ____  _    _ ______  _____ _______ _____ _   _  _____    _  ___   _ _____ _____ _    _ _______ \r\n" + //
                            " ".repeat(margen) + " |__   __| |  | |  ____|  / __ \\| |  | |  ____|/ ____|__   __|_   _| \\ | |/ ____|  | |/ / \\ | |_   _/ ____| |  | |__   __|\r\n" + //
                            " ".repeat(margen) + "    | |  | |__| | |__    | |  | | |  | | |__  | (___    | |    | | |  \\| | |  __   |  '/|  \\| | | || |  __| |__| |  | |   \r\n" + //
                            " ".repeat(margen) + "    | |  |  __  |  __|   | |  | | |  | |  __|  \\___ \\   | |    | | | . ` | | |_ |  |  < | . ` | | || | |_ |  __  |  | |   \r\n" + //
                            " ".repeat(margen) + "    | |  | |  | | |____  | |__| | |__| | |____ ____) |  | |   _| |_| |\\  | |__| |  | . \\| |\\  |_| || |__| | |  | |  | |   \r\n" + //
                            " ".repeat(margen) + "    |_|  |_|  |_|______|  \\___\\_\\\\____/|______|_____/   |_|  |_____|_| \\_|\\_____|  |_|\\_\\_| \\_|_____\\_____|_|  |_|  |_|   \r\n" + //
                            " ".repeat(margen) + "                                                                                                                         \r\n" + //
                            " ".repeat(margen) + "                                                                                                                         ");
        String[]texto ={"En este Juego podrás elegir un personaje único que tendra unas estadísticas propias junto con misiones personalizadas.",
                        "También tendrás la capacidad de entrenar o comprar objetos en la tienda para mejorar tus estadísticas.",
                        "El objetivo es convertirse en caballero o morir intentandolo. Suerte!!"
                        };
                        imprimirCuadroTexto(texto, 30, Utilidades.ANSI_YELLOW);

    }

    public static String tituloLuchador(){

        int margen = 65;
        String luchador = Utilidades.ANSI_PURPLE+" ".repeat(margen+2) +"_    _   _  ____ _   _    _    ____   ___  ____  \r\n" + //
                                               " ".repeat(margen) +" | |  | | | |/ ___| | | |  / \\  |  _ \\ / _ \\|  _ \\ \r\n" + //
                                               " ".repeat(margen) +" | |  | | | | |   | |_| | / _ \\ | | | | | | | |_) |\r\n" + //
                                               " ".repeat(margen) +" | |__| |_| | |___|  _  |/ ___ \\| |_| | |_| |  _ < \r\n" + //
                                               " ".repeat(margen) +" |_____\\___/ \\____|_| |_/_/   \\_\\____/ \\___/|_| \\_\\\r\n" + //
                                               " ".repeat(margen) +"                                                   ";
        return luchador;
    }

    public static String tituloAsesino() {
        int margen = 50;
        String asesino = Utilidades.ANSI_PURPLE + " ".repeat(margen) + "     _    ____  _____ ____ ___ _   _  ___  \r\n" +
                                               " ".repeat(margen) + "    / \\  / ___|| ____/ ___|_ _| \\ | |/ _ \\ \r\n" +
                                               " ".repeat(margen) + "   / _ \\ \\___ \\|  _| \\___ \\| ||  \\| | | | |\r\n" +
                                               " ".repeat(margen) + "  / ___ \\ ___) | |___ ___) | || |\\  | |_| |\r\n" +
                                               " ".repeat(margen) + " /_/   \\_\\____/|_____|____/___|_| \\_|\\___/ \r\n" +
                                               " ".repeat(margen) + "                                          ";
        return asesino;
    }

    public static String tituloTanque() {
        int margen = 50;
        String tanque = Utilidades.ANSI_PURPLE + " ".repeat(margen) + "  _____  _    _   _  ___  _   _ _____ \r\n" +
                                               " ".repeat(margen) + " |_   _|/ \\  | \\ | |/ _ \\| | | | ____|\r\n" +
                                               " ".repeat(margen) + "   | | / _ \\ |  \\| | | | | | | |  _|  \r\n" +
                                               " ".repeat(margen) + "   | |/ ___ \\| |\\  | |_| | |_| | |___ \r\n" +
                                               " ".repeat(margen) + "   |_/_/   \\_\\_| \\_|\\__\\_\\\\___/|_____|\r\n" +
                                               " ".repeat(margen) + "                                      ";
        return tanque;
    }

    public static String tituloMago() {
        int margen = 50;
        String mago = Utilidades.ANSI_PURPLE + " ".repeat(margen) + "  __  __    _    ____  ___  \r\n" +
                                               " ".repeat(margen) + " |  \\/  |  / \\  / ___|/ _ \\ \r\n" +
                                               " ".repeat(margen) + " | |\\/| | / _ \\| |  _| | | |\r\n" +
                                               " ".repeat(margen) + " | |  | |/ ___ \\ |_| | |_| |\r\n" +
                                               " ".repeat(margen) + " |_|  |_/_/   \\_\\____|\\___/ \r\n" +
                                               " ".repeat(margen) + "                            ";
        return mago;
    }
    
    // Título de la tienda.
    public static void tituloTienda(){

        int margen = 75;
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
    public static void tituloHistorialPartidas(){
        int margen = 40;
        System.out.println(Utilidades.ANSI_PURPLE+  " ".repeat(margen) +"  _   _ ___ ____ _____ ___  ____  ___    _    _       ____  _____   ____   _    ____ _____ ___ ____    _    ____  \r\n" + //
                                                    " ".repeat(margen) +" | | | |_ _/ ___|_   _/ _ \\|  _ \\|_ _|  / \\  | |     |  _ \\| ____| |  _ \\ / \\  |  _ \\_   _|_ _|  _ \\  / \\  / ___| \r\n" + //
                                                    " ".repeat(margen) +" | |_| || |\\___ \\ | || | | | |_) || |  / _ \\ | |     | | | |  _|   | |_) / _ \\ | |_) || |  | || | | |/ _ \\ \\___ \\ \r\n" + //
                                                    " ".repeat(margen) +" |  _  || | ___) || || |_| |  _ < | | / ___ \\| |___  | |_| | |___  |  __/ ___ \\|  _ < | |  | || |_| / ___ \\ ___) |\r\n" + //
                                                    " ".repeat(margen) +" |_| |_|___|____/ |_| \\___/|_| \\_\\___/_/   \\_\\_____| |____/|_____| |_| /_/   \\_\\_| \\_\\|_| |___|____/_/   \\_\\____/ \r\n" +Utilidades.ANSI_RESET);
    }

    public static void tituloResumenPartida(){
        int margen = 40;
        System.out.println(Utilidades.ANSI_PURPLE+  " ".repeat(margen) + "  ____  _____ ____  _   _ __  __ _____ _   _   ____  _____   ____   _    ____ _____ ___ ____    _    \r\n" + //
                                                    " ".repeat(margen) +" |  _ \\| ____/ ___|| | | |  \\/  | ____| \\ | | |  _ \\| ____| |  _ \\ / \\  |  _ \\_   _|_ _|  _ \\  / \\  \r\n" + //
                                                    " ".repeat(margen) +" | |_) |  _| \\___ \\| | | | |\\/| |  _| |  \\| | | | | |  _|   | |_) / _ \\ | |_) || |  | || | | |/ _ \\  \r\n" + //
                                                    " ".repeat(margen) +" |  _ <| |___ ___) | |_| | |  | | |___| |\\  | | |_| | |___  |  __/ ___ \\|  _ < | |  | || |_| / ___ \\ \r\n" + //
                                                    " ".repeat(margen) +" |_| \\_\\_____|____/ \\___/|_|  |_|_____|_| \\_| |____/|_____| |_| /_/   \\_\\_| \\_\\|_| |___|____/_/   \\_\\\r\n" + //
                                                    " ".repeat(margen) +"                                                                                                           "+Utilidades.ANSI_RESET);
    }

    public static void tituloInventario(){
        int margen = 63;
        System.out.println(Utilidades.ANSI_PURPLE+  " ".repeat(margen) +"  ___ _   ___     _______ _   _ _____  _    ____  ___ ___  \r\n" + //
                                                    " ".repeat(margen) +" |_ _| \\ | \\ \\   / / ____| \\ | |_   _|/ \\  |  _ \\|_ _/ _ \\ \r\n" + //
                                                    " ".repeat(margen) +"  | ||  \\| |\\ \\ / /|  _| |  \\| | | | / _ \\ | |_) || | | | |\r\n" + //
                                                    " ".repeat(margen) +"  | || |\\  | \\ V / | |___| |\\  | | |/ ___ \\|  _ < | | |_| |\r\n" + //
                                                    " ".repeat(margen) +" |___|_| \\_|  \\_/  |_____|_| \\_| |_/_/   \\_\\_| \\_\\___\\___/ \r\n" + //
                                                    " ".repeat(margen) +"                                                           "+ Utilidades.ANSI_RESET);
    }
    public static void nombramiento(){
        int margen = 40;
        System.out.println(Utilidades.ANSI_CYAN+
                        " ".repeat(margen) +"                                                                o .,<>., o\r\n" + Utilidades.ANSI_YELLOW+
                        " ".repeat(margen) +"                                                                |\\/\\/\\/\\/|\r\n" + //
                        " ".repeat(margen) +"                                                                '========'\r\n" + Utilidades.ANSI_PURPLE+
                        " ".repeat(margen) +"                                                                (_ SSSSSSs\r\n" + //
                        " ".repeat(margen) +"                                                                )a'`SSSSSs\r\n" + //
                        " ".repeat(margen) +"                                                               /_   SSSSSS\r\n" + //
                        " ".repeat(margen) +"                                                               .=## SSSSS\r\n" + //
                        " ".repeat(margen) +"                                                               .####  SSSSs\r\n" + //
                        " ".repeat(margen) +"                                                               ###::::SSSSS\r\n" + //
                        " ".repeat(margen) +"                                                              .;:::\"\"\"\"SSS\r\n" + //
                        " ".repeat(margen) +"                                                             .:;:'  . .  \\\\\r\n" + //
                        " ".repeat(margen) +"                                                            .::/  '     .'|\r\n" + //
                        " ".repeat(margen) +"                                                           .::( .         |\r\n" + //
                        " ".repeat(margen) +"                                                           :::)           \\\r\n" + //
                        " ".repeat(margen) +"                                                           /\\(            /\r\n" + //
                        " ".repeat(margen) +"                                                          /)            ( |\r\n" + //
                        " ".repeat(margen) +"                                                        .'  \\  .       ./ /\r\n" + //
                        " ".repeat(margen) +"                                                     _-'    |\\  .        |\r\n" + //
                        " ".repeat(margen) +"                                   _..--..   .  /\"---\\      | ` |      . |\r\n" + //
                        " ".repeat(margen) +"           -=====================,' _     \\=(*#(7.#####()   |  `/_..   , (\r\n" + //
                        " ".repeat(margen) +"                       _.-''``';'-''-) ,.  \\ '  '+/// |   .'/   \\  ``-.) \\\r\n" + //
                        " ".repeat(margen) +"                     ,'  _.-  ((    `-'  `._\\    `` \\_/_.'  )    /`-._  ) |\r\n" + //
                        " ".repeat(margen) +"                   ,'\\ ,'  _.'.`:-.    \\.-'                 /   <_L   )\"  |\r\n" + //
                        " ".repeat(margen) +"                 _/   `._,' ,')`;  `-'`'                    |     L  /    /\r\n" + //
                        " ".repeat(margen) +"                / `.   ,' ,|_/ / \\                          (    <_-'     \\\r\n" + //
                        " ".repeat(margen) +"                \\ / `./  '  / /,' \\                        /|`         `. |\r\n" + //
                        " ".repeat(margen) +"                )\\   /`._   ,'`._.-\\                       |)            \\'\r\n" + //
                        " ".repeat(margen) +"               /  `.'    )-'.-,' )__)                      |\\            `|\r\n" + //
                        " ".repeat(margen) +"              : /`. `.._(--.`':`':/ \\                      ) \\             \\\r\n" + //
                        " ".repeat(margen) +"              |::::\\     ,'/::;-))  /                      ( )`.            |\r\n" + //
                        " ".repeat(margen) +"              ||:::::  . .::':  :`-(                       |/    .          |\r\n" + //
                        " ".repeat(margen) +"              ||::::|  . :|  |==[]=:                       .        -       \\\r\n" + //
                        " ".repeat(margen) +"              |||:::|  : ||  :  |  |                      /\\           `     |\r\n" + //
                        " ".repeat(margen) +"  ___ ___     '|;:::|  | |'   \\=[]=|                     /  \\                \\\r\n" + //
                        " ".repeat(margen) +" |   /_  ||``|||:::::  | ;    | |  |                     \\_.'\\_               `-.\r\n" + //
                        " ".repeat(margen) +" :   \\_``[]--[]|::::'\\_;'     )-'..`._                 .-'\\``:: ` .              \\\r\n" + //
                        " ".repeat(margen) +"  \\___.>`''-.||:.__,'         |_______`>              <_____:::.         . . \\  _/\r\n" + //
                        " ".repeat(margen) +"                                                            `+ : :......   '''"+Utilidades.ANSI_RESET);
    }

    public static void tituloVictoria(){
        int margen = 45;
        System.out.println(Utilidades.ANSI_BLUE+" ".repeat(margen)  +"██╗  ██╗ █████╗ ███████╗     ██████╗  █████╗ ███╗   ██╗ █████╗ ██████╗  ██████╗ ██╗\r\n" + //
                                                  " ".repeat(margen)+"██║  ██║██╔══██╗██╔════╝    ██╔════╝ ██╔══██╗████╗  ██║██╔══██╗██╔══██╗██╔═══██╗██║\r\n" + //
                                                  " ".repeat(margen)+"███████║███████║███████╗    ██║  ███╗███████║██╔██╗ ██║███████║██║  ██║██║   ██║██║\r\n" + //
                                                  " ".repeat(margen)+"██╔══██║██╔══██║╚════██║    ██║   ██║██╔══██║██║╚██╗██║██╔══██║██║  ██║██║   ██║╚═╝\r\n" + //
                                                  " ".repeat(margen)+"██║  ██║██║  ██║███████║    ╚██████╔╝██║  ██║██║ ╚████║██║  ██║██████╔╝╚██████╔╝██╗\r\n" + //
                                                  " ".repeat(margen)+"╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝     ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝╚═════╝  ╚═════╝ ╚═╝\r\n" +Utilidades.ANSI_RESET+ //
                                                  " ".repeat(margen)+"                                                                                   ");
    
    }

    public static void calavera(){
        int margen = 60;
        System.out.println(
                                          " ".repeat(margen)+"                       ______\r\n" + //
                                        " ".repeat(margen) +"                    .-\"      \"-.\r\n" + //
                                        " ".repeat(margen) +"                   /            \\\r\n" + //
                                        " ".repeat(margen) +"       _          |              |          _\r\n" + //
                                        " ".repeat(margen) +"      ( \\         |,  .-.  .-.  ,|         / )\r\n" + //
                                        " ".repeat(margen) +"       > \"=._     | )(__/  \\__)( |     _.=\" <\r\n" + //
                                        " ".repeat(margen) +"      (_/\"=._\"=._ |/     /\\     \\| _.=\"_.=\"\\_)\r\n" + //
                                        " ".repeat(margen) +"             \"=._ (_     ^^     _)\"_.=\"\r\n" + //
                                        " ".repeat(margen) +"                 \"=\\__|IIIIII|__/=\"\r\n" + //
                                        " ".repeat(margen) +"                _.=\"| \\IIIIII/ |\"=._\r\n" + //
                                        " ".repeat(margen) +"      _     _.=\"_.=\"\\          /\"=._\"=._     _\r\n" + //
                                        " ".repeat(margen) +"     ( \\_.=\"_.=\"     `--------`     \"=._\"=._/ )\r\n" + //
                                        " ".repeat(margen) +"      > _.=\"                            \"=._ <\r\n" + //
                                        " ".repeat(margen) +"     (_/                                   \\_)");
    }

    public static void GameOver(){
        int margen = 50;
        System.out.println();
        System.out.println(Utilidades.ANSI_RED+" ".repeat(margen) + "  ▄████ ▄▄▄      ███▄ ▄███▓█████        ▒█████  ██▒   █▓█████ ██▀███        ");
                            System.out.println(" ".repeat(margen) +" ██▒ ▀█▒████▄   ▓██▒▀█▀ ██▓█   ▀       ▒██▒  ██▓██░   █▓█   ▀▓██ ▒ ██▒      ");
                            System.out.println(" ".repeat(margen) +"▒██░▄▄▄▒██  ▀█▄ ▓██    ▓██▒███         ▒██░  ██▒▓██  █▒▒███  ▓██ ░▄█ ▒      ");
                            System.out.println(" ".repeat(margen) +"░▓█  ██░██▄▄▄▄██▒██    ▒██▒▓█  ▄       ▒██   ██░ ▒██ █░▒▓█  ▄▒██▀▀█▄        ");
                            System.out.println(" ".repeat(margen) +"░▒▓███▀▒▓█   ▓██▒██▒   ░██░▒████▒      ░ ████▓▒░  ▒▀█░ ░▒████░██▓ ▒██▒      ");
                            System.out.println(" ".repeat(margen) +" ░▒   ▒ ▒▒   ▓▒█░ ▒░   ░  ░░ ▒░ ░      ░ ▒░▒░▒░   ░ ▐░ ░░ ▒░ ░ ▒▓ ░▒▓░      ");
                            System.out.println(" ".repeat(margen) +"  ░   ░  ▒   ▒▒ ░  ░      ░░ ░  ░        ░ ▒ ▒░   ░ ░░  ░ ░  ░ ░▒ ░ ▒░      ");
                            System.out.println(" ".repeat(margen) +"░ ░   ░  ░   ▒  ░      ░     ░         ░ ░ ░ ▒      ░░    ░    ░░   ░       ");
                            System.out.println(" ".repeat(margen) +"      ░      ░  ░      ░     ░  ░          ░ ░       ░    ░  ░  ░           ");
                            System.out.println(" ".repeat(margen) +"                                                    ░                       "+Utilidades.ANSI_RESET);
    }

    public static String espada(){
        int margen = 56;
        String espada =
                        " ".repeat(margen)+"                               (            \r\n" + //
                        " ".repeat(margen)+"                             '    }      \r\n" + //
                        " ".repeat(margen)+"                            (   '      \r\n" + //
                        " ".repeat(margen)+"                           '     (   \r\n" + //
                        " ".repeat(margen)+"                            )     ) \r\n" + //
                        " ".repeat(margen)+"                          '  /|\\    `\r\n" + //
                        " ".repeat(margen)+"                         )  / | \\  ` )   \r\n" + //
                        " ".repeat(margen)+"                        {   | | |  {   \r\n" + //
                        " ".repeat(margen)+"                       }    | | |  .\r\n" + //
                        " ".repeat(margen)+"                        '   | | |    )\r\n" + //
                        " ".repeat(margen)+"                       (   /| | |\\    .\r\n" + //
                        " ".repeat(margen)+"                        . / | | | \\  (\r\n" + //
                        " ".repeat(margen)+"                       }  \\ \\ | / /  .        \r\n" + //
                        " ".repeat(margen)+"                       (   \\ `-' /    }\r\n" + //
                        " ".repeat(margen)+"                        '  / ,-. \\    ' \r\n" + //
                        " ".repeat(margen)+"                        } / / | \\ \\  }\r\n" + //
                        " ".repeat(margen)+"                      '   \\ | | | /   } \r\n" + //
                        " ".repeat(margen)+"                       (   \\| | |/  (\r\n" + //
                        " ".repeat(margen)+"                         )  | | |  )\r\n" + //
                        " ".repeat(margen)+"                         .  | | |  '\r\n" + //
                        " ".repeat(margen)+"                            | | |\r\n" + //
                        " ".repeat(margen)+"                      /|    |_|_|    |\\\r\n" + //
                        " ".repeat(margen)+"                      \\ \\___/ o \\___/ /\r\n" + //
                        " ".repeat(margen)+"                       \\_____ _ _____/\r\n" + //
                        " ".repeat(margen)+"                             |-|\r\n" + //
                        " ".repeat(margen)+"                             |-|\r\n" + //
                        " ".repeat(margen)+"                             |-|\r\n" + //
                        " ".repeat(margen)+"                            ,'-'.\r\n" + //
                        " ".repeat(margen)+"                            '---'";
        return espada;

    }

    public static String armadura() {
        int margen = 71;
        String armadura =
            " ".repeat(margen) + "             .--.\n" +
            " ".repeat(margen) + "            /.--.\\\n" +
            " ".repeat(margen) + "            |====|\n" +
            " ".repeat(margen) + "            |`::`|\n" +
            " ".repeat(margen) + "        .-;`\\..../`;-.\n" +
            " ".repeat(margen) + "       /  |...::...|  \\\n" +
            " ".repeat(margen) + "      |   /'''::'''\\   |\n" +
            " ".repeat(margen) + "      ;--'\\   ::   /--; \n" +
            " ".repeat(margen) + "      <__>,>._::_.<,<__>\n" +
            " ".repeat(margen) + "      |  |/   ^^   \\|  |\n" +
            " ".repeat(margen) + "      \\::/|        |\\::/\n" +
            " ".repeat(margen) + "      |||\\|        |/|||\n" +
            " ".repeat(margen) + "      ''' |___/\\___| '''\n" +
            " ".repeat(margen) + "           \\_ || _/\n" +
            " ".repeat(margen) + "           <_ >< _>\n" +
            " ".repeat(margen) + "           |  ||  |\n" +
            " ".repeat(margen) + "           |  ||  |\n" +
            " ".repeat(margen) + "          _\\.:||:./_\n" +
            " ".repeat(margen) + "         /____/\\____\\";
        return armadura;
    }
    

    public static String caballo() {
        int margen = 62; // Puedes ajustar este valor según necesites
       String caballo =  
            " ".repeat(margen) + "                           ___________ _\r\n" + //
            " ".repeat(margen) + "                      __/   .::::.-'-(/-/)\r\n" + //
            " ".repeat(margen) + "                    _/:  .::::.-' .-'\\/\\_`,\r\n" + //
            " ".repeat(margen) + "                   /:  .::::./   -._-.  d\\|\r\n" + //
            " ".repeat(margen) + "                    /: (\"\"\"\"/    '.  (__/||\r\n" + //
            " ".repeat(margen) + "                     \\::).-'  -._  \\/ \\\\/\\|\r\n" + //
            " ".repeat(margen) + "             __ _ .-'`)/  '-'. . '. |  (i_O\r\n" + //
            " ".repeat(margen) + "         .-'      \\       -'      '\\|\r\n" + //
            " ".repeat(margen) + "    _ _./      .-'|       '.  (    \\\\\r\n" + //
            " ".repeat(margen) + " .-'   :      '_  \\         '-'\\  /|/\r\n" + //
            " ".repeat(margen) + "/      )\\_      '- )_________.-|_/^\\\r\n" + //
            " ".repeat(margen) + "(   .-'   )-._-:  /        \\(/\\'-._ `.\r\n" + //
            " ".repeat(margen) + " (   )  _//_/|:  /          `\\()   `\\_\\\r\n" + //
            " ".repeat(margen) + "  ( (   \\()^_/)_/             )/      \\\\\r\n" + //
            " ".repeat(margen) + "   )     \\\\ \\(_)             //        )\\\r\n" + //
            " ".repeat(margen) + "         _o\\ \\\\\\            (o_       |__\\\r\n" + //
            " ".repeat(margen) + "         \\ /  \\\\\\__          )_\\\r\n" + //
            " ".repeat(margen) + "               ^)__\\";
            return caballo;
    }

    public static String escudo() {
        int margen = 72;
        String escudo =  
            " ".repeat(margen) + " _________________________ \n" + 
            " ".repeat(margen) + "|<><><>     |  |    <><><>|\n" + 
            " ".repeat(margen) + "|<>         |  |        <>|\n" + 
            " ".repeat(margen) + "|           |  |          |\n" + 
            " ".repeat(margen) + "|  (______ <\\-/> ______)  |\n" + 
            " ".repeat(margen) + "|  /_.-=-.\\| \" |/.-=-._\\  | \n" + 
            " ".repeat(margen) + "|   /_    \\(o_o)/    _\\   |\n" + 
            " ".repeat(margen) + "|    /_  /\\/ ^ \\/\\  _\\    |\n" + 
            " ".repeat(margen) + "|      \\/ | / \\ | \\/      |\n" + 
            " ".repeat(margen) + "|_______ /((( )))\\ _______|\n" + 
            " ".repeat(margen) + "|      __\\ \\___/ /__      |\n" + 
            " ".repeat(margen) + "|--- (((---'   '---))) ---|\n" + 
            " ".repeat(margen) + "|           |  |          |\n" + 
            " ".repeat(margen) + "|           |  |          |\n" + 
            " ".repeat(margen) + ":           |  |          :     \n" + 
            " ".repeat(margen) + " \\<>        |  |       <>/      \n" + 
            " ".repeat(margen) + "  \\<>       |  |      <>/       \n" + 
            " ".repeat(margen) + "   \\<>      |  |     <>/       \n" + 
            " ".repeat(margen) + "    `\\<>    |  |   <>/'         \n" + 
            " ".repeat(margen) + "      `\\<>  |  |  <>/'         \n" + 
            " ".repeat(margen) + "        `\\<>|  |<>/'         \n" + 
            " ".repeat(margen) + "          `-.  .-`           \n" + 
            " ".repeat(margen) + "            '--' ";
        return escudo;
    }
    
    public static void enfrentamiento(){

        System.out.print("            *_\r\n" + //
                                "     ^       | ~~\\                     /\r\n" + //
                                "     |       |  ./               ,~~  /\r\n" + //
                                "     |  (*)  |~~              _<=)  _/_\r\n" + //
                                "     | _<\">_ |             /I\\.=\"==.{>\r\n" + //
                                "    _|_ \\ / \\0             \\I/-\\T/-'\r\n" + //
                                "     0'\\ ^ /\\/                 /_\\\r\n" + //
                                "       /   \\ |                // \\\\\r\n" + //
                                "      /__^__\\|               //   \\\\_ \r\n" + //
                                "       || ||  |             _I      /\r\n" + //
                                "      _|| ||_ |\r\n");
    }
}