package rmi.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import interfaces.IFireAlarmService;
import services.FireAlarmServiceImpl;

public class RMIServer extends FireAlarmServiceImpl {
    
	static int port = 5099;
	 
    public RMIServer() throws RemoteException {
		
	}

	public static void main(String[] args) throws RemoteException {
        try {
        	
        	// create register for relavent port number 
            Registry registry = LocateRegistry.createRegistry(port);
            
            // bind the FireAlarmService in registry
            registry.rebind("FireAlarmService", new FireAlarmServiceImpl());  
            System.out.println("Server is started"); 
        } catch (Exception ex) { 
            System.out.println("Server Error: " + ex.toString()); 
            ex.printStackTrace(); 
        } 
    }
}
