
public class Application {

	public static void main(String[] args) {
		System.out.println("Today we are learning about static and more");

		Math m1 = new Math();
		
		int result = m1.getAbsolute(-9);
		System.out.println("The absolute value is: " + result);
		
		int max = m1.getMax(-1, 0);
		System.out.println("The max is: " + max);
	}

}
