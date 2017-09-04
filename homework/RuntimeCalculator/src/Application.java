import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		System.out.print("Number of Laps: ");
		Scanner scanner = new Scanner(System.in);
		int laps = scanner.nextInt();
		double time = 0;
		
		for (int i = 1; i <= laps; i++) {
			System.out.print("Time for lap " + i + ": ");
			 time = time + scanner.nextDouble();
		}

		System.out.print("Total time of laps: " +  String.format("%.2f", time ));
I
		//time is in minutes
		
	}

}
