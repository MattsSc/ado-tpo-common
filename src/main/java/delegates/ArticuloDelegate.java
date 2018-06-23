package delegates;

import dtos.ArticuloDTO;
import dtos.MovimientoPorAjusteDTO;
import dtos.MovimientoPorEliminacionDTO;
import interfaces.SistemaArticulo;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

public class ArticuloDelegate implements SistemaArticulo {

    private static ArticuloDelegate INSTANCE = new ArticuloDelegate();
    private SistemaArticulo sistemaArticulo;

    private ArticuloDelegate(){
        Conectar();
    }

    public static ArticuloDelegate getInstance(){
        return INSTANCE;
    }

    public void crearArticulo(ArticuloDTO articuloDTO) throws RemoteException {
        sistemaArticulo.crearArticulo(articuloDTO);
    }

    public ArticuloDTO obtenerArticulo(Integer id) throws RemoteException {
        return sistemaArticulo.obtenerArticulo(id);
    }

    public List<ArticuloDTO> obtenerArticulosFaltantes() throws RemoteException {
        return sistemaArticulo.obtenerArticulosFaltantes();
    }

    public List<ArticuloDTO> obtenerArticulos() throws RemoteException {
        return sistemaArticulo.obtenerArticulos();
    }

    @Override
    public void generarMovimientoPorRotura(Integer loteId, MovimientoPorEliminacionDTO movimientoPorEliminacionDTO) throws RemoteException {
        sistemaArticulo.generarMovimientoPorRotura(loteId,movimientoPorEliminacionDTO);
    }

    @Override
    public void generarMovimientoPorAjustePositivo(Integer loteId, MovimientoPorAjusteDTO movimientoPorAjusteDTO) throws RemoteException {
        sistemaArticulo.generarMovimientoPorAjustePositivo(loteId, movimientoPorAjusteDTO);
    }

    @Override
    public void generarMovimientoPorAjusteNegativo(Integer loteId, MovimientoPorAjusteDTO movimientoPorAjusteDTO) throws RemoteException {
        sistemaArticulo.generarMovimientoPorAjusteNegativo(loteId, movimientoPorAjusteDTO);
    }

    private void Conectar(){
        try{
            sistemaArticulo = (SistemaArticulo) Naming.lookup("//localhost:1099/ControladorArticulo");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
    }
}
