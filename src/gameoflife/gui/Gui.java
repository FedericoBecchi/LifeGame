package gameoflife.gui;

import java.awt.*;

import javax.swing.*;
import gameoflife.gui.componenti.*;


public class Gui extends JFrame{
	private static final long serialVersionUID = 1L;

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
		
		ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("immagini/icona/icon.png"));
		this.setIconImage(icon.getImage());
	    
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		this.setSize(300,400);
		this.setLocation(300,300);  
	}
	
	private void CreaMenu() {
		JPanelAnimated video = new JPanelAnimated("immagini/menu/background.gif");

		JPanel pannelloNord = new TransaparentPanel();
		JPanel pannelloCentro = new TransaparentPanel();
		JPanel pannelloSud = new TransaparentPanel();

		// PANNELLO NORD
		pannelloNord.add(new Bottone("immagini/menu/game_icon.png"));
		
		// PANNELLO CENTRO
		pannelloCentro.setLayout(new GridLayout(1,3));
		pannelloCentro.add(new Bottone("immagini/menu/play.png"));
		pannelloCentro.add(new Bottone("immagini/menu/fungo.png"));
		pannelloCentro.add(new Bottone("immagini/menu/earth.png"));

		// PANNELLO SUD
		pannelloSud.add(new Bottone("immagini/menu/title.png"));
		
		// AGGIUNTA AL PANNELLO PRINCIPALE VIDEO
		video.add(pannelloNord);
		video.add(pannelloCentro);
		video.add(pannelloSud);
		
		this.add(video);
		this.revalidate();
		this.repaint();
	}
	
	private void CreaGioco() {
		
	}
	
	private void CreaJonhAutore() {
		
	}
}
