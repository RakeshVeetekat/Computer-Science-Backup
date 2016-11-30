
public abstract class Air extends Vehicle{

	private String name;
	private int passengerLimit;
	
	public Air(String name,int passengerLimit) {
		
		super(name,passengerLimit);
		this.name = name;
		this.passengerLimit = passengerLimit;
		
	}
	
	public abstract void move();

}