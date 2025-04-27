package clases.personajes;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import clases.tienda.ObjetoTienda;
import clases.estadísticas.GestionEstadisticas;
import clases.interfaz.Titulos;
import util.Utilidades;

/**
 * Clase abstracta de personaje que se ampliará en las clases hijas concretas
 * como Luchador, Mago, Asesino o Tanque.
 * 
 * @author Iván Bertolo García
 * @version 2.0
 */
public abstract class Personaje implements Serializable {

    /**
     * ATRIBUTOS DE LA CLASE PERSONAJE
     */
    private String nombre; // Nombre del personaje
    private int dinero; // Dinero que posee el personaje
    private int vitalidad; // Representa la vitalidad del personaje
    private int fuerza; // Representa la fuerza física del personaje
    private int agilidad; // Representa la agilidad del personaje
    private int percepcionMagica; // Representa la percepción mágica del personaje
    private double salud; // Salud actual del personaje
    private int experiencia; // Experiencia acumulada por el personaje
    private int nivel; // Nivel actual del personaje
    private ArrayList<ObjetoTienda> inventario; // Lista de objetos que tiene el personaje en su inventario

    /**
     * CONSTRUCTORES
     */

    /**
     * Constructor principal que inicializa todos los atributos.
     * 
     * @param nombre Nombre del personaje
     * @param dinero Dinero inicial
     * @param vitalidad Nivel de vitalidad
     * @param fuerza Nivel de fuerza
     * @param agilidad Nivel de agilidad
     * @param percepcionMagica Nivel de percepción mágica
     * @param salud Salud inicial
     * @param experiencia Experiencia inicial
     * @param nivel Nivel inicial
     * @param inventario Inventario con objetos
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
     * Constructor utilizado para crear enemigos en las misiones.
     * 
     * @param nombre Nombre del personaje
     * @param vitalidad Vitalidad
     * @param fuerza Fuerza
     * @param agilidad Agilidad
     * @param salud Salud
     * @param nivel Nivel
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
     *  GETTERS Y SETTERS
     */
    
    /**
     * Obtiene el nombre del personaje.
     * 
     * @return Nombre del personaje
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del personaje.
     * 
     * @param nombre Nombre a asignar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el dinero del personaje.
     * 
     * @return Cantidad de dinero
     */
    public int getDinero() {
        return dinero;
    }

    /**
     * Establece la cantidad de dinero.
     * 
     * @param dinero Cantidad a asignar
     */
    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    /**
     * Obtiene la vitalidad del personaje.
     * 
     * @return Valor de vitalidad
     */
    public int getVitalidad() {
        return vitalidad;
    }

    /**
     * Establece la vitalidad.
     * 
     * @param vitalidad Valor a asignar
     */
    public void setVitalidad(int vitalidad) {
        this.vitalidad = vitalidad;
    }

    /**
     * Obtiene la fuerza del personaje.
     * 
     * @return Valor de fuerza
     */
    public int getFuerza() {
        return fuerza;
    }

    /**
     * Establece la fuerza.
     * 
     * @param fuerza Valor a asignar
     */
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    /**
     * Obtiene la agilidad del personaje.
     * 
     * @return Valor de agilidad
     */
    public int getAgilidad() {
        return agilidad;
    }

    /**
     * Establece la agilidad.
     * 
     * @param agilidad Valor a asignar
     */
    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    /**
     * Obtiene la percepción mágica del personaje.
     * 
     * @return Valor de percepción mágica
     */
    public int getPercepcionMagica() {
        return percepcionMagica;
    }

    /**
     * Establece la percepción mágica.
     * 
     * @param percepcionMagica Valor a asignar
     */
    public void setPercepcionMagica(int percepcionMagica) {
        this.percepcionMagica = percepcionMagica;
    }

    /**
     * Obtiene la salud del personaje.
     * 
     * @return Valor de salud
     */
    public double getSalud() {
        return salud;
    }

    /**
     * Establece la salud.
     * 
     * @param salud Valor a asignar
     */
    public void setSalud(double salud) {
        this.salud = salud;
    }

    /**
     * Obtiene la experiencia del personaje.
     * 
     * @return Valor de experiencia
     */
    public int getExperiencia() {
        return experiencia;
    }

