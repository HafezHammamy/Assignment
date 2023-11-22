import java.rmi.*;
// ... Add your solution here ... 

public class Client /* ... Add your solution here ... */
{
	// ... Add your solution here ... 

	public void notifyProgress(int percent) /* ... Add your solution here ... */

	public static void main(String[] args)
	{
		try {
			ServerInterface server = (ServerInterface)Naming.lookup("rmi://localhost/progressNotifier");
			// ... Add your solution here ... 
		}
		catch (Exception e) {
			System.out.println("Client: " + e.getMessage());
		}
	}
}
