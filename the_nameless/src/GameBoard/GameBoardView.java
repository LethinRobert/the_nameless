package GameBoard;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Main.MainController;
//import GameBoardController;

public class GameBoardView extends JFrame {
	private JPanel gameBoardPanel, gameBoardPanelCenter = new GameBoardDrawView(), gameBoardMenuPanel, gameBoardInfoPanel;
	private JButton button1, button2, button3, button4;
	private JLabel gameInfo;
	
	private Main.MainModel mainModel;
	private Main.MainView mainView;
	
	private String gameInfoText;
	
	public GameBoardView() {
		super("Connect Four");
		
		Font font = new Font("SansSerif", Font.BOLD, 24);
				
		// gameBoard panel init
		gameBoardPanel = new JPanel();
		gameBoardPanel.setLayout(new BorderLayout());
		
		// game info init
		gameBoardInfoPanel = new JPanel();
		gameBoardInfoPanel.setLayout(new GridBagLayout());
		gameInfoText = GameBoardModel.getGameInfoText();
		//game Info labels - whos turn it is, special move, other
		gameInfo = new JLabel(gameInfoText);	
		//game Info finalize
		gameBoardInfoPanel.add(gameInfo);
		
		//Menu!
		gameBoardMenuPanel = new JPanel();
		gameBoardMenuPanel.setLayout(new GridLayout(1, 4)); //1row 4 cols menu
		
		//creating buttons
		button1 = new JButton("Main Menu");
		button1.setFont(font);
		gameBoardMenuPanel.add(button1);
		button2 = new JButton("Save");
		button2.setFont(font);
		gameBoardMenuPanel.add(button2);
		button3 = new JButton("Save and Exit");
		button3.setFont(font);
		gameBoardMenuPanel.add(button3);
		button4 = new JButton("Exit");
		button4.setFont(font);
		gameBoardMenuPanel.add(button4);
		
		//gameBoardPanel merging all panels into one
		gameBoardPanel.add(gameBoardInfoPanel, BorderLayout.NORTH);
		gameBoardPanel.add(gameBoardPanelCenter, BorderLayout.CENTER);
		gameBoardPanel.add(gameBoardMenuPanel, BorderLayout.SOUTH);
				
		add(gameBoardPanel, BorderLayout.CENTER);
	}

	public void registerController(MainController paramController) {
		button1.addActionListener(paramController);
		button2.addActionListener(paramController);
		button3.addActionListener(paramController);
		button4.addActionListener(paramController);
	}
	public void registerController2(GameBoardController paramController) {
		button1.addActionListener(paramController);
		button2.addActionListener(paramController);
		button3.addActionListener(paramController);
		button4.addActionListener(paramController);
		gameBoardPanel.addKeyListener(paramController);
		addMouseListener(paramController);
	}
	
	public void display(int doorNumber) {
		remove(gameBoardPanel);
		add(gameBoardPanel, BorderLayout.CENTER);
		validate();
		repaint();
		System.out.println("GBdis = " + GameBoardModel.getGrid(3, 3));
	}

	public JPanel getGameBoardPanel() {
		return gameBoardPanel;
	}
	public void add1(Main.MainView paramMainView) {
		mainView = paramMainView;
	}

	public void add2(Main.MainModel paramMainModel) {
		mainModel = paramMainModel;
	}
}