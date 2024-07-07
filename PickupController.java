package com.enviro.assessment.grad001.buwamabasa.enviro_waste_management;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class PickupController {
	private final PickupService pickupService;

    @Autowired
    public PickupController(PickupService pickupService) {
        this.pickupService = pickupService;
    }
    
    @PostMapping("/pickup")
//    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<String> requestPickUp(@RequestBody PickUpRequestDTO request) {
        pickupService.handlePickupRequest(request);
        return ResponseEntity.ok("Pickup request received successfully");
    }
}
