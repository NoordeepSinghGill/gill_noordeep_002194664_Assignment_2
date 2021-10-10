/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 91942
 */
public class Driver {
    private String name; 
    private String password;
    private int id;
    
    // These are the new changes. 
    private String carmodel; 
    private String manufacturer;
    private String dateofmanufacture;
    private int seats;
    private String color;
    private String city;
    private int serialnumber;
    private Long telephonenumber;
    private String loginName; 
    
    //new change
    private String availabledate;
    private Long latestavailable;
    private String availabletowork;
    
    //maintanance certificate
    private String maintananceExpired;
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getCarmodel(){
        return carmodel;
    }

    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDateofmanufacture() {
        return dateofmanufacture;
    }

    public void setDateofmanufacture(String dateofmanufacture) {
        this.dateofmanufacture = dateofmanufacture;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(int serialnumber) {
        this.serialnumber = serialnumber;
    }

    public Long getTelephonenumber() {
        return telephonenumber;
    }

    // Start : This is a new change
    public void setTelephonenumber(Long telephonenumber) {
        this.telephonenumber = telephonenumber;
    }    

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
    
    public String getAvailabledate() {
        return availabledate;
    }

    public void setAvailabledate(String availabledate) {
        this.availabledate = availabledate;
    }

    public Long getLatestavailable() {
        return latestavailable;
    }

    public void setLatestavailable(Long latestavailable) {
        this.latestavailable = latestavailable;
    }

    public String getAvailabletowork() {
        return availabletowork;
    }

    public void setAvailabletowork(String availabletowork) {
        this.availabletowork = availabletowork;
    }

    public String getMaintananceExpired() {
        return maintananceExpired;
    }

    public void setMaintananceExpired(String maintananceExpired) {
        this.maintananceExpired = maintananceExpired;
    }

    
    
    // End : This is a new change
    @Override
    public String toString() {
        return name;
    }
}
