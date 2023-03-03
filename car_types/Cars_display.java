package car_types;

public class Cars_display {
	
public static void main(String[] args) {
		
		Cars car1 = new Cars();
		System.out.println("Car No :1");
		car1.setvalue("Ford","GT40 MarkII","Blue");
		car1.setspeed(348);
		car1.display();
		System.out.println();
        Cars car2 = new Cars();
        System.out.println("Car No :2");
		car2.setvalue("Ferrari","330 P3","Red");
		car2.setspeed(310);
		car2.display();
		
}

}
