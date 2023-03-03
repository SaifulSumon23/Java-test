package car_types;

public class Cars {
	private String name;
	private String model;
	private String color;
	private double speed;
	
	public void setvalue (String name,String model,String color)
	{
      this.name = name;
      this.model= model;
      this.color = color;
      
	}
	public void setspeed(double speed)
	{
		this.speed =speed;
	}
	public void display()
	{
		
		System.out.println("Car name: "+ name);
		System.out.println("Car model : "+model);
		System.out.println("Car Color : "+color);
		System.out.println("Car speed: "+ speed+"km/h");

	}
	


	}