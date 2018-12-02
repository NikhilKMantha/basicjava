package prmenumbers;

public class Application {

	public static void main(String[] args) {
		int count = 0;
		double startTime = System.currentTimeMillis();
		for(int number = 2; number < 10000; ++number) {
			Boolean isNumberPrime = true;	
			for(int divisor = 2; divisor < number - 1; ++divisor) {
				if(number % divisor == 0) {
					isNumberPrime = false;
					break;
				}
			}
			if(isNumberPrime) {
				count = count + 1;
				System.out.println(number + " is prime");
			}
			
		}
		double endtime = System.currentTimeMillis();
		System.out.println((endtime - startTime) / 1000 + " seconds");
		System.out.println("Found " + count + " prime numbers");
	}
	
}
