
public class Student {
	String name;
	int age;
	
	void doHomework() {
		System.out.println(name + ", age " + age + ", is doing Homework.");
	}
	
	Student(String inputname, int inputage) {
		name = inputname;
		age = inputage;
	}
	
	int readBook(String bookName) { 
		System.out.print("I read " + bookName);
		return 10;
	}
	
}
