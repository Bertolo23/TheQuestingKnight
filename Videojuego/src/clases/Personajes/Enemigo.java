package clases.personajes;

public class Enemigo extends Personaje {
    
        private String tipo;
        private int fatiga;

        public Enemigo(String nombre, int vitalidad, int fuerza, int agilidad, double salud, int nivel, String tipo, int fatiga) {
            super(nombre, vitalidad, fuerza, agilidad, salud, nivel);
            this.tipo = tipo;
            this.fatiga = fatiga;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public int getFatiga() {
            return fatiga;
        }

        public void setFatiga(int fatiga) {
            this.fatiga = fatiga;
        }

        @Override
        public String toString() {
            return super.toString()+"tipo=" + tipo;
        }
        
}
