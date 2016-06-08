package com.fdmgroup.Hansel;

public class Cottage {
	private String Building;
	private int Walls;
	
	public String getBuilding() {
		return Building;
	}
	public void setBuilding(String building) {
		Building = building;
	}
	
	public int getWalls() {
		return Walls;
	}
	public void setWalls(int walls) {
		Walls = walls;
	}
	
public void stayStill(){
	System.out.println("This building stays still");
	}
}
