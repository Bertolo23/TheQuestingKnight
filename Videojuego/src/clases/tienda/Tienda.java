package clases.tienda;
import java.io.IOException;
import java.util.ArrayList;
import clases.personajes.Personaje;
import clases.interfaz.Menus;
import clases.interfaz.Titulos;
import util.Utilidades;
/**
 * Clase que se encarga de Tener la Tienda que sera igual para todos los personajes
 * @author Iván Bertolo García
 * @version 2.0
 */
public class Tienda {

    // Creación de objetos disponibles en la tienda
    static ObjetoTienda objeto1 = new ObjetoTienda("Espada Encantada", 40);
    static ObjetoTienda objeto2 = new ObjetoTienda("Armadura de Placas", 55);
    static ObjetoTienda objeto3 = new ObjetoTienda("Yegua de Guerra", 60);
    static ObjetoTienda objeto4 = new ObjetoTienda("Escudo Antimagia", 70);
    /**
     * Permite al personaje comprar objetos en la tienda, afectando sus estadísticas y reduciendo su dinero.
     * Se presentan diferentes opciones de compra con sus respectivos efectos en las características del personaje.
     * 
     * @param personaje Objeto Personaje que realiza las compras y cuyos atributos pueden verse afectados.
     * @throws IOException Si ocurre un error en la lectura de la entrada del usuario.
     */
    public static void tiendaDeObjetos(Personaje personaje) throws IOException {

        // Verifica si el personaje tiene dinero para comprar
        if (personaje.getDinero() > 0) {
            boolean salirTienda = false;
            int opcionTienda = 0;

            do {
                Utilidades.espacios(2);
                Titulos.tituloTienda();
                opcionTienda = Menus.menuTienda(personaje);

                switch (opcionTienda) {
                    case 1: // Compra de Espada Encantada
                        ObjetoTienda.gestionCompra(personaje, objeto1, Titulos.espada());
                        break;
                    case 2: // Armadura de Placas
                        ObjetoTienda.gestionCompra(personaje, objeto2, Titulos.armadura());
                        break;
                    case 3: // Compra de Báculo
                        ObjetoTienda.gestionCompra(personaje, objeto3, Titulos.caballo());
                        break;
                    case 4: // Compra de Manto
                        ObjetoTienda.gestionCompra(personaje, objeto4, Titulos.escudo());
                        break;
                    case 5: // Salir de la tienda
                        salirTienda = true;
                        Utilidades.espacios(2);
                        break;
                    default:
                        System.out.println(Utilidades.ANSI_UNDERLINE + "Escriba una opción válida (1-5)" + Utilidades.ANSI_RESET);
                        break;
                }

            } while (!salirTienda);  

        }else{
            System.out.println(Utilidades.ANSI_UNDERLINE+"No tienes dinero no puedes comprar nada"+Utilidades.ANSI_RESET);
            System.out.println();
            System.out.println();
        }
    }

    /**
     * Metodo que se encarga de recoger los objetos de objetoTienda previamente creados en un ArrayList que se podra exportar a otras clases
     * @return Un ArrayList con los objetos necesarios
     */
    public static ArrayList<ObjetoTienda> arrayObjetosTienda(){
        ArrayList<ObjetoTienda> listaObjetos = new ArrayList<>();
        listaObjetos.add(objeto1);
        listaObjetos.add(objeto2);
        listaObjetos.add(objeto3);
        listaObjetos.add(objeto4);
        return listaObjetos;
    }
}
