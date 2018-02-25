
public class Car {
	void start() {
		System.out.println("Starting car.");
	}
	
	int getNumberofWheels() {
		System.out.println("The car has 4 wheels.");
		return 4;
	}
	
	String changeOil(String oilName) {
		System.out.println("Successfully changed the " + oilName + " fill");
		return "succes";
	}
}
