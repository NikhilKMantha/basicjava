
public class Application {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("Borrowing...");
		try {
			s1.borrowMoney(200);
			System.out.println("Borrowed succesfully");
		} catch (Exception e) {
			String error = e.getMessage();
			System.out.println("Cannot borrow because " + error);
			
		}
		
		
	}

}
