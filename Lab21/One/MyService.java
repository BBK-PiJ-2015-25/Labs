import java.rmi.RemoteException;
import java.rmi.Remote;

public interface MyService extends Remote {

	String echo(String s) throws RemoteException;
}