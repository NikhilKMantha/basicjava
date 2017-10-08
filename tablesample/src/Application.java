import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		System.out.print(" Table Number:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		for(int x = 1 ; x < 11 ; x = x + 1) {
			
			if(x < 10) {
				System.out.print(number*x + ",");
			} else {
				System.out.print(number*x);
			}
		
		}

	}

}
