
public class LineCalc {
	int slope;
	int constant;

	LineCalc(int slope, int constant) {
		this.slope = slope;
		this.constant = constant;
	}

	int getYcordinate(int x) {
		int y = this.slope * x + this.constant;
		return y;
	}
}
