package com.enviro.assessment.grad001.buwamabasa.enviro_waste_management;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WasteController {
	
	@RequestMapping("/wastes")
	public List<Waste> retrieveAllWastes() {
		return Arrays.asList(
				new Waste(1, "Solid", "General"),
				new Waste(2, "Solid", "Hazardous")
		);
	}
}
