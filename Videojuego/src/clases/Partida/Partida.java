package Partida;
import util.Utilidades;
import java.time.LocalDateTime;

public class Partida {
    
        private LocalDateTime fechaInicio;
        private String nombrePersonaje;
        private int [] estadisticas;
        private LocalDateTime fechaFinal;

        /**
         * CONSTRUCTOR
         */
        /**
         * Constructor de la clase Partida
         * @param estadisticas
         * @param fecha
         */

        public Partida(LocalDateTime fechaInicio, String nombrePersonaje, int[] estadisticas, LocalDateTime fechaFinal) {
            this.fechaInicio = fechaInicio;
            this.nombrePersonaje = nombrePersonaje;
            this.estadisticas = estadisticas;
            this.fechaFinal = fechaFinal;
        }

        /**
         * GETTERS Y SETTERS
         */

        public int[] getEstadisticas() {
            return estadisticas;
        }

        public void setEstadisticas(int[] estadisticas) {
            this.estadisticas = estadisticas;
        }

        public LocalDateTime getFechaInicio() {
            return fechaInicio;
        }

        public void setFechaInicio(LocalDateTime fechaInicio) {
            this.fechaInicio = fechaInicio;
        }

        public String getNombrePersonaje() {
            return nombrePersonaje;
        }

        public void setNombrePersonaje(String nombrePersonaje) {
            this.nombrePersonaje = nombrePersonaje;
        }

        public LocalDateTime getFechaFinal() {
            return fechaFinal;
        }

        public void setFechaFinal(LocalDateTime fechaFinal) {
            this.fechaFinal = fechaFinal;
        }

        public String horaYFechaCompleta(LocalDateTime tiempo){

            int año = tiempo.getYear();
            int mes = tiempo.getMonthValue();
            int dia = tiempo.getDayOfMonth();
            int hora = tiempo.getHour();
            int minutos = tiempo.getMinute();
            int segundos = tiempo.getSecond();
            return"a las "+hora+":"+minutos+":"+segundos+" el "+dia+"/"+mes+"/"+año ;
        }

        @Override
        public String toString() {
            return "Partida empezada "+ horaYFechaCompleta(fechaInicio) + "\nCon el personaje " +Utilidades.ANSI_UNDERLINE+ nombrePersonaje + Utilidades.ANSI_RESET+"\nLas estadísticas y el nivel finales fueron: "
                    +Utilidades.ANSI_GREEN+estadisticas[0]+" "+Utilidades.ANSI_RED+estadisticas[1]+" "+Utilidades.ANSI_YELLOW+estadisticas[2]+" "+Utilidades.ANSI_BLUE+estadisticas[3]+" "+Utilidades.ANSI_PURPLE+estadisticas[4]+" "+Utilidades.ANSI_RESET+estadisticas[5]+
                    "\nY la partida termino "+ horaYFechaCompleta(fechaFinal);
        }

        


        
        
}
