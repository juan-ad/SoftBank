package entidad;

public class Prestamo extends Beneficio {
    
    private int idPrestamo;
    private int codigo;
    private int prestatario;
    private int fiador;
    private int garantia;
    private byte[] pdf;
    
    public byte[] getPdf() {
        return pdf;
    }

    public void setPdf(byte[] pdf) {
        this.pdf = pdf;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrestatario() {
        return prestatario;
    }

    public void setPrestatario(int prestatario) {
        this.prestatario = prestatario;
    }

    public int getFiador() {
        return fiador;
    }

    public void setFiador(int fiador) {
        this.fiador = fiador;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
    
    
}
