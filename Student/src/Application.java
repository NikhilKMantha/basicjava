
public class Application {

	public static void main(String[] args) {
		
		Student s1 = new Student("Nikhil");
		s1.readBook("Harry Potter");
		s1.readBook("Magnus Chase", 30);
		s1.readBook("Percy Jackson", 40, 124);
		s1.readBook();
		/*long tableNum = 12;
		long tableCount = 20;
	
		for(int x = 1; x <= tableCount; x++) {
			long product = tableNum * x;
			System.out.println(tableNum + "*" + x + " = " + product);
		}*/

	}

}
