
public class Student {
	void borrowMoney(int amount) throws Exception {
		System.out.println("Gave " + amount + " dollars");
		if (amount <= 0) {
			Exception inputInv = new Exception("amount is less than 0");
			throw inputInv;
		}
		
		if (amount > 100) {
			Exception inputInv = new Exception("amount is greater thant 100");
			throw inputInv;
		}
		
	}
}
