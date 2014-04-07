import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Board extends JPanel 
{
   public void paintComponent( Graphics g )
   {
	  int i, j, startX = 205, startY = 105, radius = 60;
      super.paintComponent( g );

      this.setBackground( Color.WHITE);

      g.setColor( Color.YELLOW );
      g.fillRect(200, 100, 480, 410);

      g.setColor( Color.WHITE );
      for(i=0; i<6; i++){
    	  for(j=0; j<7; j++){
    		  g.fillOval(startX + ((radius + 7) * j), startY + ((radius + 7) * i), radius, radius);
    	  }
      }
   }
}