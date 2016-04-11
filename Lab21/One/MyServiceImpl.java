import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyServiceImpl extends UnicastRemoteObject implements MyService {

	MyServiceImpl() throws RemoteException {}

	@Override
	public String echo(String s) throws RemoteException {
		System.out.println("My string: " + s);

		return s;
	}
}