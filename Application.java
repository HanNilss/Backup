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
		
		Building b = new Building("Gaines House", "123 Main Street | Louisville, Kentucky 40201", 25401, "Residential","R1");
		
		System.out.println(b.displayData());

		Residential r = new Residential("Gaines House", "123 Main Street | Louisville, Kentucky 40201", 25401, "Residential","R1", 2, 2, true);
		
		System.out.println(r.displayData());
		
		Business bu = new Business("Gaines House", "123 Main Street | Louisville, Kentucky 40201", 25401, "Residential","R1", 2);
		
		System.out.println(bu.displayData());
		
		Mall m = new Mall("Gaines House", "123 Main Street | Louisville, Kentucky 40201", 25401, "Residential","R1", 2, 2, 2.0, 2);
		
		System.out.println(m.displayData());
	}

}
