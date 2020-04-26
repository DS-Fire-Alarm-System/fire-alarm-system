package rmi.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import interfaces.IFireAlarmService;
import services.FireAlarmServiceImpl;

public class RMIServer extends FireAlarmServiceImpl {
    
    public RMIServer() throws RemoteException {
		
	}

	public static void main(String[] args) throws RemoteException {
        try {
            Registry registry = LocateRegistry.createRegistry(5099);
            
            registry.rebind("FireAlarmService", new FireAlarmServiceImpl());  
            System.out.println("Server ready"); 
        } catch (Exception e) { 
            System.out.println("Server exception: " + e.toString()); 
            e.printStackTrace(); 
        } 
    }
}
