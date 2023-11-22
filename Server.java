import java.rmi.*;
import java.lang.Thread;
import java.rmi.server.UnicastRemoteObject;

class Server extends UnicastRemoteObject implements ServerInterface
{
	Server() throws RemoteException
	{
		super();
	}

	public void doComputation(ProgressNotifier pn) throws RemoteException {
		for (int i = 0; i <= 100; i++) {
			pn.notifyProgress(i);
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] argv)
	{
		try {
			Server server = new Server();
			Naming.bind("rmi://localhost/progressNotifier", server);
			System.out.println("Server registered");
		}
		catch (Exception e) {
			System.out.println("Server: " + e.getMessage());
		}
	}
}
