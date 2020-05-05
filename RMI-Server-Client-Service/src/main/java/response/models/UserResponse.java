package response.models;

import java.io.Serializable;
import java.util.List;

import dtos.FireAlarmSensor;
import dtos.User;

// store registration response
public class UserResponse  implements Serializable {

	private String status;
	private User data;

	
	public User getData() {
		return data;
	}

	public void setData(User data) {
		this.data = data;
	}

	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
}