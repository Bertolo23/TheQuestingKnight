package clases.personajes;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import clases.tienda.ObjetoTienda;
import clases.estadísticas.GestionEstadisticas;
import clases.interfaz.Titulos;
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
    private ArrayList<ObjetoTienda> inventario;

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
            double salud, int experiencia, int nivel, ArrayList<ObjetoTienda> inventario) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.vitalidad = vitalidad;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.percepcionMagica = percepcionMagica;
        this.salud = salud;
        this.experiencia = experiencia;
        this.nivel = nivel;
        this.inventario = inventario;
    }

    /**
     * Constructor para los enemigos a los cuales te enfrentaras en las misiones
     * @param nombre
     * @param vitalidad
     * @param fuerza
     * @param agilidad
     * @param salud
     * @param nivel
     */
    public Personaje(String nombre, int vitalidad, int fuerza, int agilidad, double salud, int nivel) {
        this.nombre = nombre;
        this.vitalidad = vitalidad;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.salud = salud;
        this.nivel = nivel;
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

    public ArrayList<ObjetoTienda> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<ObjetoTienda> inventario) {
        this.inventario = inventario;
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
     * Comprueba si se cumplen las condiciones de victoria o de muerte y, en caso afirmativo, termina la partida.
     * 
     * @return true si se cumple alguna condición de victoria o muerte o false en caso contrario.
     * @throws IOException Si ocurre un error en la lectura de la entrada.
     */
    public boolean condiccionesFinalizacion(){
        if (salud <= 0 || dinero >= 250) {
            return true;
        }
        return false;
    }

    public boolean condiccionesVictoria(){
        if (dinero >= 250) {
            return true;
        }
        return false;
    }

    public void mostrarInventario()throws IOException{
        Utilidades.espacios(3);
        Titulos.tituloInventario();
        Utilidades.espacios(2);
        if (inventario.isEmpty()) {
            System.out.println(Utilidades.ANSI_UNDERLINE+"El Inventario esta vacío"+Utilidades.ANSI_RESET);
        }else{
            int  i = 0;
            String [] texto = new String[inventario.size()];
            for (ObjetoTienda objeto : inventario) {
               texto[i] = "Objeto "+(i+1)+" : "+objeto.getNombre().toUpperCase();
                i++;
            }
            Titulos.imprimirCuadroTexto(texto, 75, Utilidades.ANSI_BLUE);
        }
        Utilidades.espacios(2);
        Utilidades.continuar("volver al menu de acciones");
        Utilidades.espacios(2);
    }

    /**
     * Método que muestra la introducción del personaje Luchador, presentando sus estadísticas principales.
     * Muestra información en pantalla sobre la vitalidad, fuerza, agilidad, percepción mágica y coraje.
     * Coje mediante super() la introducción de personaje de la clase Persona que se completa en este método 
     */
    public void introduccionPersonaje(Personaje personaje) {
        String tituloPersonaje = "";
        if(personaje instanceof Luchador){
            tituloPersonaje = Titulos.tituloLuchador();
        }
        if (personaje instanceof Asesino) {
            tituloPersonaje = Titulos.tituloAsesino();
        }
        if (personaje instanceof Tanque) {
            tituloPersonaje = Titulos.tituloTanque();
        }
        if (personaje instanceof Mago) {
            tituloPersonaje = Titulos.tituloMago();       
        }
        int margen = 74;
        System.out.println(tituloPersonaje);
        Utilidades.espacios(1);
        System.out.println(" ".repeat(margen) +Utilidades.ANSI_CYAN+" TUS ESTADÍSTICAS INICIALES SON");
        GestionEstadisticas.mostrarEstadisticas(personaje);
        Utilidades.espacios(1);
        GestionEstadisticas.mostrarSaludYDinero(personaje);
        Utilidades.espacios(1);
        System.out.println(Utilidades.ANSI_RED_BACKGROUND + "La salud del personaje no se podrá aumentar" + Utilidades.ANSI_RESET);
    }

    /**
     * TO STRING
     */

    @Override
    public String toString() {
        return "Personaje [nombre=" + nombre + ", dinero=" + dinero + ", vitalidad=" + vitalidad + ", fuerza="
                + fuerza + ", agilidad=" + agilidad + ", percepcionMagica=" + percepcionMagica + ", salud=" + salud
                + ", experiencia=" + experiencia + ", nivel=" + nivel + "]";
    }

}
