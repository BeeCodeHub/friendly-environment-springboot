package com.enviro.assessment.grad001.buwamabasa.enviro_waste_management;

public class Waste {
	private long id;
	private String category;
	private String item;
	private String bin;
	
	//Constructor
	//Getters
	//toString
	
	public Waste(long id, String category, String item) {
		super();
		this.id = id;
		this.category = category;
		this.item = item;
	}
	
	public long getId() {
		return id;
	}
	public String getCategory() {
		return category;
	}
	public String getItem() {
		return item;
	}
	public String getBin() {
		return bin;
	}
	
	@Override
	public String toString() {
		return "WasteDisposal [id=" + id + ", category=" + category + ", item=" + item + ", bin=" + bin + "]";
	}
	
	
}

