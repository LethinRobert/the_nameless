package GameOverScreens;

import java.util.Random;


public class VictoryModel {
	public static int winner = 1;
	
	public VictoryModel() {
		reset();
	}

	public static void reset() {
		winner = 1;
	}
	
	//Winner
	public static int getWinner() {
		return winner;
	}
	public static void setWinner(int paramWinner) {
		winner = paramWinner;
	}
}