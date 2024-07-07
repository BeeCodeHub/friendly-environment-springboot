/**
 * 
 */
package com.enviro.assessment.grad001.buwamabasa.enviro_waste_management;

/**
 * 
 */
public class DropOffLocationsInTheArea {

	private String item;
	private String location;
	
	@Override
	public String toString() {
		return "DropOffLocationsInTheArea [item=" + item + ", location=" + location + "]";
	}

	public DropOffLocationsInTheArea(String item, String location) {
		super();
		this.item = item;
		this.location = location;
	}

	public String getItem() {
		return item;
	}

	public String getLocation() {
		return location;
	}

}
