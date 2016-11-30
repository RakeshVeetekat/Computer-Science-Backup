
public abstract class Vehicle {

	private String name;
	private int passengerLimit;
	
	public Vehicle(String name,int passengerLimit) {

		this.name = name;
		this.passengerLimit = passengerLimit;
		
	}
	
	public abstract void move();

}