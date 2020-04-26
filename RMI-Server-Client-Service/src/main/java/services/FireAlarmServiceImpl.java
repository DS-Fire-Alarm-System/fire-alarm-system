package services;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;

import dtos.Auth;
import dtos.FireAlarmSensor;
import interfaces.IFireAlarmService;
import response.models.AuthResponse;
import response.models.FireAlarmSensorMultipleResponse;
import response.models.FireAlarmSensorSingleResponse;

public class FireAlarmServiceImpl extends UnicastRemoteObject implements IFireAlarmService, Serializable {
	
	public Client client;
	
	public FireAlarmServiceImpl() throws RemoteException {
		
	}
	
	public AuthResponse login(Auth auth) throws RemoteException {
		
		try {
			client = ClientBuilder.newClient();
			Response response = client.target("http://localhost:4000/api/auth").request().post(Entity.json(auth));
			AuthResponse authResponse = response.readEntity(AuthResponse.class);
			return authResponse;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			client.close();
		}
		
		return null;
	}
	
	public FireAlarmSensorSingleResponse createFireAlarmSensor(FireAlarmSensor alarmSensor) throws RemoteException {
		
		try {
			client = ClientBuilder.newClient();
			Response response = client.target("http://localhost:4000/api/fire-alarms").request().post(Entity.json(alarmSensor));
			FireAlarmSensorSingleResponse fireAlarmSensorSingleResponse = response.readEntity(FireAlarmSensorSingleResponse.class);
			return fireAlarmSensorSingleResponse;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			client.close();
		}
		
		return null;
	}
	
	public FireAlarmSensorMultipleResponse getFireAlarmSensorList() throws RemoteException {
		
		try {
			client = ClientBuilder.newClient();
			FireAlarmSensorMultipleResponse response = client.target("http://localhost:4000/api/fire-alarms").request().get().readEntity(FireAlarmSensorMultipleResponse.class);
			return response;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			client.close();
		}
		
		return null;
	}
	
	public FireAlarmSensorSingleResponse getFireAlarmSensorById(String id) throws RemoteException {
		
		try {
			client = ClientBuilder.newClient();
			FireAlarmSensorSingleResponse response = client.target("http://localhost:4000/api/fire-alarms/" + id).request().get().readEntity(FireAlarmSensorSingleResponse.class);
			return response;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			client.close();
		}
		
		return null;
	}
	
	public FireAlarmSensorSingleResponse updateFireAlarmSensor(FireAlarmSensor alarmSensor, String id) throws RemoteException {
		
		try {
			client = ClientBuilder.newClient();
			Response response = client.target("http://localhost:4000/api/fire-alarms/" + id).request().put(Entity.json(alarmSensor));
			FireAlarmSensorSingleResponse fireAlarmSensorSingleResponse = response.readEntity(FireAlarmSensorSingleResponse.class);
			return fireAlarmSensorSingleResponse;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			client.close();
		}
		
		return null;
	}
	
	public FireAlarmSensorSingleResponse deleteFireAlarmSensor(String id) throws RemoteException {
		
		try {
			client = ClientBuilder.newClient();
			Response response = client.target("http://localhost:4000/api/fire-alarms/" + id).request().delete();
			FireAlarmSensorSingleResponse fireAlarmSensorSingleResponse = response.readEntity(FireAlarmSensorSingleResponse.class);
			return fireAlarmSensorSingleResponse;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			client.close();
		}
		
		return null;
	}
}
