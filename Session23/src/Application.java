
public class Application {

	public static void main(String[] args) {
		int[] favnum = new int[5];
		favnum[0] = 13;
		favnum[1] = 14;
		favnum[2] = 15;
		favnum[3] = 16;
		favnum[4] = 17;

		for (int x = 0; x < 5; x++) {
			if (x < 4) {
				System.out.print(favnum[x] + ",");
			} else {
				System.out.print(favnum[x] + "\n");
			}
		}
		
		String[] names = new String[5];
		names[0] = "Nikhil";
		names[2] = "Sahil";
		
		for (int x = 0; x < 5; x++) {
			if (x < 4) {
				System.out.print(names[x] + ",");
			} else {
				System.out.print(names[x] + "\n");
			}
		}
		
		boolean[] isVeg = new boolean[5];
		isVeg[1] = true;
		
		for (int x = 0; x < 5; x++) {
			if (x < 4) {
				System.out.print(isVeg[x] + ",");
			} else {
				System.out.print(isVeg[x] + "\n");
			}
		}
		
		char[] grades = new char[5];
		grades[0] = 'A';
		grades[1] = 'C';
		grades[2] = 'B';
		grades[3] = 'D';
		grades[4] = 'F';
		
		for (int x = 0; x < 5; x++) {
			if (x < 4) {
				System.out.print(grades[x] + ",");
			} else {
				System.out.print(grades[x]);
			}
		}
		

	}
}
