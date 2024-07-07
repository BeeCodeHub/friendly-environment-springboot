package com.enviro.assessment.grad001.buwamabasa.enviro_waste_management;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/wastes
@RestController
@RequestMapping("/api")
public class WasteController {
	
	@RequestMapping("/wastes")
	public List<WasteDTO> retrieveAllWastes() {
		return Arrays.asList(
				new WasteDTO(1, "Plastic", "plastic container"),
				new WasteDTO(2, "Glass", "Glass bottle"),
				new WasteDTO(3, "Organic", "Vegetable peels"),
				new WasteDTO(4, "Hazardous", "Batteries")
		);
	}
	
	public List<WasteService> retrieveWasteServices() {
		return Arrays.asList(
				new WasteService("Plastic container", "Recycling Bin"),
				new WasteService("Glass bottle", "Recycling Bin"),
				new WasteService("Vegetable peels", "Compost Bin"),
				new WasteService("Batteries", "Battery disposal centre")
		);
	}
	
	public List<DropOffLocationsInTheArea> retrieveAllDropOffLocations() {
		return Arrays.asList(
				new DropOffLocationsInTheArea("Battery", "Local Batteries Centre"),
				new DropOffLocationsInTheArea("Electrical appliances", "Home Electric services"),
				new DropOffLocationsInTheArea("Auto parts", "ABC local scapyard")
		);
	}
	
//	private PickUpService pickupservice;
	
//	public ResponseEntity<String> requestPickUp(PickUpRequestDTO request) {
//        PickUpService.handlePickupRequest(request);
//        return ResponseEntity.ok("Pickup request received successfully");
//	}

}
