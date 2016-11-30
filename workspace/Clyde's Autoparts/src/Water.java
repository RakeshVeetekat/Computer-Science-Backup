
public abstract class Water extends Vehicle{

	private String name;
	private int passengerLimit;
	
	public Water(String name,int passengerLimit) {
		
		super(name,passengerLimit);
		this.name = name;
		this.passengerLimit = passengerLimit;
		
	}
	
	public abstract void move();

}