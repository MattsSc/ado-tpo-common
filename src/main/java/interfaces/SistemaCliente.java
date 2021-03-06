package interfaces;

import dtos.ClienteDTO;
import dtos.MovimientoCCDto;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface SistemaCliente extends Remote {

    void crearCliente(Integer dni, String nombre, String apellido, String domicilio, String cuit, String razonSocial, float limiteCredito, float montoDisponible)  throws RemoteException;
    void modificarCliente(Integer dni, String nombre, String apellido, String domicilio, String cuit, String razonSocial, float limiteCredito, float montoDisponible)  throws RemoteException;
    void borrarCliente(Integer dni) throws RemoteException;
    void agregarMovimiento(Integer dni,MovimientoCCDto movimientoCCDto) throws RemoteException;
    List<ClienteDTO> listarClientes() throws RemoteException;
    ClienteDTO obtenerCliente(Integer dni) throws RemoteException;

}
