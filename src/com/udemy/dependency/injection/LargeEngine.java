package com.udemy.dependency.injection;

public class LargeEngine implements Engine {

	private int horsePower;
	
	public LargeEngine(int horsePower) {
		this.horsePower = horsePower;
	}
	@Override
	public void startEngine() {
		System.out.println("started large "+ horsePower + " hp engine");
		System.out.println("Vehicle is running.");
	}

}
