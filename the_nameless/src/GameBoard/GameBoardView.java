package GameBoard;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Main.MainController;

public class GameBoardView extends JFrame {
	private JPanel GameBoardPanel, GameBoardPanelCenter = new GameBoardDrawView();
	private JButton button1;
	
	public GameBoardView() {
		super("Connect Four");
		
		Font font = new Font("SansSerif", Font.BOLD, 24);
		
		// GameBoard panel
		GameBoardPanel = new JPanel();
		GameBoardPanel.setLayout(new BorderLayout());
		
		button1 = new JButton("Main Menu");
		button1.setFont(font);
		
		GameBoardPanel.add(button1, BorderLayout.SOUTH);
		GameBoardPanel.add(GameBoardPanelCenter, BorderLayout.CENTER);
		
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