
public class SUV extends Car{

	private String name;
	private int passengerLimit;
	private String vehicleType;
	
	public SUV(String name,int passengerLimit,String vehicleType) {
		
		super(name,passengerLimit,vehicleType);
		this.name = name;
		this.passengerLimit = passengerLimit;
		this.vehicleType = vehicleType;
		
	}
	
	public void move()
	{
		
		System.out.println(name + " is a SUV moving on four wheels.");
		
	}

}