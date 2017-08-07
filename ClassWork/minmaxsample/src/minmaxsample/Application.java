package minmaxsample;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		System.out.print("first number:");
		Scanner scanner = new Scanner(System.in);
		int firstNumber = scanner.nextInt();
		
		System.out.print("second number:");
		int secondNumber = scanner.nextInt();
	
		if (firstNumber < secondNumber) {
			System.out.println("minumum is:" + firstNumber );
			System.out.println("maximum is:" + secondNumber);
		} else {
			System.out.println("minumum is:" + secondNumber );
			System.out.println("maximum is:" + firstNumber);
		}
		
	}

}
