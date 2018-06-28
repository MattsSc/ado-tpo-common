package delegates;

import dtos.ItemAProcesarDTO;
import dtos.PedidoDTO;
import interfaces.SistemaPedido;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;

public class PedidoDelegate implements SistemaPedido {
    private static PedidoDelegate ourInstance = new PedidoDelegate();
    private SistemaPedido sistemaPedido;

    public static PedidoDelegate getInstance() {
        return ourInstance;
    }

    private PedidoDelegate() {
        Conectar();
    }

    private void Conectar(){
        try{
            sistemaPedido = (SistemaPedido) Naming.lookup("//localhost:1099/ControladorPedido");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
    }


    public Integer crearPedido(PedidoDTO pedidoDTO) throws RemoteException {
        return  sistemaPedido.crearPedido(pedidoDTO);
    }

    public PedidoDTO obtenerPedido(Integer id) throws RemoteException {
        return sistemaPedido.obtenerPedido(id);
    }

    public void aprobarPedido(Integer id, String aclaracion) throws RemoteException {
        sistemaPedido.aprobarPedido(id, aclaracion);
    }

    public List<ItemAProcesarDTO> despacharPedido(Integer id, String tipoFactura) throws RemoteException {
        return sistemaPedido.despacharPedido(id,tipoFactura);
    }

    public void rechazarPedido(Integer id, String aclaracion) throws RemoteException {
        sistemaPedido.rechazarPedido(id, aclaracion);
    }

    public void completarPedido(Integer id, Date fechaEntrega) throws RemoteException {
        sistemaPedido.completarPedido(id, fechaEntrega);
    }

    public List<PedidoDTO> listarPedidos() throws RemoteException {
        return sistemaPedido.listarPedidos();
    }

    public List<PedidoDTO> listarPedidos(String estado) throws RemoteException {
        return sistemaPedido.listarPedidos(estado);
    }


}
