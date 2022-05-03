package com.Bridgelabz.CabInvoiceGenerator;

public class InvoiceSummary {

	/**
	 * declaring variables given for InvoiceSumamry
	 */
	public int numOfRides;
	public double totalFare;
	public double avgFare;

	/**
	 * parameterized constructor for InvoiceSummary by passing parameters
	 * 
	 * @param numOfRides
	 * @param totalFare
	 */
	public InvoiceSummary(int numOfRides, double totalFare) {
		this.numOfRides = numOfRides;
		this.totalFare = totalFare;
		this.avgFare = this.totalFare / this.numOfRides;
	}

	@Override
	/**
	 * The equals() method of Boolean class is a built in method of Java which is
	 * used check equality of two Boolean object.
	 * 
	 * @param -It take a parameter o of type Object as input which is the instance
	 *            to be compared.
	 * @return- The return type is boolean. It returns true if the specified Object
	 *          ‘o’ has same value as the ‘BooleanObject’, else it returns false.
	 */
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		InvoiceSummary that = (InvoiceSummary) o;
		return (numOfRides == that.numOfRides) && Double.compare(that.totalFare, totalFare) == 0
				&& Double.compare(that.avgFare, avgFare) == 0;
	}
}