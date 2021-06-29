package gameoflife.gui;

import java.awt.*;
import javax.swing.*;

import gameoflife.gui.componenti.Bottone;
import gameoflife.gui.componenti.JPanelAnimated;


public class Gui{
	
	private JFrame frame;
	
	
	public Gui() {
		super();
		CreaGui(0);
	}
	
	public Gui(int id) {
		super();
		CreaGui(id);
	}
	
	private void CreaGui(int id) {
		
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(600,600);
		
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
		//JPanelAnimated video = new JPanelAnimated("immagini/background.gif");
		frame.add(new Bottone());
		// frame.add(video);
	}
	
	private void CreaGioco() {
		
	}
	
	private void CreaJonhAutore() {
		
	}
}


class Video extends JPanel {
    
	private static final long serialVersionUID = 4844000608526155717L;
	
	private Image image;
	
    Video(Image image) {
        this.image = image;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image,0,0,getWidth(),getHeight(),this);
    }
}
