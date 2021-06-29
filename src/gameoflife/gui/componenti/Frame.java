package gameoflife.gui.componenti;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class Frame extends JFrame {
	
	public Frame() {
		super();
	}
	
	public void paint(Graphics g) {
	    super.paint(g);
	    Graphics2D b = (Graphics2D)g;
	    b.setColor( Color.WHITE );
	    b.fillRect(0, 0, 800, 600);
	    b.drawImage(start.getImage(),0,0,null);
	    b.dispose();        
	}

}
