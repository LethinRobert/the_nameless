import java.awt.*;
import javax.swing.*;

/**
 * This displays a blank window with a title.
 * @author Lach and Ion!
 */
public class GameWindow extends JFrame {
	/**
	 * The constructor sets the title.
	 */
	public GameWindow() {
		super("Connect Four by Lach and Ion!");
		getContentPane().setBackground(Color.BLACK);
		
		add(new Board());
	}

	/**
	 * The main method to test this class.
	 */
	public static void main(String[] args) {
		int windowWidth = 800, windowHeight = 600;
		GameWindow window = new GameWindow();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(windowWidth, windowHeight);
		window.setVisible(true);
	}
}
