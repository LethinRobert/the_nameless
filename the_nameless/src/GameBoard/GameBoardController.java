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

public class GameBoardController{

	//settings
	private SettingsModel userSets = new SettingsModel();
	private Main.MainModel mainModel;
	private Main.MainView mainView;
	private static int h, z, v, t, u, r, d;

	public GameBoardController() {
		//not needed?
	}
	public static int checkWinner() {
		//check for horizontal four in a row
    	for (h =0;h<6;h++) {
	    	for (z=0;z<3;z++) {
		    	if ((GameBoardModel.getGrid(z, h) != 0) && (GameBoardModel.getGrid(z+1, h) != 0)
		    	&& (GameBoardModel.getGrid(z+2, h) != 0) && (GameBoardModel.getGrid(z+3, h) != 0)
		    	&& ((GameBoardModel.getGrid(z, h) == GameBoardModel.getGrid(z+1, h))
		    	&& (GameBoardModel.getGrid(z+1, h) == GameBoardModel.getGrid(z+2, h))
		    	&& (GameBoardModel.getGrid(z+2, h) == GameBoardModel.getGrid(z+3, h)))) {
    	          GameBoardModel.setWinner(GameBoardModel.getGrid(z, h));
    	          GameBoardModel.setGameOver(1);
    	          return(1);
		    	}
    	    }
    	}
	    //check for vertical four in a row
    	for (v =0;v<6;v++) {
	    	for (t=0;t<3;t++) {
		    	if ((GameBoardModel.getGrid(v, t) != 0) && (GameBoardModel.getGrid(v, t+1) != 0)
		    	&& (GameBoardModel.getGrid(v, t+2) != 0) && (GameBoardModel.getGrid(v, t+3) != 0)
		    	&& ((GameBoardModel.getGrid(v, t) == GameBoardModel.getGrid(v, t+1))
		    	&& (GameBoardModel.getGrid(v, t+1) == GameBoardModel.getGrid(v, t+2))
		    	&& (GameBoardModel.getGrid(v, t+2) == GameBoardModel.getGrid(v, t+3)))) {
    	          GameBoardModel.setWinner(GameBoardModel.getGrid(v, t));
    	          GameBoardModel.setGameOver(1);
    	          return(1);
		    	}
    	    }
	    }
    	//Check for diag1 (up to the right)
    	for (u =0;u<4;u++) {
	    	for (r=5;r>=3;r--) {
		    	if ((GameBoardModel.getGrid(u, r) != 0) && (GameBoardModel.getGrid(u+1, r-1) != 0)
		    	&& (GameBoardModel.getGrid(u+2, r-2) != 0) && (GameBoardModel.getGrid(u+3, r-3) != 0)
		    	&& ((GameBoardModel.getGrid(u, r) == GameBoardModel.getGrid(u+1, r-1))
		    	&& (GameBoardModel.getGrid(u+1, r-1) == GameBoardModel.getGrid(u+2, r-2))
		    	&& (GameBoardModel.getGrid(u+2, r-2) == GameBoardModel.getGrid(u+3, r-3)))) {
    	          GameBoardModel.setWinner(GameBoardModel.getGrid(u, r));
    	          GameBoardModel.setGameOver(1);
    	          return(1);
		    	}
    	    }
	    }
    	//Check for diag2 (down to the right)
    	for (d=0;d<4;d++) {
	    	for (r=0;r<3;r++) {
		    	if ((GameBoardModel.getGrid(d, r) != 0) && (GameBoardModel.getGrid(d+1, r+1) != 0)
		    	&& (GameBoardModel.getGrid(d+2, r+2) != 0) && (GameBoardModel.getGrid(d+3, r+3) != 0)
		    	&& ((GameBoardModel.getGrid(d, r) == GameBoardModel.getGrid(d+1, r+1))
		    	&& (GameBoardModel.getGrid(d+1, r+1) == GameBoardModel.getGrid(d+2, r+2))
		    	&& (GameBoardModel.getGrid(d+2, r+2) == GameBoardModel.getGrid(d+3, r+3)))) {
    	          GameBoardModel.setWinner(GameBoardModel.getGrid(d, r));
    	          GameBoardModel.setGameOver(1);
    	          return(1);
		    	}
    	    }
	    }
    	return(0);
	}
}
