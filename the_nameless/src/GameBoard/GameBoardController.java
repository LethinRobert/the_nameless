package GameBoard;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import Settings.SettingsModel;

public class GameBoardController implements ActionListener, KeyListener, MouseListener {

	//settings
	private SettingsModel userSets = new SettingsModel();
	private Main.MainModel mainModel;
	private Main.MainView mainView;

	/*public GameBoardController() {
	}*/
	//KEYBOARD INPUT
	/*public void keyPressed(KeyEvent e){
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
	    System.out.println("KP");
	}
	public void keyReleased(KeyEvent e) {
		//int key = e.getKeyCode();
		System.out.println("KR");
	}
	public void keyTyped(KeyEvent e) {
		//int key = e.getKeyCode();
		System.out.println("KT");
	}
	*/
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();
		
		if (button.equalsIgnoreCase("Main Menu") || button.equalsIgnoreCase("TitleMenu") || button.equals("Menu")) {
			GameBoardModel.reset();
			return;
		}
	    System.out.println("AP");
	}
/*	public void display(int doorNumber) {
		remove(gameView.getGameBoardPanel());
		add(gameView.getGameBoardPanel(), BorderLayout.CENTER);
		validate();
		repaint();
	}**/
	@Override
	public void mouseClicked(MouseEvent arg0) {
		System.out.println("MC");
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		System.out.println("ME");
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		System.out.println("MEXIT");	
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		System.out.println("MP");
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		System.out.println("MR");
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (GameBoard.GameBoardModel.getGSwitch() == 1){
			if (key == KeyEvent.VK_LEFT) {
				if(GameBoardModel.getChipX() > (userSets.getw1() + userSets.getw2())) {
					GameBoardModel.setChipX(GameBoardModel.getChipX() - (userSets.getrad1() + 7));
					GameBoardModel.setCol(GameBoardModel.getCol() - 1);
					System.out.println(GameBoardModel.getCol());
				}
			}
			if (key == KeyEvent.VK_RIGHT) {
				if(GameBoardModel.getChipX() < ( (userSets.getw1() + userSets.getw2()) + 6*(userSets.getrad1() + 7) ) ) {
					GameBoardModel.setChipX(GameBoardModel.getChipX() + (userSets.getrad1() + 7));
					GameBoardModel.setCol(GameBoardModel.getCol() + 1);
					System.out.println(GameBoardModel.getCol());	
				}
			}
			if (key == KeyEvent.VK_ENTER) {
				for (int i=5;i>=0;i--)
			    {
			      if (GameBoardModel.getGrid(GameBoardModel.getCol(), i) == 0)
			      {
			    	GameBoardModel.setGrid(GameBoardModel.getCol(), i, GameBoardModel.getPlayer());
			    	if (GameBoardModel.getPlayer() == 1) {
			    		GameBoardModel.setPlayer(2);
			    		GameBoardModel.setTurn(1);
			    	}
			    	else {
			    		GameBoardModel.setPlayer(1);
			    		GameBoardModel.setTurn(0);
			    	}
			        break;
			      }
			       
			    }
			}
		}
		System.out.println("KP");
	}
	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("KR");
	}
	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("KT");	
	}
}
