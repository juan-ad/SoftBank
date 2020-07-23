package logica;

import entidad.Conexion;
import entidad.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juan Jose
 */
public class UsuarioDAO {
    
    private Conexion con = new Conexion();
    private Connection acceso;
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;
    private static final String errorDb = "No se pudo cerrar la conexion"; 
    
  
    public int registrarUsuario(Usuario user){
        int rpta = 0;
        sql = "INSERT INTO persona (cedula,nombre,apellido,telefono,direccion) VALUES(?,?,?,?,?)";
        String sql2 = "INSERT INTO usuario (idusuario,pass,rol) VALUES((SELECT idPersona FROM persona ORDER BY idpersona DESC LIMIT 1),?,?)";
        
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setString(1, user.getCedula());
            ps.setString(2, user.getNombre());
            ps.setString(3, user.getApellido());
            ps.setString(4, user.getTelefono());
            ps.setString(5, user.getDireccion());
            
            if(ps.executeUpdate() != 0){
                PreparedStatement ps2 = acceso.prepareStatement(sql2);
                ps2.setString(1, user.getPass());
                ps2.setString(2, user.getRol());
                rpta =ps2.executeUpdate();
            }
            
            acceso.close();
        } catch (SQLException ex) {
            errores(ex, "Error en la base de datos con Rgistrar Usuario");
        }finally {
            try {
                acceso.close();
            } catch (SQLException ex) {
                errores(ex, errorDb);                
            }
        }
                
        return rpta;
    }
    
    public Usuario validarUsuario(String cedula, String pass){
        sql = "SELECT idPersona,cedula,pass,rol FROM persona JOIN usuario ON persona.idPersona = usuario.idusuario WHERE cedula like ? and pass like ?";
        Usuario usr = new Usuario();
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setString(1, cedula);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            
            if(rs.next()){
                usr.setIdPersona(rs.getInt(1));
                usr.setCedula(rs.getString(2));
                usr.setPass(rs.getString(3));
                usr.setRol(rs.getString(4));
            }
            acceso.close();
        } catch (SQLException ex) {
            errores(ex, "Error en la base de datos con validar Usuario");
        }finally {
            try {
                acceso.close();
            } catch (SQLException ex) {
               errores(ex, errorDb);
            }
        }
        
        return usr;
    }
    
    public int validarCedula(String cedula){
        
        sql = "SELECT COUNT(*) FROM persona WHERE cedula like ?";
        int rpta = 0;
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setString(1, cedula);
            rs = ps.executeQuery();
            
            if(rs.next()){
                rpta = rs.getInt(1);
            }
            acceso.close();
        } catch (SQLException ex) {
            errores(ex, "Error en la base de datos con validar Usuario");
        }finally {
            try {
                acceso.close();
            } catch (SQLException ex) {
               errores(ex, errorDb);
            }
        }
        
        return rpta;
    }
    
    public int cambiarContraseña(String cedula, String actual, String nc){
        
        sql = "UPDATE usuario JOIN persona ON usuario.idusuario = persona.idPersona SET pass=? WHERE cedula=? and pass=?";
        int rpta = 0;
        try{
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setString(1, nc);
            ps.setString(2, cedula);
            ps.setString(3, actual);
            rpta = ps.executeUpdate();
                        
        }catch(SQLException ex){
            errores(ex, "Error en la base de datos con Cambiar Contraseña");
        }
        return rpta;
    }
    public Usuario consultarUsuario(String cedula){
        
        sql = "SELECT idPersona,cedula,nombre,apellido,telefono,direccion,pass,rol FROM persona JOIN usuario ON persona.idPersona = usuario.idusuario WHERE cedula like ?";
        Usuario usr = new Usuario();
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setString(1, cedula);
            rs = ps.executeQuery();
            
            if(rs.next()){
                usr.setIdPersona(rs.getInt(1));
                usr.setCedula(rs.getString(2));
                usr.setNombre(rs.getString(3));
                usr.setApellido(rs.getString(4));
                usr.setTelefono(rs.getString(5));
                usr.setDireccion(rs.getString(6));
                usr.setPass(rs.getString(7));
                usr.setRol(rs.getString(8));
            }
            acceso.close();
        } catch (SQLException ex) {
            errores(ex, "Error en la base de datos con Consultar Usuario");
        }finally {
            try {
                acceso.close();
            } catch (SQLException ex) {
               errores(ex, errorDb);
            }
        }
        
        return usr;
    }
        
    public int actualizarUsuario(Usuario usr){
        int rpta = 0;
        sql = "UPDATE persona JOIN usuario ON persona.idPersona = usuario.idusuario SET nombre = ?, apellido = ?, telefono = ?, direccion = ?,rol = ? "
            +" WHERE cedula like ?";
                
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setString(1, usr.getNombre());
            ps.setString(2, usr.getApellido());
            ps.setString(3, usr.getTelefono());
            ps.setString(4, usr.getDireccion());
            ps.setString(5, usr.getRol());
            ps.setString(6, usr.getCedula());
            
            rpta = ps.executeUpdate();
            acceso.close();
        } catch (SQLException ex) {
            errores(ex, "Error en la base de datos con Actualizar Usuario");
        }finally {
            try {
                acceso.close();
            } catch (SQLException ex) {
                errores(ex, errorDb);
            }
        }
                
        return rpta;
    }
    
    public DefaultTableModel visualizarUsuario(){
            
        DefaultTableModel modelo;
        String [] titulos = {"CÉDULA","NOMBRES","APELLIDOS","DIRECCIÓN","TELÉFONO","ROL DE USUARIO"};
        String [] registro = new String [6];
        
        modelo = new DefaultTableModel(null, titulos){
            
            @Override
            public boolean isCellEditable(int filas, int columnas){
                return columnas== 1;
            }
        };
                        
        sql = "SELECT cedula, nombre, apellido, direccion, telefono, rol FROM persona JOIN usuario ON persona.idPersona = usuario.idusuario ORDER BY idPersona";
              
        try{
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                registro[0] = rs.getString(1);
                registro[1] = rs.getString(2);
                registro[2] = rs.getString(3);
                registro[3] = rs.getString(4);
                registro[4] = rs.getString(5);
                registro[5] = rs.getString(6);
                               
                modelo.addRow(registro);
                
            }
            acceso.close();
        }catch(SQLException ex){
            errores(ex, "Error en la base de datos con Visualizar Usuario");
        }finally {
            try {
                acceso.close();
            } catch (SQLException ex) {
                errores(ex, errorDb);
            }
        }
        return modelo;
    }
    
    public void errores(Exception ex,String error){
        Logger.getLogger(getClass().getName()).log(
        Level.WARNING, error ,ex);
    }
}
