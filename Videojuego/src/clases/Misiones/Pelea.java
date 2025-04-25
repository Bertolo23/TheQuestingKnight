package clases.misiones;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import clases.estadísticas.GestionEstadisticas;
import clases.interfaz.Titulos;
import clases.personajes.Enemigo;
import clases.personajes.Personaje;
import clases.tienda.ObjetoTienda;
import util.Utilidades;

public class Pelea {
    
         /**
         * Método principal que gestiona la pelea entre un personaje y un enemigo.
         * Permite al jugador decidir entre atacar o defenderse en cada turno.
         * La pelea continúa hasta que se cumpla alguna condición de finalización.
         * 
         * @param personaje El personaje controlado por el jugador.
         * @param enemigo El enemigo contra el que se enfrenta.
         * @param listaObjetos Lista de objetos posibles del juego.
         * @return El daño total recibido por el personaje durante el combate.
         * @throws IOException Si hay un error de entrada/salida durante la interacción.
         */
        public static double pelea(Personaje personaje, Enemigo enemigo, ArrayList<ObjetoTienda> listaObjetos ) throws IOException{
            Random rand = new Random();
            Titulos.enfrentamiento();
            double dañoRealizado = 0;
            double dañoEnemigo = 0;
            double dañoTotalRecibido = 0;
            double probabilidadFallo = 0;
            Utilidades.espacios(2);
            System.out.println("Te vas a enfrentar a un "+ enemigo.getTipo()+ " llamado "+enemigo.getNombre());
            boolean salirPelea = false;
            do {
                int opcionPelea = Utilidades.leerEntero("\nQuieres atacar o defenderte?(1 | 2)");
                if (opcionPelea == 1) {
                    
                    dañoRealizado = dañoProvocado(personaje, enemigo, listaObjetos, rand);
                    enemigo.setSalud(enemigo.getSalud()- (double) dañoRealizado);
                    System.out.println("\nRealizaste "+Utilidades.ANSI_UNDERLINE+Utilidades.ANSI_RED+ dañoRealizado+Utilidades.ANSI_RESET+" de daño");

                    System.out.println("\nAl no protegerte támbien vas a recibir un ataque");
                    dañoEnemigo = dañoRecibido(personaje, enemigo, listaObjetos, rand);
                    personaje.setSalud(personaje.getSalud() - dañoEnemigo);
                    System.out.println("\nPerdiste "+Utilidades.ANSI_UNDERLINE+Utilidades.ANSI_CYAN+ dañoEnemigo+Utilidades.ANSI_RESET+" de salud");
                    dañoTotalRecibido +=dañoEnemigo;

                }else if (opcionPelea == 2) {
                    probabilidadFallo = probabilidadFallo(personaje, enemigo, listaObjetos, rand);
                    System.out.println("\nTienes una probabilidad de parar el siguiente ataque de: "+Utilidades.ANSI_UNDERLINE+Utilidades.ANSI_GREEN+ probabilidadFallo*100+"%"+Utilidades.ANSI_RESET);

                    if (((double) Math.round(rand.nextDouble(1) * 100.0) / 100)>probabilidadFallo) {
                        dañoEnemigo = dañoRecibido(personaje, enemigo, listaObjetos, rand);
                        personaje.setSalud(personaje.getSalud() - dañoEnemigo);
                        System.out.println("\nPerdiste "+Utilidades.ANSI_UNDERLINE+Utilidades.ANSI_CYAN+ dañoEnemigo+Utilidades.ANSI_RESET+" de salud");
                        dañoTotalRecibido +=dañoEnemigo;
                    }else{
                        System.out.println(Utilidades.ANSI_UNDERLINE+Utilidades.ANSI_BOLD+"\nEsquivaste"+Utilidades.ANSI_RESET+" el ataque");
                    }
                    if (enemigo.getFatiga()<5) {
                        System.out.println("\nEl enemigo se cansa su proximo ataque sera más débil");
                        enemigo.setFatiga(enemigo.getFatiga()+1);
                    }
                }else{
                    System.out.println("\nEscriba una opción correcta(1 | 2)");
                }
                if (personaje.condiccionesFinalizacion() == true || enemigo.getSalud()<=0) {
                    if (enemigo.getSalud()<=0) {
                        System.out.println("\nHas matado al enemigo");
                    }
                    salirPelea = true;
                }
            } while (salirPelea == false);
            GestionEstadisticas.reseteoEstadisticasEnemigo(enemigo);
            return dañoTotalRecibido;
            
        }

