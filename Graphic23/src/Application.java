import java.awt.*;

public class Application {

	public static void main(String[] args) {
		Frame f1 = new Frame("Nikhil");
		Label l1 = new Label("This is a java GUI application.");
		Label l2 = new Label("I go to Findley.");
		f1.setSize(1000, 1000);
		l1.setFont(new Font("Zapfino", Font.ITALIC, 30));
		f1.add(l1);
		f1.setBackground(Color.CYAN);
		f1.setVisible(true);
		

	}

}
