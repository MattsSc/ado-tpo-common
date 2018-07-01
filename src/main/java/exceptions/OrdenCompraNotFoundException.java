package exceptions;

import java.rmi.RemoteException;

public class OrdenCompraNotFoundException extends RemoteException {

    private static final long serialVersionUID = 4409052692284472436L;

    public OrdenCompraNotFoundException(Integer id) {
        super("La orden de compra: " + id  + " no se encuentra en el sistema");
    }
}
