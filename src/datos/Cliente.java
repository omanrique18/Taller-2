package datos;

public class Cliente {
    
    private String nombre;
    private String documento;
    private String clave;
    private int saldo;
    
    Cliente(String nombre, String documento, String clave, int saldo) {
        this.nombre = nombre;
        this.documento = documento;
        this.clave = clave;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
    
    
    
}
