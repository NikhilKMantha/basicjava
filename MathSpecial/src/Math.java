
public class Math {
	int previous;

	int addSpecial(int x) {
		int total = previous + x;
		previous = total;
		return total;
	}
}
