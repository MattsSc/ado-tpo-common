package interfaces;

import dtos.PedidoDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface SistemaPedido extends Remote {
    void crearPedido() throws RemoteException;
    PedidoDTO obtenerPedido(Integer id) throws RemoteException;
    void aprobarPedido() throws RemoteException;
    void rechazarPedido() throws RemoteException;
    void actualizarPedido() throws RemoteException;
    List<PedidoDTO> listarPedidos() throws RemoteException;
    List<PedidoDTO> listarPedidos(String estado) throws RemoteException;
}
