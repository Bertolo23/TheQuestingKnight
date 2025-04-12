package clases.personajes;

public class Enemigo extends Personaje {
    
        private String tipo;
        private int estamina;

        public Enemigo(String nombre, int vitalidad, int fuerza, int agilidad, double salud, int nivel, String tipo, int estamina) {
            super(nombre, vitalidad, fuerza, agilidad, salud, nivel);
            this.tipo = tipo;
            this.estamina = estamina;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public int getEstamina() {
            return estamina;
        }

        public void setEstamina(int estamina) {
            this.estamina = estamina;
        }

        @Override
        public String toString() {
            return super.toString()+"tipo=" + tipo;
        }
        
}
