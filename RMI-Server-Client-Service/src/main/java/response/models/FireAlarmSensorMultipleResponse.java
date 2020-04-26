package response.models;

import java.io.Serializable;
import java.util.List;

import dtos.FireAlarmSensor;

public class FireAlarmSensorMultipleResponse implements Serializable {
	
	private String status;
	private List<FireAlarmSensor> data;
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public List<FireAlarmSensor> getData() {
		return data;
	}
	
	public void setData(List<FireAlarmSensor> data) {
		this.data = data;
	}
}
