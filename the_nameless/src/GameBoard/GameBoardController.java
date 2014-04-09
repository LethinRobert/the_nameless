package GameBoard;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import Settings.SettingsModel;

public class GameBoardController implements ActionListener, KeyListener {

	//settings
	private SettingsModel userSets = new SettingsModel();

	public GameBoardController() {
		/*Random randomGenerator = new Random();
	    int randomInt = randomGenerator.nextInt(2);
		GameBoardModel.setTurn(randomInt);
		if (GameBoardModel.getTurn() == 0)
			GameBoardModel.setGameInfoText("<html><h1 style=\"color:red;\">Red Goes First!!</h1></html>");
		else
			GameBoardModel.setGameInfoText("<html><h1 style=\"color:black;\">Black Goes First!!</h1></html>");
		*/
	}
	//KEYBOARD INPUT
	public void keyPressed(KeyEvent e){
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_LEFT) {
			if(GameBoardModel.getChipX() > (userSets.getw1() + userSets.getw2())) {
				GameBoardModel.setChipX(GameBoardModel.getChipX() - (userSets.getrad1() + 7));
				System.out.println("CLICK!!!");
			}
		}
		if (key == KeyEvent.VK_RIGHT) {
			if(GameBoardModel.getChipX() < ( (userSets.getw1() + userSets.getw2()) + 7*(userSets.getrad1() + 7) ) ) {
				GameBoardModel.setChipX(GameBoardModel.getChipX() + (userSets.getrad1() + 7));
				System.out.println("CLICK!!!");	
			}
		}
	    System.out.println("GBCpres = " + GameBoardModel.getGrid(3, 3));
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
			GameBoardModel.reset();
			return;
		}
	    System.out.println("GBCact = " + GameBoardModel.getGrid(3, 3));
	}
/*	public void display(int doorNumber) {
		remove(gameView.getGameBoardPanel());
		add(gameView.getGameBoardPanel(), BorderLayout.CENTER);
		validate();
		repaint();
	}*/
}
