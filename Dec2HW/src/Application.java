
public class Application {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "Nikhil";
		s.age = "11";
		School s1 = new School();

		String confNum = s1.register(s);
		System.out.println(confNum);
		
	}

}
