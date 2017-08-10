import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		System.out.print(" Number:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		if( number % 2 == 0) {
			System.out.println(" even");
		} else {
			System.out.println(" odd");
		}

	}

}
