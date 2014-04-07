import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class DifficultyView extends JFrame {
	private JPanel diffPanel;
	private JButton button1, button2, button3, button4;
	
	public DifficultyView() {
		super("Connect Four");
		
		Font font = new Font("SansSerif", Font.BOLD, 24);
			
		// difficulty panel
		diffPanel = new JPanel();
		diffPanel.setLayout(new GridLayout(2, 2, 2, 2));
				
		button1 = new JButton("Easy");
		button1.setFont(font);
		
		button2 = new JButton("Medium");
		button2.setFont(font);
		
		button3 = new JButton("Hard");
		button3.setFont(font);
		
		button4 = new JButton("Main Menu");
		button4.setFont(font);
				
		diffPanel.add(button1, BorderLayout.NORTH);
		diffPanel.add(button2, BorderLayout.NORTH);
		diffPanel.add(button3, BorderLayout.SOUTH);
		diffPanel.add(button4, BorderLayout.SOUTH);
				
		add(diffPanel, BorderLayout.CENTER);
	}

	public void registerController(MainController paramController) {
		button1.addActionListener(paramController);
		button2.addActionListener(paramController);
		button3.addActionListener(paramController);
		button4.addActionListener(paramController);
	}
	
	public void registerController2(DifficultyController paramController) {
		button1.addActionListener(paramController);
		button2.addActionListener(paramController);
		button3.addActionListener(paramController);
	}

	public void display(int doorNumber) {
		remove(diffPanel);
		add(diffPanel, BorderLayout.CENTER);		
		validate();
		repaint();
	}

	public JPanel getDiffPanel() {
		return diffPanel;
	}
}