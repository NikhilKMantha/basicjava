public class Application {

	public static void main(String[] args) {
		System.out.println("Learning my own data types");

		Person p1 = new Person();
		p1.age = 10;
		p1.name = "Nikhil";
		p1.grade = 5;
		p1.petName = "Prf. Fishy Whiskers";
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.petName);
		System.out.println(p1.grade);
		
		System.out.println("");
		
		Person p2 = new Person();
		p2.age = 14;
		p2.name = "Sahil";
		p2.grade = 9;
		p2.petName = "Prf. Fishy Whiskers";
		
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.petName);
		System.out.println(p2.grade);
		
	}

}
