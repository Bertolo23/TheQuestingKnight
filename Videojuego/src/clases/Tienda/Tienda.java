package clases.Tienda;
import java.io.IOException;
import java.util.ArrayList;

import clases.Interfaz.Menus;
import clases.Interfaz.Titulos;
import clases.Personajes.Personaje;
import util.Utilidades;
/**
 * Clase que se encarga de Tener la Tienda que sera igual para todos los personajes
 */
public class Tienda {

    // Creación de objetos disponibles en la tienda
    static ObjetoTienda objeto1 = new ObjetoTienda("Pechera", 40, false);
    static ObjetoTienda objeto2 = new ObjetoTienda("Mandoble", 55, false);
    static ObjetoTienda objeto3 = new ObjetoTienda("Báculo", 60, false);
    static ObjetoTienda objeto4 = new ObjetoTienda("Manto", 70, false);
    /**
     * Permite al personaje comprar objetos en la tienda, afectando sus estadísticas y reduciendo su dinero.
     * Se presentan diferentes opciones de compra con sus respectivos efectos en las características del personaje.
     * 
     * @param titulo    Objeto Titulos utilizado para mostrar encabezados en la tienda.
     * @param menu      Objeto Menus utilizado para mostrar el menú de la tienda.
     * @param personaje Objeto Personaje que realiza las compras y cuyos atributos pueden verse afectados.
     * @throws IOException Si ocurre un error en la lectura de la entrada del usuario.
     */
    public static void tiendaDeObjetos(Personaje personaje) throws IOException {

        // Verifica si el personaje tiene dinero para comprar
        if (personaje.getDinero() > 0) {
            boolean salirTienda = false;
            boolean objetoComprado = false;
            int comprarObjetos = 0;

            do {
                System.out.println();
                System.out.println();
                boolean dejarDeComprar = false;

                do {
                    // Muestra la tienda y obtiene la opción elegida por el usuario
                    Titulos.tituloTienda();
                    comprarObjetos = Menus.menuTienda(personaje);

                    switch (comprarObjetos) {
                        case 1: // Compra de Pechera
                            objetoComprado = objeto1.objetoTienda(objeto1, personaje);
                            if (objetoComprado) {
                                personaje.setDinero(personaje.getDinero() - objeto1.getPrecio());
                                personaje.setVitalidad(personaje.getVitalidad() + 4);
                                personaje.setAgilidad(personaje.getAgilidad() - 2);
                                System.out.println("Ahora tienes equipado el objeto "+objeto1.getNombre());
                                objeto1.setObjetoComprado(true);
                            }
                            break;
                        case 2: // Compra de Mandoble
                            objetoComprado = objeto2.objetoTienda(objeto2, personaje);
                            if (objetoComprado) {
                                personaje.setDinero(personaje.getDinero() - objeto2.getPrecio());
                                personaje.setFuerza(personaje.getFuerza() + 5);
                                personaje.setAgilidad(personaje.getAgilidad() - 1);
                                personaje.setPercepcionMagica(personaje.getPercepcionMagica() - 2);
                                System.out.println("Ahora tienes equipado el objeto "+objeto2.getNombre());
                                objeto2.setObjetoComprado(true);
                            }
                            break;
                        case 3: // Compra de Báculo
                            objetoComprado = objeto3.objetoTienda(objeto3, personaje);
                            if (objetoComprado) {
                                personaje.setDinero(personaje.getDinero() - objeto3.getPrecio());
                                personaje.setFuerza(personaje.getFuerza() - 3);
                                personaje.setPercepcionMagica(personaje.getPercepcionMagica() + 7);
                                System.out.println("Ahora tienes equipado el objeto "+objeto3.getNombre());
                                objeto3.setObjetoComprado(true);
                            }
                            break;
                        case 4: // Compra de Manto
                            objetoComprado = objeto4.objetoTienda(objeto4, personaje);
                            if (objetoComprado) {
                                personaje.setDinero(personaje.getDinero() - objeto4.getPrecio());
                                personaje.setAgilidad(personaje.getAgilidad() + 5);
                                personaje.setPercepcionMagica(personaje.getPercepcionMagica() + 2);
                                personaje.setVitalidad(personaje.getVitalidad() - 4);
                                System.out.println("Ahora tienes equipado el objeto "+objeto4.getNombre());
                                objeto4.setObjetoComprado(true);
                            }
                            break;
                        case 5: // Salir de la tienda
                            dejarDeComprar = true;
                            Utilidades.espacios(2);
                            break;
                        default:
                            System.out.println(Utilidades.ANSI_UNDERLINE + "Escriba una opción válida (1-5)" + Utilidades.ANSI_RESET);
                            break;
                    }

                } while (!dejarDeComprar);

                salirTienda = true;
            } while (!salirTienda);  

            }else{
                System.out.println(Utilidades.ANSI_UNDERLINE+"No tienes dinero no puedes comprar nada"+Utilidades.ANSI_RESET);
                System.out.println();
                System.out.println();
            }
    }

    public static ArrayList<ObjetoTienda> arrayObjetosTienda(){
        ArrayList<ObjetoTienda> listaObjetos = new ArrayList<>();
        listaObjetos.add(objeto1);
        listaObjetos.add(objeto2);
        listaObjetos.add(objeto3);
        listaObjetos.add(objeto4);
        return listaObjetos;
    }
}
