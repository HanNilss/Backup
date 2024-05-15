/**
*Superclass for all objects in the Construction project, describing basic functionalities and instances.
*
* @author Hannes Nilsson
* @version 1.0
* Construction_HN
* CS131ON
*/

import java.util.*;

public class Building {

	/**
	 * Fields include general descriptions used for the project.
	 * projectName: Name of the project
	 * completeAddress: Full address of project including street, city, state, zip code
	 * totalSquareFeet: Size of project in square feet as a double
	 * occupancyGroup: Type of occupancy group as described in IBC
	 * subgroup: Occupancy subgroup as described in IBC
	 * 
	 */
	protected String projectName; 
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subgroup;
	
	
	/**
	 * Empty argument constructor constructs Building object with empty Fields.
	 */
	public Building() {
		super();

		this.projectName = "";
		this.completeAddress = "";
		this.totalSquareFeet = 0.0;
		this.occupancyGroup = "";
		this.subgroup = "";
		
	}//end empty-argument constructor

	/**
	 * Preferred constructor constructs Building object using  parameters to set fields.
	 * 
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 */
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
	}//end preferred constructor

	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}//end getProjectName

	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}//end setProjectName

	/**
	 * @return the completeAddress
	 */
	public String getCompleteAddress() {
		return completeAddress;
	}//end getCpmpleteAddress

	/**
	 * @param completeAddress the completeAddress to set
	 */
	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}//end setCompleteAdderess

	/**
	 * @return the totalSquareFeet
	 */
	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}//end getTotalSquareFeet

	/**
	 * @param totalSquareFeet the totalSquareFeet to set
	 */
	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}//end setTotalSquareFeet

	/**
	 * @return the occupancyGroup
	 */
	public String getOccupancyGroup() {
		return occupancyGroup;
	}//end getOccupancyGroup

	/**
	 * @param occupancyGroup the occupancyGroup to set
	 */
	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}//end setOccupancyGroup

	/**
	 * @return the subgroup
	 */
	public String getSubgroup() {
		return subgroup;
	}//end getSubgroup

	/**
	 * @param subgroup the subgroup to set
	 */
	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}//end setSubgroup
	
	/**
	 * Will eventually be used to draw the object to the screen. Temporary functionality prints "Drawing code for Building" to the console
	 */
	public void draw() {
		System.out.println("Drawing code for Building");
	}//end draw
	
	/**
	 * @return Formatted table displaying relevant information about current object type as described in the fields.
	 */
	public String displayData() {
		
		StringBuilder sb = new StringBuilder("----------------------------\n");
		sb.append("Building\n");
		sb.append("----------------------------\n");
		sb.append("Project Name: "+getProjectName()+"\n");
		sb.append("Address: "+getCompleteAddress()+"\n");
		sb.append("Square Feet: "+getTotalSquareFeet()+"\n");
		sb.append("Occupancy Group: "+getOccupancyGroup()+"\n");
		sb.append("Occupancy Subgroup: "+getSubgroup()+"\n");
		
		return sb.toString();
	}//end displayData

	/**
	 *  
	 *  @return All instance fields compiled as a string object.
	 */
	@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + "]";
	}// end toString 
	
}//end class
