
public class Application {
 
	public static void main(String[] args) {
		Student s1 = new Student("Nikhil");
		Student s2 = new Student(10);
		Student s3 = new Student("Nikhil", 10);
		
		s1.readBook("Harry potter");
		
		System.out.println("");
		
		Car c1 = new Car("BMW", 290);
		c1.Start("BMW");
		c1.Stop("BMW");
	}

}
