package clases.Personajes;
import java.io.IOException;
import java.io.Serializable;
import clases.Interfaz.Titulos;
import util.Utilidades;


/**
 * Clase abstracta de personaje la cúal se expandira en los diferentes personajes en sus respectivas clases
 * @author Iván Bertolo García
 * @version 2.0
 */
public abstract class Personaje implements Serializable {
    
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
     * Método que muestra la introducción del personaje Luchador, presentando sus estadísticas principales.
     * Muestra información en pantalla sobre la vitalidad, fuerza, agilidad, percepción mágica y coraje.
     * Coje mediante super() la introducción de personaje de la clase Persona que se completa en este método 
     */
    public void introduccionPersonaje(Personaje personaje) {
        int margen = 50;
        System.out.println(" ".repeat(margen - 2) + Utilidades.ANSI_CYAN + "                    HAS ELEGIDO " + Utilidades.ANSI_UNDERLINE + this.nombre.toUpperCase() + Utilidades.ANSI_RESET + Utilidades.ANSI_CYAN + " TUS ESTADÍSTICAS SON");
        Utilidades.espacios(3);
        mostrarEstadisticas(personaje);
        Utilidades.espacios(2);
        mostrarSaludYDinero();
        Utilidades.espacios(2);
        System.out.println(Utilidades.ANSI_RED_BACKGROUND + "La salud del personaje no se podrá aumentar" + Utilidades.ANSI_RESET);
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
    public void enseñarEstadisticas(Personaje personaje) throws IOException {
        Titulos.tituloEstadisticas();
        mostrarEstadisticas(personaje);
        String vueltaAMenu = Utilidades.leerStringConTexto("Pulsa intro para volver al menú de acciones");
        Utilidades.espacios(2);
    }

    /**
     * Método que muestra todas la estadísticas completas de cada tipo de personaje, incluida la única
     * @param personaje objeto personaje para saber que estadística única va a ser
     */
    public void mostrarEstadisticas(Personaje personaje){
        int valorEstadisticaUnica = valorEstadisticaUnica(personaje);
        String nombreEstadisticaUnica = nombreEstadisticaUnica(personaje).toUpperCase();
        int margenEntreNumeros = 7;
        int margen = 50;
        Utilidades.espacios(2);
        System.out.println(" ".repeat(margen) + Utilidades.ANSI_GREEN + "     ║ VITALIDAD ║" + Utilidades.ANSI_RED + "║ FUERZA ║" + Utilidades.ANSI_YELLOW + "║ AGILIDAD ║" + Utilidades.ANSI_BLUE + "║ PERCEPCIÓN MÁGICA ║"+Utilidades.ANSI_PURPLE + "║ "+nombreEstadisticaUnica+" ║" + Utilidades.ANSI_RESET);
        System.out.println(Utilidades.ANSI_GREEN + " ".repeat(margen + 8) + "║ " + getVitalidad() + " ║" + " ".repeat(margenEntreNumeros) + Utilidades.ANSI_RED +
                "║ " + getFuerza() + " ║" + " ".repeat(margenEntreNumeros) + Utilidades.ANSI_YELLOW +
                "║ " + getAgilidad() + " ║" + " ".repeat(margenEntreNumeros + 4) + Utilidades.ANSI_BLUE +
                "║ " + getPercepcionMagica() + " ║" + " ".repeat(margenEntreNumeros + 3) + Utilidades.ANSI_PURPLE +
                "║ " + valorEstadisticaUnica + " ║" + Utilidades.ANSI_RESET);
        Utilidades.espacios(2);
    }

    /**
     * Comprueba si se cumplen las condiciones de victoria o de muerte y, en caso afirmativo, termina la partida.
     * 
     * @return true si se cumple alguna condición de victoria o muerte o false en caso contrario.
     * @throws IOException Si ocurre un error en la lectura de la entrada.
     */
    public boolean condiccionesVictoria() throws IOException {
        if (salud <= 0 || dinero >= 250) {
            return true;
        }
        return false;
    }
    /**
     * Muestra la salud y el dinero actual del personaje en la partida.
     * Se formatea la salida para que se vea correctamente en la interfaz.
     */
    public void mostrarSaludYDinero(){
        int margen = 80;
        System.out.println(" ".repeat(margen) +"SALUD  " + Utilidades.ANSI_CYAN + salud + Utilidades.ANSI_RESET 
                + "       DINERO  " + Utilidades.ANSI_YELLOW + dinero + Utilidades.ANSI_RESET);
    }

    /**
     * Obtiene el valor de la estadística única de un personaje en función de su clase específica.
     * Cada clase de personaje tiene una estadística única que la distingue de las demás.
     * 
     * @param personaje Objeto de tipo Personaje cuya estadística única se desea obtener.
     * @return El valor de la estadística única correspondiente a la clase del personaje.
     */
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

    /**
     * Obtiene el nombre de la estadística única de un personaje en función de su clase específica.
     * Cada clase de personaje tiene una estadística única que la distingue de las demás.
     * 
     * @param personaje Objeto de tipo Personaje cuya estadística única se desea conocer.
     * @return El nombre de la estadística única correspondiente a la clase del personaje.
     */
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
     * Metodo que te permite mejorar la estadistica unica de cada personaje
     * @param personaje objeto necesario para poder obtener la estadistica y mejorarla
     * @param cantidadMejorar cantidad de puntos a mejorar
     */
    public void mejoraEstadisticaUnica(Personaje personaje, int cantidadMejorar){

        if(personaje instanceof Luchador){
            ((Luchador) personaje).setCoraje(((Luchador)personaje).getCoraje()+cantidadMejorar);
        }
        if (personaje instanceof Asesino) {
            ((Asesino) personaje).setSigilo(((Asesino)personaje).getSigilo()+cantidadMejorar);
        }
        if (personaje instanceof Tanque) {
            ((Tanque) personaje).setBarrera(((Tanque)personaje).getBarrera()+cantidadMejorar);
        }
        if (personaje instanceof Mago) {
            ((Mago) personaje).setPoderDeHabilidad(((Mago)personaje).getPoderDeHabilidad()+cantidadMejorar);
        }

    }

    /**
     * Extrae las estadísticas principales y el nivel del personaje y las almacena en un array.
     * El array resultante contiene los valores en el siguiente orden:
     * vitalidad, fuerza, agilidad, percepción mágica, estadística única, nivel.
     * 
     * @param personaje Objeto de tipo Personaje del cual se extraerán las estadísticas.
     * @return Un array de enteros que contiene las estadísticas principales y el nivel del personaje.
     */
    public static int[] sacarEstadisticasYNivel(Personaje personaje){
        int[] estadisticas = new int[Utilidades.NUMERO_ESTADISTICAS];
        estadisticas[0] = personaje.getVitalidad();
        estadisticas[1] = personaje.getFuerza();
        estadisticas[2] = personaje.getAgilidad();
        estadisticas[3] = personaje.getPercepcionMagica();
        estadisticas[4] = valorEstadisticaUnica(personaje);
        estadisticas[5] = personaje.getNivel();
        return estadisticas;
    }
        /**
     * Restaura las estadísticas de un personaje a sus valores iniciales según su clase específica.
     * Se restablecen atributos generales como dinero, experiencia, nivel y salud, 
     * además de los atributos específicos según si el personaje es un Luchador, Asesino, Tanque o Mago.
     * 
     * @param personaje El personaje cuya estadística será restablecida a los valores predeterminados.
     *                  Se determina su clase específica y se asignan los valores correspondientes.
     */
    public void reseteoEstadisticas(Personaje personaje) {
        personaje.setDinero(ConstantesPersonaje.DINERO);
        personaje.setExperiencia(ConstantesPersonaje.EXPERIENCIA);
        personaje.setNivel(ConstantesPersonaje.NIVEL);
        personaje.setSalud(ConstantesPersonaje.SALUD);

        if (personaje instanceof Luchador) {
            personaje.setVitalidad(ConstantesPersonaje.LUCHADOR_VITALIDAD);
            personaje.setFuerza(ConstantesPersonaje.LUCHADOR_FUERZA);
            personaje.setAgilidad(ConstantesPersonaje.LUCHADOR_AGILIDAD);
            personaje.setPercepcionMagica(ConstantesPersonaje.LUCHADOR_PERCEPCION_MAGICA);
            ((Luchador) personaje).setCoraje(ConstantesPersonaje.LUCHADOR_ESTADISTICA_ESPECIAL);
        }
        if (personaje instanceof Asesino) {
            personaje.setVitalidad(ConstantesPersonaje.ASESINO_VITALIDAD);
            personaje.setFuerza(ConstantesPersonaje.ASESINO_FUERZA);
            personaje.setAgilidad(ConstantesPersonaje.ASESINO_AGILIDAD);
            personaje.setPercepcionMagica(ConstantesPersonaje.ASESINO_PERCEPCION_MAGICA);
            ((Asesino) personaje).setSigilo(ConstantesPersonaje.ASESINO_ESTADISTICA_ESPECIAL);
        }
        if (personaje instanceof Tanque) {
            personaje.setVitalidad(ConstantesPersonaje.TANQUE_VITALIDAD);
            personaje.setFuerza(ConstantesPersonaje.TANQUE_FUERZA);
            personaje.setAgilidad(ConstantesPersonaje.TANQUE_AGILIDAD);
            personaje.setPercepcionMagica(ConstantesPersonaje.TANQUE_PERCEPCION_MAGICA);
            ((Tanque) personaje).setBarrera(ConstantesPersonaje.TANQUE_ESTADISTICA_ESPECIAL);
        }
        if (personaje instanceof Mago) {
            personaje.setVitalidad(ConstantesPersonaje.MAGO_VITALIDAD);
            personaje.setFuerza(ConstantesPersonaje.MAGO_FUERZA);
            personaje.setAgilidad(ConstantesPersonaje.MAGO_AGILIDAD);
            personaje.setPercepcionMagica(ConstantesPersonaje.MAGO_PERCEPCION_MAGICA);
            ((Mago) personaje).setPoderDeHabilidad(ConstantesPersonaje.MAGO_ESTADISTICA_ESPECIAL);
        }
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
