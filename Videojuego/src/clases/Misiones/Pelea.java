package clases.misiones;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import clases.interfaz.Titulos;
import clases.personajes.Enemigo;
import clases.personajes.Personaje;
import clases.tienda.ObjetoTienda;
import clases.tienda.Tienda;
import util.Utilidades;

public class Pelea {
    
        public static double pelea(Personaje personaje, Enemigo enemigo, ArrayList<ObjetoTienda> listaObjetos ) throws IOException{
            Random rand = new Random();
            Titulos.enfrentamiento();
            double daño = 0;
            double dañoEnemigo = 0;
            double dañoTotalRecibido = 0;
            Utilidades.espacios(2);
            System.out.println("Te vas a enfrentar a un "+ enemigo.getTipo()+ " llamado "+enemigo.getNombre());
            System.out.println();
            boolean salirPelea = false;
            do {
                int opcionPelea = Utilidades.leerEntero("Quieres atacar o defenderte?(1 | 2)");
                if (opcionPelea == 1) {
                    if (personaje.getInventario().contains(listaObjetos.get(0))) {
                        System.out.println("Vas a atacar con la "+listaObjetos.get(0).getNombre()+"...");
                        double valor = (((rand.nextDouble(3)) + personaje.getFuerza() - enemigo.getVitalidad())/10)*1.25;
                        daño = (double) Math.round(valor * 100.0) / 100;
                    }else{
                        System.out.println("Vas a atacar con una daga...");
                        double valor = ((rand.nextDouble(3)) + personaje.getFuerza() - enemigo.getVitalidad())/10;
                        daño = (double) Math.round(valor * 100.0) / 100;
                    }
                    System.out.println();
                    System.out.println("Realizaste "+ (double) daño+ " de daño");
                    enemigo.setSalud(enemigo.getSalud()- (double) daño);

                    System.out.println("Al no protegerte támbien has recibido ");
                    if (personaje.getInventario().contains(listaObjetos.get(1))) {
                        double valor = (((rand.nextDouble(0.5)+3.5) + enemigo.getFuerza() - (personaje.getVitalidad()/2))/10)*0.75;
                        dañoEnemigo = (double) Math.round(valor * 100.0) / 100;
                    }else{
                        double valor = ((rand.nextDouble(0.5)+3.5) + enemigo.getFuerza() - (personaje.getVitalidad()/2))/10;
                        dañoEnemigo = (double) Math.round(valor * 100.0) / 100;
                        if (dañoEnemigo<=0.15) {
                            dañoEnemigo = 0.15;
                        }
                    }
                    System.out.println();
                    System.out.println((double) dañoEnemigo+" daño");
                    personaje.setSalud(personaje.getSalud()- (double) dañoEnemigo);
                    dañoTotalRecibido +=(double) dañoEnemigo; 
                }
                if (personaje.condiccionesVictoria() == true || enemigo.getSalud()<=0) {
                    if (enemigo.getSalud()<=0) {
                        System.out.println("Has matado al enemigo");
                    }
                    salirPelea = true;
                }
            } while (salirPelea == false);
            
            return dañoTotalRecibido;
            
        }
}
