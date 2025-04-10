package FicherosYSerializacion;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import clases.Personajes.ConstantesPersonaje;
import clases.Personajes.Personaje;

public class GestionFicheros {
    
    public static void llevarInfoAFichero(File file, String contenido){
        try {
            FileWriter escritor = new FileWriter(file, true);
            escritor.write(contenido);
            escritor.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void traerInfoFichero(File file){
        String cad;
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while ((cad = br.readLine()) != null) {
                System.out.println(cad);
            }
            br.close();
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    public static Personaje [] inPutSerializacionPersonajes(){
        Personaje [] tiposPersonajeAlmacenado = new Personaje[4];
        ObjectInputStream ois = null;
        try{
            File file = new File("Videojuego/src/FicherosYSerializacion/PersonajesSerializados.dat");
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
        }catch(EOFException e){
            System.out.println("Fin del archivo alcanzado.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer el archivo: " + e);
        } finally {
            try {
                if (ois != null){
                    ois.close();
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        return tiposPersonajeAlmacenado;
    }

    public static void outPutSerializacionPersonajes(){
        Personaje [] tiposPersonaje = {ConstantesPersonaje.luchador,ConstantesPersonaje.asesino,ConstantesPersonaje.tanque,ConstantesPersonaje.mago};
        try{
            File file = new File("Videojuego/src/FicherosYSerializacion/PersonajesSerializados.dat");
            FileOutputStream fo = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fo);

            oos.writeObject(tiposPersonaje);
            oos.close();
            fo.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
