package clases.personajes;
import java.util.ArrayList;
import java.util.Random;

import clases.tienda.ObjetoTienda;

public class ConstantesPersonaje {
    

    // Constantes Generales
    public static final int DINERO = 200;
    public static final double SALUD = 5.0;
    public static final int EXPERIENCIA = 0;
    public static final int NIVEL = 1;
    public static final ArrayList<ObjetoTienda> INVENTARIO = new ArrayList<>();
    public static final int ENEMIGO_ESTAMINA= 3;

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

    // Implementación de nombres aleatorios
     static Random rand = new Random();
     static String[] nombres = {"Juan", "Luis", "Carlos", "Fernando", "Pedro", "Felipe", "Marcos", "Roberto", "Ivan", "Diego", "Daniel", "Arturo"};
     static int numAleatorio = rand.nextInt(nombres.length);
    
    // Constantes para Enemigo1

     public static final String ENEMIGO1_NOMBRE = nombres[numAleatorio];
     public static final int ENEMIGO1_VITALIDAD = 4;
     public static final int ENEMIGO1_FUERZA = 3;
     public static final int ENEMIGO1_AGILIDAD = 2;
     public static final double ENEMIGO1_SALUD= 1;
     public static final int ENEMIGO1_NIVEL = 0;
     public static final String ENEMIGO1_TIPO = "Campesino";

     // Constantes para Enemigo2

     public static final String ENEMIGO2_NOMBRE = nombres[numAleatorio];
     public static final int ENEMIGO2_VITALIDAD = 6;
     public static final int ENEMIGO2_FUERZA = 5;
     public static final int ENEMIGO2_AGILIDAD = 2;
     public static final double ENEMIGO2_SALUD= 1.5;
     public static final int ENEMIGO2_NIVEL = 1;
     public static final String ENEMIGO2_TIPO = "Caballero";

      // Constantes para Enemigo3

      public static final String ENEMIGO3_NOMBRE = nombres[numAleatorio];
      public static final int ENEMIGO3_VITALIDAD = 4;
      public static final int ENEMIGO3_FUERZA = 3;
      public static final int ENEMIGO3_AGILIDAD = 4;
      public static final double ENEMIGO3_SALUD= 1.2;
      public static final int ENEMIGO3_NIVEL = 0;
      public static final String ENEMIGO3_TIPO = "Bandido";

      // Constantes para Enemigo4

      public static final String ENEMIGO4_NOMBRE = nombres[numAleatorio];
      public static final int ENEMIGO4_VITALIDAD = 5;
      public static final int ENEMIGO4_FUERZA = 4;
      public static final int ENEMIGO4_AGILIDAD = 4;
      public static final double ENEMIGO4_SALUD= 1.4;
      public static final int ENEMIGO4_NIVEL = 2;
      public static final String ENEMIGO4_TIPO = "Mercenario";

     public static Luchador luchador = new Luchador(LUCHADOR_NOMBRE, DINERO, LUCHADOR_VITALIDAD, LUCHADOR_FUERZA, LUCHADOR_AGILIDAD, LUCHADOR_PERCEPCION_MAGICA, SALUD, EXPERIENCIA, NIVEL, LUCHADOR_ESTADISTICA_ESPECIAL, INVENTARIO);
     public static Asesino asesino = new Asesino(ASESINO_NOMBRE, DINERO, ASESINO_VITALIDAD, ASESINO_FUERZA, ASESINO_AGILIDAD, ASESINO_PERCEPCION_MAGICA, SALUD, EXPERIENCIA, NIVEL, ASESINO_ESTADISTICA_ESPECIAL, INVENTARIO);
     public static Tanque tanque = new Tanque(TANQUE_NOMBRE, DINERO, TANQUE_VITALIDAD, TANQUE_FUERZA, TANQUE_AGILIDAD, TANQUE_PERCEPCION_MAGICA, SALUD, EXPERIENCIA, NIVEL, TANQUE_ESTADISTICA_ESPECIAL, INVENTARIO);
     public static Mago mago = new Mago(MAGO_NOMBRE, DINERO, MAGO_VITALIDAD, MAGO_FUERZA, MAGO_AGILIDAD, MAGO_PERCEPCION_MAGICA, SALUD, EXPERIENCIA, NIVEL, MAGO_ESTADISTICA_ESPECIAL, INVENTARIO);

     public static Enemigo enemigo1 = new Enemigo(ENEMIGO1_NOMBRE, ENEMIGO1_VITALIDAD, ENEMIGO1_FUERZA, ENEMIGO1_AGILIDAD, ENEMIGO1_SALUD, ENEMIGO1_NIVEL, ENEMIGO1_TIPO, ENEMIGO_ESTAMINA);
     public static Enemigo enemigo2 = new Enemigo(ENEMIGO2_NOMBRE, ENEMIGO2_VITALIDAD, ENEMIGO2_FUERZA, ENEMIGO2_AGILIDAD, ENEMIGO2_SALUD, ENEMIGO2_NIVEL, ENEMIGO2_TIPO, ENEMIGO_ESTAMINA);
     public static Enemigo enemigo3 = new Enemigo(ENEMIGO3_NOMBRE, ENEMIGO3_VITALIDAD, ENEMIGO3_FUERZA, ENEMIGO3_AGILIDAD, ENEMIGO3_SALUD, ENEMIGO3_NIVEL, ENEMIGO3_TIPO, ENEMIGO_ESTAMINA);
     public static Enemigo enemigo4 = new Enemigo(ENEMIGO4_NOMBRE, ENEMIGO4_VITALIDAD, ENEMIGO4_FUERZA, ENEMIGO4_AGILIDAD, ENEMIGO4_SALUD, ENEMIGO4_NIVEL, ENEMIGO4_TIPO, ENEMIGO_ESTAMINA);
}
