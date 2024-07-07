package com.enviro.assessment.grad001.buwamabasa.enviro_waste_management;

public class WasteService {
	private String item;
	private String bin;
	
	public WasteService(String item, String bin) {
		this.item = item;
		this.bin = bin;
	}

	@Override
	public String toString() {
		return "WasteServices [item=" + item + ", bin=" + bin + "]";
	}

	public String getItem() {
		return item;
	}

	public String getBin() {
		return bin;
	}
	
}