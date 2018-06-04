package delegates;

import dtos.OrdenDeCompraDTO;
import dtos.ProveedorDTO;
import interfaces.SistemaCompra;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;

public class CompraDelegate implements SistemaCompra {
    private static CompraDelegate ourInstance = new CompraDelegate();
    private SistemaCompra sistemaCompra;

    public static CompraDelegate getInstance() {
        return ourInstance;
    }

    private CompraDelegate() {
        Conectar();
    }

    private void Conectar(){
        try{
            sistemaCompra = (SistemaCompra) Naming.lookup("//localhost:1099/ControladorCompra");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
    }

    public List<ProveedorDTO> obtenerUltimos3Proveedores(Integer idProducto) throws RemoteException {
        return sistemaCompra.obtenerUltimos3Proveedores(idProducto);
    }

    public Integer crearOrdenDeCompra(OrdenDeCompraDTO ordenDeCompraDTO) throws RemoteException {
        return sistemaCompra.crearOrdenDeCompra(ordenDeCompraDTO);
    }

    public void cerrarOrdenDeCompra(Integer ocId, Date fechaVencimiento) throws RemoteException {
        sistemaCompra.cerrarOrdenDeCompra(ocId, fechaVencimiento);
    }
}
