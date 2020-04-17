//Logan is subclass of Vehicle 
package com.automobile;

public class Logan extends Vehicle {
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	private int gps;
	
	

	public Logan(String modelName, String registrationNumber, String ownerName, int speed, int gps) {
		super();
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
		this.gps = gps;
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
	
	public int speed() {
		return speed;
	}
	
	public int gps() {
		return gps;
	}
}
