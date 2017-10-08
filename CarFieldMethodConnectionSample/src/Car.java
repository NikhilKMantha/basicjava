public class Car {
	String name;
	int horsePower;

	void start() {
		System.out.println("starting : " + name + " which has:" + horsePower + " horse power");
	}

	void stop() {
		System.out.println("stopping: " + name);
	}
}