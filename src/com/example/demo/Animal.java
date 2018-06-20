package com.example.demo;

public class Animal {
	private String color; 
	private int numberOfLegs;
	private boolean laysEggs;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNumberOfLegs() {
		return numberOfLegs;
	}
	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}
	public boolean isLaysEggs() {
		return laysEggs;
	}
	public void setLaysEggs(boolean laysEggs) {
		this.laysEggs = laysEggs;
	}
	public Animal(String color, int numberOfLegs, boolean laysEggs) {
		super();
		this.color = color;
		this.numberOfLegs = numberOfLegs;
		this.laysEggs = laysEggs;
	}
	
	

}
