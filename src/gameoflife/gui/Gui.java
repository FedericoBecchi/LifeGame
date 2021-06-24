package gameoflife.gui;

import javax.swing.*;

public class Gui extends JFrame {
	
	private static final long serialVersionUID = 3196839023575819616L;
	
	
	public Gui() {
		super();
		CreaGui(0);
	}
	
	public Gui(int id) {
		super();
		CreaGui(id);
	}
	
	private void CreaGui(int id) {
		switch(id) {
		case 0:
			CreaMenu();
			break;
		case 1:
		CreaGioco();
			break;
		case 2:
			CreaJonhAutore();
			break;
		default:
			CreaMenu();
			break;
		}
		
	}
	
	private void CreaMenu() {
		
	}
	
	private void CreaGioco() {
		
	}
	
	private void CreaJonhAutore() {
		
	}
}
