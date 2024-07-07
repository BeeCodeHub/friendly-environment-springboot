package com.enviro.assessment.grad001.buwamabasa.enviro_waste_management;

public class WasteDTO {
	private long id;
	private String category;
	private String item;
	
	//Constructor
	//Getters
	//toString
	
	public WasteDTO(long id, String category, String item) {
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
	
	@Override
	public String toString() {
		return "WasteDisposal [id=" + id + ", category=" + category + ", item=" + item + "]";
	}
	
	
}

