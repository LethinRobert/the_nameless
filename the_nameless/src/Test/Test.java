package Test;
import javax.swing.JFrame;

import Credits.CreditsView;
import Difficulty.DifficultyView;
import GameBoard.GameBoardView;
import Instructions.InstructionsView;
import Main.MainController;
import Main.MainModel;
import Main.MainView;
import Settings.SettingsModel;
import TitleMenu.TitleMenuView;

/**
 * Test class for the_nameless
 * @author Robert
 */
public class Test {
	/**
	 * Test main method
	 */
	public static void main(String[] args) {
		
		// to do list
		// 1. Instructions View, Credits View, EXIT, Difficulty View
		// 2. Controllers ALL
		// 3. Multiplayer
		// 4. AI
		// 5. Victory/defeat screens
		// 6. NICE TO HAVE STUFF
		
		System.out.println("Repository for the_nameless");		
		
		//settings
		SettingsModel userSets = new SettingsModel();
		
		//views
		CreditsView credits = new CreditsView();
		DifficultyView diff = new DifficultyView();
		InstructionsView instruct = new InstructionsView();
		TitleMenuView tmenu = new TitleMenuView();
		GameBoardView board = new GameBoardView();
		
		//Main
		MainView mainView = new MainView(credits, diff, instruct, tmenu, board);
		MainModel model = new MainModel();
		MainController controller = new MainController(mainView, model);
		
		//Controllers
		credits.registerController(controller);
		diff.registerController(controller);
		instruct.registerController(controller);
		tmenu.registerController(controller);
		//board.registerController(controller);

		//Window Setup
		int windowWidth = userSets.getWindowWidth(), windowHeight = userSets.getWindowHeight();
		mainView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainView.setSize(windowWidth, windowHeight);
		mainView.setVisible(true);
	}
}