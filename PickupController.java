package com.enviro.assessment.grad001.buwamabasa.enviro_waste_management;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class PickupController {
	private final PickupService pickupService;

    public PickupController(PickupService pickupService) {
        this.pickupService = pickupService;
    }
    
    @PostMapping("/pickup")
    public ResponseEntity<String> requestPickUp(@RequestBody PickUpRequestDTO request) {
        pickupService.handlePickupRequest(request);
        return ResponseEntity.ok("Pickup request received successfully");
    }
}
