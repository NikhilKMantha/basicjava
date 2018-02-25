
public class Application {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.eatFruit(1);
		s1.eatFruit(2);
		s1.eatFruit(3);
		
		s1.eatFruit(Fruit.apple);     
		s1.eatFruit(Fruit.banana);
		
		s1.eatFruit(enumtest.Fruit.Apple);
 
	}

}
