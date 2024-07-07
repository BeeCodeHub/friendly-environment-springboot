package com.enviro.assessment.grad001.buwamabasa.enviro_waste_management;
import org.springframework.stereotype.Service;

@Service
public class PickupService {

    public void handlePickupRequest(PickUpRequestDTO request) {
        
        PickUpRequestDTO entity = new PickUpRequestDTO();
        
        entity.setName(request.getName());
        entity.setAddress(request.getAddress());
        entity.setContactNumber(request.getContactNumber());
        entity.setAutoPartsDetails(request.getAutoPartsDetails());
        
        System.out.println("Processing pickup request for auto parts: " + request);
        
        sendNotification(entity);
        
        saveToDatabase(entity);
    }
    
    private void saveToDatabase(PickUpRequestDTO entity) {
        System.out.println("Saving pickup request to database: " + entity);
    }
    
    private void sendNotification(PickUpRequestDTO request) {
        System.out.println("Notification: New pickup request for " + request.getAutoPartsDetails() + " at " + request.getAddress());
    }
    
    public void wasteCollectionReminder() {
        System.out.print("Waste collection in your area in the next 24 hours");
    }
}
