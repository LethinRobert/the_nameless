package GameBoard;
import Settings.SettingsModel;

public class GameBoardModel {
	public int[][] grid;
	SettingsModel userSets = new SettingsModel();
	int gridWidth = userSets.getGridWidth();
	int gridHeight = userSets.getGridHeight();
	public String gameInfoText = "<html><h1 style=\"color:red;\">Red's Turn</h1></html>";
	public GameBoardModel() {
		grid = new int[gridWidth][gridHeight];
		reset();
	}

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
		
	}
	
	public String getGameInfoText() {
		return gameInfoText;
	}
	public void setGameInfoText(String paramText) {
		gameInfoText = paramText;
	}
}
