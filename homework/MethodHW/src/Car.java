
public class Car {
	String brand;
	int horsepower;
	String color;

	Car(String brand,int horsepower,String color) {
		this.brand = brand;
		this.horsepower = horsepower;
		this.color = color;
	}
	
	public void start(String brand) {
		System.out.println("Starting " + brand);
	}
	
	private void stop(String brand) {
		System.out.println("Stop " + brand + " at a restaurant");
	}
}
