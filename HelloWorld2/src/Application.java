
public class Application {

	public static void main(String[] args) {
		Student s1 = new Student("Nikhil", 10);
		Student s2 = new Student("Sahil", 14);
		s1.doHomework();
		int minsRead = s1.readBook("Harry potter");
		System.out.println(" for " + minsRead + " minutes");
	}
}
