package Settings;

public class SettingsModel {
	private int WindowWidth, WindowHeight, Ratio;
	
	public SettingsModel() {
		WindowWidth = 1024;
		WindowHeight = 768;
		Ratio = 0;
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

	public void setWindowWidth(int paramWindowWidth) {
		WindowWidth = paramWindowWidth;
	}
	public void setWindowHeight(int paramWindowHeight) {
		WindowHeight = paramWindowHeight;
	}
	public void setRatio(int paramRatio) {
		Ratio = paramRatio;
	}
}
