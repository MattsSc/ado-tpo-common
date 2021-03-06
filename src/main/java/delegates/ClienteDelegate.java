package delegates;

import dtos.ClienteDTO;
import dtos.MovimientoCCDto;
import interfaces.SistemaCliente;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

public class ClienteDelegate implements SistemaCliente {

    private static ClienteDelegate INSTANCE = new ClienteDelegate();
    private SistemaCliente sistemaCliente;

    private ClienteDelegate(){
        Conectar();
    }

    public static ClienteDelegate getInstance(){
        return INSTANCE;
    }

    public  void crearCliente(Integer dni, String nombre, String apellido, String domicilio, String cuit, String razonSocial, float limiteCredito, float montoDisponible)  throws RemoteException{
        sistemaCliente.crearCliente(dni,nombre,apellido,domicilio,cuit,razonSocial,limiteCredito,montoDisponible);
    }

    public void modificarCliente(Integer dni, String nombre, String apellido, String domicilio, String cuit, String razonSocial, float limiteCredito, float montoDisponible)  throws RemoteException{
        sistemaCliente.modificarCliente(dni,nombre,apellido,domicilio,cuit,razonSocial,limiteCredito,montoDisponible);
    }

    public void borrarCliente(Integer dni)  throws RemoteException {
        sistemaCliente.borrarCliente(dni);
    }

    public void agregarMovimiento(Integer dni, MovimientoCCDto movimientoCCDto)  throws RemoteException{
        sistemaCliente.agregarMovimiento(dni,movimientoCCDto);
    }

    public List<ClienteDTO> listarClientes() throws RemoteException {
        return sistemaCliente.listarClientes();
    }

    public ClienteDTO obtenerCliente(Integer dni) throws RemoteException {
        return sistemaCliente.obtenerCliente(dni);
    }

    private void Conectar(){
        try{
            sistemaCliente = (SistemaCliente) Naming.lookup("//localhost:1099/ControladorCliente");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
    }
}
