package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
	private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents = new ArrayList<String>();
    
    // TO DO: Implement a constructor that takes an ID and a role
    public AdminUser(Integer employeeID, String role) {
    	this.employeeID = employeeID;
    	this.role = role;
    }
    // TO DO: Implement HIPAACompliantUser!
    public boolean assignPin(int pin) {
		String stringPin = String.valueOf(pin);
		if(stringPin.length() == 6) {
			return true;
		}else {
			return false;
		}
    }
    
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if(confirmedAuthID == employeeID) {
			return true;
		}else {
			authIncident();
			return false;
		}
	}
    
    // TO DO: Implement HIPAACompliantAdmin!
	public ArrayList<String> reportSecurityIncidents(){
		return securityIncidents;
		
	}
	
    
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.employeeID, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.employeeID, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }

    // TO DO: Setters & Getters
    public Integer getEmployeeID() {
    	return employeeID;
    }
    
    public void setEmployeeID(Integer employeeID) {
    	this.employeeID = employeeID;
    }
    
    public String getRole() {
    	return role;
    }
    
    public void setRole(String role) {
    	this.role = role;
    }
    
}
