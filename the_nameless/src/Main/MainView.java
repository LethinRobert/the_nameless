package Main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import Credits.CreditsView;
import Difficulty.DifficultyView;
import GameBoard.GameBoardView;
import Instructions.InstructionsView;
import TitleMenu.TitleMenuView;

public class MainView extends JFrame {
	private JPanel thePanel;
	
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
		
		add(thePanel, BorderLayout.CENTER);
	}

	public void display(int doorNumber) {
		remove(thePanel);
		
		if (doorNumber == 1)
			thePanel = diffPanel.getDiffPanel();
		else if (doorNumber == 2)
			thePanel = instructionsPanel.getInstructionsPanel();
		else if (doorNumber == 3)
			thePanel = creditsPanel.getCreditsPanel();
		else if (doorNumber == 4)
			thePanel = tMenuPanel.getTMenuPanel();
		else if (doorNumber == 5)
			thePanel = creditsPanel.getCreditsPanel();
		else if (doorNumber == 6)
			thePanel = boardPanel.getGameBoardPanel();
		add(thePanel, BorderLayout.CENTER);

		validate();
		repaint();
	}
}