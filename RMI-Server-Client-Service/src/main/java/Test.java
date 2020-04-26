import java.rmi.RemoteException;

import dtos.Auth;
import interfaces.IFireAlarmService;
import response.models.AuthResponse;
import rmi.client.Client;

public class Test {

	public static void main(String[] args) throws RemoteException {
		Client client = new Client();
        IFireAlarmService stub = client.getStub();
        
        Auth auth = new Auth();
        auth.setUsername("blcchanaka@gmail.com");
        auth.setPassword("123456");
        
        AuthResponse res = stub.login(auth);
        System.out.println(res.getMessage());

	}

}
