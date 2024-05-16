/**
 * 
 */

/**
 * 
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Building b1 = new Building();
		Building b2 = new Building("Building2", "123 Main Street | Louisville, Kentucky 40201", 25401, "Residential","R1");
		System.out.println(b1.toString());
		System.out.println(b2.displayData());
		b1.draw();
		b1.setProjectName("Building1");
		b1.setCompleteAddress("123 Main Street | Louisville, Kentucky 40201");
		b1.setTotalSquareFeet(10000);
		b1.setOccupancyGroup("Residential");
		b1.setSubgroup("R1");
		System.out.println(b1.displayData());
		
		Business bu1 = new Business();
		Business bu2= new Business("Business2", "123 Main Street | Louisville, Kentucky 40201", 25401, "Business","B1",2);
		System.out.println(bu2.toString());
		bu1.setProjectName("Business1");
		bu1.setCompleteAddress("123 Main Street | Louisville, Kentucky 40201");
		bu1.setTotalSquareFeet(10000);
		bu1.setOccupancyGroup("Business");
		bu1.setSubgroup("B1");
		bu1.setNumRentableUnits(1);
		System.out.println(bu1.toString());
		
		Mall m1 = new Mall();
		Mall m2 = new Mall("Mall2", "123 Main Street | Louisville, Kentucky 40201", 25401, "Business","B1",2,2,2,2);
		System.out.println(m2.toString());
		m1.draw();
		m1.setProjectName("Mall1");
		m1.setCompleteAddress("123 Main Street | Louisville, Kentucky 40201");
		m1.setTotalSquareFeet(10000);
		m1.setOccupancyGroup("Business");
		m1.setSubgroup("B1");
		m1.setNumRentableUnits(1);
		m1.setNumRentedUnits(1);
		m1.setMedianUnitSize(2);
		m1.setNumParkingSpaces(2);
		System.out.println(m1.toString());
		
		Residential r1 = new Residential();
		Residential r2 = new Residential("Residential2", "123 Main Street | Louisville, Kentucky 40201", 25401, "Residential","R1",2,2,false);
		System.out.println(r2.toString());
		r1.setProjectName("Residential1");
		r1.setCompleteAddress("123 Main Street | Louisville, Kentucky 40201");
		r1.setTotalSquareFeet(10000);
		r1.setOccupancyGroup("Residential");
		r1.setSubgroup("R1");
		r1.setNumBedrooms(1);
		r1.setNumBathrooms(1);
		r1.setLaundryRoom(true);
		System.out.println(r1.toString());
		
		Apartment a1 = new Apartment();
		Apartment a2 = new Apartment("Apartment2", "123 Main Street | Louisville, Kentucky 40201", 25401, "Residential","R1",2,2,false,2,2,false);
		System.out.println(a2.toString());
		a1.draw();
		a1.setProjectName("Apartment1");
		a1.setCompleteAddress("123 Main Street | Louisville, Kentucky 40201");
		a1.setTotalSquareFeet(10000);
		a1.setOccupancyGroup("Residential");
		a1.setSubgroup("R1");
		a1.setNumBedrooms(1);
		a1.setNumBathrooms(1);
		a1.setLaundryRoom(true);
		a1.setNumRentableUnits(2);
		a1.setAvgUnitSize(2.0);
		a1.setParkingAvailable(true);
		System.out.println(a1.toString());
		
		SingleFamilyHome s1 = new SingleFamilyHome();
		SingleFamilyHome s2 = new SingleFamilyHome("SingleFamilyHome2", "123 Main Street | Louisville, Kentucky 40201", 25401, "Residential","R1",2,2,false,false);
		System.out.println(s2.toString());
		s1.draw();
		s1.setProjectName("SingleFamilyHome1");
		s1.setCompleteAddress("123 Main Street | Louisville, Kentucky 40201");
		s1.setTotalSquareFeet(10000);
		s1.setOccupancyGroup("Residential");
		s1.setSubgroup("R2");
		s1.setNumBedrooms(1);
		s1.setNumBathrooms(1);
		s1.setLaundryRoom(true);
		s1.setGarage(true);
		System.out.println(s1.toString());
		
		
		
	}

}
