
public class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;

	}
	
	Boolean canDrive() {
		if(age > 15) {
			return true;
		}else {
			return false;
		}
		
	}
}
