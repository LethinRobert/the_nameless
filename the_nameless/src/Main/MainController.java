package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import GameBoard.GameBoardModel;
import GameOverScreens.VictoryModel;
import Settings.SettingsModel;


public class MainController implements ActionListener, KeyListener{
	private MainView view;
	private MainModel model;
	SettingsModel userSets = new SettingsModel();
	
	
	public MainController(MainView paramView, MainModel paramModel) {
		view = paramView;
		model = paramModel;
	}

	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();
		if (button == "Play") {
			model.setDoorNumber(7);
			VictoryModel.reset();
		}
		else if (button == "Instructions")
			model.setDoorNumber(2);
		else if (button == "Credits")
			model.setDoorNumber(3);
		else if (button == "Main Menu")
			model.setDoorNumber(4);
		else if (button == "Exit")
			model.setDoorNumber(9);
		else if (button == "Multiplayer")
			model.setDoorNumber(6);
		else if (button == "Computer")
			model.setDoorNumber(1);
		//else if (button == "Load")
			//model.setDoorNumber(8);
		else if (button == "Easy" || button == "Medium" || button == "Hard")
			model.setDoorNumber(6);
		else if (button == "Save") {
		}
		else if (button == "Save and Exit") {
		}
		view.display(model.getDoorNumber());
	}

	@Override
	public void keyPressed(KeyEvent e) {
    	//Check for Horizontal Four in a row
		int key = e.getKeyCode();
		if (GameBoard.GameBoardModel.getGSwitch() == 1 && GameBoard.GameBoardModel.getGameOver() == 0){

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
				for (int k=5;k>=0;k--)
			    {
			      if (GameBoardModel.getGrid(GameBoardModel.getCol(), k) == 0)
			      {
			    	  GameBoardModel.setGrid(GameBoardModel.getCol(), k, GameBoardModel.getPlayer());
			        break;
			      }
			    }
	    		/*for (int a=0; a<7; a++) {
	    			for (int b=0; b<6; b++) {
	    				System.out.print("[" + a + "," + b + "] = " + GameBoardModel.getGrid(a, b) + ", ");
	    			}
	    			System.out.print("\n");
	    		}
	    		System.out.print("\n");*/
		    	for (int i =0;i<6;i++) {
			    	for (int j=0;j<3;j++) {
				    	if ((GameBoardModel.getGrid(j, i) != 0) && (GameBoardModel.getGrid(j+1, i) != 0)
				    	&& (GameBoardModel.getGrid(j+2, i) != 0) && (GameBoardModel.getGrid(j+3, i) != 0)
				    	&& ((GameBoardModel.getGrid(j+0, i) == GameBoardModel.getGrid(j+1, i))
				    	&& (GameBoardModel.getGrid(j+1, i) == GameBoardModel.getGrid(j+2, i))
				    	&& (GameBoardModel.getGrid(j+2, i) == GameBoardModel.getGrid(j+3, i)))) {
		    	          GameBoardModel.setWinner(GameBoardModel.getGrid(j+1, i));
		    	          GameBoardModel.setGameOver(1);
				    	}
		    	    }
			    }
			    if (GameBoardModel.getPlayer() == 1) {
			    	GameBoardModel.setPlayer(2);
			    	GameBoardModel.setTurn(1);
			   	}
			   	else {
			    	GameBoardModel.setPlayer(1);
			   		GameBoardModel.setTurn(0);
			   	}
			}
		}
		if (GameBoardModel.getGameOver() == 1) {
			if(GameBoardModel.getWinner() == 1)
				System.out.println("Red won!!");
			else
				System.out.println("Black won!!");
			model.setDoorNumber(10);
			VictoryModel.setWinner(GameBoardModel.getWinner());
			GameBoardModel.reset();
		}
		view.display(model.getDoorNumber());


	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}