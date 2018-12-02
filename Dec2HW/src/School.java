
public class School {
	String register(String name, String age, String ssn, String address1, String address2, String phone) {
		System.out.println("registering " + name + ", age " + age);
		return "1234";
	}
	
	String register(Student s) {
		System.out.println("registering " + s.name + ", age " + s.age);
		return "1234";
	}
}
