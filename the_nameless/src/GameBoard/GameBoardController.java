package GameBoard;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import Settings.SettingsModel;

public class GameBoardController implements ActionListener, KeyListener {
	private Main.MainView mainView;
	private Main.MainModel mainModel;
	private GameBoardModel board;
	private GameBoardView gameView;
	//settings
	private SettingsModel userSets = new SettingsModel();

	public GameBoardController(Main.MainView paramView, Main.MainModel paramModel, GameBoardModel paramboard, GameBoardView paramGameView) {
		mainView = paramView;
		mainModel = paramModel;
		board = paramboard;
		gameView = paramGameView;
		
		/*Random randomGenerator = new Random();
	    int randomInt = randomGenerator.nextInt(2);
		board.setTurn(randomInt);
		if (board.getTurn() == 0)
			board.setGameInfoText("<html><h1 style=\"color:red;\">Red Goes First!!</h1></html>");
		else
			board.setGameInfoText("<html><h1 style=\"color:black;\">Black Goes First!!</h1></html>");
		*/
	}
	//KEYBOARD INPUT
	public void keyPressed(KeyEvent e){
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_LEFT) {
			if(board.getChipX() > (userSets.getw1() + userSets.getw2()))
				board.setChipX(board.getChipX() - (userSets.getrad1() + 7));
		}
		if (key == KeyEvent.VK_RIGHT) {
			if(board.getChipX() < ( (userSets.getw1() + userSets.getw2()) + 7*(userSets.getrad1() + 7) ) )
				board.setChipX(board.getChipX() + (userSets.getrad1() + 7));
		}
	}
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
	}
	public void keyTyped(KeyEvent e) {
		int key = e.getKeyCode();
	}
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();
		
		if (button.equalsIgnoreCase("Main Menu") || button.equalsIgnoreCase("TitleMenu") || button.equals("Menu")) {
			board.reset();
			return;
		}
	}
/*	public void display(int doorNumber) {
		remove(gameView.getGameBoardPanel());
		add(gameView.getGameBoardPanel(), BorderLayout.CENTER);
		validate();
		repaint();
	}*/
}
