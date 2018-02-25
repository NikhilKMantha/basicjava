import java.awt.*;

public class Application {

	public static void main(String[] args) {
		int sum = Math.add(1, 2);
		System.out.println("The sum is " + sum); 
		System.out.println(Math.PI);
		Double result = java.lang.Math.PI;
		System.out.println(result);
		
		/*Frame f1 = new Frame("Nikhil");
		f1.setSize(1 ,1000);
		f1.setVisible(false);*/
		
		int age;
		int[] favNum = new int[5];
		favNum[0] = 10;
		favNum[1] = 10;
		favNum[2] = 10;
		favNum[3] = 10;
		favNum[4] = 10;
		
		for(int x = 0; x < 5; x++) {
			System.out.print(favNum[x] + " ");
		}
		
		

	}

}
