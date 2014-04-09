package GameBoard;
import java.util.Random;

import Settings.SettingsModel;

public class GameBoardModel {
	public int[][] grid;
	SettingsModel userSets = new SettingsModel();
	private int gridWidth = userSets.getGridWidth();
	private int gridHeight = userSets.getGridHeight();
	public String gameInfoText;
	Random randomGenerator = new Random();
    int randomInt = randomGenerator.nextInt(2);
	public int turn = randomInt;
	public int chipX = (userSets.getw1() + userSets.getw2());
	public int chipY = ( (userSets.geth1() + userSets.geth2()) - (userSets.getrad1() + 15) );
	
	public GameBoardModel() {
		grid = new int[gridWidth][gridHeight];
		reset();
	}
	//grid
	public int getGrid(int a, int b) {
		return grid[a][b];
	}
	public void setGrid(int a, int b, int c) {
		grid[a][b] = c;
	}
	public void reset() {
		for (int a=0; a<gridWidth; a++) {
			for (int b=0; b<gridHeight; b++) {
				grid[a][b] = 0;
			}
		}
		chipX = (userSets.getw1() + userSets.getw2());
		chipY = ( (userSets.geth1() + userSets.geth2()) - (userSets.getrad1() + 15) );
	    int randomInt = randomGenerator.nextInt(2);
		setTurn(randomInt);
		if (getTurn() == 0)
			setGameInfoText("<html><h1 style=\"color:red;\">Red Goes First!!</h1></html>");
		else
			setGameInfoText("<html><h1 style=\"color:black;\">Black Goes First!!</h1></html>");
	}
	
	//game info text
	public String getGameInfoText() {
		return gameInfoText;
	}
	public void setGameInfoText(String paramText) {
		gameInfoText = paramText;
	}
	
	//turn
	public int getTurn() {
		return turn;
	}
	public void setTurn(int paramTurn) {
		turn = paramTurn;
	}
	
	//Chip active
	public int getChipX() {
		return chipX;
	}
	public void setChipX(int paramChip) {
		chipX = paramChip;
	}
	public int getChipY() {
		return chipY;
	}
	public void setChipY(int paramChip) {
		chipY = paramChip;
	}
}
