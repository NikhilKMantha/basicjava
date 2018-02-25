import java.awt.*;

public class Application {

	public static void main(String[] args) {
		Frame f1 = new Frame("Nikhil");
		Label l1 = new Label("Hi");
		f1.setSize(1000, 1000);
		f1.setVisible(true);
		l1.setText("	          This is my first GUI application.");
		l1.setFont(new Font("Zapfino", Font.ITALIC, 30));
		f1.add(l1);
		
	}

}
