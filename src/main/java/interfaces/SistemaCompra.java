package interfaces;

import dtos.OrdenDeCompraDTO;
import dtos.ProveedorDTO;
import dtos.ProveedorPrecioDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;

public interface SistemaCompra extends Remote {
    Integer crearOrdenDeCompra(OrdenDeCompraDTO ordenDeCompraDTO) throws RemoteException;
    void cerrarOrdenDeCompra(Integer ocId, float precioTotal, Date fechaVencimiento) throws RemoteException;
    void asignarOrdenesDePedidoAOrdenesAbiertas() throws RemoteException;
    List<OrdenDeCompraDTO> obtenerTodasLasOrdenes() throws RemoteException;
    OrdenDeCompraDTO obtenerOc(Integer id) throws RemoteException;
    List<ProveedorPrecioDTO> obtenerUltimos3Proveedores(Integer idProducto) throws RemoteException;
    List<ProveedorDTO> obtenerProveedores() throws RemoteException;
}
