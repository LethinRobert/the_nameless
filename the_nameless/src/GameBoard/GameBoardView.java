package GameBoard;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import Main.MainController;

public class GameBoardView extends JFrame {
	private JPanel GameBoardPanel, GameBoardPanelSouth, GameBoardPanelCenter = new GameBoardDrawView();
	private JButton button1;
	
	public GameBoardView() {
		super("Connect Four");
		
		Font font = new Font("SansSerif", Font.BOLD, 24);
		
		// title panel
		GameBoardPanel = new JPanel();
		GameBoardPanel.setLayout(new BorderLayout());
		
		GameBoardPanelSouth = new JPanel();
		GameBoardPanel.add(GameBoardPanelSouth, BorderLayout.SOUTH);
		GameBoardPanel.add(GameBoardPanelCenter, BorderLayout.CENTER);
		
		/* SOUTH:
		 * Menu Buttons
		 */
		GameBoardPanelSouth.setLayout(new GridLayout(1, 1));
		GameBoardPanelSouth.setBackground(Color.WHITE);
		/* Add buttons*/
		button1 = new JButton("Main Menu");
		GameBoardPanelSouth.add(button1);
		
	}

	public void registerController(MainController paramController) {
		button1.addActionListener(paramController);
	}
	
	public void display(int doorNumber) {
		remove(GameBoardPanel);
		add(GameBoardPanel, BorderLayout.CENTER);
		validate();
		repaint();
	}

	public JPanel getGameBoardPanel() {
		return GameBoardPanel;
	}
}