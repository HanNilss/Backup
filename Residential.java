/**
* Describing the residential occupancy group subgrouping from Building
*
* @author Hannes Nilsson
* @version 1.0
* Construction_HN
* CS131ON
*/
public class Residential extends Building{

	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	public Residential() {
		super();
		
		this.numBedrooms = 0;
		this.numBathrooms = 0;
		this.laundryRoom = false;

	}//end empty-argument constructor
	
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom) {
		
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
		this.laundryRoom = laundryRoom;

	}//end preferred constructor
	
	/**
	 * @return the numBedrooms
	 */
	public int getNumBedrooms() {
		return numBedrooms;
	}//end getNumBedrooms

	/**
	 * @param numBedrooms the numBedrooms to set
	 */
	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}//end setNumBedrooms

	/**
	 * @return the numBathrooms
	 */
	public int getNumBathrooms() {
		return numBathrooms;
	}//end getNumBathrooms

	/**
	 * @param numBathrooms the numBathrooms to set
	 */
	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}//end setNumBathrooms

	/**
	 * @return the laundryRoom
	 */
	public boolean isLaundryRoom() {
		return laundryRoom;
	}//end isLaundryRoom

	/**
	 * @param laundryRoom the laundryRoom to set
	 */
	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}//end setLaundryRoom

	@Override
	public String toString() {
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + ", projectName=" + projectName + ", completeAddress=" + completeAddress
				+ ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup="
				+ subgroup + "]";
	}//end toString
	
}//end class
