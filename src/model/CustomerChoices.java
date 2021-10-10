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
public class CustomerChoices {
    ArrayList<Driver> customerlist;
    
    public CustomerChoices(){
        this.customerlist = new ArrayList<>();
    }
    
    public ArrayList<Driver> getCustomerlist() {
        return customerlist;
    }

    public void setCustomerlist(ArrayList<Driver> customerlist) {
        this.customerlist = customerlist;
    }
    
     public Driver addNewCustomerChoices(){
        Driver newDriverWorker = new Driver();
        customerlist.add(newDriverWorker);
        return newDriverWorker; 
    }

    public void deleteCustomerChoices(Driver SelectedDriver) {
        customerlist.remove(SelectedDriver);
    }
}
