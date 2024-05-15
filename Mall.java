/**
* Describing the Mall subgrouping from Business occupancy group
*
* @author Hannes Nilsson
* @version 1.0
* Construction_HN
* CS131ON
*/
public class Mall extends Business {

	/**
	 * Instance fields describing the number of rented units in the mall, the median size of the rentable units, and how many parking spaces the mall has
	 */
	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	
	/**
	 * Creates Mall object and sets all instance fields to default values
	 */
	public Mall() {
		super();
		
		this.numRentedUnits = 0;
		this.medianUnitSize = 0.0;
		this.numParkingSpaces = 0;
	}//end empty-argument constructor

	/**
	 * Creates Mall object and sets all instance fields to values passed as arguments
	 * 
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 * @param numRentableUnits
	 */
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentableUnits, int numRentedUnits, double medianUnitSize, int numParkingSpaces) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numRentableUnits);
		
		this.numRentedUnits = numRentedUnits;
		this.medianUnitSize = medianUnitSize;
		this.numParkingSpaces = numParkingSpaces;
	}//end preferred constructor
	
	/**
	 * Will eventually be used to draw the object to the screen. Temporary functionality prints "Drawing code for Residential" to the console
	 */
	public void draw() {
		System.out.println("Drawing code for Residential");
	}//end draw
	
	/**
	 * @return Formatted table displaying relevant information about current object type as described in the fields.
	 */
	public String displayData() {
		
		StringBuilder sb = new StringBuilder("----------------------------\n");
		sb.append("Mall\n");
		sb.append("----------------------------\n");
		sb.append("Project Name: "+getProjectName()+"\n");
		sb.append("Address: "+getCompleteAddress()+"\n");
		sb.append("Square Feet: "+getTotalSquareFeet()+"\n");
		sb.append("Occupancy Group: "+getOccupancyGroup()+"\n");
		sb.append("Occupancy Subgroup: "+getSubgroup()+"\n");
		sb.append("Number of Rented Units: "+getNumRentedUnits()+"\n");
		sb.append("Median Unit Size: "+getMedianUnitSize()+"\n");
		sb.append("Number of Parking Spaces: "+ getNumParkingSpaces()+"\n");
			
		return sb.toString();
		
	}//end displayData
	
	/**
	 * @return the numRentedUnits
	 */
	public int getNumRentedUnits() {
		return numRentedUnits;
	}//end getNumRentedUnits
	
	/**
	 * @param numRentedUnits the numRentedUnits to set
	 */
	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}//end setNumRentedUnits
	
	/**
	 * @return the medianUnitSize
	 */
	public double getMedianUnitSize() {
		return medianUnitSize;
	}//end getMedianUnitSize
	
	/**
	 * @param medianUnitSize the medianUnitSize to set
	 */
	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}//end setMedianUnitSize
	
	/**
	 * @return the numParkingSpaces
	 */
	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}//end getNumParkingSpaces
	
	/**
	 * @param numParkingSpaces the numParkingSpaces to set
	 */
	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}//end setNumParkingSpaces
	
	@Override
	public String toString() {
		return "Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces="
				+ numParkingSpaces + "]";
	}//end toString
	
}//end class
