package com.example.demo;

import java.util.ArrayList;

public class application {

	public static void main(String[] args) {
		Animal monkey = new Animal("brown", 2, false);
		Animal fish =new Animal("grey", 0, true);
		Primate gibbus= new Primate(true);
		System.out.println(gibbus.getHasThumbs());
		System.out.println(gibbus.getColor());
		System.out.println(gibbus.getNumberOfLegs());
		
		ArrayList<Animal> myList= new ArrayList<Animal>();
		myList.add(monkey);
		myList.add(fish);
		myList.add(gibbus);
		
		for(Animal a : myList) {
			System.out.println(a.getColor());
		}

	}

}
