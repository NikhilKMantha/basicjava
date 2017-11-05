
public class Student {
	String name;
	int age;
	int grade;
	
	Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	public void doHomework(String HWname) {
		System.out.println("Doing " + HWname + " homework");
	}
	
	private int HWtime(int HWtime) {
		System.out.println("Time of homework: " + HWtime);
		return HWtime;
	}
}
