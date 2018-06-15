package interfaces;

import dtos.ClienteDTO;
import dtos.ItemAProcesarDTO;
import dtos.ItemPedidoDTO;
import dtos.PedidoDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface SistemaPedido extends Remote {
    Integer crearPedido(ClienteDTO cliente, String direccionEntrega, List<ItemPedidoDTO> items) throws RemoteException;
    PedidoDTO obtenerPedido(Integer id) throws RemoteException;
    void aprobarPedido(Integer id, String aclaracion) throws RemoteException;
    List<ItemAProcesarDTO> despacharPedido(Integer id, String tipoFactura) throws RemoteException;
    void rechazarPedido(Integer id, String aclaracion) throws RemoteException;
    void completarPedido(Integer id, Date fechaEntrega) throws RemoteException;
    List<PedidoDTO> listarPedidos() throws RemoteException;
    List<PedidoDTO> listarPedidos(String estado) throws RemoteException;
}
