import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class CreditsView extends JFrame {
	private JPanel creditsPanel;
	private JButton button1;
	
	public CreditsView() {
		super("Connect Four");
		
		Font font = new Font("SansSerif", Font.BOLD, 24);
		
		// credits panel
		creditsPanel = new JPanel();
		creditsPanel.setLayout(new GridLayout(2, 2, 2, 2));
		
		button1 = new JButton("Main Menu");
		button1.setFont(font);
				
		creditsPanel.add(button1, BorderLayout.NORTH);
				
		// start on title panel
		add(creditsPanel, BorderLayout.CENTER);
	}

	public void registerController(MainController paramController) {
		button1.addActionListener(paramController);
	}
	
	public void setButton1(JButton button1) {
		this.button1 = button1;
	}

	public void display(int doorNumber) {
		remove(creditsPanel);
		add(creditsPanel, BorderLayout.CENTER);
		validate();
		repaint();
	}
	
	public JPanel getCreditsPanel() {
		return creditsPanel;
	}
}