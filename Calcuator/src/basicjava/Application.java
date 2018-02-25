package basicjava;

import java.awt.*;
import javax.swing.*;

public class Application {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 1000);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GridLayout layout = new GridLayout(2, 2);
		f.setLayout(layout);

		ResultPanel r = new ResultPanel();
		r.setBackground(Color.LIGHT_GRAY);
		f.add(r);

		JPanel d = new JPanel();
		d.setBackground(Color.LIGHT_GRAY);
		f.add(d);

		JPanel p = new NumberPanel(r);
		p.setBackground(Color.BLACK);
		f.add(p);

		JPanel o = new OperationPanel();
		o.setBackground(Color.BLACK);
		f.add(o);

		f.setVisible(true);

	}
}
