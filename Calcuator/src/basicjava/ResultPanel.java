package basicjava;

import java.awt.*;
import javax.swing.*;

public class ResultPanel extends JPanel {

	JTextField textField;
	JTextField textField2;

	ResultPanel() {

		textField = new JTextField();
		textField.setText("              ");
		Font font = new Font("Serif", Font.BOLD, 88);
		textField.setFont(font);
		textField.setBackground(Color.LIGHT_GRAY);
		super.add(textField);
		
		textField2 = new JTextField();
		textField2.setText("              ");
		Font font2 = new Font("Serif", Font.BOLD, 88);
		textField2.setFont(font2);
		textField2.setBackground(Color.LIGHT_GRAY);
		super.add(textField2);
	}

	void setNumber(String num) {
		String exist = textField.getText();
		String newNumber = exist + num;
		textField.setText(newNumber);
	}
	
	void setNumber2(String num) {
		String exist = textField2.getText();
		String newNumber = exist + num;
		textField2.setText(newNumber);
	}

}
