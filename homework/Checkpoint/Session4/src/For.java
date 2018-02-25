
public class For {

	public static void main(String[] args) {
		for ( int x = 9; x <= 100; x = x + 5)
			if(x < 99) {
				System.out.print(x + ",");
			} else {
				System.out.println(x + ".");
			}
	}

}
