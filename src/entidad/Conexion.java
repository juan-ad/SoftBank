
package entidad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Conexion {
    
    String url = "jdbc:mysql://localhost:3306/sfbancario?useTimezone=true&serverTimezone=UTC";
    String user = "root";
    public Connection conectar(){
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, "juanjo");
        }catch(ClassNotFoundException | SQLException ex){
            Logger.getLogger(getClass().getName()).log(
            Level.WARNING, "No se pudo conectar a la base de datos",ex);
        }
        
        return con;
    }
    
}
