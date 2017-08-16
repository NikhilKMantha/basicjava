
public class Application {

	public static void main(String[] args) {
		System.out.println("Cars: \n");

		Car c1 = new Car();
		c1.comp = "BMW";
		c1.model = 'X';
		c1.num = 1;
		c1.type = "Gas";
		c1.horsepower1 = 255;
		c1.horsepower2 = 445;
		c1.price = 56600;
		c1.year = 2017;

		System.out.println("Company:" + c1.comp);
		System.out.println("Model:" + c1.model + c1.num);
		System.out.println("Type:" + c1.type);
		System.out.println("Horsepower:" + c1.horsepower1 + " to " + c1.horsepower2);
		System.out.println("Price: from $" + c1.price);
		System.out.println("Year:" + c1.year + "\n");

		Car c2 = new Car();
		c2.comp = "BMW";
		c2.model = 'i';
		c2.num = 8;
		c2.type = "Hybrid";
		c2.horsepower1 = 357;
		c2.price = 143400;
		c2.year = 2017;

		System.out.println("Company:" + c2.comp);
		System.out.println("Model:" + c2.model + c2.num);
		System.out.println("Type:" + c2.type);
		System.out.println("Horsepower:" + c2.horsepower1);
		System.out.println("Price: from $" + c2.price);
		System.out.println("Year:" + c2.year + "\n");
		
		Car c3 = new Car();
		c3.comp = "Audi";
		c3.model = 'R';
		c3.num = 8;
		c3.type = "Gas";
		c3.horsepower1 = 540;
		c3.horsepower2 = 610;
		c3.price = 162900;
		c3.year = 2017;
		
		System.out.println("Company:" + c3.comp);
		System.out.println("Model:" + c3.model + c3.num);
		System.out.println("Type:" + c3.type);
		System.out.println("Horsepower:" + c3.horsepower1 + " to " + c3.horsepower2);
		System.out.println("Price: from $" + c3.price);
		System.out.println("Year:" + c3.year + "\n");
		
	}

}
