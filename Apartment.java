/**
* Describing the Apartment subgrouping from Residential occupancy group
*
* @author Hannes Nilsson
* @version 1.0
* Construction_HN
* CS131ON
*/
public class Apartment extends Residential{

	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	/**
	 * Constructs Apartment object and gives instance fields default values
	 */
	public Apartment() {
		super();
		
		this.numRentableUnits = 0;
		this.avgUnitSize = 0.0;
		this.parkingAvailable = false;
	}//end empty-argument constructor

	/**
	 * Constructs Apartment object and gives instance fields values based on passed arguments
	 * 
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 * @param numBedrooms
	 * @param numBathrooms
	 * @param laundryRoom
	 */
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, int numRentableUnits, double avgUnitSize, boolean parkingAvailable) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, laundryRoom);
		
		this.numRentableUnits = numRentableUnits;
		this.avgUnitSize = avgUnitSize;
		this.parkingAvailable = parkingAvailable;
	}//end preferred constructor
	
	/**
	 * Will eventually be used to draw the object to the screen. Temporary functionality prints "Drawing code for Apartment" to the console
	 */
	public void draw() {
		System.out.println("Drawing code for Apartment");
	}//end draw
	
	/**
	 * @return Formatted table displaying relevant information about current object type as described in the fields.
	 */
	public String displayData() {
		
		String s1;
		
		if (isLaundryRoom() == true) {
			s1 = "Y";
		}
		else {
			s1 = "N";
		}
		
        String s2;
		
		if (isParkingAvailable() == true) {
			s2 = "Y";
		}
		else {
			s2 = "N";
		}
		
		StringBuilder sb = new StringBuilder("----------------------------\n");
		sb.append("Apartment\n");
		sb.append("----------------------------\n");
		sb.append("Project Name: "+getProjectName()+"\n");
		sb.append("Address: "+getCompleteAddress()+"\n");
		sb.append("Square Feet: "+getTotalSquareFeet()+"\n");
		sb.append("Occupancy Group: "+getOccupancyGroup()+"\n");
		sb.append("Occupancy Subgroup: "+getSubgroup()+"\n");
		sb.append("Number of Bedrooms: "+getNumBedrooms()+"\n");
		sb.append("Number of Bathrooms: "+getNumBathrooms()+"\n");
		sb.append("Laundry Room: "+s1+"\n");
		sb.append("Number of Rentable Units: "+getNumRentableUnits()+"\n");
		sb.append("Average Unit Size: "+getAvgUnitSize()+"\n");
		sb.append("Parking Available: "+s2+"\n");
			
			return sb.toString();
	}//end displayData

	/**
	 * @return the numRentableUnits
	 */
	public int getNumRentableUnits() {
		return numRentableUnits;
	}//end getNumRentableUnits
	
	/**
	 * @param numRentableUnits the numRentableUnits to set
	 */
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}//end setNumeRentableUnits
	
	/**
	 * @return the avgUnitSize
	 */
	public double getAvgUnitSize() {
		return avgUnitSize;
	}//end getAvgUnitSize
	
	/**
	 * @param avgUnitSize the avgUnitSize to set
	 */
	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}//end setAvgUnitSize
	
	/**
	 * @return the parkingAvailable
	 */
	public boolean isParkingAvailable() {
		return parkingAvailable;
	}//end isParkingAvailable
	
	/**
	 * @param parkingAvailable the parkingAvailable to set
	 */
	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}//end setParkingAvailable

	@Override
	public String toString() {
		return "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvailable=" + parkingAvailable + ", numBedrooms=" + numBedrooms + ", numBathrooms="
				+ numBathrooms + ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + "]";
	}//end toString
}//end class
