package com.enviro.assessment.grad001.buwamabasa.enviro_waste_management;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/wastes
@RestController
public class WasteController {
	
	@RequestMapping("/wastes")
	public List<Waste>retrieveAllWastes() {
		return Arrays.asList(
				new Waste(1, "Plastic", "plastic container"),
				new Waste(2, "Glass", "Glass bottle"),
				new Waste(3, "Organic", "Vegetable peels"),
				new Waste(4, "Hazardous", "Batteries")
		);
	}
//	public List<WasteServices> retrieveWasteServices() {
//		return Arrays.asList(
//				new WasteService(1, "")
//		)
//	}
}
