package bbdd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

import clases.partida.Partida;
import clases.tienda.ObjetoTienda;

public class CRUD {


    public static void insertarEstadisticas(Partida partida){
        String sentencia = "INSERT INTO Estadisticas (Vitalidad, Fuerza, Agilidad, PercepcionMagica, EstadisticaEspecial, Nivel) Values  (?, ?, ?, ?, ?, ?)";
        
        try (Connection conexion = ConexionBBDD.gConnection();
             PreparedStatement statement = conexion.prepareStatement(sentencia)) {
            
            
            for(int i = 0;i<partida.getEstadisticas().length;i++){
                statement.setInt(i+1, partida.getEstadisticas()[i]);
            }

            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("error "+ e.getMessage());
        }
    }
    
    public static void insertarObjetosTienda(Partida partida){
        String sentencia = "INSERT INTO InventariObjetos (Objeto_1, Objeto_2, Objeto_3, Objeto_4) Values  (?, ?, ?, ?)";
        
        try (Connection conexion = ConexionBBDD.gConnection();
             PreparedStatement statement = conexion.prepareStatement(sentencia)) {
            String [] arrayNombresObjetos = new String[4];
            int i = 0;
            for (ObjetoTienda objetoTienda : partida.getPersonaje().getInventario()) {
                arrayNombresObjetos[i] = objetoTienda.getNombre();
                i++;
            }
            System.out.println(Arrays.toString(arrayNombresObjetos));
            for(int j = 0;j<arrayNombresObjetos.length;j++){

                if (arrayNombresObjetos[j] == null) {
                    statement.setString(j+1, null);
                }else{
                    statement.setString(j+1, arrayNombresObjetos[j]);
                }
            }

            statement.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("error "+ e.getMessage());
        }
    }
    
    public static void insertarPartidaSQL(Partida partida){
        insertarEstadisticas(partida);
        insertarObjetosTienda(partida);
        String sentencia = "INSERT INTO Partidas (id_Personaje, id_Estadisticas, id_Inventario, FechaYHoraInicio, FechaYHoraFinal, Duracion, Victoria) Select  (Select id From tipopersonaje where tipoPersonaje = ?), (Select max(id) From Estadisticas), (Select max(id) From InventariObjetos), ?, ?, ?, ?";
        
        try (Connection conexion = ConexionBBDD.gConnection();
             PreparedStatement statement = conexion.prepareStatement(sentencia)) {
            
            statement.setString(1, partida.getPersonaje().getNombre());
            statement.setString(2, partida.horaYFechaCompleta(partida.getFechaInicio()));
            statement.setString(3, partida.horaYFechaCompleta(partida.getFechaFinal()));
            statement.setString(4, partida.duracionPartida(partida.getDuracion()));
            statement.setBoolean(5, partida.getPersonaje().condiccionesVictoria());

            int filas = statement.executeUpdate();
            if (filas>0) {
                System.out.println("Partida insertada a la BBDD con exito");
            }
        } catch (SQLException e) {
            System.out.println("error "+ e.getMessage());
        }
    }

        
}
