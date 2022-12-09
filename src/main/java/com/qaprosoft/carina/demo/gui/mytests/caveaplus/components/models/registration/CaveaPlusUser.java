package com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.models.registration;

import com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.enums.regitration.Day;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.enums.regitration.Gender;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.enums.regitration.Month;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.enums.regitration.Year;

public class CaveaPlusUser {
    private String firstName;
    private String lastName;
    private Day day;
    private Month month;
    private Year year;
    private Gender gender;
    private String phoneNumber;
    private String email;
    private String password;

    public CaveaPlusUser(String firstName, String lastName, Day day, Month month, Year year, Gender gender, String phoneNumber, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
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

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
