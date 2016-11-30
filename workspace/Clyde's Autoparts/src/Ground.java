
public abstract class Ground extends Vehicle{

	private String name;
	private int passengerLimit;
	
	public Ground(String name,int passengerLimit) {
		
		super(name,passengerLimit);
		this.name = name;
		this.passengerLimit = passengerLimit;
		
	}
	
	public abstract void move();

}