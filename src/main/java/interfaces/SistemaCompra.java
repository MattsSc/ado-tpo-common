package interfaces;

import dtos.OrdenDeCompraDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

public interface SistemaCompra extends Remote {
    Integer crearOrdenDeCompra(OrdenDeCompraDTO ordenDeCompraDTO) throws RemoteException;
    void cerrarOrdenDeCompra(Integer ocId, Date fechaVencimiento) throws RemoteException;
}
