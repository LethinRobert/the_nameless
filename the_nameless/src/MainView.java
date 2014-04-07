import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class MainView extends JFrame {
	private JPanel thePanel, thePanel2;
	
	CreditsView creditsPanel;
	DifficultyView diffPanel;
	InstructionsView instructionsPanel;
	TitleMenuView tMenuPanel;
	GameBoardView boardPanel;
	
	public MainView(CreditsView paramCreditsPanel, DifficultyView paramDiffPanel, InstructionsView paramInstructionsPanel, TitleMenuView paramTMenuPanel, GameBoardView paramBoardPanel) {
		super("Connect Four");
		
		creditsPanel = paramCreditsPanel;
		diffPanel = paramDiffPanel;
		instructionsPanel = paramInstructionsPanel;
		tMenuPanel = paramTMenuPanel;
		boardPanel = paramBoardPanel;
		
		Font font = new Font("SansSerif", Font.BOLD, 24);
		
		thePanel = tMenuPanel.getTMenuPanel();
		thePanel2 = tMenuPanel.getTMenuPanel2();
		
		add(thePanel, BorderLayout.CENTER);
		add(thePanel2, BorderLayout.EAST);
	}

	public void display(int doorNumber) {
		remove(thePanel);
		remove(thePanel2);
		
		if (doorNumber == 1) {
			int a = 0;
		}
		else if (doorNumber == 2) {
			thePanel = creditsPanel.getCreditsPanel();
			add(thePanel, BorderLayout.CENTER);
		}
		else if (doorNumber == 3) {
			thePanel = instructionsPanel.getInstructionsPanel();
			add(thePanel, BorderLayout.CENTER);
		}
		else if (doorNumber == 4) {
			thePanel = tMenuPanel.getTMenuPanel();
			thePanel2 = tMenuPanel.getTMenuPanel2();
			add(thePanel, BorderLayout.CENTER);
			add(thePanel2, BorderLayout.EAST);
		}
		else if (doorNumber == 5) {
			int b = -1;
		}
		

		validate();
		repaint();
	}
}