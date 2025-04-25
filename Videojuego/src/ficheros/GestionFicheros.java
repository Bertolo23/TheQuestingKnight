package ficheros;

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

import clases.personajes.CreacionPersonajes;
import clases.personajes.Personaje;

public class GestionFicheros {

    /**
     * Escribe información en un archivo de texto.
     * 
     * @param file Archivo donde se escribirá la información.
     * @param contenido Texto que se desea añadir al archivo.
     */
    public static void llevarInfoAFichero(File file, String contenido){
        try {
            FileWriter escritor = new FileWriter(file, true);
            escritor.write(contenido);
            escritor.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Lee y muestra por consola el contenido de un archivo de texto línea por línea.
     * 
     * @param file Archivo desde el cual se quiere leer la información.
     */
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

    /**
     * Deserializa un array de objetos {@code Personaje} desde un archivo binario.
     * 
     * @return Un array de objetos {@code Personaje} leído desde el archivo.
     */
    public static Personaje[] inPutSerializacionPersonajes(){
        Personaje[] tiposPersonajeAlmacenado = new Personaje[4];
        ObjectInputStream ois = null;
        try {
            File file = new File("Videojuego/src/ficheros/PersonajesSerializados.dat");
            ois = new ObjectInputStream(new FileInputStream(file));
            boolean hayObjetos = true;
            while (hayObjetos) {
                try {
                    tiposPersonajeAlmacenado = (Personaje[]) ois.readObject();
                    System.out.println("Objeto guardado " + Arrays.toString(tiposPersonajeAlmacenado));
                } catch (EOFException e) {
                    hayObjetos = false;
                }
            } 
        } catch (EOFException e) {
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

    /**
     * Serializa un array de objetos {@code Personaje} y los guarda en un archivo binario.
     */
    public static void outPutSerializacionPersonajes(){
        Personaje[] tiposPersonaje = {
            CreacionPersonajes.luchador,
            CreacionPersonajes.asesino,
            CreacionPersonajes.tanque,
            CreacionPersonajes.mago
        };
        try {
            File file = new File("Videojuego/src/ficheros/PersonajesSerializados.dat");
            FileOutputStream fo = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fo);

            oos.writeObject(tiposPersonaje);
            oos.close();
            fo.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
