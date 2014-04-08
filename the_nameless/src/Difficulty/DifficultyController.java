package Difficulty;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Main.MainView;

public class DifficultyController implements ActionListener {
	private MainView view;
	private DifficultyModel model;
	
	public DifficultyController(MainView paramView, DifficultyModel paramModel) {
		view = paramView;
		model = paramModel;
	}
	
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();
		if (button == "Easy")
			model.setDoorNumber(1);
		else if (button == "Medium")
			model.setDoorNumber(2);
		else if (button == "Hard")
			model.setDoorNumber(3);
		
		view.display(5);
	}
}