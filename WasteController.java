package com.enviro.assessment.grad001.buwamabasa.enviro_waste_management;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/wastes
@RestController
public class WasteController {
	
	@RequestMapping("/wastes")
	public List<Waste> retrieveAllWastes() {
		return Arrays.asList(
				new Waste(1, "Plastic", "plastic container", "Recycling bin"),
				new Waste(2, "Glass", "Glass bottle", "Recycling bin"),
				new Waste(3, "Organic", "Vegetable peels", "Compost bin")
		);
	}
}
