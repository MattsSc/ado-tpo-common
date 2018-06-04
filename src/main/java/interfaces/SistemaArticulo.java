package interfaces;

import dtos.ArticuloDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface SistemaArticulo extends Remote {
    ArticuloDTO obtenerArticulo(Integer id) throws RemoteException;
    List<ArticuloDTO> obtenerArticulos() throws RemoteException;
    List<ArticuloDTO> obtenerArticulosFaltantes() throws RemoteException;
}
