package com.udemy.dependency.injection;

public class Vehicle {
	
	Engine myEngine;
	
	public Vehicle(Engine anEngine) {
		myEngine = anEngine;
	}
	
	public void crankIgnition() {
		myEngine.startEngine();
	}

}
