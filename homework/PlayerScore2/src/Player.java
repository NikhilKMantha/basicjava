
public class Player {
	void play(int gameNum) {
		System.out.println("Playing Game " + gameNum + "...");
	}

	int getScore() {
		return 100;
	}
	
	int getScore(int gameNumber) {
		System.out.println("The score was: " + gameNumber);
		return gameNumber;
	}
}
