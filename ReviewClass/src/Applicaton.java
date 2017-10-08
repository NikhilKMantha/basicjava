
public class Applicaton {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.first = "Nikhil";
		p1.last = " Mantha";
		p1.homephone = "(503)-533-9625";
		p1.mobilephone = "(503)-830-2993";
		
		System.out.print(p1.first);
		System.out.println(p1.last);
		p1.callhome();
		p1.callmobile();

	}

}
