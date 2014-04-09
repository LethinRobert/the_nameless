package GameOverScreens;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Main.MainController;

public class VictoryView extends JFrame {
	private JPanel victoryPanel, victoryPanelCenter = new VictoryViewDraw(), victoryMenuPanel;
	private JButton button1, button2;
	
	private Main.MainModel mainModel;
	private Main.MainView mainView;
	
	
	public VictoryView() {
		super("Connect Four");
		
		Font font = new Font("SansSerif", Font.BOLD, 24);
				
		// victory panel init
		victoryPanel = new JPanel();
		victoryPanel.setLayout(new BorderLayout());
		
		//Menu!
		victoryMenuPanel = new JPanel();
		victoryMenuPanel.setLayout(new GridLayout(1, 2)); //1row 4 cols menu
		
		//creating buttons
		button1 = new JButton("Main Menu");
		button1.setFont(font);
		victoryMenuPanel.add(button1);
		button2 = new JButton("Exit");
		button2.setFont(font);
		victoryMenuPanel.add(button2);
		
		//victoryPanel merging all panels into one
		victoryPanel.add(victoryPanelCenter, BorderLayout.CENTER);
		victoryPanel.add(victoryMenuPanel, BorderLayout.SOUTH);
				
		add(victoryPanel, BorderLayout.CENTER);
	}

	public void registerController(MainController paramController) {
		button1.addActionListener(paramController);
		button2.addActionListener(paramController);
	}
	
	public void display(int doorNumber) {
		remove(victoryPanel);
		add(victoryPanel, BorderLayout.CENTER);
		validate();
		repaint();
	}

	public JPanel getVictoryPanel() {
		return victoryPanel;
	}
	public void add1(Main.MainView paramMainView) {
		mainView = paramMainView;
	}

	public void add2(Main.MainModel paramMainModel) {
		mainModel = paramMainModel;
	}
}