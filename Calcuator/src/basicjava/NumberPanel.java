package basicjava;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class NumberPanel extends JPanel implements ActionListener {

	ResultPanel result;

	NumberPanel(ResultPanel result) {
		this.result = result;
		GridLayout numberPanelLayout = new GridLayout(4, 3);
		setLayout(numberPanelLayout);
		Font font = new Font("Serif", Font.BOLD, 66);

		for (int i = 0; i < 10; i++) {
			String buttonText = Integer.toString(i);
			JButton numberButton = new JButton();
			numberButton.setFont(font);
			numberButton.setText(buttonText);
			numberButton.addActionListener(this);

			add(numberButton);
		}

		/*
		 * JButton clear = new JButton("Clear"); clear.setFont(font);
		 * clear.addActionListener(this);
		 */
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String text = e.getActionCommand();
		this.result.setNumber(text);
		this.result.setNumber2(text);
	}

}
