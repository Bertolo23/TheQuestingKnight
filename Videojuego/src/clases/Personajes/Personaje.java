package Personajes;

import java.io.IOException;
import Interfaz.Titulos;
import util.Utilidades;


/**
 * Clase abstracta de personaje la cúal se expandira en los diferentes personajes en sus respectivas clases
 * @author Iván Bertolo García
 * @version 2.0
 */
public abstract class Personaje {
    
    /**
     * ATRIBUTOS DE LA CLASE PERSONAJE
     */
    private String nombre;// referencia el nombre de cada personaje
    private int dinero;// referencia el dinero de cada personaje
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
     * @param experiencia atributo experiencia que se exportara a las demas clases que se extienden de Personaje mediante super()
     * @param nivel atributo nivel que se exportara a las demas clases que se extienden de Personaje mediante super()
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
     * Método set para dar o actualizar el valor del atributo experiencia
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



    /**
     * Muestra la introducción del personaje, incluyendo su nombre y sus estadísticas iniciales.
     */
    public void introduccionPersonaje() {
        int margen = 50;
        System.out.println(" ".repeat(margen - 2) + Utilidades.ANSI_CYAN + "                    HAS ELEGIDO " + Utilidades.ANSI_UNDERLINE + nombre.toUpperCase() + Utilidades.ANSI_RESET + Utilidades.ANSI_CYAN + " TUS ESTADÍSTICAS SON");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.print(Utilidades.ANSI_GREEN + " ".repeat(margen - 2) + "     ║ VITALIDAD ║" + Utilidades.ANSI_RED + "║ FUERZA ║" + Utilidades.ANSI_YELLOW + "║ AGILIDAD ║" + Utilidades.ANSI_BLUE + "║ PERCEPCIÓN MÁGICA ║");
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
        System.out.println("NIVEL ACTUAL " + Utilidades.FONDO_AMARILLO + nivel + Utilidades.ANSI_RESET);
    }

    /**
     * Muestra las estadísticas actuales del personaje.
     */
    public void enseñarEstadisticas(){
        Titulos.tituloEstadisticas();
        System.out.println();
        System.out.println();
        int margen = 50;
        System.out.print(" ".repeat(margen) + Utilidades.ANSI_GREEN + "     ║ VITALIDAD ║" + Utilidades.ANSI_RED + "║ FUERZA ║" + Utilidades.ANSI_YELLOW + "║ AGILIDAD ║" + Utilidades.ANSI_BLUE + "║ PERCEPCIÓN MÁGICA ║");
    }

    /**
     * Comprueba si se cumplen las condiciones de victoria o de muerte y, en caso afirmativo, termina la partida.
     * 
     * @param salirMenuAcciones Booleano que indica si el jugador desea salir del menú de acciones.
     * @return true si se cumple alguna condición de victoria o muerte o false en caso contrario.
     * @throws IOException Si ocurre un error en la lectura de la entrada.
     */
    public boolean condiccionesVictoria() throws IOException {
        if (salud <= 0 || dinero >= 250) {
            if (salud <= 0) {
                System.out.println("Has muerto");
                System.out.println();
                return true;
            }
            if (dinero >= 250) {
                System.out.println("LO HAS CONSEGUIDO, ERES EL REY");
                System.out.println();
                return true;
            }
            String volverMenuInicio = Utilidades.leerStringConTexto("Pulsa intro para ir al menú de inicio");
        }
        return false;
    }

    public void mostrarSaludYDinero(){
        int margen = 80;
        System.out.println(" ".repeat(margen) +"SALUD  " + Utilidades.ANSI_CYAN + salud + Utilidades.ANSI_RESET + "       DINERO  " + Utilidades.ANSI_YELLOW + dinero + Utilidades.ANSI_RESET + "");

    }

    public static int valorEstadisticaUnica(Personaje personaje){
   
        int valorEstadisticaUnica = 0;
        if(personaje instanceof Luchador){
            valorEstadisticaUnica = ((Luchador) personaje).getCoraje();
        }
        if (personaje instanceof Asesino) {
            valorEstadisticaUnica = ((Asesino) personaje).getSigilo();
        }
        if (personaje instanceof Tanque) {
            valorEstadisticaUnica = ((Tanque) personaje).getBarrera();
        }
        if (personaje instanceof Mago) {
            valorEstadisticaUnica = ((Mago) personaje).getPoderDeHabilidad();
        }

        return valorEstadisticaUnica;
}

    public static String nombreEstadisticaUnica(Personaje personaje){

        String nombreEstadisticaUnica = "";
        if(personaje instanceof Luchador){
            nombreEstadisticaUnica = "Coraje";
        }
        if (personaje instanceof Asesino) {
            nombreEstadisticaUnica = "Sigilo";
        }
        if (personaje instanceof Tanque) {
            nombreEstadisticaUnica = "Barrera";
        }
        if (personaje instanceof Mago) {
            nombreEstadisticaUnica = "Poder de Habilidad";
        }

        return nombreEstadisticaUnica;
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
