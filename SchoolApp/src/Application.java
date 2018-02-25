
public class Application {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "Nikhil";
		s.address = new Address();
		s.address.street = "NW Redfox Dr";
		School sc = new School();
		
		sc.enroll(s);

	}

}
