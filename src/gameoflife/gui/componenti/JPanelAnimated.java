package gameoflife.gui.componenti;

import java.awt.*;
import java.net.URL;

import javax.swing.*;

public class JPanelAnimated extends JPanel {
	   
	private static final long serialVersionUID = 1L;
	private String percorso_immagine;
	private URL url;
    private Image image;
    public JPanelAnimated(String image) {
     	this.percorso_immagine = image;
     	this.url = getClass().getClassLoader().getResource(percorso_immagine);
     	this.image = Toolkit.getDefaultToolkit().getImage(this.url);
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image,0,0,getWidth(),getHeight(),this);
     }
 }