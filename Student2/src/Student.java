
public class Student {
	String name;
	int age;

	Student(String name) {
		this.name = name;
	}

	Student(int age) {
		this.age = age;
	}

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	private void checkOut(String bookName) {
		System.out.println("Checking " + bookName + " out.");
	}

	private void readinBook(String bookName) {
		System.out.println("Reading " + bookName + ".");
	}

	private void checkIn(String bookName) {
		System.out.println("Returning " + bookName + ".");
	}

	void readBook(String bookName) {
		checkOut(bookName);
		readinBook(bookName);
		checkIn(bookName);
	}
}
