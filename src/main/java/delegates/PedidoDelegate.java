package delegates;

import dtos.ClienteDTO;
import dtos.ItemPedidoDTO;
import dtos.PedidoDTO;
import interfaces.SistemaCliente;
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


    public void crearPedido(ClienteDTO cliente, Date fechaSolicitudOrden, String direccionEntrega, List<ItemPedidoDTO> items) throws RemoteException {
        sistemaPedido.crearPedido(cliente, fechaSolicitudOrden, direccionEntrega, items);
    }

    public PedidoDTO obtenerPedido(Integer id) throws RemoteException {
        return sistemaPedido.obtenerPedido(id);
    }

    public void aprobarPedido(Integer id) throws RemoteException {
        sistemaPedido.aprobarPedido(id);
    }

    public void rechazarPedido(Integer id) throws RemoteException {
        sistemaPedido.rechazarPedido(id);
    }

    public void actualizarPedido(PedidoDTO pedidoDTO) throws RemoteException {
        sistemaPedido.actualizarPedido(pedidoDTO);
    }

    public List<PedidoDTO> listarPedidos() throws RemoteException {
        return sistemaPedido.listarPedidos();
    }

    public List<PedidoDTO> listarPedidos(String estado) throws RemoteException {
        return listarPedidos(estado);
    }


}
