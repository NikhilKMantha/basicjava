
public class Student {
	String name;

	Student(String name) {
		this.name = name;
	}

	Student() {

	}

	int play(int type) {
		if (type == 1) {
			System.out.println("Playing basketball for 10 minutes.");
			return 10;
		} else if (type == 2) {
			System.out.println("Playing soccer for 10 minutes.");
			return 10;
		} else {
			System.out.println("Don't know what to play.");
			return 0;
		}
	}

	int play2(int type) {
		switch (type) {
		case 1:
			System.out.println("Playing basketball for 10 minutes.");
			break;
		case 2:
			System.out.println("Playing soccer for 10 minutes.");
			break;
		default:
			System.out.println("I don't know what game to play.");
			break;
		}

		return 10;
	}

	int play(Game type) {
		if (type == Game.Basketball) {
			System.out.println("Playing basketball for 10 minutes.");
		} else if (type == Game.Soccer) {
			System.out.println("Playing soccer for 10 minutes.");
		} else if (type == Game.Tennis) {
			System.out.println("Playing t for 10 minutes.");
		}
		
		return 10;
	}

}