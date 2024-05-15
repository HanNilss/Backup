/**
* Describing the Single Family Home subgrouping from Residential occupancy group
*
* @author Hannes Nilsson
* @version 1.0
* Construction_HN
* CS131ON
*/
public class SingleFamilyHome extends Residential{

	private boolean garage;
	
	/**
	 * Constructs SingleFamilyHome object and gives instance fields default values
	 */
	public SingleFamilyHome() {
		super();
		
		this.garage = false;
	}

	/**
	 * Constructs SingleFamilyHome object and gives instance fields values based on passed arguments
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
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, boolean garage) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, laundryRoom);
		
		this.garage = garage;
	}
	
	/**
	 * Will eventually be used to draw the object to the screen. Temporary functionality prints "Drawing code for SingleFamilyHome" to the console
	 */
	public void draw() {
		System.out.println("Drawing code for SingleFamilyHome");
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
		
		if (isGarage() == true) {
			s2 = "Y";
		}
		else {
			s2 = "N";
		}
		
		StringBuilder sb = new StringBuilder("----------------------------\n");
		sb.append("SingleFamilyHome\n");
		sb.append("----------------------------\n");
		sb.append("Project Name: "+getProjectName()+"\n");
		sb.append("Address: "+getCompleteAddress()+"\n");
		sb.append("Square Feet: "+getTotalSquareFeet()+"\n");
		sb.append("Occupancy Group: "+getOccupancyGroup()+"\n");
		sb.append("Occupancy Subgroup: "+getSubgroup()+"\n");
		sb.append("Number of Bedrooms: "+getNumBedrooms()+"\n");
		sb.append("Number of Bathrooms: "+getNumBathrooms()+"\n");
		sb.append("Laundry Room: "+s1+"\n");
		sb.append("Garage: "+s2+"\n");
			
			return sb.toString();
	}//end displayData

	/**
	 * @return the garage
	 */
	public boolean isGarage() {
		return garage;
	}//end isGarage

	/**
	 * @param garage the garage to set
	 */
	public void setGarage(boolean garage) {
		this.garage = garage;
	}//end setGarage

	@Override
	public String toString() {
		return "SingleFamilyHome [garage=" + garage + "]";
	}
	
}//end class
