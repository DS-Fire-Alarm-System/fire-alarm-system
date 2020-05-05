package dtos;

import java.io.Serializable;

public class EmailSms implements Serializable {
	
	private int floor;
	private int room;
	
	public int getFloor() {
		return floor;
	}
	
	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	public int getRoom() {
		return room;
	}
	
	public void setRoom(int room) {
		this.room = room;
	}
}
