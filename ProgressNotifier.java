import java.rmi.*;
// ... Add your solution here ... 

public interface ProgressNotifier extends Remote
{
	public void notifyProgress(int percent) throws RemoteException;
}
