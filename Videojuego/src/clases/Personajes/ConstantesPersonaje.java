package clases.Personajes;

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
     public static final int LUCHADOR_ESTADISTICA_ESPECIAL = 12; // Resistencia física
 
     // Constantes para Asesino
     public static final String ASESINO_NOMBRE = "Asesino";
     public static final int ASESINO_VITALIDAD = 5;
     public static final int ASESINO_FUERZA = 6;
     public static final int ASESINO_AGILIDAD = 8;
     public static final int ASESINO_PERCEPCION_MAGICA = 3;
     public static final int ASESINO_ESTADISTICA_ESPECIAL = 9; // Probabilidad de crítico
 
     // Constantes para Tanque
     public static final String TANQUE_NOMBRE = "Tanque";
     public static final int TANQUE_VITALIDAD = 10;
     public static final int TANQUE_FUERZA = 7;
     public static final int TANQUE_AGILIDAD = 3;
     public static final int TANQUE_PERCEPCION_MAGICA = 0;
     public static final int TANQUE_ESTADISTICA_ESPECIAL = 7; // Armadura extra
 
     // Constantes para Mago
     public static final String MAGO_NOMBRE = "Mago";
     public static final int MAGO_VITALIDAD = 4;
     public static final int MAGO_FUERZA = 3;
     public static final int MAGO_AGILIDAD = 5;
     public static final int MAGO_PERCEPCION_MAGICA = 10;
     public static final int MAGO_ESTADISTICA_ESPECIAL = 10; // Poder mágico extra

     public static Luchador luchador = new Luchador(LUCHADOR_NOMBRE, DINERO, LUCHADOR_VITALIDAD, LUCHADOR_FUERZA, LUCHADOR_AGILIDAD, LUCHADOR_PERCEPCION_MAGICA, SALUD, EXPERIENCIA, NIVEL, LUCHADOR_ESTADISTICA_ESPECIAL);
     public static Asesino asesino = new Asesino(ASESINO_NOMBRE, DINERO, ASESINO_VITALIDAD, ASESINO_FUERZA, ASESINO_AGILIDAD, ASESINO_PERCEPCION_MAGICA, SALUD, EXPERIENCIA, NIVEL, ASESINO_ESTADISTICA_ESPECIAL);
     public static Tanque tanque = new Tanque(TANQUE_NOMBRE, DINERO, TANQUE_VITALIDAD, TANQUE_FUERZA, TANQUE_AGILIDAD, TANQUE_PERCEPCION_MAGICA, SALUD, EXPERIENCIA, NIVEL, TANQUE_ESTADISTICA_ESPECIAL);
     public static Mago mago = new Mago(MAGO_NOMBRE, DINERO, MAGO_VITALIDAD, MAGO_FUERZA, MAGO_AGILIDAD, MAGO_PERCEPCION_MAGICA, SALUD, EXPERIENCIA, NIVEL, MAGO_ESTADISTICA_ESPECIAL);


}
