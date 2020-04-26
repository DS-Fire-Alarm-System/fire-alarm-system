package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

import dtos.Auth;
import dtos.FireAlarmSensor;
import response.models.AuthResponse;
import response.models.FireAlarmSensorMultipleResponse;
import response.models.FireAlarmSensorSingleResponse;

public interface IFireAlarmService extends Remote {
	
	public AuthResponse login(Auth auth) throws RemoteException;
	public FireAlarmSensorSingleResponse createFireAlarmSensor(FireAlarmSensor alarmSensor) throws RemoteException;
	public FireAlarmSensorMultipleResponse getFireAlarmSensorList() throws RemoteException;
	public FireAlarmSensorSingleResponse getFireAlarmSensorById(String id) throws RemoteException;
	public FireAlarmSensorSingleResponse updateFireAlarmSensor(FireAlarmSensor alarmSensor, String id) throws RemoteException;
	public FireAlarmSensorSingleResponse deleteFireAlarmSensor(String id) throws RemoteException;
}
