
public class Application {

	public static void main(String[] args) {
		for(int i = 100; i >= 0; i = i - 2) {
			if(i > 0) {
				System.out.print(i + ",");
			} else {
				System.out.print(i + ".");
			}
		}

	}

}
