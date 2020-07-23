package logica;

import entidad.Conexion;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class PdfEjecucion {
    Conexion con = new Conexion();
    Connection acceso;
    PreparedStatement ps;
    ResultSet rs;
    String sql;
    
    public void ejecutarArchivoPDF(int id, String tipo) {// ejecuta el archivo pdf de una inversión o un préstamo
        getConsulta(tipo);
        acceso = con.conectar();
        byte[] b = null;
        String codigo = "";
        try {
            ps = acceso.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                b = rs.getBytes(1);
                codigo = rs.getString(2);
            }
            InputStream bos = new ByteArrayInputStream(b);

            int tamanoInput = bos.available();
            byte[] datosPDF = new byte[tamanoInput];
            bos.read(datosPDF, 0, tamanoInput);

            OutputStream out = new FileOutputStream(tipo+"#"+codigo+".pdf");
            out.write(datosPDF);

            //abrir archivo
            out.close();
            bos.close();
            acceso.close();

        } catch (IOException | NumberFormatException | SQLException ex) {
            Logger.getLogger(getClass().getName()).log(
            Level.WARNING, "Error al abrir archivo PDF",ex);
        } 
    }
    
    public Image getImage(String ruta) {
        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getResource(ruta));
            return imageIcon.getImage();
        } catch (Exception ex) {
            Logger.getLogger(getClass().getName()).log(
            Level.WARNING, "Error al abrir imagen PDF",ex);
        }
        return null;
    }
    
    private void getConsulta(String tipo){ 
        
        if ("Inversion".equals(tipo)){
            sql = "SELECT pdf,codInversion FROM inversion WHERE idInversion = ?";
        }else{
            sql= "SELECT pdf,codPrestamo FROM prestamo WHERE idPrestamo = ?";
        }
        
    }
  
}
