package rminterface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMInterface extends Remote {

    public String helloTo(String nome) throws RemoteException;
}
