package application;

import java.sql.Date;

public class criminalData {
    private int criminalId;
    private String firstName;
    private String lastName;
    private char gender;
    private String image;
    private Date date;
    private int due;
    private int timeNeedsJail;
    private boolean incarceratedArrested;
    private boolean setArrest;

    public criminalData() {
    }

    public criminalData(String firstName, String lastName, char gender, String image, Date date, int due, int timeNeedsJail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.image = image;
        this.date = date;
        this.due = due;
        this.timeNeedsJail = timeNeedsJail;
        this.incarceratedArrested = false; // Default value
        this.setArrest = false; // Default value
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

    public int getDue() {
        return due;
    }

    public void setDue(int due) {
        this.due = due;
    }

    public int getTimeNeedsJail() {
        return timeNeedsJail;
    }

    public void setTimeNeedsJail(int timeNeedsJail) {
        this.timeNeedsJail = timeNeedsJail;
    }

    public boolean isIncarceratedArrested() {
        return incarceratedArrested;
    }

    public void setIncarceratedArrested(boolean incarceratedArrested) {
        this.incarceratedArrested = incarceratedArrested;
    }

    public boolean isSetArrest() {
        return setArrest;
    }

    public void setSetArrest(boolean setArrest) {
        this.setArrest = setArrest;
    }
}
