
import java.io.BufferedReader;
import java.io.IOException;
/**
 * Clase que se encarga de Tener la Tienda que sera igual para todos los personajes
 */
public class Tienda {
    
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_UNDERLINE = "\u001B[4m";;

    /**
     * Permite al personaje comprar objetos en la tienda, afectando sus estadísticas y reduciendo su dinero.
     * Se presentan diferentes opciones de compra con sus respectivos efectos en las características del personaje.
     * 
     * @param titulo    Objeto Titulos utilizado para mostrar encabezados en la tienda.
     * @param menu      Objeto Menus utilizado para mostrar el menú de la tienda.
     * @param personaje Objeto Personaje que realiza las compras y cuyos atributos pueden verse afectados.
     * @throws IOException Si ocurre un error en la lectura de la entrada del usuario.
     */
    public void tiendaDeObjetos(Titulos titulo, Menus menu, Personaje personaje) throws IOException {

        // Creación de objetos disponibles en la tienda
        ObjetoTienda objeto1 = new ObjetoTienda("Pechera", 40);
        ObjetoTienda objeto2 = new ObjetoTienda("Mandoble", 55);
        ObjetoTienda objeto3 = new ObjetoTienda("Báculo", 60);
        ObjetoTienda objeto4 = new ObjetoTienda("Manto", 70);

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
                    titulo.tituloTienda();
                    comprarObjetos = menu.menuTienda();

                    switch (comprarObjetos) {
                        case 1: // Compra de Pechera
                            objetoComprado = objeto1.objetoTienda(objeto1, personaje);
                            if (objetoComprado) {
                                personaje.setDinero(personaje.getDinero() - objeto1.getPrecio());
                                personaje.setVitalidad(personaje.getVitalidad() + 4);
                                personaje.setAgilidad(personaje.getAgilidad() - 2);
                            }
                            break;
                        case 2: // Compra de Mandoble
                            objetoComprado = objeto2.objetoTienda(objeto2, personaje);
                            if (objetoComprado) {
                                personaje.setDinero(personaje.getDinero() - objeto2.getPrecio());
                                personaje.setFuerza(personaje.getFuerza() + 5);
                                personaje.setAgilidad(personaje.getAgilidad() - 1);
                                personaje.setPercepcionMagica(personaje.getPercepcionMagica() - 2);
                            }
                            break;
                        case 3: // Compra de Báculo
                            objetoComprado = objeto3.objetoTienda(objeto3, personaje);
                            if (objetoComprado) {
                                personaje.setDinero(personaje.getDinero() - objeto3.getPrecio());
                                personaje.setFuerza(personaje.getFuerza() - 3);
                                personaje.setPercepcionMagica(personaje.getPercepcionMagica() + 7);
                            }
                            break;
                        case 4: // Compra de Manto
                            objetoComprado = objeto4.objetoTienda(objeto4, personaje);
                            if (objetoComprado) {
                                personaje.setDinero(personaje.getDinero() - objeto4.getPrecio());
                                personaje.setAgilidad(personaje.getAgilidad() + 5);
                                personaje.setPercepcionMagica(personaje.getPercepcionMagica() + 2);
                                personaje.setVitalidad(personaje.getVitalidad() - 4);
                            }
                            break;
                        case 5: // Salir de la tienda
                            dejarDeComprar = true;
                            System.out.println();
                            System.out.println();
                            break;
                        default:
                            System.out.println(ANSI_UNDERLINE + "Escriba una opción válida (1-5)" + ANSI_RESET);
                            break;
                    }

                } while (!dejarDeComprar);

                salirTienda = true;
            } while (!salirTienda);  

            }else{
                System.out.println(ANSI_UNDERLINE+"No tienes dinero no puedes comprar nada"+ANSI_RESET);
                System.out.println();
                System.out.println();
            }
    }
}
