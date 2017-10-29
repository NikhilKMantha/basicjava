
public class Student {
	String name;
	
	Student(String name) {
		this.name = name;
	}
	
	void readBook(String bookName) {
		System.out.println("Read " + bookName);
	}
	
	void readBook(String bookName, int bookTime) {
		System.out.println("Read " + bookName + " for " + bookTime + " mins");
	}
	
	void readBook(String bookName, int bookTime, int pageNum) {
		System.out.println("Read " + pageNum + " pages of " + bookName + " for " + bookTime + " mins");
	}
	
	void readBook() {
		System.out.println("Read any book");
	}
}
