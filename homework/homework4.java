
public class homework4 {

	public static void main(String[] args) {
		
		int age = 234;
		
		if( age < 13) {
			System.out.println("you are a kid");
		} else if( age > 13 && age < 19) {
			System.out.println("you are a teen");
		} else if(age > 20 && age < 60) {
			System.out.println("you are an adult");
		} else if(age > 60 && age <= 100) {
			System.out.println("you are a senior citizen");
		} else if(age > 100) {
			System.out.println("you are most likely dead");
		}
	}

}
