package com.enviro.assessment.grad001.buwamabasa.enviro_waste_management;

import java.util.Arrays;
import java.util.List;

@RestController
public class WasteController {
	// /wasteManagement
	// Waste: id, name, type
	public List<Waste> retrieveAllWastes() {
		return Arrays.asList(
				new Waste(1, "Solid", "General"),
				new Waste(2, "Solid", "Hazardous"),
		)
	}
}
