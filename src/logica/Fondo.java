package logica;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.border.Border;

public class Fondo implements Border{

    private BufferedImage imagen;
    
    public Fondo(){
        try{
            URL imagenPath = new URL(getClass().getResource("/imagenes/fondoPantalla.jpg").toString());
            imagen = ImageIO.read(imagenPath);
        }catch(IOException ex){
            Logger.getLogger(getClass().getName()).log(
            Level.WARNING, "Error en cargar el fondo de pantalla",ex);
        }
    }
    
    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawImage(imagen, 0, 0, width,height,null);
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(0,0,0,0);
    }

    @Override
    public boolean isBorderOpaque() {
        return true;
    }
    
}
