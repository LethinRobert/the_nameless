package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import GameBoard.GameBoardModel;
import Settings.SettingsModel;


public class MainController implements ActionListener, KeyListener{
	private MainView view;
	private MainModel model;
	SettingsModel userSets = new SettingsModel();
	
	
	public MainController(MainView paramView, MainModel paramModel) {
		view = paramView;
		model = paramModel;
	}

	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();
		if (button == "Play")
			model.setDoorNumber(7);
		else if (button == "Instructions")
			model.setDoorNumber(2);
		else if (button == "Credits")
			model.setDoorNumber(3);
		else if (button == "Main Menu")
			model.setDoorNumber(4);
		else if (button == "Exit")
			model.setDoorNumber(9);
		else if (button == "Multiplayer")
			model.setDoorNumber(6);
		else if (button == "Computer")
			model.setDoorNumber(1);
		//else if (button == "Load")
			//model.setDoorNumber(8);
		else if (button == "Easy" || button == "Medium" || button == "Hard")
			model.setDoorNumber(6);
		else if (button == "Save") {
		}
		else if (button == "Save and Exit") {
		}
		view.display(model.getDoorNumber());
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		view.display(model.getDoorNumber());
		System.out.println("UPDATE!!");
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}