
public class Application {

	public static void main(String[] args) {
		Person p1 = new Person("Nikhil", 10);
		Person p2 = new Person("Sahil", 14);
		boolean canDrive = p1.canDrive();
		if(canDrive == true) {
			System.out.println(p1.name + " can drive");
		}else if(canDrive == false) {
			System.out.println(p1.name + " can't drive");
		}
		
	}

}
