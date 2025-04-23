package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBBDD {
    

        private static final String URL = "jdbc:mysql://localhost:3306/TheQuestingKnightDB";
        private static final String USER = "root";
        private static final String PASSWORD = "admin";

        
        public static Connection gConnection()throws SQLException{
            try {
                String driver = new String ("com.mysql.cj.jdbc.Driver");
                Class.forName(driver);
            } catch (Exception e) {
                System.out.println("No se pudo cargar el driver "+e.getMessage());
            }
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }
}
