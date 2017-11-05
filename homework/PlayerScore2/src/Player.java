
public class Player {
	void play() {
		System.out.println("Playing Game...");
	}

	int getScore() {
		return 100;
	}
	
	int getScore(int gameNumber) {
		System.out.println("The score for game " + gameNumber + " is: " + 100);
		return gameNumber;
	}
}
