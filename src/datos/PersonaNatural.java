package datos;

public class PersonaNatural extends Cliente{
    private boolean prestamo;
    private String tipoCliente;
    
	public boolean isPrestamo() {
		return prestamo;
	}
	public void setPrestamo(boolean prestamo) {
		this.prestamo = prestamo;
	}
	public String getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
    
    public PersonaNatural (String tipoCliente) {
    	setTipoCliente(tipoCliente);
    	switch(tipoCliente) {
    		case "ClienteA":
    			setPrestamo(true);
    			break;
    		case "ClienteB":
    			setPrestamo(true);
    			break;
    		case "ClienteC":
    			setPrestamo(false);
    			break;
    	}
    }
