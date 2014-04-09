package GameOverScreens;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

import GameBoard.GameBoardModel;
import Settings.SettingsModel;

public class VictoryViewDraw extends JPanel 
{
	//settings
	private SettingsModel userSets = new SettingsModel();
	private String redWin = "Red won!!", blackWin = "Black won!!";
	//Game Board
	public void paintComponent( Graphics g )
	{
      super.paintComponent( g );
      Font font = new Font("SansSerif", Font.BOLD, 74);
      this.setBackground( Color.WHITE);

      //Level:1 - This is the square
      g.setFont(font);
      if(VictoryModel.getWinner() == 1) {
          g.setColor(Color.RED);
          g.drawString(redWin, userSets.getWindowWidth()/4, userSets.getWindowHeight()/2);
      }
      else {
          g.setColor(Color.BLACK);
          g.drawString(blackWin, userSets.getWindowWidth()/4, userSets.getWindowHeight()/2);
      }
      
	}
}