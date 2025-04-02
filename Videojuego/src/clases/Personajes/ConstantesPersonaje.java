package clases.Personajes;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ConstantesPersonaje {
    

    // Constantes Generales
    public static final int DINERO = 0;
    public static final double SALUD = 5.0;
    public static final int EXPERIENCIA = 0;
    public static final int NIVEL = 1;

     // Constantes para Luchador
     public static final String LUCHADOR_NOMBRE = "Luchador";
     public static final int LUCHADOR_VITALIDAD = 9;
     public static final int LUCHADOR_FUERZA = 8;
     public static final int LUCHADOR_AGILIDAD = 7;
     public static final int LUCHADOR_PERCEPCION_MAGICA = 2;
     public static final int LUCHADOR_ESTADISTICA_ESPECIAL = 12; 
 
     // Constantes para Asesino
     public static final String ASESINO_NOMBRE = "Asesino";
     public static final int ASESINO_VITALIDAD = 5;
     public static final int ASESINO_FUERZA = 6;
     public static final int ASESINO_AGILIDAD = 8;
     public static final int ASESINO_PERCEPCION_MAGICA = 3;
     public static final int ASESINO_ESTADISTICA_ESPECIAL = 9; 
 
     // Constantes para Tanque
     public static final String TANQUE_NOMBRE = "Tanque";
     public static final int TANQUE_VITALIDAD = 10;
     public static final int TANQUE_FUERZA = 7;
     public static final int TANQUE_AGILIDAD = 3;
     public static final int TANQUE_PERCEPCION_MAGICA = 0;
     public static final int TANQUE_ESTADISTICA_ESPECIAL = 7; 
 
     // Constantes para Mago
     public static final String MAGO_NOMBRE = "Mago";
     public static final int MAGO_VITALIDAD = 4;
     public static final int MAGO_FUERZA = 3;
     public static final int MAGO_AGILIDAD = 5;
     public static final int MAGO_PERCEPCION_MAGICA = 10;
     public static final int MAGO_ESTADISTICA_ESPECIAL = 10; 

     public static Luchador luchador = new Luchador(LUCHADOR_NOMBRE, DINERO, LUCHADOR_VITALIDAD, LUCHADOR_FUERZA, LUCHADOR_AGILIDAD, LUCHADOR_PERCEPCION_MAGICA, SALUD, EXPERIENCIA, NIVEL, LUCHADOR_ESTADISTICA_ESPECIAL);
     public static Asesino asesino = new Asesino(ASESINO_NOMBRE, DINERO, ASESINO_VITALIDAD, ASESINO_FUERZA, ASESINO_AGILIDAD, ASESINO_PERCEPCION_MAGICA, SALUD, EXPERIENCIA, NIVEL, ASESINO_ESTADISTICA_ESPECIAL);
     public static Tanque tanque = new Tanque(TANQUE_NOMBRE, DINERO, TANQUE_VITALIDAD, TANQUE_FUERZA, TANQUE_AGILIDAD, TANQUE_PERCEPCION_MAGICA, SALUD, EXPERIENCIA, NIVEL, TANQUE_ESTADISTICA_ESPECIAL);
     public static Mago mago = new Mago(MAGO_NOMBRE, DINERO, MAGO_VITALIDAD, MAGO_FUERZA, MAGO_AGILIDAD, MAGO_PERCEPCION_MAGICA, SALUD, EXPERIENCIA, NIVEL, MAGO_ESTADISTICA_ESPECIAL);
    
    public static void outPutSerializacionPersonajes(){
        Personaje [] tiposPersonaje = {luchador,asesino,tanque,mago};
        try{
            File file = new File("Videojuego/src/PersonajesSerializados.dat");
            FileOutputStream fo = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fo);

            oos.writeObject(tiposPersonaje);
            fo.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }

    public static Personaje [] inPutSerializacionPersonajes(){
        Personaje [] tiposPersonajeAlmacenado = new Personaje[4];
        ObjectInputStream ois = null;
        try{
            File file = new File("Videojuego/src/PersonajesSerializados.dat");
            ois = new ObjectInputStream(new FileInputStream(file));
            boolean hayObjetos = true;
            while (hayObjetos) {
                try {
                    tiposPersonajeAlmacenado = (Personaje []) ois.readObject();
                    System.out.println("Objeto guardado "+Arrays.toString(tiposPersonajeAlmacenado));
                } catch (EOFException e) {
                    hayObjetos = false;
                }
                
            } 
        }catch(IOException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            try {
                ois.close();
            } catch (IOException e) {
                System.out.println(e);
            }
            
        }
        return tiposPersonajeAlmacenado;
    }


}
