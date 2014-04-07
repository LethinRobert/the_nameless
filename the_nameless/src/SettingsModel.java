
public class SettingsModel {
	private int WindowWidth, WindowHeight;
	
	public SettingsModel() {
		WindowWidth = 800;
		WindowHeight = 600;
	}

	public int getWindowWidth() {
		return WindowWidth;
	}
	public int getWindowHeight() {
		return WindowHeight;
	}

	public void setWindowWidth(int paramWindowWidth) {
		WindowWidth = paramWindowWidth;
	}
	public void setWindowHeight(int paramWindowHeight) {
		WindowHeight = paramWindowHeight;
	}
}
