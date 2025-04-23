package model;

import java.util.Date;

public class Guestbook {
	
	private String message;
	private Date date;
	
	public Guestbook(String message) {
		this.message = message;
		this.date = new Date();
	}
	
	public String getMessage() {
		return message;
	}
	
	public Date getDate() {
		return date;
	}
	@Override
	public String toString() {
		return "Guestbook[message=" + message + ", date = " + date + "]";
	}
	
}
