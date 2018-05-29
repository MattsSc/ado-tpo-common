package interfaces;

import dtos.ClienteDTO;
import dtos.ItemPedidoDTO;
import dtos.PedidoDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;

public interface SistemaPedido extends Remote {
    Integer crearPedido(ClienteDTO cliente, String direccionEntrega, List<ItemPedidoDTO> items) throws RemoteException;
    PedidoDTO obtenerPedido(Integer id) throws RemoteException;
    void aprobarPedido(Integer id) throws RemoteException;
    void despacharPedido(Integer id, String tipoFactura) throws RemoteException;
    void rechazarPedido(Integer id) throws RemoteException;
    void completarPedido(Integer id, Date fechaEntrega) throws RemoteException;
    List<PedidoDTO> listarPedidos() throws RemoteException;
    List<PedidoDTO> listarPedidos(String estado) throws RemoteException;
}
