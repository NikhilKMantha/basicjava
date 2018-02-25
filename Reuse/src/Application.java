import java.time.YearMonth;
import java.util.Date;


public class Application {

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.name = "Nikhil";
		stu1.age = 10;
		stu1.id = 418367;
		stu1.getGrade();
		stu1.getAttendance(); 
		
		Staff sta1 = new Staff();
		sta1.name = "Mrs.Cooper";
		sta1.age = 23;
		sta1.id = 182645;
		sta1.getAttendance();
		
		Teacher t1 = new Teacher();
		t1.name = "Mrs.Lockhart";
		t1.age = 52;
		t1.id = 167359;
		t1.getAttendance();
		
		System.out.println(Math.sqrt(3));
		System.out.println(Math.cbrt(3));
		
		System.out.println(Math.addExact(1212121211, 485447121));
		System.out.println(Math.PI * Math.PI);
		
		Date now = new Date();
		
		System.out.println(now);
		
		YearMonth y = YearMonth.of(2017,2);
		System.out.println(y.isLeapYear());
		System.out.println(y.lengthOfMonth());

	}

}
