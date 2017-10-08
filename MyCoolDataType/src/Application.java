
public class Application {

	public static void main(String[] args) {
		System.out.println("my cool data type \n");
		
		Recipe soup = new Recipe();
		soup.recipeName = "Tomato Soup";
		soup.Yeild = 6;
		soup.ing1 = "Tomato";
		soup.ing2 = "Onion";
		soup.ing3 = "Garlic";
		soup.ing4 = "Oil";
		soup.ing5 = "Seasoning";
		soup.ing6 = "Heavy Cream";
		
		System.out.println(soup.recipeName);
		System.out.println("Yeild:" + soup.Yeild);
		System.out.println(soup.ing1);
		System.out.println(soup.ing2);
		System.out.println(soup.ing3);
		System.out.println(soup.ing4);
		System.out.println(soup.ing5);
		System.out.println(soup.ing6);

	}

}
