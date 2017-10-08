import java.util.Scanner;

public class Application {

	public int prompt() {
		System.out.println(“/n Type 1 to add numbers");
		System.out.println("Type 2 to subtract numbers");
		System.out.println("Type 3 to multiply numbers");
		System.out.println("Type 4 to divide numbers");
		System.out.println("Type 5 to exit");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	
	public void process(int num, Scanner scanner) {
		if (num == 1) {
			System.out.print("Number of numbers to add: ");
			int addnum = scanner.nextInt();
			int numadd = 0;
			for (int i = 1; i <= addnum; i++) {
				System.out.println("Number " + i + ": ");
				numadd = numadd + scanner.nextInt();
			}
			System.out.println("The Sum is: " + numadd);
			num = prompt();
			process(num, scanner);

		} else if (num == 2) {
			System.out.print("Number 1: ");
			int num1 = scanner.nextInt();

			System.out.print("Number 2: ");
			int num2 = scanner.nextInt();
			int numsub = num1 - num2;

			System.out.println("The Difference is: " + numsub);
			num = prompt();
			process(num, scanner);

		} else if (num == 3) {
			System.out.print("Number of numbers to multiply: ");
			int mulnum = scanner.nextInt();
			int nummul = 1;
			for (int i = 1; i <= mulnum; i++) {
				System.out.println("Number " + i + ": ");
				int multi = scanner.nextInt();
				nummul = nummul * multi;
			}
			System.out.println("The Product is: " + nummul);

			num = prompt();
			process(num, scanner);

		} else if (num == 4) {
			System.out.print("Enter dividend: ");
			double dividend = scanner.nextDouble();

			System.out.print("Enter divisor: ");
			double divisor = scanner.nextDouble();
			double quotient = dividend / divisor;

			System.out.println("The Quotient is: " + String.format("%.2f", quotient));
			num = prompt();
			process(num, scanner);

		} else if (num == 5) {
			System.exit(0);
		} else if (num > 5) {
			System.out.println("Invalid option");
			num = prompt();
			process(num, scanner);
		}
	}

	public static void main(String[] args) {

		Application calc = new Application();
		Scanner scanner = new Scanner(System.in);
		int num = calc.prompt();

		calc.process(num, scanner);

	}

}