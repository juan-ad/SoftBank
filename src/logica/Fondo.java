package logica;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.border.Border;

public class Fondo implements Border{

    private BufferedImage imagen;
    
    public Fondo(){
        try{
            URL imagenPath = new URL(getClass().getResource("/imagenes/fondoPantalla.jpg").toString());
            imagen = ImageIO.read(imagenPath);
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        //int x0= x+(width-imagen.getWidth())/2;
        //int y0= y+(height-imagen.getHeight())/2;
        //g.drawImage(imagen, x0, y0, null);
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
