package ModeSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Main.MainView;

public class ModeSelectionController implements ActionListener {
	private MainView view;
	private ModeSelectionModel model;
	
	public ModeSelectionController(MainView paramView, ModeSelectionModel paramModel) {
		view = paramView;
		model = paramModel;
	}
	
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();
		if (button == "Multiplayer") {
			model.setDoorNumber(1);
			view.display(6);
		}
		else if (button == "Computer") {
			model.setDoorNumber(2);
			view.display(1);
		}
		else if (button == "Load") {
			model.setDoorNumber(3);
			view.display(8);
		}
	}
}