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
import dtos.EmailSms;
import dtos.FireAlarmSensor;
import dtos.User;
import interfaces.IFireAlarmService;
import response.models.AuthResponse;
import response.models.EmailSmsResponse;
import response.models.UserResponse;
import response.models.FireAlarmSensorMultipleResponse;
import response.models.FireAlarmSensorSingleResponse;

public class FireAlarmServiceImpl extends UnicastRemoteObject implements IFireAlarmService, Serializable {
	
	public Client client;
	
	public FireAlarmServiceImpl() throws RemoteException {}
	
	// Register New User
	public UserResponse register(User user) throws RemoteException {
		try {
			// create new client
			client = ClientBuilder.newClient();
			// get the users response values from REST api
			Response response = client.target("http://localhost:4000/api/users").request().post(Entity.json(user));
			// set the response in RegistrationResponse
			UserResponse regResponse = response.readEntity(UserResponse.class);
			// return registration response
			return regResponse;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			client.close(); // close newly created client
		}
		
		return null;
	}
	
	// Login
	public AuthResponse login(Auth auth) throws RemoteException {
		
		try {
			// create new client
			client = ClientBuilder.newClient();
			// get the authentication response values from REST api
			Response response = client.target("http://localhost:4000/api/auth").request().post(Entity.json(auth));
			// set the response in authResponse
			AuthResponse authResponse = response.readEntity(AuthResponse.class);
			return authResponse;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			client.close(); // close newly created client
		}
		
		return null;
	}
	
	// Create a Fire Alarm Sensor
	public FireAlarmSensorSingleResponse createFireAlarmSensor(FireAlarmSensor alarmSensor) throws RemoteException {
		
		try {
			// create new client
			client = ClientBuilder.newClient();
			// get the fire alarm sensors response values values from REST api
			Response response = client.target("http://localhost:4000/api/fire-alarms").request().post(Entity.json(alarmSensor));
			// set the response in authResponse
			FireAlarmSensorSingleResponse fireAlarmSensorSingleResponse = response.readEntity(FireAlarmSensorSingleResponse.class);
			return fireAlarmSensorSingleResponse;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			client.close(); // close newly created client
		}
		
		return null;
	}
	
	// Get Fire Alarm Sensors
	public FireAlarmSensorMultipleResponse getFireAlarmSensorList() throws RemoteException {
		
		try {
			// create new client
			client = ClientBuilder.newClient();
			// set the multiple fire alarm sensors response values from REST api
			FireAlarmSensorMultipleResponse response = client.target("http://localhost:4000/api/fire-alarms").request().get().readEntity(FireAlarmSensorMultipleResponse.class);
			return response;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			client.close(); // close newly created client
		}
		
		return null;
	}
	
	// Get Fire Alarm Sensor by id
	public FireAlarmSensorSingleResponse getFireAlarmSensorById(String id) throws RemoteException {
		
		try {
			// create new client
			client = ClientBuilder.newClient();
			// set the single  fire alarm sensors response values from REST api
			FireAlarmSensorSingleResponse response = client.target("http://localhost:4000/api/fire-alarms/" + id).request().get().readEntity(FireAlarmSensorSingleResponse.class);
			return response;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			client.close(); // close newly created client
		}
		
		return null;
	}
	
	// Update Fire Alarm Sensor
	public FireAlarmSensorSingleResponse updateFireAlarmSensor(FireAlarmSensor alarmSensor, String id) throws RemoteException {
		
		try {
			// create new client
			client = ClientBuilder.newClient();
			// get the given id fire alarm sensors response values from REST api
			Response response = client.target("http://localhost:4000/api/fire-alarms/" + id).request().put(Entity.json(alarmSensor));
			// set the response in fireAlarmSensorSingleResponse
			FireAlarmSensorSingleResponse fireAlarmSensorSingleResponse = response.readEntity(FireAlarmSensorSingleResponse.class);
			return fireAlarmSensorSingleResponse;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			client.close(); // close newly created client
		}
		
		return null;
	}
	
	// Delete Fire Alarm Sensor
	public FireAlarmSensorSingleResponse deleteFireAlarmSensor(String id) throws RemoteException {
		
		try {
			// create new client
			client = ClientBuilder.newClient();
			// delete the given id fire alarm sensors response values from REST api
			Response response = client.target("http://localhost:4000/api/fire-alarms/" + id).request().delete();
			// set the response in fireAlarmSensorSingleResponse
			FireAlarmSensorSingleResponse fireAlarmSensorSingleResponse = response.readEntity(FireAlarmSensorSingleResponse.class);
			return fireAlarmSensorSingleResponse;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			client.close(); // close newly created client
		}
		
		return null;
	}
	
	// Send Email
	public EmailSmsResponse sendEmail(EmailSms email) throws RemoteException {
		try {
			// create new client
			client = ClientBuilder.newClient();
			// get the email response values from REST api
			Response response = client.target("http://localhost:4000/api/emails").request().post(Entity.json(email));
			// set the response in EmailSmsResponse
			EmailSmsResponse emailResponse = response.readEntity(EmailSmsResponse.class);
			// return email response
			return emailResponse;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			client.close(); // close newly created client
		}
		
		return null;
	}
	
	// Send SMS
	public EmailSmsResponse sendSms(EmailSms sms) throws RemoteException {
		try {
			// create new client
			client = ClientBuilder.newClient();
			// get the sms response values from REST api
			Response response = client.target("http://localhost:4000/api/sms").request().post(Entity.json(sms));
			// set the response in EmailSmsResponse
			EmailSmsResponse smsResponse = response.readEntity(EmailSmsResponse.class);
			// return sms response
			return smsResponse;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			client.close(); // close newly created client
		}
		
		return null;
	}
}
