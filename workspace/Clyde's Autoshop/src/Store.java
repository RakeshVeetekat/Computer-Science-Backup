/*
 * Rakesh Veetekat
 * 12/13/16
 * AP Computer Science Period 6
 * Vehicle Hierarchy Project
 */
public class Store {

	public static void main(String[] args) {
		
		//Declare each vehicle object and instantiate to different types of vehicles
		Vehicle joe = new Car("Joe",5,"Car");
		Vehicle tom = new Sedan("Tom",5,"Sedan");
		Vehicle jack = new SUV("Jack",7,"SUV");
		Vehicle bill = new Motorcycle("Bill",2,"Motorcycle");
		Vehicle billy = new Airplane("Billy",560,"Airplane");
		Vehicle fred = new Jet("Fred",15,"Jet");
		Vehicle frederick = new Propeller("Frederick",7,"Propeller Plane");
		Vehicle john = new Helicopter("John",6,"Helicopter");
		Vehicle ben = new Boat("Ben",4,"Boat");
		Vehicle wonjae = new Submarine("Wonjae",20,"Submarine");
		
		//Create array of vehicles using objects created above
		Vehicle[] myVehicles = {joe,tom,jack,bill,billy,fred,frederick,john,ben,wonjae};
		
		System.out.println("Information for each vehicle and how they move.");
		System.out.println();
		
		//Print out info on each vehicle
		for(int n = 0;n < myVehicles.length;n++)
		{
		
			System.out.println(myVehicles[n]);
			myVehicles[n].move();
			System.out.println();
			
		}
		
		//Prints the conclusions determined by the compareTo method depending on two vehicles' holding capacity	
		System.out.println("Comparing the holding capacity of the Sedan and SUV.");
		printCompareResult(tom.getVehicleType(),jack.getVehicleType(),tom.compareTo(jack));
				
		System.out.println("Comparing the holding capacity of the Airplane and motorcycle.");
		printCompareResult(billy.getVehicleType(),bill.getVehicleType(),billy.compareTo(bill));
		
		System.out.println("Comparing the holding capacity of the Propeller Plane and SUV.");
		printCompareResult(frederick.getVehicleType(),jack.getVehicleType(),frederick.compareTo(jack));
		
		//Creates an alias of vehicle joe by giving the reference of joe to rakesh
		Vehicle rakesh = joe;
		if(rakesh.equals(joe))
		{
			System.out.println("Vehicle Rakesh is an alias of Vehicle Joe.");
		}
		System.out.println();
		
		//Casts the vehicle to car so that it can access a method in the car class
		System.out.println("Joe, the car, will now turn using its steering wheel.");
		((Car) joe).turnRight();		
		
	}
	
	/**
	 * This method uses the result from the compareTo method in the comparable interface
	 * to determine the type of message that has to be displayed.
	 * @param v1 - The type of the first vehicle being compared by the compareTo method.
	 * @param v2 - The type of the second vehicle being compared by the compareTo method.
	 * @param compareToResult - The integer value returned by the compareTo method depending on
	 * whether the first vehicle has less, more, or the same number of seats as the second one.
	 */
	private static void printCompareResult(String v1,String v2,int compareToResult)
	{
		
		if(compareToResult < 0)
		{
			System.out.println("The " + v1 + " has less seats than the " + v2 + ".");
		}
		else if(compareToResult > 0)
		{
			System.out.println("The " + v1 + " has more seats than the " + v2 + ".");
		}
		else
		{
			System.out.println("The " + v1 + " has the same number of seats as the " + v2 + ".");
		}
		
		System.out.println();
		
	}

}
