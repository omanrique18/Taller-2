package datos;
import java.util.*;

public class Sistema {
    
    HashMap<String, Cliente> listaClientes = new HashMap<String, Cliente>();
    
    public void crearCliente(String nombre, String documento, String clave, int saldo) {
        Cliente nuevoCliente = new Cliente(nombre, documento, clave, saldo);
        listaClientes.put(clave, nuevoCliente);
    }
    
    public void modificarCliente(Cliente clienteModificado, String nombre, String documento, String clave, int saldo) {
        
    }
    
    public void eliminarCLiente(Cliente cliente) {
        listaClientes.remove(cliente);
    }
    
}
