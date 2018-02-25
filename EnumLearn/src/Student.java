
public class Student {
	int eatFruit(int fruitType) {
		if (fruitType == 1) {
			System.out.println("Eating Apple");
		} else if (fruitType == 2) {
			System.out.println("Eating Banana");
		} else {
			System.out.println("Unknown fruit");
		}

		return fruitType;
	}
	
	void eatFruit(enumtest.Fruit f) {
		System.out.println("Eating " + f);
	}
}
