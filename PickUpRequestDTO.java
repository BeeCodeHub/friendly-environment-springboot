package com.enviro.assessment.grad001.buwamabasa.enviro_waste_management;

public class PickUpRequestDTO {
	
    private String name;
    private String address;
    private String contactNumber;
    private String autoPartsDetails;
    
    public PickUpRequestDTO() {
    }

    //constructors
    public PickUpRequestDTO(String name, String address, String contactNumber, String autoPartsDetails) {
    	this.name = name;
    	this.address = address;
    	this.contactNumber = contactNumber;
    	this.autoPartsDetails = autoPartsDetails;
    }
    
    // Getters and Setters
    public String getName() {
        return name;
    }

	public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }


	public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAutoPartsDetails() {
        return autoPartsDetails;
    }

    public void setAutoPartsDetails(String autoPartsDetails) {
        this.autoPartsDetails = autoPartsDetails;
    }

    @Override
    public String toString() {
    	return "PickUpRequestDTO [name=" + name + ", address=" + address + ", contactNumber=" + contactNumber
    			+ ", autoPartsDetails=" + autoPartsDetails + "]";
    }
}
