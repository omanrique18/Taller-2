package datos;

public abstract class CuentaBancaria {
    
    private int saldo;
    
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
    
    public int getSaldo(){
        return saldo;
    }
}
