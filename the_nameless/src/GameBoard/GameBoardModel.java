package GameBoard;
import java.util.Random;

import Settings.SettingsModel;

public class GameBoardModel {
	public static int[][] grid;
	static SettingsModel userSets = new SettingsModel();
	private static int gridWidth = userSets.getGridWidth();
	private static int gridHeight = userSets.getGridHeight();
	public static String gameInfoText;
	static Random randomGenerator = new Random();
    static int randomInt = randomGenerator.nextInt(2);
	public static int turn = randomInt;
	public static int player = turn + 1;
	public static int gswitch = 0, col = 0;
	public static int chipX = (userSets.getw1() + userSets.getw2());
	public static int chipY = ( (userSets.geth1() + userSets.geth2()) - (userSets.getrad1() + 15) );
	
	public GameBoardModel() {
		grid = new int[gridWidth][gridHeight];
		reset();
	}
	//grid
	public static int getGrid(int a, int b) {
		return grid[a][b];
	}
	public static void setGrid(int a, int b, int c) {
		grid[a][b] = c;
	}
	public static void reset() {
		for (int a=0; a<gridWidth; a++) {
			for (int b=0; b<gridHeight; b++) {
				grid[a][b] = 0;
			}
		}
		chipX = (userSets.getw1() + userSets.getw2());
		chipY = ( (userSets.geth1() + userSets.geth2()) - (userSets.getrad1() + 15) );
	    int randomInt = randomGenerator.nextInt(2);
		setTurn(randomInt);
		setPlayer(getTurn() + 1);
		if (getTurn() == 0)
			setGameInfoText("<html><h1 style=\"color:red;\">Red Goes First!!</h1></html>");
		else
			setGameInfoText("<html><h1 style=\"color:black;\">Black Goes First!!</h1></html>");
		gswitch = 0;
		col = 0;
	}
	
	//game info text
	public static String getGameInfoText() {
		return gameInfoText;
	}
	public static void setGameInfoText(String paramText) {
		gameInfoText = paramText;
	}
	
	//turn
	public static int getTurn() {
		return turn;
	}
	public static void setTurn(int paramTurn) {
		turn = paramTurn;
	}
	
	//Chip active
	public static int getChipX() {
		return chipX;
	}
	public static void setChipX(int paramChip) {
		chipX = paramChip;
	}
	public static int getChipY() {
		return chipY;
	}
	public void setChipY(int paramChip) {
		chipY = paramChip;
	}
	//gswitch
	public static int getGSwitch() {
		return gswitch;
	}
	public static void setGSwitch(int paramGSwitch) {
		gswitch = paramGSwitch;
	}
	//Player
	public static int getPlayer() {
		return player;
	}
	public static void setPlayer(int paramPlayer) {
		player = paramPlayer;
	}
	//Collum
	public static int getCol() {
		return col;
	}
	public static void setCol(int paramCol) {
		col = paramCol;
	}
}
