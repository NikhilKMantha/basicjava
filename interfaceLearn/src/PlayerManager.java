 
public class PlayerManager {
	 static Playable getPlayer(int op) {
		Playable player;
		switch (op) {
		case 1:
			player = new Person();
			break;
		case 2:
			player = new Dog();
			break;
		default:
			player = null;
			break;
		}
		
		return player;
	}
}
