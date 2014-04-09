package Settings;

public class SettingsModel {
	public int WindowWidth, WindowHeight, Ratio, gridWidth, gridHeight;
	public int i, j, w1, w2, h1, h2, rw1, rw2, rh1, rh2, rad1;
	
	public SettingsModel() {
		WindowWidth = 1024; //possibly change to display differently for most commons resolutions in the future
		WindowHeight = 768; //then revert to this method for other resolutions
		Ratio = 0; //0 = 4:3 ratio, 1 = 16:9 ratio
		gridWidth = 7;
		gridHeight = 6;
		
		  if (getRatio() == 0) { //4:3 Aspect
			  setw1(getWindowWidth() / 6);
			  setw2(getWindowWidth() / 40);
			  seth1(getWindowHeight() / 9);
			  seth2(getWindowHeight() / 60);
			  setrad1(getWindowHeight() / 10);
			  setrw1(getWindowWidth() / 2);
			  setrw2(getWindowWidth() / 8);
			  setrh1(getWindowHeight() / 2);
			  setrh2(getWindowHeight() / 5);
		  }
		  else if (getRatio() == 1) { //16:9 Aspect NOT OPTIMIZED
			  setw1(getWindowWidth() / 4);
			  setw2(getWindowWidth() / 30);
			  seth1(getWindowHeight() / 9);
			  seth2(getWindowHeight() / 40);
			  setrad1(getWindowHeight() / 9);
			  setrw1(getWindowWidth() / 2);
			  setrw2(getWindowWidth() / 14);
			  setrh1(getWindowHeight() / 2);
			  setrh2(getWindowHeight() / 4);
		  }
		  else {
			  setw1(getWindowWidth() / 6);
			  setw2(getWindowWidth() / 40);
			  seth1(getWindowHeight() / 9);
			  seth2(getWindowHeight() / 60);
			  setrad1(getWindowHeight() / 10);
			  setrw1(getWindowWidth() / 2);
			  setrw2(getWindowWidth() / 8);
			  setrh1(getWindowHeight() / 2);
			  setrh2(getWindowHeight() / 5);
		  }
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
	public int getw1() {
		return w1;
	}
	public int getw2() {
		return w2;
	}
	public int geth1() {
		return h1;
	}
	public int geth2() {
		return h2;
	}
	public int getrad1() {
		return rad1;
	}
	public int getrw1() {
		return rw1;
	}
	public int getrw2() {
		return rw2;
	}
	public int getrh1() {
		return rh1;
	}
	public int getrh2() {
		return rh2;
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
	public void setw1(int a) {
		w1 = a;
	}
	public void setw2(int a) {
		w2 = a;
	}
	public void seth1(int a) {
		h1 = a;
	}
	public void seth2(int a) {
		h2 = a;
	}
	public void setrad1(int a) {
		rad1 = a;
	}
	public void setrw1(int a) {
		rw1 = a;
	}
	public void setrw2(int a) {
		rw2 = a;
	}
	public void setrh1(int a) {
		rh1 = a;
	}
	public void setrh2(int a) {
		rh2 = a;
	}
}
