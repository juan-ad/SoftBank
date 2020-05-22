
package entidad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
        
    String url = "jdbc:mysql://localhost:3306/sfbancario?useTimezone=true&serverTimezone=UTC";
    String user = "root";
    String pass = "juanjo";
    
    public Connection conectar(){
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
    
}
