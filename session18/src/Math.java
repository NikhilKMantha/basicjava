
public class Math {
	int prevNum;
	
	static int add(int x, int y) {
		return x + y;
	}
	
	 int addSpecial(int x) {
		int total = prevNum + x;
		prevNum = total;
		return total;
	}
}
