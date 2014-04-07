import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GameBoardView extends JPanel 
{
   public void paintComponent( Graphics g )
   {
	  int i, j, startX = 205, startY = 105, radius = 60;
      super.paintComponent( g );

      this.setBackground( Color.WHITE);

      //Level:1 - This is the square
      g.setColor( Color.YELLOW );
      g.fillRect(200, 100, 480, 410);

      //Level:2 - White cirlces to complete board
      g.setColor( Color.WHITE );
      for(i=0; i<6; i++){
    	  for(j=0; j<7; j++){
    		  
    		  g.fillOval(startX + ((radius + 7) * j), startY + ((radius + 7) * i), radius, radius);
    	  }
      }
      
   }
}