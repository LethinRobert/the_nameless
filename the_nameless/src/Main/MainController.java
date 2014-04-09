package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GameBoard.GameBoardModel;
import Settings.SettingsModel;


public class MainController implements ActionListener {
	private MainView view;
	private MainModel model;
	//Game Board Model
	GameBoardModel board = new GameBoardModel();
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
			model.setDoorNumber(5);
		else if (button == "Multiplayer")
			model.setDoorNumber(6);
		else if (button == "Computer")
			model.setDoorNumber(1);
		//else if (button == "Load")
			//model.setDoorNumber(8);
		else if (button == "Easy" || button == "Medium" || button == "Hard")
			model.setDoorNumber(6);
		else if (button == "Save") {
			board.setChipX(board.getChipX() - (userSets.getrad1() + 7));
		}
		view.display(model.getDoorNumber());
	}
}