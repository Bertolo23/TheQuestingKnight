package bbdd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import clases.partida.Partida;
import clases.tienda.ObjetoTienda;
import util.Utilidades;

public class CRUD {


    private static void insertarEstadisticas(Partida partida){
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
    
    private static void insertarObjetosTienda(Partida partida){
        String sentencia = "INSERT INTO InventariObjetos (Objeto_1, Objeto_2, Objeto_3, Objeto_4) SELECT  (Select id From Objetos where Nombre = ?), (Select id From Objetos where Nombre = ?), (Select id From Objetos where Nombre = ?), (Select id From Objetos where Nombre = ?)";
        
        try (Connection conexion = ConexionBBDD.gConnection();
             PreparedStatement statement = conexion.prepareStatement(sentencia)) {

                String [] arrayNombresObjetos = new String[4];
                int i = 0;
                for (ObjetoTienda objetoTienda : partida.getPersonaje().getInventario()) {
                    arrayNombresObjetos[i] = objetoTienda.getNombre();
                    i++;
                }

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
                statement.setBoolean(5, partida.getVictoria());

                int filas = statement.executeUpdate();
                if (filas>0) {
                    System.out.println("Partida insertada a la BBDD con exito");
                }
        } catch (SQLException e) {
            System.out.println("error "+ e.getMessage());
        }
    }

    public static void selectPartidas(){
        String sentencia = "Select * From Partidas";

        try (Connection conexion = ConexionBBDD.gConnection();
            Statement statement = conexion.prepareStatement(sentencia);
            ResultSet resultado = statement.executeQuery(sentencia);) {

            System.out.printf(" %-10s| %-12s| %-15s| %-13s| %-22s| %-22s| %-8s| %-8s|\n", "Id Partida", "Id Personaje", "Id Estadísticas", "Id Inventario", "Fecha Inicio", "Fecha Final", "Duración", "Victoria");
            while (resultado.next()) {
                int idPartida = resultado.getInt("id");
                int idPersonaje = resultado.getInt("id_Personaje");
                int idEstadisticas = resultado.getInt("id_Estadisticas");
                int idInventario = resultado.getInt("id_Inventario");
                String fechaYHoraInicio = resultado.getString("FechaYHoraInicio");
                String fechaYHoraFinal = resultado.getString("FechaYHoraFinal");
                String duracion = resultado.getString("Duracion");
                Boolean victoria = resultado.getBoolean("Victoria");

                
                System.out.println("_".repeat(126));
                System.out.printf(" %-10d| %-12d| %-15d| %-13d| %-22s| %-22s| %-8s| %-8b|\n", idPartida, idPersonaje,idEstadisticas , idInventario, fechaYHoraInicio, fechaYHoraFinal, duracion, victoria);

            }

        } catch (SQLException e) {
        System.out.println("error "+ e.getMessage());
        }
    }

    public static void selectEstadisticas(int id){
        String sentencia = "Select * From Estadisticas Where id = "+id;

        try (Connection conexion = ConexionBBDD.gConnection();
            Statement statement = conexion.prepareStatement(sentencia)) {
            ResultSet resultado = statement.executeQuery(sentencia);

            System.out.printf(" %-9s| %-6s| %-8s| %-16s| %-19s| %-5s|\n", "Vitalidad", "Fuerza", "Agilidad", "PercepcionMagica", "EstadisticaEspecial", "Nivel");
            while (resultado.next()) {
                int Vitalidad = resultado.getInt("Vitalidad");
                int Fuerza = resultado.getInt("Fuerza");
                int Agilidad = resultado.getInt("Agilidad");
                int PercepcionMagica = resultado.getInt("PercepcionMagica");
                int EstadisticaEspecial = resultado.getInt("EstadisticaEspecial");
                int Nivel = resultado.getInt("Nivel");

                
                System.out.println("_".repeat(75));
                System.out.printf(" %-9d| %-6d| %-8d| %-16d| %-19d| %-5d|\n", Vitalidad, Fuerza, Agilidad , PercepcionMagica, EstadisticaEspecial, Nivel);

            }

        } catch (SQLException e) {
        System.out.println("error "+ e.getMessage());
        }
    }

    public static void selectInventario(int id){
        String sentencia = "Select * From InventariObjetos Where id = "+id;

        try (Connection conexion = ConexionBBDD.gConnection();
            Statement statement = conexion.prepareStatement(sentencia)) {
            ResultSet resultado = statement.executeQuery(sentencia);

            System.out.printf(" %-7s| %-7s| %-7s| %-7s|\n", "Objeto1", "Objeto2", "Objeto3", "Objeto4");
            while (resultado.next()) {
                int Objeto1 = resultado.getInt("Objeto_1");
                int Objeto2 = resultado.getInt("Objeto_2");
                int Objeto3 = resultado.getInt("Objeto_3");
                int Objeto4 = resultado.getInt("Objeto_4");

                System.out.println("_".repeat(36));
                System.out.printf(" %-7d| %-7d| %-7d| %-7d|\n", Objeto1, Objeto2, Objeto3 , Objeto4);

            }
            Utilidades.espacios(1);
            selectObjetos();

        } catch (SQLException e) {
        System.out.println("error "+ e.getMessage());
        }
    }

    private static void selectObjetos(){
        String sentencia = "Select * From Objetos";

        try (Connection conexion = ConexionBBDD.gConnection();
            Statement statement = conexion.prepareStatement(sentencia)) {
            ResultSet resultado = statement.executeQuery(sentencia);

            System.out.printf(" %-2s| %-21s|\n", "id", "Nombre");
            while (resultado.next()) {
                int id = resultado.getInt("id");
                String Nombre = resultado.getString("Nombre");

                System.out.println("_".repeat(27));
                System.out.printf(" %-2d| %-21s|\n", id, Nombre);

            }

        } catch (SQLException e) {
        System.out.println("error "+ e.getMessage());
        }
    }

        
}
