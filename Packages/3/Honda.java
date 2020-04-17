//Honda class is subclass of Vehicle 
package com.automobile;

public class Honda extends Vehicle{
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	
	

	public Honda(String modelName, String registrationNumber, String ownerName, int speed) {
		super();
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
	}

	@Override
	public void getModelName() {
		System.out.println("ModelName: " + modelName);
	}

	@Override
	public void getRegistrationNumber() {
		System.out.println("RegistrationNumber: " + registrationNumber);
	}

	@Override
	public void getOwnerName() {
		System.out.println("OwnerName: " + ownerName);
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void cdplayer() {
		System.out.println("Accessing CD Player.");
	}

}
