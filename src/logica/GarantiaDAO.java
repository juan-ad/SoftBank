package logica;

import entidad.Conexion;
import entidad.Garantia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GarantiaDAO {
    Conexion con = new Conexion();
    Connection acceso;
    PreparedStatement ps;
    ResultSet rs;
    String sql;
    
    public int codigoGarantia(){
        
        int codigo = 0;
        sql = "SELECT MAX(codGarantia) FROM garantia";
        try{
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
               codigo = rs.getInt(1);
            }
            acceso.close();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }finally {
            try {
                acceso.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return codigo;
    }
    
    public int registrarGarantia(Garantia g){
        int rpta = 0;
        sql = "INSERT INTO garantia (codGarantia,valor,tipo,ubicacion) VALUES (?,?,?,?)";        
        try{
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setInt(1, g.getCodigo());
            ps.setDouble(2, g.getValor());
            ps.setString(3, g.getTipo());
            ps.setString(4, g.getUbicacion());
            rpta = ps.executeUpdate();
            acceso.close();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }finally {
            try {
                acceso.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return rpta;
    }
    
    public int actualizarGarantia(Garantia g, int codigo){
        int rpta = 0;
        sql = "UPDATE garantia JOIN prestamo ON garantia.idGarantia = prestamo.garantia set valor = ?, tipo = ?, ubicacion = ? WHERE prestamo.codPrestamo = ?";        
        try{
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setDouble(1, g.getValor());
            ps.setString(2, g.getTipo());
            ps.setString(3, g.getUbicacion());
            ps.setInt(4, codigo);
            rpta = ps.executeUpdate();
            acceso.close();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }finally {
            try {
                acceso.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return rpta;
    }
}
