package Test;

import javax.swing.JFrame;

import Credits.CreditsView;
import Difficulty.DifficultyView;
import GameBoard.GameBoardModel;
import GameBoard.GameBoardView;
import Instructions.InstructionsView;
import Main.MainController;
import Main.MainModel;
import Main.MainView;
import ModeSelection.ModeSelectionView;
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
		
		/*Completed
		* 1. Skeleton for the game
		* 2. Main MVC, Credits View, Skeleton InstructionsView
		* 3. Skeleton EXIT, skeleton Difficulty MVC
		* 4. TitleMenu + graphics (Still needs slight visual improvements
		* 5. SettingsModel with rescalable skeleton built
		* 6. Setting for board size skeleton
		* 7. GameBoard M/V skeletons
		*/
		/* to do list
		* 1. Instructions View, EXIT, Difficulty View
		* 2. Controllers ALL
		* 3. Multiplayer
		* 4. AI
		* 5. Victory/defeat screens
		* 6. Improve graphics scaling
		* 7. NICE TO HAVE STUFF
		*/
		
		System.out.println("Repository for the_nameless");		
		
		//Model
		SettingsModel userSets = new SettingsModel();
		GameBoardModel board = new GameBoardModel();
		
		//views
		CreditsView credits = new CreditsView();
		DifficultyView diff = new DifficultyView();
		InstructionsView instruct = new InstructionsView();
		TitleMenuView tmenu = new TitleMenuView();
		GameBoardView gameView = new GameBoardView();
		ModeSelectionView mode = new ModeSelectionView();
		
		//Main
		MainView mainView = new MainView(credits, diff, instruct, tmenu, gameView, mode);
		MainModel model = new MainModel();
		MainController controller = new MainController(mainView, model);
		
		//Controllers
		Difficulty.DifficultyModel diffModel = new Difficulty.DifficultyModel();
		Difficulty.DifficultyController diffControl = new Difficulty.DifficultyController(mainView, diffModel);
		GameBoard.GameBoardController boardControl = new GameBoard.GameBoardController (mainView, model, board, gameView);
		
		gameView.add1(mainView);
		gameView.add2(model);
		
		//register Controllers
		credits.registerController(controller);
		diff.registerController(controller);
		diff.registerController2(diffControl);
		instruct.registerController(controller);
		tmenu.registerController(controller);
		gameView.registerController(controller);
		mode.registerController(controller);
		gameView.registerController2(boardControl);

		//Window Setup
		int windowWidth = userSets.getWindowWidth(), windowHeight = userSets.getWindowHeight();
		mainView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainView.setSize(windowWidth, windowHeight);
		mainView.setVisible(true);
	}
}