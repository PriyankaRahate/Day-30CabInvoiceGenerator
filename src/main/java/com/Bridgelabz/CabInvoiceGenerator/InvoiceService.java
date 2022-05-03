package com.Bridgelabz.CabInvoiceGenerator;



public class InvoiceService {

	/**
	 * the variables is only visible within the class, not from any other class
	 * (including subclasses). The visibility of private members extends to nested
	 * classes. private final static -> create this variable only once.
	 */
	private static final int COST_PER_TIME = 1;
	private static final double COST_PER_KM = 10;
	private static final double MINIMUM_FARE = 5;
	private RideRepository rideRepository;

	/**
	 * default constructor for InvoiceService
	 */
	public InvoiceService() {
		this.rideRepository = new RideRepository();
	}

	/**
	 * create method to calculate total fare as per distance and time
	 * 
	 * @param distance -distance of per km cost is 10 rs
	 * @param time     -per minute cost is 1rs
	 * @return -return to method created
	 */
	public double calculateFare(double distance, int time) {
		return Math.max(MINIMUM_FARE, distance * COST_PER_KM + time * COST_PER_TIME);
	}

	/**
	 * InvoiceSummary method for getting the part of the invoice
	 * 
	 * @param rides
	 * @return
	 */
	public InvoiceSummary calculateFare(Ride[] rides) {
		double totalFare = 0;
		for (Ride ride : rides) {
			totalFare += calculateFare(ride.getDistance(), ride.getTime());
		}
		return new InvoiceSummary(rides.length, totalFare);
	}

	/**
	 * method created addRides for Given a user id
	 * 
	 * @param userId
	 * @param ride
	 */
	public void addRides(String userId, Ride[] ride) {
		rideRepository.addRide(userId, ride);
	}

	/**
	 * the invoice service gets the list of rides from the ride repository, and
	 * return the invoice
	 * 
	 * @param userId
	 * @return
	 */
	public InvoiceSummary getInvoiceSummary(String userId) {
		return this.calculateFare(rideRepository.getRides(userId));
	}

}
