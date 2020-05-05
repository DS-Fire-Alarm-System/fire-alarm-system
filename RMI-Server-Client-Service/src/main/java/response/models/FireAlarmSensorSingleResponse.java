package response.models;

import java.io.Serializable;

import dtos.FireAlarmSensor;

// store single response
public class FireAlarmSensorSingleResponse implements Serializable {

	private String status;
	private FireAlarmSensor data;
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public FireAlarmSensor getData() {
		return data;
	}
	
	public void setData(FireAlarmSensor data) {
		this.data = data;
	}
}
