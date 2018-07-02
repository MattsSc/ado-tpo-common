package interfaces;

import dtos.ArticuloDTO;
import dtos.MovimientoPorAjusteDTO;
import dtos.MovimientoPorEliminacionDTO;
import dtos.UbicacionDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface SistemaArticulo extends Remote {
    void crearArticulo(ArticuloDTO articuloDTO) throws RemoteException;
    ArticuloDTO obtenerArticulo(Integer id) throws RemoteException;
    List<ArticuloDTO> obtenerArticulos() throws RemoteException;
    List<ArticuloDTO> obtenerArticulosFaltantes() throws RemoteException;
    List<UbicacionDTO> obtenerUbicaciones(Integer id) throws RemoteException;
    void generarMovimientoPorRotura(Integer loteId, MovimientoPorEliminacionDTO movimientoPorEliminacionDTO) throws RemoteException;
    void generarMovimientoPorAjustePositivo(Integer loteId, MovimientoPorAjusteDTO movimientoPorAjusteDTO) throws RemoteException;
    void generarMovimientoPorAjusteNegativo(Integer loteId, MovimientoPorAjusteDTO movimientoPorAjusteDTO) throws RemoteException;
}
