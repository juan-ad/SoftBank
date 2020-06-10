package logica;

import entidad.Conexion;
import entidad.Inversion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class InversionDAO {
    
    Conexion con = new Conexion();
    Connection acceso;
    PreparedStatement ps;
    ResultSet rs;
    String sql;
    
    public int nroCodigo(){
        int codigo = 0;
        sql = "SELECT MAX(codInversion) FROM inversion";
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
    
   
    public int registrarInversion(Inversion inv){
        int rpta = 0;
        sql = "INSERT INTO beneficio (fechaSolicitud,fechaInicio,fechaTermino,interes,monto,estado) VALUES (?,?,?,?,?,?)";
        String sql2 = "INSERT INTO inversion (idInversion,codInversion,inversionista,pdf) VALUES ((SELECT idBeneficio FROM beneficio ORDER BY idBeneficio DESC LIMIT 1),?,?,?)";
        try{
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setString(1, inv.getFechaSolicitud());
            ps.setString(2, inv.getFechaInicio());
            ps.setString(3, inv.getFechaTermino());
            ps.setDouble(4, inv.getInteres());
            ps.setDouble(5, inv.getMonto());
            ps.setString(6, inv.getEstado());
            
            if(ps.executeUpdate() != 0){
                
                PreparedStatement ps2 = acceso.prepareStatement(sql2);
                ps2.setInt(1, inv.getCodigo());
                ps2.setInt(2, inv.getInversionista());
                ps2.setBytes(3, inv.getPdf());
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
    public DefaultTableModel revisarInversiones(JTable tabla){
        tabla.setDefaultRenderer(Object.class, new imgTabla());
        DefaultTableModel modelo;
        String [] titulos = {"idIn","CÓDIGO","CLIENTE","CÉDULA","F.SOLICITUD","F.INICIO","F.TERMINO","INTERÉS","MONTO","DOCUMENTO"};
        Object [] registro = new Object [10];
        
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
                
        sql = "SELECT t1.idInversion,t1.codInversion, t2.nombre, t2.apellido, t2.cedula, t3.fechaSolicitud, t3.fechaInicio, t3.fechaTermino, "
              +"t3.interes, t3.monto FROM inversion t1 JOIN persona t2 ON t1.inversionista = t2.idPersona JOIN beneficio t3 ON "
              +"t1.idInversion = t3.idBeneficio WHERE t3.estado like 'En Proceso'ORDER BY t1.codInversion";
        
        try{
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                registro[0] = rs.getString(1);
                registro[1] = rs.getString(2);
                registro[2] = rs.getString(3)+" "+rs.getString(4);
                registro[3] = rs.getString(5);
                registro[4] = rs.getString(6);
                registro[5] = rs.getString(7);
                registro[6] = rs.getString(8);
                registro[7] = rs.getString(9)+"%";
                registro[8] = "$ "+rs.getString(10);
                registro[9] = new JButton(icono);

                modelo.addRow(registro);
                
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
    
    public int aceptarInversion(Inversion inv){
        
        int rpta = 0;
        sql = "UPDATE beneficio JOIN inversion ON idBeneficio = idInversion SET fechaAprobacion=?,estado=? WHERE idBeneficio=?";
        
        try{
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setString(1, inv.getFechaAprobación());
            ps.setString(2, inv.getEstado());
            ps.setInt(3, inv.getIdInversion());
            
            rpta = ps.executeUpdate();
            acceso.close();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        } finally {
            try {
                acceso.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return rpta;
    }
    
    public int rechazarInversion(Inversion inv){
        int rpta = 0;
        
        sql = "UPDATE beneficio JOIN inversion ON idBeneficio = idInversion SET estado=? WHERE idBeneficio=?";
        
        try{
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setString(1, inv.getEstado());
            ps.setInt(2, inv.getIdInversion());
            
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
 
        
    public String[] consultarInversion(int codigo, String estado){
        
        String[] consulta = new String[9];
        sql = "SELECT  t1.cedula,t1.nombre, t1.apellido, t2.fechaSolicitud, t2.fechaInicio, t2.fechaTermino, "
              +"t2.interes, t2.monto, t2.estado,t2.fechaAprobacion FROM inversion JOIN persona t1 ON inversion.inversionista = t1.idPersona "
              + "JOIN beneficio t2 ON inversion.idInversion = t2.idBeneficio WHERE inversion.codInversion = ? and t2.estado like ?";
        
        try{
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.setString(2, "%"+estado+"%");
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
    
    public int actualizarInversion(Inversion inv){
        
        int rpta = 0;
        sql = "UPDATE beneficio JOIN inversion ON inversion.idInversion = beneficio.idBeneficio set fechaInicio = ?, fechaTermino = ?, interes = ?, monto = ? WHERE codInversion like ?";
        String sql2 = "UPDATE inversion JOIN beneficio ON inversion.idInversion = beneficio.idBeneficio set pdf = ? WHERE codInversion like ?";
        try{
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setString(1, inv.getFechaInicio());
            ps.setString(2, inv.getFechaTermino());
            ps.setDouble(3, inv.getInteres());
            ps.setDouble(4, inv.getMonto());
            ps.setInt(5, inv.getCodigo());
            
            rpta = ps.executeUpdate();
            if (inv.getPdf() != null){
                if(rpta != 0){
                
                    PreparedStatement ps2 = acceso.prepareStatement(sql2);
                    ps2.setBytes(1, inv.getPdf());
                    ps2.setInt(2, inv.getCodigo());
                
                    rpta = ps2.executeUpdate();
                }
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
    
    public DefaultTableModel visualizarInversiones(String estado, String cedula){
        
        DefaultTableModel modelo;
        String [] titulos = {"CÓDIGO","CLIENTE","CÉDULA","F.SOLICITUD","F.INICIO","F.TERMINO","INTERÉS","MONTO","ESTADO","F.APROBACIÓN"};
        String [] registro = new String [10];
        
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
                        
        sql = "SELECT t1.codInversion, t2.nombre, t2.apellido, t2.cedula, t3.fechaSolicitud, t3.fechaInicio, t3.fechaTermino, "
              +"t3.interes, t3.monto, t3.estado, t3.fechaAprobacion FROM inversion t1 JOIN persona t2 ON t1.inversionista = t2.idPersona JOIN beneficio t3 ON "
              +"t1.idInversion = t3.idBeneficio WHERE t3.estado like ? and t2.cedula like ? ORDER BY t1.codInversion";
        
        try{
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setString(1, "%"+estado+"%");
            ps.setString(2, "%"+cedula+"%");
            rs = ps.executeQuery();
            while(rs.next()){
                registro[0] = rs.getString(1);
                registro[1] = rs.getString(2)+" "+rs.getString(3);
                registro[2] = rs.getString(4);
                registro[3] = rs.getString(5);
                registro[4] = rs.getString(6);
                registro[5] = rs.getString(7);
                registro[6] = rs.getString(8)+"%";
                registro[7] = "$ "+rs.getString(9);
                registro[8] = rs.getString(10);
                registro[9] = rs.getString(11);
               
                modelo.addRow(registro);
                
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
   
}
