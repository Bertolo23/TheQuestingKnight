package bbdd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import clases.partida.Partida;

public class CRUD {
    
        public static void insertarPartidaSQL(Partida partida){
            String sentencia = "INSERT INTO Partidas (id_Personaje, FechaYHoraInicio, FechaYHoraFinal, Duracion, Vitalidad, Fuerza, Agilidad, PercepcionMagica, EstadisticaEspecial, Nivel) Select  (Select id From tipopersonaje where tipoPersonaje = ?), ?, ?, ?, ?, ?, ?, ?, ?, ?";
            
            try (Connection conexion = ConexionBBDD.gConnection();
                 PreparedStatement statement = conexion.prepareStatement(sentencia)) {
                
                statement.setString(1, partida.getPersonaje().getNombre());
                statement.setString(2, partida.horaYFechaCompleta(partida.getFechaInicio()));
                statement.setString(3, partida.horaYFechaCompleta(partida.getFechaFinal()));
                statement.setString(4, partida.duracionPartida(partida.getDuracion()));
                for(int i = 0;i<partida.getEstadisticas().length;i++){
                    statement.setInt(i+5, partida.getEstadisticas()[i]);
                }

                int filas = statement.executeUpdate();
                if (filas>0) {
                    System.out.println("Partida insertada a la BBDD con exito");
                }
            } catch (SQLException e) {
                System.out.println("error "+ e.getMessage());
            }
        }

        
}
