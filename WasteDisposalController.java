package com.enviro.assessment.grad001.buwamabasa.enviro_waste_management;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/wastes
@RestController
public class WasteDisposalController {
	
	@RequestMapping("/wastes")
	public List<WasteDisposal> retrieveAllWastes() {
		return Arrays.asList(
			new WasteDisposal(1, "Plastic", "plastic container", "Recycling bin"),
			new WasteDisposal(2, "Glass", "Glass bottle", "Recycling bin"),
			new WasteDisposal(3, "Organic", "Vegetable peels", "Compost bin"),
			new WasteDisposal(4, "Hazardous", "Batteries", "Batteries collection points")
		);
	}
	
//	public List<WasteServices> retrieveWasteServices() {
//		return Arrays.asList()
//	}
}
