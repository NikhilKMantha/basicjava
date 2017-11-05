
public class Car {
 String brand;
 int horsePower;
 
 Car(String brand, int horsePower) {
	 this.brand = brand;
	 this.horsePower = horsePower;
 }
 
 void Start(String carName) {
	 System.out.println("Starting " + carName);
 }
 
 void Stop(String carName) {
	 System.out.println("Stopping " + carName);
 }
 
 private void pumpGas() {
	 System.out.println("Pumping Gas.");
 }
}
