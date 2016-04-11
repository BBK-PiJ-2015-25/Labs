import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyServiceLauncher {

	public static void main(String[] args) {

		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}

		try {

			Registry registry = LocateRegistry.getRegistry(0007);

			MyService myService = new MyServiceImpl();

			registry.rebind("Echo", myService);

		} catch (RemoteException ex) {
			System.out.println("An exception has been thrown.");
			ex.printStackTrace();
		}
	}
}