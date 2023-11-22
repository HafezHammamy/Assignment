import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerInterface extends Remote
{
   public void doComputation(ProgressNotifier pn) throws RemoteException;
}
