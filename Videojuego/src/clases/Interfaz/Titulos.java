package clases.Interfaz;

import java.lang.reflect.Array;
import java.util.Arrays;

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

    public static void corona(){

        String corona []= {"    .     . .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .           \r\n" + //
                        "  .   .           .       .       .       .   .:tXS%:     .       .       .       .        .  . .  .\r\n" + //
                        "    .   . .  . .     . .     . .     . .      %      X .     . .     . .     . .     . .  .         \r\n" + //
                        "  .         .    .       .       .       .  .;  8 8 8 8  .  .    .       .       .          . .  .  \r\n" + //
                        "     . .  .    .   . .     . .     . .     . 8 8  8  8X        .   . .     . .     . .  .       .  .\r\n" + //
                        "  .          .         . .     . .     . .   X  8     S . .  .         . .     . .     .  . .       \r\n" + //
                        "    .  . . .    . .  .   .;;:      .         .88 8  88:  .      . .  . .;:.. .     .          .  .  \r\n" + //
                        "  .   . .     .        :@     @.     . .  . ...  88    .   .  .      :@    8%   .    .  . . .  .   .\r\n" + //
                        "    .;@@8t.  .   . . . %  8 8 8 . .             :@SX.    .       . . @ 8 8  X..    .   . .tSX8;  .  \r\n" + //
                        "  . 8   X 8;           8 8   88     .  . .  .   8% 8       .  .      S  8 8 t   .    .  .8   @ 8    \r\n" + //
                        "      8  8 8. .  .  .  :8S@ 8S;...             ;@%S%S:. .       .    :SS  88% .   .    .t 8 8   8.  \r\n" + //
                        "  .:X  8  X8   .       .:. 8@.   .  .  .  .  ..; S S@..  .  .     .   .@88;S    .    .  t  8 8@X  . \r\n" + //
                        "    t888888; .    . .   ..:% @    .     .     .@S @ S% .     .  .   . t 8;.. .    .     ;8@888X.    \r\n" + //
                        " .  .;   XX8@   .     .  ..; St .   .     .  .S X @ X @  . .         % X: .    .   .  ..@88  .:  .  \r\n" + //
                        "   . .    8StS.   .        t8% 8   .  .     .; @ 8 8 @@:      .  . .t @X:  .     .    ;  8;. ..    .\r\n" + //
                        "     .   :;@S X8.   . . .  .8SS%X       . . :  8  8 8 X8:. .      .%  88.    . .    :@  %S.  ..  .  \r\n" + //
                        " .   .   ..t8@S  S:       . 8tX X8; . .   .%  .      8 @8;   . . ;@ 8  8:..      .;8  8Xt    .      \r\n" + //
                        "   .        S @ 8 S8. .    :8X 8  X8:   ..X 8:S..S .X 8S @8.   .8  8.. 8% . .  ..@% 8S 8  .   . . . \r\n" + //
                        "     .   . .:8@     88; .  S 8S8    X888XX  ::S 8  X .S 8 @8S88X 8.::: 8S.   .;@8%8   t;:.  .  .    \r\n" + //
                        " .    .    .::88@S  %  @@8X 8X8X @8 8  8%@ .8 ..88..X..:X  8S@S8 .;@.X  88@88@ @S8  @;. . .      .  \r\n" + //
                        "   .   .  .  :S  .@..:S 8 8X8 ..@ 88 .8 8@ @.;8S @S :88S :8 8X8 ;8.:X.;@ 8 8S8X8 88 @8.     . .    .\r\n" + //
                        "     .   .  . tS @.88 8@ .@ 88 8 :X 8  :8 8.8  8X8 :8X  @S :8 .8S ;@.88 .8 8X8 88X :S    .      .   \r\n" + //
                        " .      .     .X8 8X 8  8S.8X8@8@S  X88@@ X 88 @8@ 8  @S.88X  8@ 8 .8S8@S ;8 @8 ::8@      .  .   .  \r\n" + //
                        "   .  .    . .  @  :8 8% 88 .8 8:;8S.8@8X@:8.:@8@ @8@S.88X8.8S 8 8888@ .@;8 .@ 8@X.:       .   .    \r\n" + //
                        "         .    .:S@@X :X 8S888X.88:;888888888@8X88@88@8@8@8X888888X88X 8X;;@;8 ;@.;8S   . .        . \r\n" + //
                        " . .  .     .  .;8@ 8X:88@.888@8@SX888888@8X8@S8888888888@8X888X888888888@88 8@;8XS        . .  .   \r\n" + //
                        "        .       :%8 8X888@:8X8X8888888888888.t;t:.:;; 88@8888888@8@8@888 88@8.8888@.  .  .          \r\n" + //
                        "  . .     .  .   ;8@8@X88@88888@8 8:@:@88.t@88%..  :%88X88.88SXS8;8888 8 8@88SX88 .    .    . .  .  \r\n" + //
                        "      .       .  .;88888X88S888@ 8888@88.@8@8@@888888888@8888 88@X88@;8X88@88888::  .     .       . \r\n" + //
                        "  .  .  .  .   .  :%X 8888888 8@8 88XX 8X8 S;8 8 8 8 8 8;88.S X8888.88:8@88888888 :   .  .   . .    \r\n" + //
                        "          .      . @@8X8@8X@@X8@XX@8888@8X8 888888888888@8S888888@@X@XS8888S8.88@ : .      .     .  \r\n" + //
                        "  . .  .    . .    ;t8 8S8 8.88.888@::     :;; ;:t;; :.%       :S888S8 8S8 8S88 :  .   .      .     \r\n" + //
                        "      .   .     . . @88888t : S.... .             .             .:. :..  :8888@8: "};

        for (int i = 0; i < corona.length; i++) {
                corona[i] = corona[i].replace('.', ' ');
                System.out.println(" ".repeat(30)+Utilidades.ANSI_YELLOW+corona[i]+Utilidades.ANSI_RESET);
        }
    }

    public static void tituloVictoria(){
        int margen = 40;
        System.out.println(Utilidades.ANSI_YELLOW+  " ".repeat(margen) + "  _____ _   _ _   _  ___  ____      _    ____  _   _ _____ _   _    _      _____ ____  _____ ____    _____ _       ____  _______   __\r\n" + //
                                                    " ".repeat(margen) + " | ____| \\ | | | | |/ _ \\|  _ \\    / \\  | __ )| | | | ____| \\ | |  / \\    | ____|  _ \\| ____/ ___|  | ____| |     |  _ \\| ____\\ \\ / /\r\n" + //
                                                    " ".repeat(margen) + " |  _| |  \\| | |_| | | | | |_) |  / _ \\ |  _ \\| | | |  _| |  \\| | / _ \\   |  _| | |_) |  _| \\___ \\  |  _| | |     | |_) |  _|  \\ V / \r\n" + //
                                                    " ".repeat(margen) + " | |___| |\\  |  _  | |_| |  _ <  / ___ \\| |_) | |_| | |___| |\\  |/ ___ \\  | |___|  _ <| |___ ___) | | |___| |___  |  _ <| |___  | |  \r\n" + //
                                                    " ".repeat(margen) + " |_____|_| \\_|_| |_|\\___/|_| \\_\\/_/   \\_\\____/ \\___/|_____|_| \\_/_/   \\_\\ |_____|_| \\_\\_____|____/  |_____|_____| |_| \\_\\_____| |_|  \r\n" +Utilidades.ANSI_RESET);
    
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
}