    /**
     * Establece la experiencia.
     * 
     * @param experiencia Valor a asignar
     */
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    /**
     * Obtiene el nivel del personaje.
     * 
     * @return Nivel actual
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * Establece el nivel.
     * 
     * @param nivel Nivel a asignar
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * Obtiene el inventario del personaje.
     * 
     * @return Lista de objetos del inventario
     */
    public ArrayList<ObjetoTienda> getInventario() {
        return inventario;
    }

    /**
     * Establece el inventario.
     * 
     * @param inventario Lista de objetos a asignar
     */
    public void setInventario(ArrayList<ObjetoTienda> inventario) {
        this.inventario = inventario;
    }

    /**
     * Verifica si el personaje ha subido de nivel y, si es así, incrementa su nivel.
     * El personaje sube de nivel cada 5 puntos de experiencia.
     */
    public void subirNivel() {
        if (experiencia % 5 == 0) {
            System.out.println("HAS SUBIDO DE NIVEL");
            nivel++;
        }
        System.out.println("NIVEL ACTUAL " + Utilidades.FONDO_AMARILLO + nivel + Utilidades.ANSI_RESET);
    }

    /**
     * Comprueba si se ha cumplido una condición para finalizar la partida:
     * - Salud igual o inferior a 0 (derrota)
     * - Dinero igual o superior a 250 (victoria)
     * 
     * @return true si se cumple una condición de finalización, false en caso contrario
     */
    public boolean condiccionesFinalizacion() {
        return salud <= 0 || dinero >= 250;
    }

    /**
     * Comprueba si se ha alcanzado la condición de victoria (250 monedas o más).
     * 
     * @return true si se ha ganado la partida, false en caso contrario
     */
    public boolean condiccionesVictoria() {
        return dinero >= 250;
    }

    /**
     * Muestra el contenido actual del inventario del personaje.
     * 
     * @throws IOException si hay error en la entrada del usuario
     */
    public void mostrarInventario() throws IOException {
        Utilidades.espacios(3);
        Titulos.tituloInventario();
        Utilidades.espacios(2);
        if (inventario.isEmpty()) {
            System.out.println(Utilidades.ANSI_UNDERLINE + "El Inventario está vacío" + Utilidades.ANSI_RESET);
        } else {
            int i = 0;
            String[] texto = new String[inventario.size()];
            for (ObjetoTienda objeto : inventario) {
                texto[i] = "Objeto " + (i + 1) + " : " + objeto.getNombre().toUpperCase();
                i++;
            }
            Titulos.imprimirCuadroTexto(texto, 75, Utilidades.ANSI_BLUE);
        }
        Utilidades.espacios(2);
        Utilidades.continuar("volver al menú de acciones");
        Utilidades.espacios(2);
    }

    /**
     * Muestra por consola la introducción del personaje según su tipo y sus estadísticas iniciales.
     * 
     * @param personaje Instancia del personaje a presentar
     */
    public void introduccionPersonaje(Personaje personaje) {
        String tituloPersonaje = "";
        if (personaje instanceof Luchador) {
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
        Utilidades.espacios(13);
        int margen = 74;
        System.out.println(tituloPersonaje);
        Utilidades.espacios(1);
        System.out.println(" ".repeat(margen) + Utilidades.ANSI_CYAN + " TUS ESTADÍSTICAS INICIALES SON");
        GestionEstadisticas.mostrarEstadisticas(personaje);
        Utilidades.espacios(1);
        GestionEstadisticas.mostrarSaludYDinero(personaje);
        Utilidades.espacios(1);
        System.out.println(Utilidades.ANSI_RED_BACKGROUND + "La salud del personaje no se podrá aumentar" + Utilidades.ANSI_RESET);
    }

    /**
     * Representación en texto del personaje.
     * 
     * @return Cadena con los atributos del personaje
     */
    @Override
    public String toString() {
        return "Personaje [nombre=" + nombre + ", dinero=" + dinero + ", vitalidad=" + vitalidad + ", fuerza="
                + fuerza + ", agilidad=" + agilidad + ", percepcionMagica=" + percepcionMagica + ", salud=" + salud
                + ", experiencia=" + experiencia + ", nivel=" + nivel + "]";
    }

}
