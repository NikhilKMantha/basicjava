package basicjava;

import java.awt.*;
import javax.swing.*;

public class OperationPanel extends JPanel {
	OperationPanel() {
		GridLayout operationPanelLayout = new GridLayout(5, 1);
		setLayout(operationPanelLayout);

		JButton addButton = new JButton("+");
		Font font = new Font("Serif", Font.BOLD, 66);
		addButton.setFont(font);
		addButton.setSize(100, 100);
		super.add(addButton);
		
		JButton subButton = new JButton("-");
		Font font1 = new Font("Serif", Font.BOLD, 66);
		subButton.setFont(font1);
		subButton.setSize(100, 100);
		super.add(subButton);
		
		JButton multButton = new JButton("×");
		Font font2 = new Font("Serif", Font.BOLD, 66);
		multButton.setFont(font2);
		multButton.setSize(100, 100);
		super.add(multButton);
		
		JButton divButton = new JButton("÷");
		Font font3 = new Font("Serif", Font.BOLD, 66);
		divButton.setFont(font3);
		divButton.setSize(100, 100);
		super.add(divButton);
		
		JButton equalButton = new JButton("=");
		Font font4 = new Font("Serif", Font.BOLD, 66);
		equalButton.setFont(font4);
		equalButton.setSize(100, 100);
		super.add(equalButton);

	}
}
