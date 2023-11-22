import java.rmi.*;
import java.lang.Thread;
import java.rmi.server.UnicastRemoteObject;

class Server extends UnicastRemoteObject implements ServerInterface
{
	Server() throws RemoteException
	{
	}

	public void doComputation(ProgressNotifier pn) /* ... Add your solution here ... */

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
