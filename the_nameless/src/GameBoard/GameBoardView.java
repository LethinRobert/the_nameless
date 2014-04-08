package GameBoard;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Main.MainController;

public class GameBoardView extends JFrame {
	private JPanel gameBoardPanel, gameBoardPanelCenter = new GameBoardDrawView();
	private JButton button1;
	
	public GameBoardView() {
		super("Connect Four");
		
		Font font = new Font("SansSerif", Font.BOLD, 24);
				
		// instructions panel
		gameBoardPanel = new JPanel();
		gameBoardPanel.setLayout(new BorderLayout());
		
		button1 = new JButton("Main Menu");
		button1.setFont(font);
		
		gameBoardPanel.add(gameBoardPanelCenter, BorderLayout.CENTER);
		gameBoardPanel.add(button1, BorderLayout.SOUTH);
				
		add(gameBoardPanel, BorderLayout.CENTER);
	}

	public void registerController(MainController paramController) {
		button1.addActionListener(paramController);
	}
	
	public void display(int doorNumber) {
		remove(gameBoardPanel);
		add(gameBoardPanel, BorderLayout.CENTER);
		validate();
		repaint();
	}

	public JPanel getGameBoardPanel() {
		return gameBoardPanel;
	}
}