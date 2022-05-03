package com.Bridgelabz.CabInvoiceGenerator;

public class Ride {

	/**
	 * private variables can only be accessed within the same class (an outside
	 * class has no access to it) private = restricted access However, it is
	 * possible to access them if we provide public get and set methods.
	 */
	private double distance;
	private int time;
	public RideCategories rideCategory;

	/**
	 * create parameterized constructor of Ride class by passing distance, time and
	 * rideCategory
	 * 
	 * @param rideCategory
	 * @param distance
	 * @param time
	 */
	public Ride(RideCategories rideCategory, double distance, int time) {
		this.rideCategory = rideCategory;
		this.distance = distance;
		this.time = time;
	}

	/**
	 * created getter setter methods
	 * 
	 * @return
	 */
	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
}
