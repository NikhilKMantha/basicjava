
public class Math {
	int getAbsolute(int number) {
		if (number >= 0) {
			return number;
		} else {
			return number * -1;
		}
	}

	int getMax(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
	int getMin(int num1, int num2) {
		if (num1 < num2) {
			return num1;
		} else {
			return num2;
		}
	}

}
