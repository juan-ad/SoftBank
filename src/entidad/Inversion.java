package entidad;

public class Inversion extends Beneficio{
    
    private int idInversion;
    private int codigo;
    private int inversionista;
    private byte [] pdf;
  
    public byte[] getPdf() {
        return pdf;
    }

    public void setPdf(byte[] pdf) {
        this.pdf = pdf;
    }
    
    public int getIdInversion() {
        return idInversion;
    }

    public void setIdInversion(int idInversion) {
        this.idInversion = idInversion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

   

    public int getInversionista() {
        return inversionista;
    }

    public void setInversionista(int inversionista) {
        this.inversionista = inversionista;
    }
    
    
}
