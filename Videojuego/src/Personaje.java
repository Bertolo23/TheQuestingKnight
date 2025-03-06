
import java.io.IOException;

import Utilidades.Utilidades;

/**
 * Clase abstracta de personaje la cúal se expandira en los diferentes personajes en sus respectivas clases
 */
public abstract class Personaje {
    
    /**
     * ATRIBUTOS DE LA CLASE PERSONAJE
     */
    private String nombre;
    private int dinero;// referencia en dinero de cada personaje
    private int vitalidad;// referencia la vitalidad de cada personaje
    private int fuerza;// referencia la fuerza de cada personaje
    private int agilidad;// referencia la agilidad de cada personaje
    private int percepcionMagica;// referencia la percepcionMagica de cada personaje
    private double salud;// referencia la salud de cada personaje
    private int experiencia; // referencia la experiencia de cada personaje
    private int nivel; // referencia el nivel de cada personaje

    /**
     * CONSTRUCTORES
     */
     
    /**
     * Constructor principal que coje todos los atributos
     * @param vitalidad atributo vitalidad que se exportara a las demas clases que se extienden de Personaje mediante super()
     * @param fuerza atributo fuerza que se exportara a las demas clases que se extienden de Personaje mediante super()
     * @param agilidad atributo agilidad que se exportara a las demas clases que se extienden de Personaje mediante super()
     * @param percepcionMagica atributo percepcionMagica que se exportara a las demas clases que se extienden de Personaje mediante super()
     * @param salud atributo salud que se exportara a las demas clases que se extienden de Personaje mediante super()
     * @param experiencia
     * @param nivel
     */
    public Personaje(String nombre, int dinero, int vitalidad, int fuerza, int agilidad, int percepcionMagica,
            double salud, int experiencia, int nivel) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.vitalidad = vitalidad;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.percepcionMagica = percepcionMagica;
        this.salud = salud;
        this.experiencia = experiencia;
        this.nivel = nivel;
    }

    /**
     * Constructor vacío para poder inicializarlo con los métodos set y get en la main
     */
    public Personaje() {
    }
    
    /**
     * GETTERS Y SETTERS
     */

    /**
     * Método get que retorna el nombre del Personaje
     * @return devuelva el nombre del Personaje
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método set para dar o actualizar el nombre del Personaje
     * @param nombre coje el valor del parametro String y se lo asigna al atributo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método get que retorna el dinero del Personaje
     * @return devuelva el valor del atributo dinero
     */
    public int getDinero() {
        return dinero;
    }
    
    /**
     * Método set para dar o actualizar el dinero del Personaje
     * @param dinero coje el valor del parametro int y se lo asigna al atributo dinero
     */
    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    
    /**
     * Método get que retorna el valor del atributo vitalidad
     * @return devuelva el valor de vitalidad
     */
    public int getVitalidad() {
        return vitalidad;
    }

    /**
     * Método set para dar o actualizar el valor del atributo vitalidad
     * @param vitalidad coje el valor del parametro int y se lo asigna al atributo vitalidad
     */
    public void setVitalidad(int vitalidad) {
        this.vitalidad = vitalidad;
    }
    
    /**
     * Método get que retorna el valor del atributo fuerza
     * @return devuelva el valor de fuerza
     */
    public int getFuerza() {
        return fuerza;
    }

    /**
     * Método set para dar o actualizar el valor del atributo fuerza
     * @param fuerza coje el valor del parametro int y se lo asigna al atributo fuerza
     */
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    /**
     * Método get que retorna el valor del atributo agilidad
     * @return devuelva el valor de agilidad
     */
    public int getAgilidad() {
        return agilidad;
    }

    /**
     * Método set para dar o actualizar el valor del atributo agilidad
     * @param agilidad coje el valor del parametro int y se lo asigna al atributo agilidad
     */
    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    /**
     * Método get que retorna el valor del atributo percepcionMagica
     * @return devuelva el valor de percepcionMagica
     */
    public int getPercepcionMagica() {
        return percepcionMagica;
    }

    /**
     * Método set para dar o actualizar el valor del atributo percepcionMagica
     * @param percepcionMagica coje el valor del parametro int y se lo asigna al atributo percepcionMagica
     */
    public void setPercepcionMagica(int percepcionMagica) {
        this.percepcionMagica = percepcionMagica;
    }

    /**
     * Método get que retorna el valor del atributo salud
     * @return devuelva el valor de salud
     */
    public double getSalud() {
        return salud;
    }

    /**
     * Método set para dar o actualizar el valor del atributo salud
     * @param salud coje el valor del parametro int y se lo asigna al atributo salud
     */
    public void setSalud(double salud) {
        this.salud = salud;
    }

    /**
     * Método get que retorna el valor del atributo experiencia
     * @return devuelva el valor de experiencia
     */
    public int getExperiencia() {
        return experiencia;
    }

    /**
     * Método set para dar o actualizar el valor del atributo salud
     * @param experiencia coje el valor del parametro int y se lo asigna al atributo salud
     */
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    /**
     * Método get que retorna el valor del atributo nivel
     * @return devuelva el valor de nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * Método set para dar o actualizar el valor del atributo nivel
     * @param nivel coje el valor del parametro int y se lo asigna al atributo nivel
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    private final String ANSI_RESET = "\u001B[0m";
    private final String ANSI_RED = "\u001B[31m";
    private final String ANSI_GREEN = "\u001B[32m";
    private final String ANSI_YELLOW = "\u001B[33m";
    private final String ANSI_BLUE = "\u001B[34m";
    private final String ANSI_CYAN = "\u001B[36m";
    private final String ANSI_UNDERLINE = "\u001B[4m";
    private final String FONDO_AMARILLO = "\u001B[43m";

    /**
     * Muestra la introducción del personaje, incluyendo su nombre y sus estadísticas iniciales.
     */
    public void introduccionPersonaje() {
        int margen = 50;
        System.out.println(" ".repeat(margen - 2) + ANSI_CYAN + "                    HAS ELEGIDO " + ANSI_UNDERLINE + nombre.toUpperCase() + ANSI_RESET + ANSI_CYAN + " TUS ESTADÍSTICAS SON");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.print(ANSI_GREEN + " ".repeat(margen - 2) + "     ║ VITALIDAD ║" + ANSI_RED + "║ FUERZA ║" + ANSI_YELLOW + "║ AGILIDAD ║" + ANSI_BLUE + "║ PERCEPCIÓN MÁGICA ║");
    }

    /**
     * Muestra las opciones disponibles para mejorar las estadísticas del personaje durante el entrenamiento.
     */
    public void preguntasEntrenamiento(){
        int margen = 70;
        System.out.println(" ".repeat(margen) + ANSI_CYAN + "QUE ESTADÍSTICA QUIERES MEJORAR(1-5)");
        System.out.println();
        System.out.println();
        System.out.println();
        margen = 50;
        System.out.print(" ".repeat(margen) + ANSI_GREEN + "     ║ VITALIDAD ║" + ANSI_RED + "║ FUERZA ║" + ANSI_YELLOW + "║ AGILIDAD ║" + ANSI_BLUE + "║ PERCEPCIÓN MÁGICA ║");
    }

    /**
     * Verifica si el personaje ha subido de nivel y actualiza su nivel si corresponde.
     * Se sube de nivel cada 5 puntos de experiencia acumulados.
     */
    public void subirNivel() {
        if (experiencia % 5 == 0) { 
            System.out.println("HAS SUBIDO DE NIVEL");
            nivel++;
        }
        System.out.println("NIVEL ACTUAL " + FONDO_AMARILLO + nivel + ANSI_RESET);
    }

    /**
     * Muestra las estadísticas actuales del personaje.
     * 
     * @param titulo Objeto Titulos utilizado para mostrar el titulo de las estadísticas.
     */
    public void enseñarEstadisticas(Titulos titulo){
        titulo.tituloEstadisticas();
        System.out.println();
        System.out.println();
        int margen = 50;
        System.out.print(" ".repeat(margen) + ANSI_GREEN + "     ║ VITALIDAD ║" + ANSI_RED + "║ FUERZA ║" + ANSI_YELLOW + "║ AGILIDAD ║" + ANSI_BLUE + "║ PERCEPCIÓN MÁGICA ║");
    }

    /**
     * Comprueba si se cumplen las condiciones de victoria o de muerte y, en caso afirmativo, termina la partida.
     * 
     * @param salirMenuAcciones Booleano que indica si el jugador desea salir del menú de acciones.
     * @return true si se cumple alguna condición de victoria o muerte o false en caso contrario.
     * @throws IOException Si ocurre un error en la lectura de la entrada.
     */
    public boolean condiccionesVictoria(boolean salirMenuAcciones) throws IOException {
        if (salud <= 0 || dinero >= 250) {
            if (salud <= 0) {
                System.out.println("Has muerto");
                System.out.println();
                System.out.println("Pulsa cualquier tecla para ir al menú de inicio");
                return true;
            }
            if (dinero >= 250) {
                System.out.println("LO HAS CONSEGUIDO, ERES EL REY");
                System.out.println();
                System.out.println("Pulsa cualquier tecla para ir al menú de inicio");
                return true;
            }
            String volverMenuInicio = Utilidades.leerStringConTexto("Pulsa cualquier tecla para ir al menú de inicio");
        }
        return false;
    }


    /**
     * TO STRING
     */
    @Override
    public String toString() {
        return "Personaje vitalidad= " + vitalidad + ", fuerza= " + fuerza + ", agilidad=" + agilidad
                + ", percepcionMagica= " + percepcionMagica + ", salud= " + salud;
    }
  
}
