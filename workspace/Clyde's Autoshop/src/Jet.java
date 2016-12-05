
public class Jet extends Airplane{

	private String name;
	private int passengerLimit;
	private String vehicleType;
	
	public Jet(String name,int passengerLimit,String vehicleType) {
		
		super(name,passengerLimit,vehicleType);
		this.name = name;
		this.passengerLimit = passengerLimit;
		this.vehicleType = vehicleType;
		
	}
	
	public void move()
	{
		
		System.out.println(name + " is an airplane that is flying using jet propulsion.");
		
	}

}