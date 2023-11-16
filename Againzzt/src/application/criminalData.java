package application;

import java.sql.Date;

public class criminalData {
    private int criminalID;
    private String firstName;
    private String lastName;
    private char gender;
    private int due;
    private String image;
    private Date arrestTime;
    private boolean arrested;
    private boolean setArrest;

    public criminalData() {
    }

    public criminalData(int criminalId, String firstName, String lastName, String gender, int due, String image, Date arrestTime, boolean arrested, boolean setArrest) {
        this.criminalID = criminalId;
    	this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender.charAt(0);
        this.image = image;
        this.arrestTime = arrestTime;
        this.due = due;
        this.arrested = false; // Default value
        this.setArrest = false; // Default value
    }

    public int getCriminalId() {
        return criminalID;
    }

    public void setCriminalId(int criminalId) {
        this.criminalID = criminalId;
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

    public int getDue() {
        return due;
    }

    public void setDue(int due) {
        this.due = due;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getArrestTime() {
        return arrestTime;
    }

    public void setArrestTime(Date arrestTime) {
        this.arrestTime = arrestTime;
    }

    public boolean isArrested() {
        return arrested;
    }

    public void setArrested(boolean arrested) {
        this.arrested = arrested;
    }

    public boolean isSetArrest() {
        return setArrest;
    }

    public void setSetArrest(boolean setArrest) {
        this.setArrest = setArrest;
    }
}
