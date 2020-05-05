package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

import dtos.Auth;
import dtos.EmailSms;
import dtos.FireAlarmSensor;
import dtos.User;
import response.models.AuthResponse;
import response.models.EmailSmsResponse;
import response.models.FireAlarmSensorMultipleResponse;
import response.models.FireAlarmSensorSingleResponse;
import response.models.UserResponse;

public interface IFireAlarmService extends Remote {
	
	public AuthResponse login(Auth auth) throws RemoteException;
	public FireAlarmSensorSingleResponse createFireAlarmSensor(FireAlarmSensor alarmSensor) throws RemoteException;
	public FireAlarmSensorMultipleResponse getFireAlarmSensorList() throws RemoteException;
	public FireAlarmSensorSingleResponse getFireAlarmSensorById(String id) throws RemoteException;
	public FireAlarmSensorSingleResponse updateFireAlarmSensor(FireAlarmSensor alarmSensor, String id) throws RemoteException;
	public FireAlarmSensorSingleResponse deleteFireAlarmSensor(String id) throws RemoteException;
	public UserResponse register(User user) throws RemoteException;
	public EmailSmsResponse sendEmail(EmailSms email) throws RemoteException;
	public EmailSmsResponse sendSms(EmailSms sms) throws RemoteException;
}
