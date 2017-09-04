
public class Application {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		int sum = c1.add(2, 3);
		int sub = c1.subtract(23, 15);
		int mult = c1.multiply(2, 5);
		int div = c1.divide(30, 10);
		
		System.out.println("The sum of 2 and 3 is: " + sum);
		System.out.println("The difference of 23 and 15 is: " + sub);
		System.out.println("2 times 5 is: " + mult);
		System.out.println("30 divided by 10 is: " + div);
		
	}

}
