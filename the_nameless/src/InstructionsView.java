import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class InstructionsView extends JFrame {
	private JPanel instructionsPanel;
	private JButton button1;
	
	public InstructionsView() {
		super("Connect Four");
		
		Font font = new Font("SansSerif", Font.BOLD, 24);
				
		// instructions panel
		instructionsPanel = new JPanel();
		instructionsPanel.setLayout(new GridLayout(2, 2, 2, 2));
		
		button1 = new JButton("Main Menu");
		button1.setFont(font);
				
		instructionsPanel.add(button1, BorderLayout.NORTH);
				
		add(instructionsPanel, BorderLayout.CENTER);
	}

	public void registerController(MainController paramController) {
		button1.addActionListener(paramController);
	}
	
	public void display(int doorNumber) {
		remove(instructionsPanel);
		add(instructionsPanel, BorderLayout.CENTER);
		validate();
		repaint();
	}

	public JPanel getInstructionsPanel() {
		return instructionsPanel;
	}
}