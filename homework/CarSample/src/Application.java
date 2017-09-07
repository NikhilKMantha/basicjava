public class Application {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.name = "bmw";
		c1.horsePower = 200;
		c1.start();
		// Start one more time and see what happens
		c1.start();
		c1.stop();

		Car c2 = new Car();
		c2.name = "honda";
		c2.horsePower = 50;
		c2.start();
		c2.stop();

	}
}