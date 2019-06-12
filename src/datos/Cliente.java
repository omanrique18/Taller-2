package datos;

public abstract class Cliente implements EntidadFinanciera{
    
    private String nombre;
    private String numeroDeCuenta;
    private String clave;
    private int descuento;
    private CuentaBancaria tipoCuenta;
    
    public Cliente(String nombre, String documento, String clave, int saldo) {
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

    public int getDescuento() {
        return descuento;
    }

    public String getDocumento() {
        return documento;
    }
    
    public CuentaBancaria getTipoCuenta(){
        return tipoCuenta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
    public void setTipoCuenta(CuentaBancaria tipoCuenta){
        this.tipoCuenta = tipoCuenta;
    }
    
    public Cliente() {
    }
}
