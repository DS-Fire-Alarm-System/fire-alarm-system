package rmi.client;

import java.io.Serializable;
import java.rmi.Naming;

import interfaces.IFireAlarmService;

public class Client implements Serializable {

	private IFireAlarmService stub = null;
	
	// initialize stub
	public Client() {
		this.setStub();
	}
	
	//get the stub
	public IFireAlarmService getStub() {
		return stub;
	}

	// set the stub 
	public void setStub() {
		
		try {
			// Looking up the registry for the remote object 
			this.stub = (IFireAlarmService) Naming.lookup("rmi://localhost:5099/FireAlarmService");
			
		} catch (Exception e) {
			
			System.out.println("Client exception: " + e.toString()); 
	        e.printStackTrace();
		}
	}
}
