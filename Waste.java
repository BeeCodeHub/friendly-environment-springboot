package com.enviro.assessment.grad001.buwamabasa.enviro_waste_management;

public class Waste {
	private long id;
	private String state;
	private String type;
	
	//Constructor
	//Getters
	//toString
	
	public Waste(long id, String state, String type) {
		super();
		this.id = id;
		this.state = state;
		this.type = type;
	}
	
	public long getId() {
		return id;
	}
	public String getName() {
		return state;
	}
	public String getAuthor() {
		return type;
	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + state + ", author=" + type + "]";
	}
	
	
}

