import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int seriesNum;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the lenght of the Fibonacci series:");
		seriesNum = sc.nextInt();
		
		int[] num = new int[seriesNum];
		num[0] = 0;
		num[1] = 1;
		
		for(int i = 2; i < seriesNum; i++) {
			num[i] = num[i - 1] + num[i - 2];
		}
		
		for(int i = 0; i < seriesNum; i++) {
			System.out.print(num[i] + " ");
		}
		

	}
}
