
public class Application {

	public static void main(String[] args) {
		System.out.println("The result is: " + Math.add(20, 80));
		Math m1 = new Math();
		System.out.println(m1.addSpecial(2));
		System.out.println(m1.addSpecial(5));
		System.out.println(m1.addSpecial(8));
		Math m2 = new Math();
		System.out.println(m2.addSpecial(2));
		System.out.println(m2.addSpecial(5));
		System.out.println(m2.addSpecial(8));
		System.out.println(m1.addSpecial(11));
		
		Dog d1 = new Dog();
		d1.feed();
	}

}