        /**
         * Calcula el daño que el personaje recibe de parte del enemigo.
         * Tiene en cuenta si el personaje tiene un objeto de defensa equipado.
         * 
         * @param personaje El personaje que recibe el daño.
         * @param enemigo El enemigo que inflige el daño.
         * @param listaObjetos Lista de objetos del juego.
         * @param rand Instancia de Random para los cálculos aleatorios.
         * @return El valor del daño recibido, ya ajustado y redondeado.
         */
        public static double dañoRecibido(Personaje personaje, Enemigo enemigo, ArrayList<ObjetoTienda> listaObjetos, Random rand){
            double dañoEnemigo = 0;
            if (personaje.getInventario().contains(listaObjetos.get(1))) {
                double valor = (((rand.nextDouble(0.5)+3.5) + enemigo.getFuerza() - (personaje.getVitalidad()/2))/10)*0.75;
                dañoEnemigo = (double) Math.round(valor * 100.0) / 100;
                System.out.println("\nAl tener equipada la "+listaObjetos.get(1).getNombre()+" te protegera parte del golpe");
            }else{
                double valor = ((rand.nextDouble(0.5)+3.5) + enemigo.getFuerza() - (personaje.getVitalidad()/2))/10;
                dañoEnemigo = (double) Math.round(valor * 100.0) / 100;
            }
            dañoEnemigo *= (1-(0.15 * enemigo.getFatiga()));
            if (dañoEnemigo<=0.15) {
                dañoEnemigo = 0.15;
            }
            return (double) dañoEnemigo; 
        }

        /**
         * Calcula el daño que el personaje inflige al enemigo.
         * Depende de si el personaje tiene un arma equipada o no.
         * 
         * @param personaje El personaje que ataca.
         * @param enemigo El enemigo que recibe el daño.
         * @param listaObjetos Lista de objetos del juego.
         * @param rand Instancia de Random para los cálculos aleatorios.
         * @return El valor del daño infligido, ajustado y redondeado.
         */
        public static double dañoProvocado(Personaje personaje, Enemigo enemigo, ArrayList<ObjetoTienda> listaObjetos, Random rand){
            double dañoRealizado = 0;
            if (personaje.getInventario().contains(listaObjetos.get(0))) {
                System.out.println("\nVas a atacar con la "+listaObjetos.get(0).getNombre()+"...");
                double valor = (((rand.nextDouble(3)) + personaje.getFuerza() - enemigo.getVitalidad())/10)*1.25;
                dañoRealizado = (double) Math.round(valor * 100.0) / 100;
            }else{
                System.out.println("\nVas a atacar con una daga...");
                double valor = ((rand.nextDouble(3)) + personaje.getFuerza() - enemigo.getVitalidad())/10;
                dañoRealizado = (double) Math.round(valor * 100.0) / 100;
            }
            return (double) dañoRealizado; 
        }

        /**
         * Calcula la probabilidad de que el personaje esquive un ataque enemigo.
         * Depende de si tiene un objeto defensivo y de la diferencia de estadísticas.
         * 
         * @param personaje El personaje que se defiende.
         * @param enemigo El enemigo que ataca.
         * @param listaObjetos Lista de objetos del juego.
         * @param rand Instancia de Random para los cálculos aleatorios.
         * @return La probabilidad de esquivar el ataque, redondeada.
         */
        public static double probabilidadFallo(Personaje personaje, Enemigo enemigo, ArrayList<ObjetoTienda> listaObjetos, Random rand){
            double probabilidadFallo = 0;
            if (personaje.getInventario().contains(listaObjetos.get(3))) {
                System.out.println("\nTe protegeras con el "+listaObjetos.get(3).getNombre());
                double valor = (((rand.nextDouble(2)) - (enemigo.getAgilidad()+enemigo.getNivel()) + personaje.getAgilidad())/10)*1.25;
                probabilidadFallo = (double) Math.round(valor * 100.0) / 100;
            }else{
                System.out.println("\nTe protegeras como puedas");
                double valor = (((rand.nextDouble(1.5)) - ((enemigo.getAgilidad()+enemigo.getNivel())*2) + personaje.getAgilidad())/10);
                probabilidadFallo = (double) Math.round(valor * 100.0) / 100;
            }
            if (probabilidadFallo<=0.15) {
                probabilidadFallo = 0.15;
            }
            return (double) probabilidadFallo; 
        }
}
