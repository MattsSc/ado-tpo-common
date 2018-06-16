package interfaces;

import dtos.OrdenDeCompraDTO;
import dtos.ProveedorDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;

public interface SistemaCompra extends Remote {
    Integer crearOrdenDeCompra(OrdenDeCompraDTO ordenDeCompraDTO) throws RemoteException;
    void cerrarOrdenDeCompra(Integer ocId, float precioTotal, Date fechaVencimiento) throws RemoteException;
    List<ProveedorDTO> obtenerUltimos3Proveedores(Integer idProducto) throws RemoteException;
}
