package logica;

import entidad.Conexion;
import entidad.Prestamo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class PrestamoDAO {
    
    Conexion con = new Conexion();
    Connection acceso;
    PreparedStatement ps;
    ResultSet rs;
    String sql;
    
    public int codigoSolicitud(){
        
        int codigo = 0;
        sql = "SELECT MAX(codPrestamo) FROM prestamo";
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
    
    public int registrarPrestamoFiador(Prestamo p){
        int rpta = 0;
        sql = "INSERT INTO beneficio (fechaSolicitud,fechaInicio,fechaTermino,interes,monto,estado) VALUES (?,?,?,?,?,?)";
        String sql2 = "INSERT INTO prestamo (idPrestamo,codPrestamo,prestatario,fiador,pdf) VALUES ((SELECT idBeneficio FROM beneficio ORDER BY idBeneficio DESC LIMIT 1),?,?,?,?)";
        try{
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setString(1, p.getFechaSolicitud());
            ps.setString(2, p.getFechaInicio());
            ps.setString(3, p.getFechaTermino());
            ps.setDouble(4, p.getInteres());
            ps.setDouble(5, p.getMonto());
            ps.setString(6, p.getEstado());
                        
            if(ps.executeUpdate() != 0){
                
                PreparedStatement ps2 = acceso.prepareStatement(sql2);
                ps2.setInt(1, p.getCodigo());
                ps2.setInt(2, p.getPrestatario());
                ps2.setInt(3, p.getFiador());
                ps2.setBytes(4, p.getPdf());
                rpta = ps2.executeUpdate();
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
        return rpta;
    }
    
    public int registrarPrestamoGarantia(Prestamo p){
        int rpta = 0;
        sql = "INSERT INTO beneficio (fechaSolicitud,fechaInicio,fechaTermino,interes,monto,estado) VALUES (?,?,?,?,?,?)";
        String sql2 = "INSERT INTO prestamo (idPrestamo,codPrestamo,prestatario,garantia,pdf) VALUES ((SELECT idBeneficio FROM beneficio ORDER BY idBeneficio DESC LIMIT 1),?,?,(SELECT idGarantia FROM garantia ORDER BY idGarantia DESC LIMIT 1),?)";
        try{
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setString(1, p.getFechaSolicitud());
            ps.setString(2, p.getFechaInicio());
            ps.setString(3, p.getFechaTermino());
            ps.setDouble(4, p.getInteres());
            ps.setDouble(5, p.getMonto());
            ps.setString(6, p.getEstado());
            
            if(ps.executeUpdate() != 0){
                
                PreparedStatement ps2 = acceso.prepareStatement(sql2);
                ps2.setInt(1, p.getCodigo());
                ps2.setInt(2, p.getPrestatario());
                ps2.setBytes(3, p.getPdf());
                rpta = ps2.executeUpdate();
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
        return rpta;
    }
    public Prestamo validarFiadorGarantia(int codigo){
        
        Prestamo p = new Prestamo();
        sql = "SELECT codPrestamo,fiador,garantia FROM prestamo WHERE codPrestamo LIKE ?";
        try{
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setInt(1, codigo);
            rs = ps.executeQuery();
            while(rs.next()){
                p.setCodigo(rs.getInt(1));
                p.setFiador(rs.getInt(2));
                p.setGarantia(rs.getInt(3));
            }          
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }finally {
            try {
                acceso.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return p;
    }
    public String[] consultarPrestamoFiador(int codigo){
        
        String[] consulta = new String[11];
        sql = "SELECT  t1.cedula,t1.nombre, t1.apellido, t2.fechaSolicitud, t2.fechaInicio, t2.fechaTermino, "
              +"t2.interes, t2.monto, t2.estado,t2.fechaAprobacion, t3.cedula, t3.nombre, t3.apellido"
              + " FROM prestamo JOIN persona t1 ON prestamo.prestatario = t1.idPersona "
              + "JOIN beneficio t2 ON prestamo.idPrestamo = t2.idBeneficio JOIN persona t3 ON prestamo.fiador = t3.idPersona "
              + "WHERE prestamo.codPrestamo = ?";
        
        try{
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setInt(1, codigo);
            rs = ps.executeQuery();
            while(rs.next()){
               
                consulta[0]=  rs.getString(1);
                consulta[1] = rs.getString(2)+" "+rs.getString(3);
                consulta[2] = rs.getString(4);
                consulta[3] = rs.getString(5);
                consulta[4] = rs.getString(6);
                consulta[5] = rs.getString(7)+"%";
                consulta[6] = "$ "+rs.getString(8);
                consulta[7] = rs.getString(9);
                consulta[8] = rs.getString(10);
                consulta[9] = rs.getString(11);
                consulta[10] = rs.getString(12)+" "+rs.getString(13);
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
        
        return consulta;
    }
    
    public String[] consultarPrestamoGarantia(int codigo){
        
        String[] consulta = new String[13];
        sql = "SELECT  t1.cedula,t1.nombre, t1.apellido, t2.fechaSolicitud, t2.fechaInicio, t2.fechaTermino, "
              +"t2.interes, t2.monto, t2.estado,t2.fechaAprobacion, t3.codGarantia, t3.tipo, t3.valor, t3.ubicacion "
              + " FROM prestamo JOIN persona t1 ON prestamo.prestatario = t1.idPersona "
              + "JOIN beneficio t2 ON prestamo.idPrestamo = t2.idBeneficio JOIN garantia t3 "
              + "ON prestamo.garantia = t3.idGarantia "
              + "WHERE prestamo.codPrestamo = ?";
        
        try{
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setInt(1, codigo);
            rs = ps.executeQuery();
            while(rs.next()){
               
                consulta[0]=  rs.getString(1);
                consulta[1] = rs.getString(2)+" "+rs.getString(3);
                consulta[2] = rs.getString(4);
                consulta[3] = rs.getString(5);
                consulta[4] = rs.getString(6);
                consulta[5] = rs.getString(7)+"%";
                consulta[6] = "$ "+rs.getString(8);
                consulta[7] = rs.getString(9);
                consulta[8] = rs.getString(10);
                consulta[9] = rs.getString(11);
                consulta[10] = rs.getString(12);
                consulta[11] = "$ "+rs.getString(13);
                consulta[12] = rs.getString(14);
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
        
        return consulta;
    }
    
    public DefaultTableModel revisarPrestamoGarantia(JTable tabla){
        tabla.setDefaultRenderer(Object.class, new imgTabla());
        DefaultTableModel modelo;
              
        String [] titulos = {"idIP","CÓDIGO","CLIENTE","CÉDULA","F.SOLICITUD","F.INICIO","F.TERMINO","INTERÉS","MONTO","GARANTÍA","TIPO","VALOR","UBICACIÓN","DOCUMENTO"};
        Object [] consulta = new Object [14];
        PdfEjecucion pd = new PdfEjecucion();
        ImageIcon icono = new ImageIcon(pd.get_Image("/imagenes/32pdf.png"));
        modelo = new DefaultTableModel(null, titulos){
            
            @Override
            public boolean isCellEditable(int filas, int columnas){
                if(columnas== 1){
                    return true;
                }else{
                    return false;
                }
            }
        };
        
        sql = "SELECT  prestamo.IdPrestamo,prestamo.codPrestamo,t1.nombre, t1.apellido,t1.cedula, t2.fechaSolicitud, t2.fechaInicio, t2.fechaTermino, "
              +"t2.interes, t2.monto, t3.codGarantia, t3.tipo, t3.valor, t3.ubicacion "
              + " FROM prestamo JOIN persona t1 ON prestamo.prestatario = t1.idPersona "
              + "JOIN beneficio t2 ON prestamo.idPrestamo = t2.idBeneficio JOIN garantia t3 "
              + "ON prestamo.garantia = t3.idGarantia WHERE t2.estado like 'En Proceso' ORDER BY prestamo.codPrestamo";
        
        try{
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
               
                consulta[0]=  rs.getString(1);
                consulta[1] = rs.getString(2);
                consulta[2] = rs.getString(3)+" "+rs.getString(4);
                consulta[3] = rs.getString(5);
                consulta[4] = rs.getString(6);
                consulta[5] = rs.getString(7);
                consulta[6] = rs.getString(8);
                consulta[7] = rs.getString(9)+"%";
                consulta[8] = "$ "+rs.getString(10);
                consulta[9] = rs.getString(11);
                consulta[10] = rs.getString(12);
                consulta[11] = "$ "+rs.getString(13);
                consulta[12] = rs.getString(14);
                consulta[13] = new JButton(icono);
                modelo.addRow(consulta);
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
        return modelo;
    }
    
    public DefaultTableModel revisarPrestamoFiador(JTable tabla){
        tabla.setDefaultRenderer(Object.class, new imgTabla());
        DefaultTableModel modelo;
        String [] titulos = {"idIP","CÓDIGO","CLIENTE","CÉDULA","F.SOLICITUD","F.INICIO","F.TERMINO","INTERÉS","MONTO","FIADOR","CÉDULA","DOCUMENTO"};
        Object [] consulta = new Object [12];
        
        modelo = new DefaultTableModel(null, titulos){
            
            @Override
            public boolean isCellEditable(int filas, int columnas){
                if(columnas== 1){
                    return true;
                }else{
                    return false;
                }
            }
        };
        PdfEjecucion pd = new PdfEjecucion();
        ImageIcon icono = new ImageIcon(pd.get_Image("/imagenes/32pdf.png"));
        sql = "SELECT  prestamo.idPrestamo, prestamo.codPrestamo,t1.nombre, t1.apellido,t1.cedula, t2.fechaSolicitud, t2.fechaInicio, t2.fechaTermino,"
              + " t2.interes, t2.monto, t3.nombre, t3.apellido,t3.cedula"
              + " FROM prestamo JOIN persona t1 ON prestamo.prestatario = t1.idPersona"
              + " JOIN beneficio t2 ON prestamo.idPrestamo = t2.idBeneficio JOIN persona t3 ON prestamo.fiador = t3.idPersona"
              + " WHERE t2.estado like 'En Proceso' ORDER BY prestamo.codPrestamo";
        
        try{
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
               
                consulta[0]=  rs.getString(1);
                consulta[1] = rs.getString(2);
                consulta[2] = rs.getString(3)+" "+rs.getString(4);
                consulta[3] = rs.getString(5);
                consulta[4] = rs.getString(6);
                consulta[5] = rs.getString(7);
                consulta[6] = rs.getString(8);
                consulta[7] = rs.getString(9)+"%";
                consulta[8] = "$ "+rs.getString(10);
                consulta[9] = rs.getString(11)+" "+rs.getString(12);
                consulta[10] = rs.getString(13);
                consulta[11] = new JButton(icono);
                modelo.addRow(consulta);
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
        return modelo;
    }
    public int aceptarPrestamo(Prestamo p){
        
        int rpta = 0;
        sql = "UPDATE beneficio JOIN prestamo ON idBeneficio = idPrestamo SET fechaAprobacion=?,estado=? WHERE idBeneficio=?";
        
        try{
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setString(1, p.getFechaAprobación());
            ps.setString(2, p.getEstado());
            ps.setInt(3, p.getIdPrestamo());
            
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
    
    public int rechazarPrestamo(Prestamo p){
        int rpta = 0;
        
        sql = "UPDATE beneficio JOIN prestamo ON idBeneficio = idPrestamo SET estado=? WHERE idBeneficio=?";
        
        try{
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setString(1, p.getEstado());
            ps.setInt(2, p.getIdPrestamo());
            
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
