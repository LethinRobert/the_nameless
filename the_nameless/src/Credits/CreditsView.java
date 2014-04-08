package Credits;
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

public class CreditsView extends JFrame {
	private JPanel creditsPanel;
	private JButton button1;
	private JLabel credits, creditsHeader;
	
	public CreditsView() {
		super("Connect Four");
		
		Font font = new Font("SansSerif", Font.BOLD, 24);
		
		creditsHeader = new JLabel("<html><h1 style=\"color:red;\">Credits:</h1></html>");
		creditsHeader.setFont(font);
		credits = new JLabel("<html>Robert Lethin:<br><ul style=\"color:red;\">"
				+"<li>Design</li>"
				+"<li>Foundation Build</li>"
				+"<li>Graphics/Views</li></ul><br>"
				+"Adrian Hurst:<br><ul style=\"color:red;\">"
				+"<li>Something!</li>"
				+"<li>Something esle!</li></ul><br>"
				+"David Martinez:<br><ul style=\"color:red;\">"
				+"<li>Something!</li>"
				+"<li>Something esle!</li></ul></html>");
		credits.setFont(font);
		// credits panel
		creditsPanel = new JPanel();
		creditsPanel.setLayout(new BorderLayout());
		
		button1 = new JButton("Main Menu");
		button1.setFont(font);
			
		creditsPanel.add(creditsHeader, BorderLayout.NORTH);
		creditsPanel.add(credits, BorderLayout.CENTER);
		creditsPanel.add(button1, BorderLayout.SOUTH);
			
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