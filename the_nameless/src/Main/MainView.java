package Main;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Credits.CreditsView;
import Difficulty.DifficultyView;
import GameBoard.GameBoardView;
import Instructions.InstructionsView;
import ModeSelection.ModeSelectionView;
import TitleMenu.TitleMenuView;

public class MainView extends JFrame {
	private JPanel thePanel;
	
	CreditsView creditsPanel;
	DifficultyView diffPanel;
	InstructionsView instructionsPanel;
	TitleMenuView tMenuPanel;
	GameBoardView boardPanel;
	ModeSelectionView modePanel;
	
	public MainView(CreditsView paramCreditsPanel, DifficultyView paramDiffPanel, InstructionsView paramInstructionsPanel, TitleMenuView paramTMenuPanel, GameBoardView paramBoardPanel, ModeSelectionView paramModePanel) {
		super("Connect Four");
		
		creditsPanel = paramCreditsPanel;
		diffPanel = paramDiffPanel;
		instructionsPanel = paramInstructionsPanel;
		tMenuPanel = paramTMenuPanel;
		boardPanel = paramBoardPanel;
		modePanel = paramModePanel;
		
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
		else if (doorNumber == 7)
			thePanel = modePanel.getModePanel();
		add(thePanel, BorderLayout.CENTER);

		validate();
		repaint();
	}
}