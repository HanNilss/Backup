/**
* Describing the Business occupancy group subgrouping from Building
*
* @author Hannes Nilsson
* @version 1.0
* Construction_HN
* CS131ON
*/
public class Business extends Building{
	
	
	/**
	 * Number of units in building available for rent
	 */
	protected int numRentableUnits;

	/**
	 * Constructs Business object with default values for instance variables
	 */
	public Business() {
		super();
		 this.numRentableUnits = 0;
	}//end empty-argument constructor

	/**
	 * Constructs Business object with values for instance variables passed in as arguments
	 * 
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 * @param numRentableUnits
	 */
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup, int numRentableUnits) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		
		this.numRentableUnits = numRentableUnits;
	}//end preferred constructor

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
	}//end setNumRentableUnits

	@Override
	public String toString() {
		return "Business [numRentableUnits=" + numRentableUnits + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + "]";
	}//end toString
	
}//end class
