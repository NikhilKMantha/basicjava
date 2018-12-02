
public class Application {

	public static void main(String[] args) {
		/*int total = 0;
		int num = 3;
		for(int i = 0; i <= num; i++) {
			total = total + i;
		}
		System.out.println(total);*/	
		
		
		/*for(int i=3; i<=10; i++) {
			System.out.println(i + "," + PatternCalc.PatCalc(i));
		}*/
		
		LineCalc c1 = new LineCalc(4,3);
		for(int i = 1; i <= 5; i++) {
			System.out.println(i + "," + c1.getYcordinate(i));
		}
		
	

	}

}
