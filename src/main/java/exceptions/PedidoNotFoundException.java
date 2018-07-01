package exceptions;

import java.rmi.RemoteException;

public class PedidoNotFoundException extends RemoteException {
    private static final long serialVersionUID = 44092366664472436L;

    public PedidoNotFoundException(Integer id) {
        super("El pedido " + id + " no se encuentra en el sistema");
    }
}
