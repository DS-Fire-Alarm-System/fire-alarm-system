package dtos;

import java.io.Serializable;

public class FireAlarmSensor implements Serializable {
    
	private String _id;
    private int floor_no;
    private int room_no;
    private int smoke_level;
    private int co2_level;
    private boolean status;

    public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public int getFloor_no() {
        return floor_no;
    }

    public void setFloor_no(int floor_no) {
        this.floor_no = floor_no;
    }

    public int getRoom_no() {
        return room_no;
    }

    public void setRoom_no(int room_no) {
        this.room_no = room_no;
    }

    public int getSmoke_level() {
        return smoke_level;
    }

    public void setSmoke_level(int smoke_level) {
        this.smoke_level = smoke_level;
    }

    public int getCo2_level() {
        return co2_level;
    }

    public void setCo2_level(int co2_level) {
        this.co2_level = co2_level;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
