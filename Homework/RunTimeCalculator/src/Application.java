import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		System.out.print("Number of Laps:");
		Scanner scanner = new Scanner(System.in);
		int laps = scanner.nextInt();
		
		System.out.print("Time of each lap:");
		int time = scanner.nextInt();
		String end = scanner.nextLine();
		
		System.out.print(laps*time + end);
		
	}

}
