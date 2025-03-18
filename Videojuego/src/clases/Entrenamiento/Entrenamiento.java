package clases.Entrenamiento;
import java.io.IOException;
import clases.Interfaz.Titulos;
import clases.Personajes.*;
import util.Utilidades;

public class Entrenamiento {
    
    /**
     * Muestra las opciones disponibles para mejorar las estadísticas del personaje durante el entrenamiento.
     *
     * @param personaje
     * @throws IOException
     */
    public static int preguntasEntrenamiento(Personaje personaje)throws IOException{
        int opcionMejora = 0;
        String nombreEstadisticaUnica = Personaje.nombreEstadisticaUnica(personaje).toUpperCase();
        
        int margen = 70;
        System.out.println(" ".repeat(margen) + Utilidades.ANSI_CYAN + "QUE ESTADÍSTICA QUIERES MEJORAR(1-5)");
        Utilidades.espacios(3);
        margen = 50;
        System.out.println(" ".repeat(margen) + Utilidades.ANSI_GREEN + "     ║ VITALIDAD ║" + Utilidades.ANSI_RED + "║ FUERZA ║" + Utilidades.ANSI_YELLOW + "║ AGILIDAD ║" + Utilidades.ANSI_BLUE + "║ PERCEPCIÓN MÁGICA ║"+Utilidades.ANSI_PURPLE + "║ "+nombreEstadisticaUnica+" ║" + Utilidades.ANSI_RESET);
        Utilidades.espacios(2);
        opcionMejora = Utilidades.leerEntero();
        Utilidades.espacios(2);
        return opcionMejora;
    }

    /**
     * Método que gestiona el entrenamiento del personaje, permitiendo mejorar sus estadísticas
     * utilizando puntos de experiencia acumulados. Tambien introduce el método subir nivel de la clase
     * Persona cuando llegas a un número múltiplo de 5 para subir un nivel
     * 
     * @param personaje Objeto personaje necesario para saber que tipo es
     * @throws IOException Si ocurre un error en la lectura de la entrada.
     */
    public static void entrenamientoPersonaje(Personaje personaje) throws IOException {
        String nombreEstadisticaUnica = Personaje.nombreEstadisticaUnica(personaje);
        int valorEstadisticaUnica = Personaje.valorEstadisticaUnica(personaje);
        Titulos.tituloEntrenamiento();
        personaje.setExperiencia(personaje.getExperiencia() + 1);
        personaje.subirNivel();
        boolean salirBucleExperiencia = false;
        String eleccionMejora = " ";

        do {
            System.out.println("Tienes " + personaje.getExperiencia() + " puntos de experiencia");
            eleccionMejora = Utilidades.leerStringConTexto("¿Quieres gastar los puntos (S/N)?").toUpperCase();
            Utilidades.espacios(2);
            if (eleccionMejora.equals("S")) {
                personaje.setExperiencia(personaje.getExperiencia() - 1);
                int opcionMejora = 0;

                do {
                    opcionMejora = Entrenamiento.preguntasEntrenamiento(personaje);

                    switch (opcionMejora) {
                        case 1: // Aumentar Vitalidad
                            personaje.setVitalidad(personaje.getVitalidad() + 1);
                            System.out.println("Vitalidad: " + Utilidades.ANSI_GREEN + personaje.getVitalidad() + Utilidades.ANSI_RESET);
                            break;
                        case 2: // Aumentar Fuerza
                            personaje.setFuerza(personaje.getFuerza() + 1);
                            System.out.println("Fuerza: " + Utilidades.ANSI_RED + personaje.getFuerza() + Utilidades.ANSI_RESET);
                            break;
                        case 3: // Aumentar Agilidad
                            personaje.setAgilidad(personaje.getAgilidad() + 1);
                            System.out.println("Agilidad: " + Utilidades.ANSI_YELLOW + personaje.getAgilidad() + Utilidades.ANSI_RESET);
                            break;
                        case 4: // Aumentar Percepción Mágica
                            personaje.setPercepcionMagica(personaje.getPercepcionMagica() + 1);
                            System.out.println("Percepción Mágica: " + Utilidades.ANSI_BLUE + personaje.getPercepcionMagica() + Utilidades.ANSI_RESET);
                            break;
                        case 5: // Aumentar Coraje
                            valorEstadisticaUnica++;
                            System.out.println(nombreEstadisticaUnica+": " + Utilidades.ANSI_PURPLE + valorEstadisticaUnica + Utilidades.ANSI_RESET);
                            break;
                        default:
                            System.out.println("Escriba una de las opciones (1-5)");
                            break;
                    }

                } while (opcionMejora < 1 || opcionMejora > 5);
            }
            if (eleccionMejora.equals("N")) {
                System.out.println("Te queda/n " + personaje.getExperiencia() + " puntos, hasta la próxima");
                salirBucleExperiencia = true;
                System.out.println();
            }
            if (!eleccionMejora.equals("S") && !eleccionMejora.equals("N")) {
                System.out.println(Utilidades.ANSI_UNDERLINE+"Escriba una opción válida"+Utilidades.ANSI_RESET);
                Utilidades.espacios(2);
            }
            if (personaje.getExperiencia() == 0) {
                System.out.println("No te queda más puntos de experiencia, hasta la próxima");
                System.out.println();
                salirBucleExperiencia = true;
            }
        } while (personaje.getExperiencia() > 0 && !salirBucleExperiencia);
    }
}
