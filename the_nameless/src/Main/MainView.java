package Main;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Credits.CreditsView;
import Difficulty.DifficultyView;
import GameBoard.GameBoardController;
import GameBoard.GameBoardView;
import GameOverScreens.VictoryView;
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
	VictoryView victoryPanel;
	
	public MainView(CreditsView paramCreditsPanel, DifficultyView paramDiffPanel, InstructionsView paramInstructionsPanel, TitleMenuView paramTMenuPanel, GameBoardView paramBoardPanel, ModeSelectionView paramModePanel, VictoryView paramVictoryPanel) {
		super("Connect Four");
		
		creditsPanel = paramCreditsPanel;
		diffPanel = paramDiffPanel;
		instructionsPanel = paramInstructionsPanel;
		tMenuPanel = paramTMenuPanel;
		boardPanel = paramBoardPanel;
		modePanel = paramModePanel;
		victoryPanel = paramVictoryPanel;
		
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
		else if (doorNumber == 6) {
			thePanel = boardPanel.getGameBoardPanel();
			GameBoard.GameBoardModel.setGSwitch(1);}
		else if (doorNumber == 7)
			thePanel = modePanel.getModePanel();
		//else if (doorNumber == 8)
			//thePanel = loadPanel.getloadPanel();
		else if (doorNumber == 9)
			System.exit(1);
		else if (doorNumber == 10) {
			thePanel = victoryPanel.getVictoryPanel();
		}
		add(thePanel, BorderLayout.CENTER);

		validate();
		repaint();
	}
	public void registerController(MainController paramController) {
		addKeyListener(paramController);
		//addMouseListener(paramController);
	}
	public void registerController2(GameBoardController paramController) {
		addKeyListener(paramController);
		addMouseListener(paramController);
	}
	
}