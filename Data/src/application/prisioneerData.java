package application;

import java.sql.Date;

public class prisioneerData {

	private int criminalId;
	private String firstName;
	private String lastName;
	private char gender;
	private String image;
	private Date date;
	private Date due;
	private int serverdTime;
	private Boolean in_Arrest;
	private Boolean set_Arrest;
	
	public prisioneerData(int criminalId, String firstName, String lastName, char gender, String image, Date date,
			Date due, int serverdTime, Boolean in_Arrest, Boolean set_Arrest) {
		this.criminalId = criminalId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.image = image;
		this.date = date;
		this.due = due;
		this.serverdTime = serverdTime;
		this.in_Arrest = in_Arrest;
		this.set_Arrest = set_Arrest;
	}
	
	public prisioneerData(int criminalId, String firstName, String lastName, Date date, Date due, Boolean in_Arrest,
			Boolean set_Arrest) {
		this.criminalId = criminalId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.date = date;
		this.due = due;
		this.in_Arrest = in_Arrest;
		this.set_Arrest = set_Arrest;
	}

	public int getCriminalId() {
		return criminalId;
	}
	public void setCriminalId(int criminalId) {
		this.criminalId = criminalId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getDue() {
		return due;
	}
	public void setDue(Date due) {
		this.due = due;
	}
	public int getServerdTime() {
		return serverdTime;
	}
	public void setServerdTime(int serverdTime) {
		this.serverdTime = serverdTime;
	}
	public Boolean getIn_Arrest() {
		return in_Arrest;
	}
	public void setIn_Arrest(Boolean in_Arrest) {
		this.in_Arrest = in_Arrest;
	}
	public Boolean getSet_Arrest() {
		return set_Arrest;
	}
	public void setSet_Arrest(Boolean set_Arrest) {
		this.set_Arrest = set_Arrest;
	}
}

