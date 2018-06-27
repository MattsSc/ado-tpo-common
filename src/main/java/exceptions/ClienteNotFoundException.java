package exceptions;

import java.rmi.RemoteException;

public class ClienteNotFoundException extends RemoteException {

    private static final long serialVersionUID = 4409052692284472436L;

    public ClienteNotFoundException(Integer dni) {
        super("El cliente con DNI: " + dni  + " no se encuentra en el sistema");
    }
}
