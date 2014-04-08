package TitleMenu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Main.MainController;

public class TitleMenuView extends JFrame {
	private JPanel tMenuPanel, tMenuPanelEast, tMenuPanelCenter = new TitleMenuGBView();
	private JButton button1, button2, button3, button4;
	
	public TitleMenuView() {
		super("Connect Four");
		
		Font font = new Font("SansSerif", Font.BOLD, 24);
		
		// title panel
		tMenuPanel = new JPanel();
		tMenuPanel.setLayout(new BorderLayout());
		
		tMenuPanelEast = new JPanel();
		tMenuPanel.add(tMenuPanelEast, BorderLayout.EAST);
		tMenuPanel.add(tMenuPanelCenter, BorderLayout.CENTER);
		
		/* EAST:
		 * Menu Buttons
		 * See Figures 14.15 and 14.17
		 */
		/* Use a 4x1 grid in the north panel */
		tMenuPanelEast.setLayout(new GridLayout(4, 1));
		tMenuPanelEast.setBackground(Color.WHITE);
		/* Add buttons*/
		button1 = new JButton("Play");
		tMenuPanelEast.add(button1);
		button2 = new JButton("Instructions");
		tMenuPanelEast.add(button2);
		button3 = new JButton("Credits");
		tMenuPanelEast.add(button3);
		button4 = new JButton("Exit");
		tMenuPanelEast.add(button4);
		
		/*titlePanel = new JPanel();
		titlePanel.setLayout(new GridLayout(2, 2, 2, 2));
				
		button1 = new JButton("Play Game");
		button1.setFont(font);
		
		button2 = new JButton("Instructions");
		button2.setFont(font);
		
		button3 = new JButton("Credits");
		button3.setFont(font);
		
		titlePanel.add(button1, BorderLayout.NORTH);
		titlePanel.add(button2, BorderLayout.CENTER);
		titlePanel.add(button3, BorderLayout.SOUTH);
				
		add(titlePanel, BorderLayout.CENTER);*/
	}

	public void registerController(MainController paramController) {
		button1.addActionListener(paramController);
		button2.addActionListener(paramController);
		button3.addActionListener(paramController);
		button4.addActionListener(paramController);
	}
	
	public void display(int doorNumber) {
		remove(tMenuPanel);
		add(tMenuPanel, BorderLayout.CENTER);
		validate();
		repaint();
	}

	public JPanel getTMenuPanel() {
		return tMenuPanel;
	}
}