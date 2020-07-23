package entidad;
/**
 *
 * @author Juan Jose
 */
public class Usuario extends Persona{
    
    private String pass;
    private String rol;

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
   
}
