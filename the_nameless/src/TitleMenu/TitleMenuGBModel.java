package TitleMenu;

import Settings.SettingsModel;

public class TitleMenuGBModel {
	public int[][] grid;
	SettingsModel userSets = new SettingsModel();
	int gridWidth = userSets.getGridWidth();
	int gridHeight = userSets.getGridHeight();
	public TitleMenuGBModel() {
		grid = new int[gridWidth][gridHeight];
		reset();
	    this.setGrid(0, 5, 1);
	    this.setGrid(0, 4, 1);
	    this.setGrid(0, 3, 2);
	    this.setGrid(0, 2, 2);
	    this.setGrid(1, 5, 2);
	    this.setGrid(1, 4, 2);
	    this.setGrid(1, 3, 1);
	    this.setGrid(1, 2, 1);
	    this.setGrid(2, 5, 2);
	    this.setGrid(2, 4, 1);
	    this.setGrid(3, 5, 1);
	    this.setGrid(3, 4, 2);
	    this.setGrid(3, 3, 1);
	    this.setGrid(3, 2, 1);
	    this.setGrid(4, 5, 1);
	    this.setGrid(4, 4, 2);
	    this.setGrid(4, 3, 2);
	    this.setGrid(4, 2, 1);
	    this.setGrid(4, 1, 2);
	    this.setGrid(6, 5, 2);
	    this.setGrid(6, 4, 2);
	    this.setGrid(6, 3, 1);
	    this.setGrid(6, 2, 2);
	    this.setGrid(6, 1, 1);
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
}

