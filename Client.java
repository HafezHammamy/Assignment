import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class Client extends UnicastRemoteObject implements ProgressNotifier
{
	protected Client() throws RemoteException {
		super();
	}

	public void notifyProgress(int percent){
		System.out.println("Progress: " + percent + "%");
	}

	public static void main(String[] args)
	{
		try {
			ServerInterface server = (ServerInterface) java.rmi.Naming.lookup("rmi://localhost:1099/progressNotifier");
			Client client = new Client();
			java.rmi.registry.LocateRegistry.createRegistry(1098);
			java.rmi.Naming.rebind("client", client);
			System.out.println("Client is ready...");
			server.doComputation(client);
		}
		catch (Exception e) {
			System.out.println("Client: " + e.getMessage());
		}
	}
}
