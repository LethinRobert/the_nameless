package ModeSelection;
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

public class ModeSelectionView extends JFrame {
	private JPanel modePanel;
	private JButton button1, button2, button3, button4;
	
	public ModeSelectionView() {
		super("Connect Four");
		
		Font font = new Font("SansSerif", Font.BOLD, 24);
			
		// ModeSelection panel
		modePanel = new JPanel();
		modePanel.setLayout(new GridLayout(2, 2, 2, 2));
				
		button1 = new JButton("Multiplayer");
		button1.setFont(font);
		
		button2 = new JButton("Computer");
		button2.setFont(font);
		
		button3 = new JButton("Load Game");
		button3.setFont(font);
		
		button4 = new JButton("Main Menu");
		button4.setFont(font);
				
		modePanel.add(button1, BorderLayout.NORTH);
		modePanel.add(button2, BorderLayout.NORTH);
		modePanel.add(button3, BorderLayout.SOUTH);
		modePanel.add(button4, BorderLayout.SOUTH);
				
		add(modePanel, BorderLayout.CENTER);
	}

	public void registerController(MainController paramController) {
		button1.addActionListener(paramController);
		button2.addActionListener(paramController);
		button3.addActionListener(paramController);
		button4.addActionListener(paramController);
	}
	
	public void registerController2(ModeSelectionController paramController) {
		button1.addActionListener(paramController);
		button2.addActionListener(paramController);
		button3.addActionListener(paramController);
	}

	public void display(int doorNumber) {
		remove(modePanel);
		add(modePanel, BorderLayout.CENTER);		
		validate();
		repaint();
	}

	public JPanel getModePanel() {
		return modePanel;
	}
}