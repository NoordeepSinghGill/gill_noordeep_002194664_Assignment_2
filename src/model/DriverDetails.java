/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author 91942
 */
public class DriverDetails {
    ArrayList<Driver> newDriver;
    
    private String loginName; 
    private String driverforupdate;
    
    //New changes
    private String adminupdatecarmodel; 
    private String adminupdatemanufacturer;
    private String adminupdatedateofmanufacture;
    private int adminupdateseats;
    private String adminupdatecolor;
    private String adminupdatecity;
    private int adminupdateserialnumber;
    private Long adminuodatetelephonenumber;
    // new changes end here
    
    //update catalog date and time
    private String updatedcatalogtime;
    
    public DriverDetails(){
        this.newDriver = new ArrayList<>();
    }
    public ArrayList<Driver> getNewDriver() {
        return newDriver;
    }

    public void setNewDriver(ArrayList<Driver> newDriver) {
        this.newDriver = newDriver;
    }
    
    public Driver addNewDriver(){
        Driver newDriverWorker = new Driver();
        newDriver.add(newDriverWorker);
        return newDriverWorker; 
    }

    public void deleteDriver(Driver SelectedDriver) {
        newDriver.remove(SelectedDriver);
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getDriverforupdate() {
        return driverforupdate;
    }

    public void setDriverforupdate(String driverforupdate) {
        this.driverforupdate = driverforupdate;
    }

    public String getAdminupdatecarmodel() {
        return adminupdatecarmodel;
    }

    public void setAdminupdatecarmodel(String adminupdatecarmodel) {
        this.adminupdatecarmodel = adminupdatecarmodel;
    }

    public String getAdminupdatemanufacturer() {
        return adminupdatemanufacturer;
    }

    public void setAdminupdatemanufacturer(String adminupdatemanufacturer) {
        this.adminupdatemanufacturer = adminupdatemanufacturer;
    }

    public String getAdminupdatedateofmanufacture() {
        return adminupdatedateofmanufacture;
    }

    public void setAdminupdatedateofmanufacture(String adminupdatedateofmanufacture) {
        this.adminupdatedateofmanufacture = adminupdatedateofmanufacture;
    }

    public int getAdminupdateseats() {
        return adminupdateseats;
    }

    public void setAdminupdateseats(int adminupdateseats) {
        this.adminupdateseats = adminupdateseats;
    }

    public String getAdminupdatecolor() {
        return adminupdatecolor;
    }

    public void setAdminupdatecolor(String adminupdatecolor) {
        this.adminupdatecolor = adminupdatecolor;
    }

    public String getAdminupdatecity() {
        return adminupdatecity;
    }

    public void setAdminupdatecity(String adminupdatecity) {
        this.adminupdatecity = adminupdatecity;
    }

    public int getAdminupdateserialnumber() {
        return adminupdateserialnumber;
    }

    public void setAdminupdateserialnumber(int adminupdateserialnumber) {
        this.adminupdateserialnumber = adminupdateserialnumber;
    }

    public Long getAdminuodatetelephonenumber() {
        return adminuodatetelephonenumber;
    }

    public void setAdminuodatetelephonenumber(Long adminuodatetelephonenumber) {
        this.adminuodatetelephonenumber = adminuodatetelephonenumber;
    }

    public String getUpdatedcatalogtime() {
        return updatedcatalogtime;
    }

    public void setUpdatedcatalogtime(String updatedcatalogtime) {
        this.updatedcatalogtime = updatedcatalogtime;
    }

    
   
}
