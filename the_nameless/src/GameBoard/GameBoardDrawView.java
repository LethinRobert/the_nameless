package GameBoard;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

import Settings.SettingsModel;

public class GameBoardDrawView extends JPanel 
{
	//settings
	private SettingsModel userSets = new SettingsModel();
	//Game Board
	GameBoardModel board = new GameBoardModel();
	
	public void paintComponent( Graphics g )
	{
	  int i, j, startX, startY, radius, w1, w2, h1, h2, rw1, rw2, rh1, rh2, rad1;
	  int gridWidth = userSets.getGridWidth();
	  int gridHeight = userSets.getGridHeight();
	  w1 = userSets.getw1();
	  w2 = userSets.getw2();
	  h1 = userSets.geth1();
	  h2 = userSets.geth2();
	  rad1 = userSets.getrad1();
	  rw1 = userSets.getrw1();
	  rw2 = userSets.getrw2();
	  rh1 = userSets.getrh1();
	  rh2 = userSets.getrh2();
	  radius = rad1;
	  startX = w1 + w2;
	  startY = h1 + h2;
      super.paintComponent( g );

      this.setBackground( Color.WHITE);

      //Level:1 - This is the square
      g.setColor( Color.YELLOW );
      g.fillRect(w1, h1, (rw1 + rw2), (rh1 + rh2) );
      

      //Level:2 - White cirlces to complete board
      g.setColor( Color.WHITE );
      for(i=0; i<gridWidth; i++){
    	  for(j=0; j<gridHeight; j++){
    		  if (board.getGrid(i, j) == 0)
    		  {
    			  g.setColor(Color.WHITE);
    		  }
    		  else if (board.getGrid(i, j) == 1)
    		  {
    			  g.setColor(Color.BLACK);
    		  }
    		  else if (board.getGrid(i, j) == 2)
    		  {
    			  g.setColor(Color.RED);
    		  }
    		  g.fillOval(startX + ((radius + 7) * i), startY + ((radius + 7) * j), radius, radius);
    	  }
      }
      //level 3 Player Chip
      if (board.getTurn() == 0)
    	  g.setColor( Color.RED );
      else
    	  g.setColor( Color.BLACK );
      g.fillOval(board.getChipX(), board.getChipY(), radius, radius);
	}
}