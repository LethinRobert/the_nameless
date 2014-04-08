package Settings;

public class SettingsModel {
	private int WindowWidth, WindowHeight, Ratio, gridWidth, gridHeight;
	
	public SettingsModel() {
		WindowWidth = 800;
		WindowHeight = 600;
		Ratio = 0;
		gridWidth = 7;
		gridHeight = 6;
	}

	public int getWindowWidth() {
		return WindowWidth;
	}
	public int getWindowHeight() {
		return WindowHeight;
	}
	public int getRatio() {
		return Ratio;
	}
	public int getGridWidth() {
		return gridWidth;
	}
	public int getGridHeight() {
		return gridHeight;
	}

	public void setWindowWidth(int paramWindowWidth) {
		WindowWidth = paramWindowWidth;
	}
	public void setWindowHeight(int paramWindowHeight) {
		WindowHeight = paramWindowHeight;
	}
	public void setRatio(int paramRatio) {
		Ratio = paramRatio;
	}
	public void setGridWidth(int paramGridWidth) {
		gridWidth = paramGridWidth;
	}
	public void setGridHeight(int paramGridHeight) {
		gridHeight = paramGridHeight;
	}
}
