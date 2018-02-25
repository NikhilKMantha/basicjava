import java.util.Scanner;

public class factorial {
	
	public static long findFactorial(int num) {
		long factorial = 1;
		
		for(int i = num; i > 0 ; i--) {
			factorial = factorial * i;
		}
		
		return factorial;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number for factorial");
		int num = sc.nextInt();
		long factorial = findFactorial(num);
		
		System.out.println("the factorial of " + num + " is " + factorial);

	}

}
