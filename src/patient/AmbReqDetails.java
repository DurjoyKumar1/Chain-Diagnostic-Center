/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patient;

import java.time.LocalDate;

/**
 *
 * @author hp
 */
public class AmbReqDetails {
    protected String name, phoneNum, address, email;
    protected Float time;
    protected LocalDate date;

    public AmbReqDetails(String name, String phoneNum, String address, String email, Float time, LocalDate date) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.address = address;
        this.email = email;
        this.time = time;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Float getTime() {
        return time;
    }

    public void setTime(Float time) {
        this.time = time;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "AmbReqDetails{" + "name=" + name + ", phoneNum=" + phoneNum + ", address=" + address + ", email=" + email + ", time=" + time + ", date=" + date + '}';
    }
    
    
}
