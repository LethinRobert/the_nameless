package Instructions;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import Main.MainController;

public class InstructionsView extends JFrame {
	private JPanel instructionsPanel;
	private JButton button1;
	private JLabel instructions;
	public InstructionsView() {
		super("Connect Four");
		
		Font font = new Font("SansSerif", Font.BOLD, 24);
				
		// instructions panel
		instructionsPanel = new JPanel();
		instructionsPanel.setLayout(new BorderLayout());
		
		button1 = new JButton("Main Menu");
		button1.setFont(font);
		
		instructions = new JLabel("<html>Instructions:<br>"
				+ "WRITE"
				+ " INSTRUCTIONS"
				+ " HERE</html>");
		
		instructionsPanel.add(instructions, BorderLayout.CENTER);
		instructionsPanel.add(button1, BorderLayout.SOUTH);
				
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