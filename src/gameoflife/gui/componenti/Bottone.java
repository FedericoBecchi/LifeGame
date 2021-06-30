package gameoflife.gui.componenti;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Bottone extends JButton {
	private static final long serialVersionUID = 1L;
	
	protected String percorso_immagine;
    private ImageIcon immagine;

    public Bottone(){
        this.percorso_immagine = "immagini/play.png";
        this.immagine = new ImageIcon(getClass().getClassLoader().getResource(this.percorso_immagine));
        this.setIcon(immagine);
        this.setOpaque(false);
        this.setContentAreaFilled(false);
        this.setBorderPainted(false);
        this.setFocusPainted(false);
    }

    public Bottone(String percorso_immagine){
        this.percorso_immagine = percorso_immagine;
        this.immagine = new ImageIcon(getClass().getClassLoader().getResource(this.percorso_immagine));
        this.setIcon(immagine);
        this.setOpaque(false);
        this.setContentAreaFilled(false);
        this.setBorderPainted(false);
        this.setFocusPainted(false);
    }

    public Icon getColor() {
        return this.getIcon();
    }

    public void setColor(String percorso_immagine) {
    	this.percorso_immagine = percorso_immagine;
        this.immagine = new ImageIcon(getClass().getClassLoader().getResource(this.percorso_immagine));
        this.setIcon(immagine);
    }

}