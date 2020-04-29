package response.models;

import java.io.Serializable;
import java.util.List;

import dtos.FireAlarmSensor;
import dtos.Registration;

public class RegistrationResponse  implements Serializable {

	private String status;
	private List<Registration> data;

	
	public List<Registration> getData() {
		return data;
	}

	public void setData(List<Registration> data) {
		this.data = data;
	}

	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	

}